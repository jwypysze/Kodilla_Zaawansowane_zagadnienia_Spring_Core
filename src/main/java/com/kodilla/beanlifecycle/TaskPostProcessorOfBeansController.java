package com.kodilla.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskPostProcessorOfBeansController {

    // utworzenie kontekstu
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

    @ResponseBody
    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public void create() {
        // wczytanie konfiguracji
        context.register(AppConfiguration.class);
        context.refresh();

        //utworzenie beana AnyBean
        AnyBean anyBean = context.getBean(AnyBean.class);

        context.close();
    }


}
