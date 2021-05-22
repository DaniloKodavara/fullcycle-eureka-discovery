package com.fourleaf.kelvinclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KelvinclientController {

    @RequestMapping("/kelvin/{temp}")
    public Double convertCelsiusToKevin(@PathVariable Double temp){
        Double kelvin = temp +  273.15;
        return kelvin;
    }
}
