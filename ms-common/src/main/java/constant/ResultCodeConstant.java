package constant;


public interface ResultCodeConstant {

    /**
     * 系统错误
     */
    int RESCODE_SYSTEM_ERROR = 500;

    /**
     * 成功
     */
    int RESCODE_SUCCESS = 1000;

    /**
     * 请求异常
     */
    int RESCODE_EXCEPTION = 1001;

    /**
     * 未登陆状态
     */
    int RESCODE_NOLOGIN = 1002;

    /**
     * 查询结果为空
     */
    int RESCODE_NOEXIST = 1003;

    /**
     * 无操作权限
     */
    int RESCODE_NOAUTH = 1004;

    /**
     * 未找到
     */
    int RESCODE_NOT_FOUND = 1005;

    /**
     * 服务器错误
     */
    int RESCODE_SERVER_ERROR = 1006;

    String RESCODE_NOLOGIN_MSG = "凭证有误";

    String RESCODE_SERVER_ERROR_MSG = "服务繁忙,请稍后再试";

    String RESCODE_SYSTEM_ERROR_MSG = "系统繁忙,请稍后再试";

    /**
     * 互联互通响应结果
     */
    interface HlhtResultCode{

        /**
         * 互联互通token有误
         */
        String RESCODE_HLHT_TOKEN_ERROR = "4002";

        String RESCODE_HLHT_TOKEN_ERROR_MSG = "token错误";
    }

}
