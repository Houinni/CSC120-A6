/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {
    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      collection=new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }
    public void addTitle(String title){
      collection.put(title,true);
    }
    public String removeTitle(String title){
      if(collection.containsKey(title)){
        collection.remove(title);
        return title;
      }
      else{
        return null;
      }
    }
    public void checkOut(String title){
      if(collection.containsKey(title)){
        collection.replace(title, false);
      }
    }
    public void returnBook(String title){
      if(collection.containsKey(title)){
      collection.replace(title, true);
      }
    }
    public boolean containsTitle(String title){
      if(collection.containsKey(title)){
        return true;
      }
      else{
        return false;
      }
    }
    public boolean isAvailable(String title){
      return collection.get(title);
    }
    public void printCollection(){
      System.out.println("Library Collection:");
      for (String title : collection.keySet()) {
          String status = collection.get(title) ? "Available" : "Checked out";
          System.out.println("- " + title + " (" + status + ")");
      }
    }
    public static void main(String[] args) {
      Library myLibrary = new Library("City Library", "456 Elm St", 3);

      myLibrary.addTitle("The Lorax by Dr. Seuss");
      myLibrary.addTitle("To Kill a Mockingbird by Harper Lee");

      System.out.println("Does the library contain 'The Lorax by Dr. Seuss'? " + myLibrary.containsTitle("The Lorax by Dr. Seuss"));
      System.out.println("Is 'The Lorax by Dr. Seuss' available? " + myLibrary.isAvailable("The Lorax by Dr. Seuss"));

      myLibrary.checkOut("The Lorax by Dr. Seuss");

      System.out.println("Is 'The Lorax by Dr. Seuss' available after checkout? " + myLibrary.isAvailable("The Lorax by Dr. Seuss"));

      myLibrary.printCollection();
    }
  
  }