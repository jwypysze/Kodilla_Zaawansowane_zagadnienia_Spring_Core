package com.kodilla.beanlifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskPostProcessorOfBeansController {

    @ResponseBody
    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public AnyBean create() {
        return new AnyBean();
    }

}
