package com.fourleaf.farenheitclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarenheitServiceController {

    @RequestMapping("/fahrenheit/{temp}")
    public Double convertCelsiusToFahrenehit(@PathVariable Double temp){
        Double fahrenheit = (temp * 9/5) + 32;
        return fahrenheit;
    }

}
