package com.TestDocker.DockerTest.Controller;

import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class TestController {

    int count = 0;

    @GetMapping("/test")
    public String increaseCount(){
        count++;
        System.out.println(count + " Current count");
        return "Count increased to "+count;
    }

    @GetMapping("/count")
    public String CurrentCount(){
        return "Currrent Value count = "+String.valueOf(count);
    }
}
