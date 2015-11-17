package com.springBoot.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akshata on 16/11/15.
 */
@Controller
public class BasicCRUDController {
    private static final Logger logger = LoggerFactory.getLogger(BasicCRUDController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        logger.info("Index handler");
        return "home";
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
         return "index";
    }


    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String indexPage() {
        return "success";
    }
}
