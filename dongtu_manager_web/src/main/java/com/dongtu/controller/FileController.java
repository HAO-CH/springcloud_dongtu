package com.dongtu.controller;

import com.dongtu.config.FastDFSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("file")
public class FileController {

    @Autowired
    private FastDFSClient fastDFSClient;

    @RequestMapping("upload")
    @ResponseBody
    public Map<String,Object> upLoadFile(@RequestParam(value = "myFile") MultipartFile myFile){
        try {
            String file = fastDFSClient.uploadFile(myFile);
            Map<String,Object> map = new HashMap<>();
            map.put("imgUrl",file);
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
