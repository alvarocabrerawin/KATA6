
package business;

import toyproducts.Toy;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanCarToy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    /* En el diagrama pone que SerialNumberGenerator debe ser publico, pero en clase
    de practicas se comentó que el diagrama estaria mal,porque no es necesario que desde fuera
    accedan a este metodo */
   final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    public abstract Toy createToy(String type);
   /*public  Toy createToy(String type){
       switch(type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
        }        return null;
   }
     
} 
        */ 
    
    
}

