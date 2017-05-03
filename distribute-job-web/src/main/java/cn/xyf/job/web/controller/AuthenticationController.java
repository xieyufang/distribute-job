package cn.xyf.job.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xieyufang
 */
@Controller
public class AuthenticationController {

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String handler(){
        System.out.println("test");
        return "logout";
    }

    @RequestMapping(method = RequestMethod.POST, value="")
    public String login(){

        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value="")
    public String logout(){
        return null;
    }
}
