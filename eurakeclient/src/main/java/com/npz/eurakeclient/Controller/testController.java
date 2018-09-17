package com.npz.eurakeclient.Controller;

import com.npz.eurakeclient.Service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private testService testService;

    @RequestMapping(value = "/servicetest")
    public String servicetest(){
        return testService.test();
    }
}
