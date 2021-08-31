package com.baken.teach.shedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(SheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        log.info("The time is now" + dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay = 7000)
    public void reportCurrentTime1(){
        log.info("The time is now delay" + dateFormat.format(new Date()));
    }

}
