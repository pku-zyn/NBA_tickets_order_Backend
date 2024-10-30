//这个文件运行springboot的工程的启动类，用来启动整个工程
package com.example.nba_tickets_order_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NbaTicketsOrderBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbaTicketsOrderBackendApplication.class, args);
    }
}