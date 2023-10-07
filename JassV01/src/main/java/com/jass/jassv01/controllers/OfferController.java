package com.jass.jassv01.controllers;

import com.jass.jassv01.models.Demand;
import com.jass.jassv01.models.Offer;
import com.jass.jassv01.services.DemandService;
import com.jass.jassv01.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OfferController {
    public String msg;
    private final OfferService offerService;
    private final DemandService demandService;

    @Autowired
    public OfferController(OfferService offerService, DemandService demandService) {
        this.offerService = offerService;
        this.demandService = demandService;
    }

    @GetMapping("/offer")
    public String offer(Model model){
        model.addAttribute("msg",msg);
        msg ="";
        return "offer";
    }

    @GetMapping("/offercreate")
    public String offerCreate(Model model){
        model.addAttribute("msg",msg);
        msg ="";
        return "offercreate";
    }
    @PostMapping("/offercreate")
    public String offerCreate(@RequestParam Integer number,
                              @RequestParam String name,
                              @RequestParam(required = false) Integer demandNumber){
        Offer offer = new Offer(number,name);
        if (demandNumber != null) {
            Demand demand = demandService.getDemandByNumber(demandNumber);
            if (demand != null){
                offer.setDemand(demand);
            }
        }
        offerService.addOffer(offer);
        return "redirect:/offerdetail/"+number;
    }

    @GetMapping("/offerdetail/{id}")
    public String offerDetail(@PathVariable Integer id,Model model){
        Offer offer = offerService.getOfferByNumber(id);
        return "offerdetail";
    }

    @PostMapping("/offerdetail")
    public String offerDetail(@RequestParam Integer number){
        return "redirect:/offerdetail/"+number;
    }



}
