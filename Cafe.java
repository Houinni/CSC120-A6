/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    
    public Cafe(String name, String address, int nFloors,int CoffeeOunce,int SugarPackets,int Creams,int Cups) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = CoffeeOunce;
        nSugarPackets = SugarPackets;
        nCreams = Creams;
        nCups = Cups;
    }
    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces < nCoffeeOunces ){
            restock(nCoffeeOunces, 0, 0, 0);
        }
        if(nSugarPackets > this.nSugarPackets ){
            restock(0, nSugarPackets, 0, 0);
        }
        if(nCreams > this.nCreams){
            restock(0, 0, nCreams, 0);
        }
        if(nCups <= 0){
            restock(0, 0, 0, 5);
        }
        else{
            this.nCoffeeOunces-=nCoffeeOunces;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        }
        
    }
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if (nCoffeeOunces > 0){
            this.nCoffeeOunces += nCoffeeOunces;
            System.out.println("restock "+nCoffeeOunces+ " ounces of coffee");
        } 
        if (nSugarPackets > 0){
            this.nSugarPackets += nSugarPackets;
            System.out.println("restock "+ nSugarPackets+" packs of suger");
        }
        if (nCreams > 0){
            this.nCreams += nCreams;
            System.out.println("restock "+ nCreams+ " creams");
        } 
        if (nCups > 0){
            this.nCups += nCups;
            System.out.println("restock "+nCups+" cups");
        } 

    }
    
    public static void main(String[] args) {

    }
    
}
