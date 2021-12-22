import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
public class Main {

   
    public static void main(String[] args) {
        //ToyBusiness business = new AmericanToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        AmericanToyFactory americanToyFactory = new AmericanToyFactory();
        AsianToyFactory asianToyFactory = new AsianToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness(asianToyFactory);
        Scanner in = new Scanner(System.in); 
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            switch(line){
            case "car":
            case "helicopter":
                toys.add(toyBusiness.produceToy(line));
                System.out.println("Toys: "+ toys.stream().map(c->c.toString()).collect(Collectors.joining(", ")));
                break;
            
            case "exit":
                System.out.println("Exiting...");
                break;
         
              default:
                System.out.println("Command unknown!");
            }
        }

    }

    public Main() {
    }
}