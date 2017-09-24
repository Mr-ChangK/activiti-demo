package chk.demo.controller;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
public class ActivitiConltroller {
    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/demo")
    public String acvititiDemo(){
        runtimeService.startProcessInstanceByKey("demo");

        return "sucess";
    }
}
