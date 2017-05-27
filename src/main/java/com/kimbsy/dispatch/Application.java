package com.kimbsy.dispatch;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kimbsy
 */
@SpringBootApplication
@ComponentScan({"com.kimbsy.dispatch"})
@ImportResource({"classpath*:META-INF/spring/main-context.xml"})
@Configuration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name="sqsClient")
    public AmazonSQSAsync amazonSQSAsyncClient() {
        return AmazonSQSAsyncClientBuilder.standard().withRegion("eu-west-1").build();
    }
}
