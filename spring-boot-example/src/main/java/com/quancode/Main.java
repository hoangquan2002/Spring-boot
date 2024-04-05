package com.quancode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

    }
//    @GetMapping("/greet")
//    public GreetResponse greet(){
//        GreetResponse response =new GreetResponse(
//                "lo con cac",
//                List.of("Java", "Golang", "C++"),
//                new Person("Alex", 30, 30_0000)
//        );
//        return response;
//
//
//    }
//
//    record Person(String name, int age, double money){
//
//    }
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguagesss,
//            Person personnn
//    ) {}



}
