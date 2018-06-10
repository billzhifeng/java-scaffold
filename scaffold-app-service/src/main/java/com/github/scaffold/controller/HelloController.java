package com.github.scaffold.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/**
 * 测试controller
 * 
 * @author wangzhifeng
 */
@Controller
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    @ResponseBody
    public String sayOK() {
        return "OK";
    }

    @RequestMapping(value = "/receiveMsg", method = RequestMethod.POST)
    @ResponseBody
    public String receiveMsg(@RequestBody Object o) {
        log.info(JSON.toJSONString(o));
        return "OK";
    }

    @RequestMapping(value = "/sendMsg", method = RequestMethod.GET)
    @ResponseBody
    public String sentMsg() {
        return "OK";
    }

    //    @Autowired
    //    private CouponTestDOMapper couponTestDOMapper;
    //    
    //    @RequestMapping(value = "/db", method = RequestMethod.GET)
    //    @ResponseBody
    //    public CouponTestDO db() {
    //        return couponTestDOMapper.selectByPrimaryKey(1L);
    //    }
}
