package com.example.chuyendoitiente2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {

    @GetMapping("/enter")
    public String home() {
        return "enter"; // Trả về trang enter.jsp
    }

    @PostMapping("/currency")
    public String convertCurrency(@RequestParam("rate") double rate,
                                  @RequestParam("usd") double usd,
                                  Model model) {
        double vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "result"; // Trả về trang result.jsp
    }
}
