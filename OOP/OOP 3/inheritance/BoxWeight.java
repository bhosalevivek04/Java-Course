package com.vivek.inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }

    BoxWeight (BoxWeight other){
        super(other);
        weight= other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //call the parent class constructor
    //  use to initialized values present in parent class
        this.weight = weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
