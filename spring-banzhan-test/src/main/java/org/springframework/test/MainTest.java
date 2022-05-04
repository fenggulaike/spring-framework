package org.springframework.test;


import lombok.Data;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

@Data
public class MainTest {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}