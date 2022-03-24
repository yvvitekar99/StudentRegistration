package com.avelanche.StudentRegistrationSite.config;


import com.avelanche.StudentRegistrationSite.service.implemenatation.StudentRegistration;
import com.avelanche.StudentRegistrationSite.service.interfaces.IStudentRegistration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public IStudentRegistration studentRegistration(){
        return  new StudentRegistration();
    }

}
