package org.embarx.firstspringbootexample;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponce hello(){
        return new HelloResponce("Hello, World");
    }

    @PostMapping("/hello")
    public HelloResponce helloPost(@RequestBody String name){
        return new HelloResponce("Hello " + name +"!");
    }

    @GetMapping("/hello/{name}")
    public HelloResponce helloParam(@PathVariable String name){
        return new HelloResponce("Hello "+name+ "!");

    }
}
