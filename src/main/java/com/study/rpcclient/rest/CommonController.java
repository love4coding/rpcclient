/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.study.rpcclient.rest;

import com.study.rpcserver.api.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yalinli
 * @version $Id: CommonController.java, v 0.1 2018-12-10 21:20 yalinli Exp $$
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(@RequestParam("name") String name) {
        System.out.println("enter hello");
        return commonService.hello(name);
    }
}
