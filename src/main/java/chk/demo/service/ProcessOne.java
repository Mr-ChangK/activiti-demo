package chk.demo.service;

import org.springframework.stereotype.Component;

@Component("processOne")
public class ProcessOne {

    public void one(){
        System.out.println("this is a process one");
    }
    public boolean flag(){
        return true;
    }
}
