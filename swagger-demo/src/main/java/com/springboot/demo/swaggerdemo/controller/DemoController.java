package com.springboot.demo.swaggerdemo.controller;

import com.springboot.demo.swaggerdemo.vo.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 21:44 2020/6/12
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public ResultData demoMethd(){
        System.out.println("hahahah");
        return ResultData.RESULT_SUCCESS;
    }
}
