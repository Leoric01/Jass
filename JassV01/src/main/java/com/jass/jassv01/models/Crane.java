package com.jass.jassv01.models;

import jakarta.persistence.*;

@Entity
public class Crane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int material;
    private int components;
    private int productionWork;
    private int paint;
    private int assemblyWork;
    private int cargo;
    @ManyToOne
    private Offer offer;

    public Crane() {
    }

    public Crane(String name, int material, int components, int productionWork, int paint, int assemblyWork, int cargo, Offer offer) {
        this.name = name;
        this.material = material;
        this.components = components;
        this.productionWork = productionWork;
        this.paint = paint;
        this.assemblyWork = assemblyWork;
        this.cargo = cargo;
        this.offer = offer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getComponents() {
        return components;
    }

    public void setComponents(int components) {
        this.components = components;
    }

    public int getProductionWork() {
        return productionWork;
    }

    public void setProductionWork(int productionWork) {
        this.productionWork = productionWork;
    }

    public int getPaint() {
        return paint;
    }

    public void setPaint(int paint) {
        this.paint = paint;
    }

    public int getAssemblyWork() {
        return assemblyWork;
    }

    public void setAssemblyWork(int assemblyWork) {
        this.assemblyWork = assemblyWork;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
