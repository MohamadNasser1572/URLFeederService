package com.nasser.urlfeederservice.service;

import com.nasser.urlfeederservice.dao.URLRepository;
import com.nasser.urlfeederservice.model.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLService {
    @Autowired
    private KafkaService kafkaService;

    @Autowired
    private URLRepository urlRepository;

    public void save(URL url) {
        urlRepository.save(url);
        kafkaService.send("html_topic", url.getUrl());
    }
}
