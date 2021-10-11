package com.zch.seckill.operation.domain;

import javafx.util.converter.LocalDateTimeStringConverter;

/**
 * @author zhangchunhui
 * @date 2021/10/11
 *
 * private String sessionName;
 *
 *     private LocalDateTime createTime;
 *
 *     private LocalDateTime endTime;
 *
 *     private String creator;
 *
 *     private LocalDateTime startTime;
 */
public class SeckillSessionFactory {

    private static final LocalDateTimeStringConverter localDateTimeStringConverter = new LocalDateTimeStringConverter();


    public static  SeckillSession createSeckillSession(String startTime, String endTime, String sessionName, String creator){
        SeckillSession seckillSession = new SeckillSession();
        seckillSession.setSessionName(sessionName);
        seckillSession.setCreator(creator);
        seckillSession.setStartTime(localDateTimeStringConverter.fromString(startTime));
        seckillSession.setEndTime(localDateTimeStringConverter.fromString(endTime));
        return seckillSession;
    }
}
