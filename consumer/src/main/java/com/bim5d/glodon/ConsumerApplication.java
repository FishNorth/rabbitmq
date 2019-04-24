package com.bim5d.glodon;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

/**
 * @author: guanl-c
 * @date: 2019/4/23 19:29
 * @description:
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        checkServer();
        SpringApplication.run(ConsumerApplication.class);
    }

    // 检查rabbit服务是否启动
    public static void checkServer() {
        if (NetUtil.isUsableLocalPort(15672)) {
            JOptionPane.showMessageDialog(null, "RabbitMQ 服务器未启动 ");
            System.exit(1);
        }
    }
}
