/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups; 
    /**
     * Constructs a new Cafe object.
     *
     * @param name the name of the cafe
     * @param address the address of the cafe
     * @param nFloors the number of floors in the cafe
     * @param CoffeeOunce the initial amount of coffee in ounces
     * @param SugarPackets the initial number of sugar packets
     * @param Creams the initial number of creams
     * @param Cups the initial number of cups
     */
    public Cafe(String name, String address, int nFloors,int CoffeeOunce,int SugarPackets,int Creams,int Cups) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = CoffeeOunce;
        nSugarPackets = SugarPackets;
        nCreams = Creams;
        nCups = Cups;
    }
    /**
     * Sells a coffee and decreases inventory accordingly.
     *
     * @param size the size of the coffee in ounces
     * @param nSugarPackets the number of sugar packets
     * @param nCreams the number of creams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        
        if (this.nCoffeeOunces < size) {
            restock(size - this.nCoffeeOunces, 0, 0, 0);
        }
        if (this.nSugarPackets < nSugarPackets) {
            restock(0, nSugarPackets - this.nSugarPackets, 0, 0);
        }
        if (this.nCreams < nCreams) {
            restock(0, 0, nCreams - this.nCreams, 0);
        }
        if (this.nCups <= 0) {
            restock(0, 0, 0, 5);
        }
    
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && 
            this.nCreams >= nCreams && this.nCups > 0) {
            this.nCoffeeOunces-=size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Sold coffee: " + size + "oz, " + nSugarPackets + " sugar packets, " + nCreams + " creams.");
        }  else {
            System.out.println("Unable to complete sale due to insufficient stock.");
        }
        
    }
/**
 * Restocks the cafe's inventory with the specified amounts of coffee, sugar packets, cream, and cups.
 * Only non-zero values are added to the inventory.
 *
 * @param nCoffeeOunces the amount of coffee (in ounces) to add to the inventory
 * @param nSugarPackets the number of sugar packets to add to the inventory
 * @param nCreams the number of cream units to add to the inventory
 * @param nCups the number of cups to add to the inventory
 */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if (nCoffeeOunces > 0){
            System.out.println("restock "+nCoffeeOunces+ " ounces of coffee");
            this.nCoffeeOunces += nCoffeeOunces;
        } 
        if (nSugarPackets > 0){
            System.out.println("restock "+ nSugarPackets+" packs of suger");
            this.nSugarPackets += nSugarPackets;
        }
        if (nCreams > 0){
            System.out.println("restock "+ nCreams+ " creams");
            this.nCreams += nCreams;
        } 
        if (nCups > 0){
            System.out.println("restock "+nCups+" cups");
            this.nCups += nCups;
        } 

    }
    
    public static void main(String[] args) {
    
    } 
}
