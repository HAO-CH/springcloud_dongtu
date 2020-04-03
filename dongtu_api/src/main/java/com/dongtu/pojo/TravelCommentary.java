package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.pojo
 * @ClassName: TravelCommentary
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 20:24
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 20:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Document(collection = "travelCommentary")
public class TravelCommentary {
    //游记id
    private String travelsId;
    //用户名字
    private String userName;
    //用户头像
    private String headPic;
    //评论时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date commentTime;
    //评论内容
    private String content;

    public String getTravelsId() {
        return travelsId;
    }

    public void setTravelsId(String travelsId) {
        this.travelsId = travelsId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
