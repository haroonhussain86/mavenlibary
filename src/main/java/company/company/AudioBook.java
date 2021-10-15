package company.company;

public class AudioBook implements LibraryItem
{
    private String title; // To hold title of the item
    private String category; // To hold title of the item
    private String author; // To hold title of the item
    private Integer size; // To hold title of the item
    private String type;

    //Constructor that accept name as parameter.
    public AudioBook(String title, String category, String author , Integer audioLength)
    {
        this.title = title;
        this.category = category;
        this.author = author;
        this.size = audioLength;
        this.type = "Audiobook";
    }

    // method required to implement the animal interface.
    public String getTitle()
    {
        return title;
    }

    public String getCategory()
    {
        return category;
    }


    public String getAuthor()
    {
        return author;
    }

    public Integer getSize()
    {
        return size;
    }

    public String getType()
    {
        return type;
    }

}