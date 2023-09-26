package com.jass.jassv01.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Demand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;

    private String companyName;
    @OneToOne
    private Contract contract;
    @OneToMany
    private List<Crane> cranes;
//    @ManyToMany
//    private List<Employee> employees;

    public Demand() {
    }

//    public Demand(int number, String companyName, Contract contract, List<Crane> cranes, List<Employee> employees) {
//        this.number = number;
//        this.companyName = companyName;
//        this.contract = contract;
//        this.cranes = cranes;
//        this.employees = employees;
//    }

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

    public List<Crane> getCranes() {
        return cranes;
    }

    public void setCranes(List<Crane> cranes) {
        this.cranes = cranes;
    }

//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return companyName;
    }

    public void setName(String name) {
        this.companyName = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
