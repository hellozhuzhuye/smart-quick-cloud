package top.smartsoftware.cloud.controller;

import api.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import top.smartsoftware.cloud.feignClient.OrderFeignClient;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xjx
 * @since 2023-11-29
 */
@RestController
@RequestMapping("/cloud/order")
public class OrderController {

    @Resource
    OrderFeignClient orderFeignClient;

    @GetMapping("/openFeignTestRpc")
    public ApiResult<String> openFeignTestRpc(){
        return orderFeignClient.openFeignTestRpc();
    }

}
