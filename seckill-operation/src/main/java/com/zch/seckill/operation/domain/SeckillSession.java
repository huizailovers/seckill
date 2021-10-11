package com.zch.seckill.operation.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zhangchunhui
 * @date 2021/10/11
 */
@Data
public class SeckillSession {

    private String sessionId;

    private String sessionName;

    private LocalDateTime createTime;

    private LocalDateTime endTime;

    private String creator;

    private LocalDateTime startTime;
}
