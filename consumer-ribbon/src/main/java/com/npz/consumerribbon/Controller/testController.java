package com.npz.consumerribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class testController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/testribbon",method = RequestMethod.GET)
    public String test(){
        return restTemplate.getForEntity("http://eurakeclient/servicetest",String.class).getBody();
    }
}
