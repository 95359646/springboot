package com.example.demo.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Scheduled(cron = "* */30 * * * ?")
    public void scheduler(){
        System.out.println("SchedulingConfig.scheduler job is running");
    }
}
