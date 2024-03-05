package api;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpStatus;

import constant.ResultCodeConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * HTTP接口通用返回对象
 *
 * @author Uncarbon
 */
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResult<T> {

    @ApiModelProperty(value = "状态码")
    private int code;

    @ApiModelProperty(value = "返回消息")
    private String msg;

    @ApiModelProperty(value = "承载数据")
    private T data;

    /*
    字段权限3字段
     */
    @ApiModelProperty(value = "分页可见字段")
    private List<Object> pageVisibleField;

    @ApiModelProperty(value = "详情可见字段")
    private List<Object> detailVisibleField;

    @ApiModelProperty(value = "详情table可见字段")
    private List<Object> detailTableVisibleField;


    public static <T> ApiResult<T> success() {
        return build(ResultCodeConstant.RESCODE_SUCCESS, "请求成功", null);
    }

    public static <T> ApiResult<T> success(String msg) {
        return build(ResultCodeConstant.RESCODE_SUCCESS, msg, null);
    }

    public static <T> ApiResult<T> fail(Integer code, String msg) {
        return build(code, msg, null);
    }

    public static <T> ApiResult<T> fail(Integer code, String msg, T data) {
        return build(code, msg, data);
    }

    public static <T> ApiResult<T> fail(String msg) {
        return build(ResultCodeConstant.RESCODE_EXCEPTION, msg, null);
    }

    public static <T> ApiResult<T> requireLogin(String msg) {
        return build(ResultCodeConstant.RESCODE_NOLOGIN, msg, null);
    }

    public static <T> ApiResult<T> data(T data) {
        return build(ResultCodeConstant.RESCODE_SUCCESS, ObjectUtil.isEmpty(data) ? "暂无数据" : "请求成功", data);
    }

    public static <T> ApiResult<T> data(String msg, T data) {
        return build(ResultCodeConstant.RESCODE_SUCCESS, msg, data);
    }

    public static <T> ApiResult<T> timeout() {
        return build(HttpStatus.HTTP_GATEWAY_TIMEOUT, "请求超时", null);
    }

    private static <T> ApiResult<T> build(Integer code, String msg, T data) {
        ApiResult<T> ret = new ApiResult<>();
        ret
                .setCode(code)
                .setMsg(msg)
                .setData(data);

        return ret;
    }

    public boolean isSuccess() {
        return getCode() == ResultCodeConstant.RESCODE_SUCCESS;
    }
}
