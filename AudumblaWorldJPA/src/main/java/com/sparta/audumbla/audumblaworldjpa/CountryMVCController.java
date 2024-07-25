package com.sparta.audumbla.audumblaworldjpa;

import com.sparta.audumbla.audumblaworldjpa.repositories.CountryRepository;
import com.sparta.audumbla.audumblaworldjpa.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/countries")
public class CountryMVCController {

    private final WorldService worldService;
    @Autowired
    public CountryMVCController(WorldService worldService) {
        this.worldService = worldService;
    }

    @GetMapping
    public String getCountry(@RequestParam(name = "countryCode", required = false) String countryCode, Model model) {
        if (countryCode != null) {
            model.addAttribute("country", worldService.getCountryByCountryCode(countryCode));
        } else {
            model.addAttribute("country", worldService.getAllCountries());
        }
        return "countries/list";
    }

}
