package com.jass.jassv01.controllers;

import com.jass.jassv01.models.Contract;
import com.jass.jassv01.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContractController {

    private String errorMsg = "";

    private final ContractService contractService;
    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contract")
    public String contract(Model model){
        model.addAttribute("errorMsg", errorMsg);
        errorMsg = "";
        return "contract";
    }
    @PostMapping("/contractnumber")
    public String contract(@RequestParam Integer number){
        if (number == null || number <= 0){
            errorMsg = "Nemáme záporná čísla zakázek";
            return "redirect:/contract";
        }
        if (!contractService.numberExists(number)){
            errorMsg = "Toto číslo zakázky nenalezeno";
            return "redirect:/contract";
        }
        return "redirect:/contractdetail/"+number;
    }

    @GetMapping("/contractdetail/{number}")
    public String contractDetail(@PathVariable Integer number, Model model){
        Contract contract = contractService.getByNumber(number);
        model.addAttribute("contract", contract);
        return "contractdetail";
    }
}
