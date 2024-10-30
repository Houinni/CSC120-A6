/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean DiningRoom) {
    super(name, address, nFloors);
    residents=new ArrayList<>();
    residents.add(name);
    hasDiningRoom=DiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  public int nResidents(){
    return residents.size();
  }

  public void moveIn(String name){
    if(!residents.contains(name)){
      residents.add(name);
      System.out.println(name+" just moved in!");
    }else{
      System.out.println("Already lives here");
    }
    
  }

  public void moveOut(String name){
    if(residents.contains(name)){
      residents.remove(name);
      System.out.println(name+" just moved out!");
    }else{
      System.out.println("couldn't find this resident");
    }
  }

  public boolean isResident(String person){
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House Morris=new House("morris", "Northampton", 3, false);
    System.out.println(Morris.hasDiningRoom());
    Morris.moveIn("Kira");
    Morris.moveOut("Kira");
    Morris.moveOut("Kira");
    System.out.println(Morris.isResident("Kira"));
  }

}