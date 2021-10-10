package resp;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangchunhui
 * @date 2021/10/10
 */

@Data
@Builder
@NoArgsConstructor
public class ResultData<T> {
    /**
     * 状态码
     */
    private int status;
    /**
     * 秒杀信息
     */
    private String message;
    /**
     * 具体数据
     */
    private T data;
    /**
     * 时间戳
     */
    private long timestamp;


    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setStatus(ReturnCode.RC100.getCode());
        resultData.setMessage(ReturnCode.RC100.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail(int code, String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setStatus(code);
        resultData.setMessage(message);
        return resultData;
    }

    public static <T> ResultData<T> systemFail() {
        ResultData<T> resultData = new ResultData<>();
        resultData.setStatus(ReturnCode.RC999.getCode());
        resultData.setMessage(ReturnCode.RC999.getMessage());
        return resultData;
    }




}
