package com.zch.seckill.operation.interfaces.req;

import lombok.Data;
import javax.validation.constraints.NotNull;

/**
 * 秒杀场次请求
 * @author zhangchunhui
 * @date 2021/10/11
 */

@Data
public class SeckillSessionReq {

    @NotNull()
    private String sessionName;

    @NotNull()
    private String startTime;

    @NotNull()
    private String endTime;

    @NotNull()
    private String creator;

}
