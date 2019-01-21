package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients		//启动Feign访问形式，Feign的作用，可以实现负载均衡，当有多个提供者时，可以合理调配
public class RunAppConsumer {
	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumer.class, args);
	}

}
