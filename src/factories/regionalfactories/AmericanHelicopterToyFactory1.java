package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanSubmarineToy;

public class AmericanHelicopterToyFactory1 extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
         return new AmericanHelicopterToy(serialNumber);
        
    
    }
}  
