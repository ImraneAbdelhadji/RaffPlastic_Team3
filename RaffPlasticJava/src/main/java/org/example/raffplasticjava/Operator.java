package org.example.raffplasticjava;

public class Operator {
    private int operatorID;
    private String naam;
    private String rol;

    public Operator(int operatorID, String naam, String rol) {
        this.operatorID = operatorID;
        this.naam = naam;
        this.rol = rol;
    }

    public int getOperatorID() {
        return operatorID;
    }

    public String getNaam() {
        return naam;
    }

    public String getRol() {
        return rol;
    }
}