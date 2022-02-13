package com.geekbin.wikibook.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//@ComponentScan({"com.geekbin","com.test"})  // 扫描多个包配置示例
@ComponentScan("com.geekbin") // 手动指定 SpringBoot 项目扫描目录
@SpringBootApplication
public class WikibookApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikibookApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikibookApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }


}
