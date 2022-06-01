package com.java.jdksfeatures;

import com.java.jdksfeatures.service.FeatureExecutioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JdksFeaturesApplication implements CommandLineRunner {
	@Autowired
	FeatureExecutioner featureExecutioner ;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JdksFeaturesApplication.class,args);
		context.close();
	}

	@Override
	public void run(String...args) throws InterruptedException {
		featureExecutioner.startExecution();
	}
}
