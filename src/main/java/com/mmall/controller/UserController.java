package com.mmall.controller;

import com.mmall.dao.TbUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZHAOKANG on 2018/5/21.
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    TbUserMapper tbUserMapper;

    @RequestMapping("/login")
    @ResponseBody
    public String login(Model model) {
        log.info(tbUserMapper.selectByUsername("zhaokang"));
        model.addAttribute("message", "123");
        return "hello";
    }

    //文件上传接口

}
