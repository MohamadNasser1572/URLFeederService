package com.nasser.urlfeederservice.resources;

import com.nasser.urlfeederservice.common.Constants;
import com.nasser.urlfeederservice.model.URL;
import com.nasser.urlfeederservice.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.UUID;

@RestController
public class URLResources {

    @Autowired
    private URLService urlService;


    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    //Create an endpoint that posts a String url that can return it on the compiler
    @PostMapping
    public ResponseEntity<Void> submitURL(@RequestBody URL url) {
        url.setId(Constants.URL_UUID_PREFIX + UUID.randomUUID().toString());
        urlService.save(url);//saving
        System.out.println(url);
        return ResponseEntity.ok().build();
    }
}
