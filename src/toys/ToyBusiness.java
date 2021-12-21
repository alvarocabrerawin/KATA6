
package toys;

import toyproducts.Toy;
import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;

public class ToyBusiness {
    /* En el diagrama pone que SerialNumberGenerator debe ser publico, pero en clase
    de practicas se comentó que el diagrama estaria mal,porque no es necesario que desde fuera
    accedan a este metodo */
   final private SerialNumberGenerator generator = new SerialNumberGenerator();
   
    public Toy createToy(String type){
        switch(type){
            case "car":
                CarToy car = new CarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
        }        return null;
    
    }
}   
