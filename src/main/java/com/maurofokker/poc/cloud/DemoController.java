package com.maurofokker.poc.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/discoveryByRestTemplate")
    public String discoveryByRestTemplate() {
        return this.restTemplate.getForObject("http://MYSECONDCLIENT/serviceinfo", String.class);
    }

}
