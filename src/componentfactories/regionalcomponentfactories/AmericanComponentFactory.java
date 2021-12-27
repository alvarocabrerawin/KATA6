/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.american.AmericanEngine;
import toyproducts.components.american.AmericanRotorBlade;
import toyproducts.components.american.AmericanWheel;

/**
 *
 * @author alvar
 */
public class AmericanComponentFactory implements ComponentFactory {

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
        
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
        
    }
    
}
