package com.jass.jassv01.controllers;

import com.jass.jassv01.models.Demand;
import com.jass.jassv01.repositories.DemandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemandController {
    public String createdMsg;

    private final DemandRepository demandRepository;

    @Autowired
    public DemandController(DemandRepository demandRepository) {
        this.demandRepository = demandRepository;
    }

    @GetMapping("/demand")
    public String demand(Model model){
        model.addAttribute("msg",createdMsg);
        createdMsg ="";
        return "demand";
    }

    @PostMapping("/createdemand")
    public String createdemand(@RequestParam Integer demandNumber,
                               @RequestParam String companyName,
                               @RequestParam String demandDescription){
        Demand demand = new Demand();
        demand.setNumber(demandNumber);
        demand.setCompanyName(companyName);
        demand.setDescription(demandDescription);
        demandRepository.save(demand);
        createdMsg = "Poptavka cislo "+demand.getNumber()+ " uspesne vytvorena";
        return "redirect:/demand";
    }
    @PostMapping("/demandnumber")
    public String demanddetail(@RequestParam Integer number){
        if (demandRepository.findByNumber(number).isEmpty()){
            createdMsg = "poptavka s timto cislem nenalezena";
            return "redirect:/demand";
        }


        return "redirect:/demanddetail";
    }
}
