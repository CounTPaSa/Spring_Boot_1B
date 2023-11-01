package com.tobeto.tbto.jr_wshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/persons") //Bu controllerin kontrol edecegi alt routerlari tanimlar
public class PersonsController
{
    @GetMapping // api/persons
    public String get()
    {
        return "********1G1*******";
    }
    @GetMapping("get2") // api/persons/get2
    public String get2()
    {
        return "********2G2*******";
    }

    @PostMapping
    public String post()
    {
        return "********PSTD*******";
    }
}
