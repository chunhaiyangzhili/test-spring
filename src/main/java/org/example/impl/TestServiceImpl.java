package org.example.impl;

import org.example.service.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author zwzhang5
 * @description
 * @date Created on 2024/5/28 8:59
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getTest() {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        return list.toString();
    }
}
