package top.smartsoftware.cloud.feignClient;


import api.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ms-order")
public interface OrderFeignClient {
    @GetMapping("/openFeignTestRpc")
    ApiResult<String> openFeignTestRpc();
}
