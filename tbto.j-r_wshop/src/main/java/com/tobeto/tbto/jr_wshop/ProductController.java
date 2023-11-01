package com.tobeto.tbto.jr_wshop;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController
{
    @GetMapping
    public String get()
    {
        return "Product --> X";
    }
    @GetMapping("get2")
    public String get2()
    {
        return "Product --> Y";
    }
    @PostMapping
    public String post()
    {
        return "CREATED";
    }
    @PutMapping
    public String put()
    {
        return "UPDATED";
    }
    @DeleteMapping
    public String delete()
    {
        return "DELETED";
    }


}
