package com.tobeto.tbto.jr_wshop;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController
{
    @GetMapping
    public String getC()
    {
        return "Category:X";
    }
    @GetMapping("category-2")
    public String getc2()
    {
        return "Category:Y";
    }
    @PostMapping()
    public String postC()
    {
        return "AddedToCategories";
    }
    @PutMapping
    public String putC()
    {
        return "Updated Categories";
    }
    @DeleteMapping
    public String deleteC()
    {
        return "Deleted Category";
    }
}
