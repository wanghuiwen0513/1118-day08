package com.whw.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:MR.W on 2020/11/18 8:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerStarter {
      public static void main(String[] args) {
              SpringApplication.run(ConsumerStarter.class,args);
          }

}
