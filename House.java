/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
    /**
     * Constructs a new House object.
     *
     * @param name the name of the house
     * @param address the address of the house
     * @param nFloors the number of floors in the house
     * @param DiningRoom indicates if the house has a dining room
     */
  public House(String name, String address, int nFloors, boolean DiningRoom) {
    super(name, address, nFloors);
    this.residents=new ArrayList<>();
    this.hasDiningRoom=DiningRoom;
    System.out.println("You have built a house: 🏠");
  }
    /**
     * Checks if the house has a dining room.
     *
     * @return true if the house has a dining room, false otherwise
     */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
    /**
     * Returns the number of residents currently in the house.
     *
     * @return the number of residents
     */
  public int nResidents(){
    return residents.size();
  }
    /**
     * Adds a resident to the house.
     *
     * @param name the name of the resident moving in
     */
  public void moveIn(String name){
    if(!residents.contains(name)){
      residents.add(name);
      System.out.println(name+" just moved in!");
    }else{
     System.out.println(name+ " already lives here");
    }
    
  }
    /**
     * Removes a resident from the house.
     *
     * @param name the name of the resident moving out
     * @return the name of the person who moved out, or an error message if they weren't a resident
     */
  public String moveOut(String name){
    if(isResident(name)){
        residents.remove(name);
        System.out.println(name+" just moved out!");
        return name;
    }else{
      System.out.println(name+" doesn't lives here!");
      return "doesn't lives here";
    }
  }
    /**
     * Checks if a given person is a resident of the house.
     *
     * @param person the name of the person to check
     * @return true if the person is a resident, false otherwise
     */
  public boolean isResident(String person){
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House Morris=new House("morris", "Northampton", 3, false);
    System.out.println(Morris.hasDiningRoom());
    Morris.moveIn("Kira");
    Morris.moveOut("Kira");
    Morris.moveOut("Kira");
    Morris.moveIn("Kira");
    Morris.moveOut("Kira");
    System.out.println(Morris.isResident("Kira"));
  }

}