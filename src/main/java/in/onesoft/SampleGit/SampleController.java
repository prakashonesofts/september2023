package in.onesoft.SampleGit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value = "/getdetails")
    public String get(){
        if(true) {
            return "Helloworld is my first program";
        }
        else {
            return "Hello";
        }
    }

    @GetMapping("/data")
    public Integer  getNum(){
        return 100;
    }
}
