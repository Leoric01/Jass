package com.jass.jassv01.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;

    private String companyName;
    @OneToOne
    private Contract contract;
    @OneToOne
    private Demand demand;
    @OneToMany
    private List<Crane> cranes;
    @ManyToMany
    private List<Employee> employees;

    public Offer() {
    }

    public Offer(int number, String companyName, Contract contract, Demand demand, List<Crane> cranes, List<Employee> employees) {
        this.number = number;
        this.companyName = companyName;
        this.contract = contract;
        this.demand = demand;
        this.cranes = cranes;
        this.employees = employees;
    }

    public Offer(int number, String companyName, Demand demand) {
        this.number = number;
        this.companyName = companyName;
        this.demand = demand;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Demand getDemand() {
        return demand;
    }

    public void setDemand(Demand demand) {
        this.demand = demand;
    }

    public List<Crane> getCranes() {
        return cranes;
    }

    public void setCranes(List<Crane> cranes) {
        this.cranes = cranes;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
