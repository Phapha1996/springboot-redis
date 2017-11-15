package org.fage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年10月30日
 * @description redis测试程序创建步骤：
 * 						打开redis服务器
 * 						1.先创建maven web项目，创建依赖
 *						2.配置yml文件
 *						3.编写程序
 */

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
