package spring5mvc.service.impl;

import org.springframework.stereotype.Service;
import spring5mvc.model.Utente;
import spring5mvc.service.UtenteService;

@Service
public class UtenteServiceImpl implements UtenteService {
    @Override
    public void oscuraEmail(Utente u) {
        if (u.getEmail()!=null && u.getEmail().length()>1) {
            u.setEmail("*".repeat(u.getEmail().length()));
        }else {
            u.setEmail("NON PRESENTE");
        }
    }
}//end class
