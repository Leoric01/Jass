package com.jass.jassv01.models.DTOs;

public class DemandDto {
    public Integer demandNumber;
    public String companyName;
    public String demandDescription;

    public DemandDto() {
    }

    public DemandDto(int demandNumber, String companyName, String demandDescription) {
        this.demandNumber = demandNumber;
        this.companyName = companyName;
        this.demandDescription = demandDescription;
    }

    public int getDemandNumber() {
        return demandNumber;
    }

    public void setDemandNumber(int demandNumber) {
        this.demandNumber = demandNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDemandDescription() {
        return demandDescription;
    }

    public void setDemandDescription(String demandDescription) {
        this.demandDescription = demandDescription;
    }
}
