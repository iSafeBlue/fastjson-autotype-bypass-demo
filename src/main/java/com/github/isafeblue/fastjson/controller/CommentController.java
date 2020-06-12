package com.github.isafeblue.fastjson.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.github.isafeblue.fastjson.entity.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 浅蓝
 * @email blue@ixsec.org
 * @since 2020/5/9 12:56
 */
@Controller
public class CommentController {


    public static List<Comment>  comments = new ArrayList(){
        {
            Comment comment = new Comment();
            comment.setName("Tom");
            comment.setContent("Hello World.");
            comment.setEmail("tom@gmail.com");
            add(comment);
        }
    };

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        modelAndView.addObject("comments",comments);
        return modelAndView;
    }

    @RequestMapping("addComment")
    @ResponseBody
    public String addComment(@RequestBody String comment){
        
        JSONObject jsonObject = JSON.parseObject(comment);
        Comment temp = new Comment();
        temp.setName(jsonObject.getString("name"));
        temp.setEmail(jsonObject.getString("email"));
        temp.setContent(jsonObject.getString("content"));
        comments.add(temp);
        return "1";
    }

}
