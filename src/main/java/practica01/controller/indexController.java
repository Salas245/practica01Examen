package practica01.controller;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import practica01.dao.estadoDao;
import practica01.domain.Estado;
import practica01.estadoService.estadoService;

@Controller
@Slf4j
public class indexController {
    @Autowired
    private estadoDao estadoDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var estados = estadoDao.findAll();
        model.addAttribute("estados", estados);
        return "index";
    }
}
