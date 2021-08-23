package com.workshops.javasamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavasamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavasamplesApplication.class, args);

        Student studentOne = new StudentBuilder().name("Samet").age(37).motto("Don't give up").buildStudent();
    }

}
