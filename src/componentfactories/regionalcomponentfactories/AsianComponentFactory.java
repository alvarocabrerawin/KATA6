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
import toyproducts.components.asian.AsianEngine;
import toyproducts.components.asian.AsianRotorBlade;
import toyproducts.components.asian.AsianWheel;

/**
 *
 * @author alvar
 */
public class AsianComponentFactory implements ComponentFactory {

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
        
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
        
    }
    
}
