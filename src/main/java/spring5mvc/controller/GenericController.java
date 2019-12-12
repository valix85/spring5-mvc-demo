package spring5mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring5mvc.model.Utente;
import spring5mvc.service.UtenteService;

@Controller
public class GenericController {

    @Autowired
    UtenteService utenteService;

    @GetMapping("/")
    public String getHome(){
        return "homepage";
    }

    @PostMapping("/sendData")
    public String doData(@ModelAttribute("utenteModel") Utente utente, Model model){
        System.out.println("Dati ricevuti dalla form: " + utente);
        utenteService.oscuraEmail(utente);
        model.addAttribute("utenteElaborato", utente);
        return "elabora";
    }

    @ModelAttribute("utenteModel")
    public Utente formUtenteObject() {
        return new Utente();
    }
}//end class
