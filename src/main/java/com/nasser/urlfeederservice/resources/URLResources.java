package com.nasser.urlfeederservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLResources {
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    //Create an endpoint that posts a String url that can return it on the compiler
    @PostMapping
    public ResponseEntity<Void> submitURL(@RequestBody String url){
        System.out.println(url);
        return ResponseEntity.ok().build();
    }
}
