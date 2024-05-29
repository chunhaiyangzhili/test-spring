package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.impl.TestServiceImpl;
import org.example.model.ReturnMsg;
import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author zwzhang5
 * @description
 * @date Created on 2024/5/28 8:54
 */
@RestController
@RequestMapping(value = "/test", produces = "application/json")
@Slf4j
@RequiredArgsConstructor
public class TestController {

    private final TestServiceImpl testService;

    @GetMapping("/getTest")
    public ReturnMsg test() {
        log.info("请求开始");
        String result = testService.getTest();
        log.info("请求结束");
        return new ReturnMsg<>(result);
    }
}
