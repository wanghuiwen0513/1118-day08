package com.whw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author:MR.W on 2020/11/18 8:50
 */
@SpringBootApplication
@EnableConfigurationProperties
public class ConfigStarter {
      public static void main(String[] args) {
              SpringApplication.run(ConfigStarter.class,args);
          }
      
}
