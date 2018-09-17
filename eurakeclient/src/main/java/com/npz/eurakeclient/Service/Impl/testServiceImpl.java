package com.npz.eurakeclient.Service.Impl;

import com.npz.eurakeclient.Service.testService;
import org.springframework.stereotype.Service;

@Service
public class testServiceImpl implements testService {

    @Override
    public String test() {
        return "success";
    }
}
