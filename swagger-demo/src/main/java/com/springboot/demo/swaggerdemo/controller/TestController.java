package com.springboot.demo.swaggerdemo.controller;

import com.springboot.demo.swaggerdemo.context.UserContext;
import com.springboot.demo.swaggerdemo.service.UserService;
import com.springboot.demo.swaggerdemo.vo.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author:ASUS
 * @createTime:2020/5/16 16:18
 * @describle:
 */

// 表示标识这个类是swagger的资源

/**
 * @Api：用在请求的类上，表示对类的说明
 * tags="说明该类的作用，可以在UI界面上看到的注解"
 * value="该参数没什么意义，在UI界面上也看到，所以不需要配置
 * */
@Controller
@RequestMapping("v1/product")
@Api(value = "docController",tags = {"restful api示例"})
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{phone}/{nickName}",method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value = "修改当前用户好了",httpMethod = "PUT",produces = "application/json")
    @ApiImplicitParams({@ApiImplicitParam(name = "phone",value = "phone",required = true,paramType = "path"),
            @ApiImplicitParam(name = "nickName",value = "其他的在想",required = false,paramType = "path")})
    public ResultData update(@PathVariable("phone") String phone,
                             @PathVariable("nickName") String nickName,
                             @ModelAttribute UserContext context){
        System.out.println(context.getGitUrl()+":"+context.getUserEmail());
        System.out.printf("修改用户id及相关信息 ==>%s,%s",phone,nickName);
        if (context.getPhone() != null && !phone.equals(context.getPhone())){
            System.out.println("改用户名不存在");
            return ResultData.RESULT_ERROR;
        }
        if(nickName !=null  && !"".equals(nickName)){
            context.setNickName(nickName);
        }
        int status = userService.updateUser(context);
        System.out.println();
        if (status == 0){
            DateFormat format1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String formatDate = format1.format(new Date());
            System.out.println("修改产品失败，当前时间：" + formatDate);
            return ResultData.RESULT_ERROR;
        }
        return  ResultData.RESULT_SUCCESS;
    }

    /**
     *@ApiModel：用于响应类上，表示一个返回响应数据的信息
     * （这种一般用在post创建的时候，使用@RequestBody这样的场景，
     *  请求参数无法使用@ApiImplicitParam注解进行描述的时候）
     *  所以这个在UserContext上 也可以用在ResultData上
     *  看 UserContext示例
     */

    /**
     *  @ApiModelProperty：用在属性上，描述响应类的属性
     */

    /**
     * @ApiOperation：用在请求的方法上，说明方法的用途、作用
     * value="说明方法的用途、作用"
     * httpMethod = "PUT"
     * produces = "application/json"
     * notes="方法的备注说明"
     */

    /**
     * @ApiImplicitParams：用在请求的方法上，表示一组参数说明
     * @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面
     *         name：参数名
     *         value：参数的汉字说明、解释
     *         required：参数是否必须传
     *         paramType：参数放在哪个地方
     *             · header --> 请求参数的获取：@RequestHeader
     *             · query --> 请求参数的获取：@RequestParam
     *             · path（用于restful接口）--> 请求参数的获取：@PathVariable
     *             · body（不常用）
     *             · form（不常用）
     *         dataType：参数类型，默认String，其它值dataType="Integer"
     *         defaultValue：参数的默认值
     */

    /**
     *@ApiResponses：用在请求的方法上，表示一组响应
     *@ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
     *    code：数字，例如400
     *    message：信息，例如"请求参数没填好"
     *    response：抛出异常的类
     */


}
