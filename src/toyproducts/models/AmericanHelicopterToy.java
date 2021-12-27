package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;

public class AmericanHelicopterToy implements Toy {
    final private Integer serialNumber;
    final String type = "helicopter";
    final ComponentFactory factory;
    private Engine engine;
    private RotorBlade rotorBlade;

    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Labelling '%s' '%d\n'", this.type, this.serialNumber);
        
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        this.rotorBlade = this.factory.createRotorBlade();
        
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber +  '}';
    }
    
    
    
    
    
    
}
