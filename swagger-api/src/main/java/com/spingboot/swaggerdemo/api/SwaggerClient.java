package com.spingboot.swaggerdemo.api;


import com.spingboot.swaggerdemo.api.impl.SwaggerClientFallback;
import com.springboot.common.context.UserContext;
import com.springboot.common.vo.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "swagger-demo",
            url = "localhost:6666",
            fallback = SwaggerClientFallback.class)
public interface SwaggerClient {
    @PostMapping("v1/product/{phone}/{nickName}")
    ResultData update(@PathVariable("phone") String phone,
                      @PathVariable("nickName") String nickName,
                      @RequestBody UserContext context);
}
