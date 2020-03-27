package guru.springframework.sfgpetclinic.sfgpetclinic.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(){
        return "owners/index";
    }
}
