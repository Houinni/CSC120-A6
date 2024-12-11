/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;

  /**
   * Constructs a new Library object.
   *
   * @param name    the name of the library
   * @param address the address of the library
   * @param nFloors the number of floors in the library
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    collection = new Hashtable<>();
    System.out.println("You have built a library: 📖");
  }

  /**
   * Adds a book title to the library's collection.
   *
   * @param title the title of the book to add
   */
  public void addTitle(String title) {
    if (!collection.containsKey(title)) {
      collection.put(title, true);
    } else {
      throw new RuntimeException("The book is already in the library");
    }

  }

  /**
   * Removes a book title from the library's collection.
   *
   * @param title the title of the book to remove
   * @return the removed title if it existed, or null otherwise
   */
  public String removeTitle(String title) {
    if (collection.containsKey(title)) {
      collection.remove(title);
      return title;
    } else {
      throw new RuntimeException("The book is not in the library");
    }
  }

  /**
   * Checks out a book, setting its availability to false.
   *
   * @param title the title of the book to check out
   */
  public void checkOut(String title) {
    if (collection.containsKey(title)) {
      collection.replace(title, false);
    } else {
      throw new RuntimeException("Can't checkout the book");
    }
  }

  /**
   * Returns a book, setting its availability to true.
   *
   * @param title the title of the book to return
   */
  public void returnBook(String title) {
    if (collection.containsKey(title)) {
      collection.replace(title, true);
    } else {
      throw new RuntimeException("Can't return the book");
    }
  }

  /**
   * Checks if the library contains a specific title.
   *
   * @param title the title to check
   * @return true if the title is in the collection, false otherwise
   */
  public boolean containsTitle(String title) {
    if (collection.containsKey(title)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Checks if a book is available.
   *
   * @param title the title to check
   * @return true if the book is available, false otherwise
   */
  public boolean isAvailable(String title) {
    return collection.get(title);
  }

  /**
   * Prints the library's collection and each book's availability.
   */
  public void printCollection() {
    System.out.println("Library Collection:");
    for (String title : collection.keySet()) {
      String status = collection.get(title) ? "Available" : "Checked out";
      System.out.println("- " + title + " (" + status + ")");
    }
  }

  public static void main(String[] args) {
  }

}