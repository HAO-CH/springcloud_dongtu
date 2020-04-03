package com.dongtu.config;

import com.github.tobato.fastdfs.domain.FileInfo;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.proto.storage.DownloadByteArray;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;

@Component
public class FastDFSClient {

    @Resource
    private FastFileStorageClient fastFileStorageClient;

    /**
     * 文件上传
     *
     * @param file
     * @return
     * @throws IOException
     */
    public String uploadFile(MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        String originalFileName = file.getOriginalFilename();
        String extension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String fileName = file.getName();
        long fileSize = file.getSize();
        System.out.println(originalFileName + "==========" + fileName + "===========" + fileSize + "===============" + extension + "====" + bytes.length);
        return upload_file(file.getBytes(), fileSize, extension);
    }

    /**
     * @param bytes     文件字节
     * @param fileSize  文件大小
     * @param extension 文件扩展名
     * @return fastDfs路径
     */
    public String upload_file(byte[] bytes, long fileSize, String extension) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        StorePath storePath = fastFileStorageClient.uploadFile(byteArrayInputStream, fileSize, extension, null);
        System.out.println(storePath.getGroup() + "===" + storePath.getPath() + "======" + storePath.getFullPath());
        return storePath.getFullPath();
    }

    public StorePath upload(File file) {
        StorePath storePath = null;
        try {
            FileInputStream inputStream = new FileInputStream(file);
            storePath = fastFileStorageClient.uploadFile(inputStream, file.length(), "jpg", null);
            System.out.println(storePath.getGroup() + " " + storePath.getPath());
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return storePath;
    }


    /**
     * 文件下载到磁盘
     *
     * @param fileUrl 图片路径
     * @param outUrl  输出到磁盘的路径
     * @return -1失败,0成功
     */
    public int downloadFile(String fileUrl, String outUrl) throws IOException {
        int result = -1;
        byte[] bytes = download_File(fileUrl);
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outUrl));
        try {
            if (bytes != null) {
                output.write(bytes);
                result = 0;
            }
        } catch (Exception e) {
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    /**
     * 下载文件
     *
     * @param fileUrl 文件URL
     * @return 文件字节
     * @throws IOException
     */
    private byte[] download_File(String fileUrl) {
        String group = fileUrl.substring(0, fileUrl.indexOf("/"));
        String path = fileUrl.substring(fileUrl.indexOf("/") + 1);
        DownloadByteArray downloadByteArray = new DownloadByteArray();
        byte[] bytes = fastFileStorageClient.downloadFile(group, path, downloadByteArray);
        return bytes;
    }
    /**
     * 删除文件
     *
     * @param group    "group1"
     * @param filePath "M00/00/00/wKiAjVlpQVyARpQwAADGA0F72jo566.jpg"
     */
    public void deleteFile(String group, String filePath) {
        fastFileStorageClient.deleteFile(group, filePath);
    }

    /**
     * 查询文件
     *
     * @param group    "group1"
     * @param filePath "M00/00/00/wKiAjVlpQVyARpQwAADGA0F72jo566.jpg"
     */
    public FileInfo queryFileInfo(String group, String filePath) {
        return fastFileStorageClient.queryFileInfo(group, filePath);
    }

}
