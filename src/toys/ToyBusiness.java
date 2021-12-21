
package toys;

public class ToyBusiness {
    /* En el diagrama pone que SerialNumberGenerator debe ser publico, pero en clase
    de practicas se comentó que el diagrama estaria mal,porque no es necesario que desde fuera
    accedan a este metodo */
   final private SerialNumberGenerator generator = new SerialNumberGenerator();
   
    public Car createCar(){
        Car car = new Car(this.generator.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(this.generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
    
}
