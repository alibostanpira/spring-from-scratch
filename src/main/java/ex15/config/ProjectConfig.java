package ex15.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ex15.services", "ex15.beans", "ex15.implementation"})
public class ProjectConfig {

}