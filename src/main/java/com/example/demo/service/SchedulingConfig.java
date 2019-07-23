package com.example.demo.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Scheduled(cron = "* */30 * * * ?")
    public void scheduler(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("SchedulingConfig.scheduler job is running at " + simpleDateFormat.format(new Date())
        );
    }
}
