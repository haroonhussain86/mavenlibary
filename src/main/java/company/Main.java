package company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<LibraryItem> libraryItems = new ArrayList<LibraryItem>();
        libraryItems.add(new AudioBook("Michael 2208", "", "Haroon", 520));
        libraryItems.add(new Book("Michael 2208", "", "Haroon", 520));

        // generically process each element in arraylist animals
        for (LibraryItem libraryItem: libraryItems)
        {
            System.out.println("this is a "+libraryItem.getType()+" titled " +libraryItem.getTitle()+ " by " + libraryItem.getAuthor());
        }
    }


}
