package com.whw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:MR.W on 2020/11/18 8:46
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaStarter {
      public static void main(String[] args) {
              SpringApplication.run(EurekaStarter.class,args);
          }

}
