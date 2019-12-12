package spring5mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring5mvc.model.Utente;
import spring5mvc.service.UtenteService;

import javax.validation.Valid;

@Controller
public class GenericController {

    @Autowired
    UtenteService utenteService;

    @GetMapping("/")
    public String getHome(){
        return "homepage";
    }

    @PostMapping("/sendData")
    public String doData(@ModelAttribute("utenteModel") @Valid Utente utente, BindingResult result, Model model){
        System.out.println("Dati ricevuti dalla form: " + utente);
        if (result.hasErrors()){
            return "homepage";
        }
        utenteService.oscuraEmail(utente);
        model.addAttribute("utenteElaborato", utente);
        return "elabora";
    }

    @ModelAttribute("utenteModel")
    public Utente formUtenteObject() {
        return new Utente();
    }
}//end class
