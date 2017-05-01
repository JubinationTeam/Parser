package com.jubination.io.parser.controller;



import com.jubination.io.parser.init.Init;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;



@Controller
public class RedirectController {

    public RedirectController() {
    }
    
   
    @PostConstruct
    public void init() {
        Init.main(null);
    }
    
}
