package top.smartsoftware.cloud.controller;

import api.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/openFeignTestRpc")
    public ApiResult<String> openFeignTestRpc(){
        return ApiResult.data("666");
    }

}
