package org.fcv.api.apiejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ejemploController {

    @GetMapping("/prueba")
    public String prueba(){
        return "Nola";
    }
    
}
