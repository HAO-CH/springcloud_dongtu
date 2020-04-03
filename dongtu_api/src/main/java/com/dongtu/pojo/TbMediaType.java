package com.dongtu.pojo;

import java.io.Serializable;

/**
 *  媒介类型
 */
public class TbMediaType implements Serializable {
    private Long mediaId;

    private String mediaName;

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName == null ? null : mediaName.trim();
    }
}