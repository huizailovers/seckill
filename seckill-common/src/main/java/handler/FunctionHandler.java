package handler;

import exception.BusinessException;
import resp.ResultData;

import java.util.function.Supplier;

/**
 * 初版的全局处理，使用这种方式，controller 类不再需要写返回值和异常处理，
 * 更好的方式是结合spring 来完成全局的异常处理和全局结果返回
 * @author zhangchunhui
 * @date 2021/10/10
 */
public class FunctionHandler {


    public static <T> ResultData<T> handle(Supplier<T> tSupplier){

        try {
            T t = tSupplier.get();
            return ResultData.success(t);
        }catch (BusinessException businessException){
            // 业务异常
            return ResultData.fail(businessException.getError(),businessException.getMessage());
        } catch (Exception exception){
            // 运行异常
            return ResultData.systemFail();
        }
    }








}
