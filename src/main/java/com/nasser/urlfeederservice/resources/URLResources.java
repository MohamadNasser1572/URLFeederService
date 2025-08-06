package com.nasser.urlfeederservice.resources;

import com.nasser.urlfeederservice.common.Constants;
import com.nasser.urlfeederservice.model.URL;
import com.nasser.urlfeederservice.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.UUID;

@RestController
public class URLResources {

    @Autowired
    private URLService urlService;

    //TEST TEST TEST
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
    //Create an endpoint that posts a String url that can return it on the compiler
    @PostMapping
    public ResponseEntity<Void> submitURL(@RequestBody URL url) {
        url.setId(Constants.URL_UUID_PREFIX + UUID.randomUUID().toString());
        url.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        urlService.save(url);
        System.out.println(url);
        return ResponseEntity.ok().build();
    }
}
