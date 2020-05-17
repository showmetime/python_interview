package com.springboot.demo.swaggerdemo.context;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @author:ASUS
 * @createTime:2020/5/16 15:15
 * @describle:
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "需要修改的用户的相关信息")
public class UserContext {
    // 自增主键
    @ApiModelProperty(required = false, name = "userId", value = "用户数据库中的主键",dataType = "query")
    private Long userId;
    // 用户工号 唯一键
    @ApiModelProperty(required = false, name = "phone", value = "用户的唯一根据电话号码来判断的",dataType = "query")
    private String phone;
    @ApiModelProperty(required = true, name = "userName", value = "用户名",dataType = "query")
    private String userName;
    @ApiModelProperty(required = true, name = "userEmail", value = "用户邮箱",dataType = "query")
    private String userEmail;
    @ApiModelProperty(required = true , name = "gitUrl", value = "用户git地址",dataType = "query")
    private String gitUrl;
    @ApiModelProperty(required = true , name = "nickName", value = "用户昵称",dataType = "query")
    private String nickName;

    public UserContext(String userName, String userEmail, String gitUrl) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.gitUrl = gitUrl;
    }
}
