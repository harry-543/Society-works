package com.mycompany.question_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hariprasadlalam
 */
public class Car 
{
     String color;
    double speed;
    double regularPrice;

    public double salePrice()
    {
        return regularPrice;
    }

    static class Truck extends Car
    {
        double weight;
        double getsalePrice;

        public double getsalePrice()
        {
            
            Truck obj = new Truck();
            Car obj2 = new Car();

            obj.weight = 4500;
            
            obj2.regularPrice = 67000;
            
            if(weight > 2300)
            {
                getsalePrice = regularPrice - (0.1 * regularPrice);
            }
            else
                getsalePrice = regularPrice - (0.2 * regularPrice);

            return getsalePrice;
        }

    }
    
    
}
