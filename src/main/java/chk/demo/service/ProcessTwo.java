package chk.demo.service;

import org.springframework.stereotype.Component;

@Component("processTwo")
public class ProcessTwo {
    public void two(){
        System.out.println("this is a process two");
    }
}
