package ex13_assignment.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ex13_assignment.services", "ex13_assignment.beans", "ex13_assignment.implementation"})
public class ProjectConfig {

}
