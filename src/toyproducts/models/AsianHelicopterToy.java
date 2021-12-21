package toyproducts.models;

import toyproducts.Toy;

public class AsianHelicopterToy implements Toy {
    final private Integer serialNumber;
    final String type = "helicopter";

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
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
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber +  '}';
    }
    
    
    
    
    
    
}
