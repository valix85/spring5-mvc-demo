package spring5mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenericController {

    @GetMapping("/")
    public String getHome(){
        return "homepage";
    }

    @PostMapping("/sendData")
    public String doData(@RequestParam("nome") String testo, Model model){
        System.out.println("Testo ricevuto dalla form: " + testo);
        model.addAttribute("nomeElaborato", testo.toUpperCase());
        return "elabora";
    }

}//end class
