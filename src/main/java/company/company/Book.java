package company.company;

public class Book implements LibraryItem
{
    private String title; // To hold title of the item
    private String category; // To hold category of the item
    private String author; // To hold author of the item
    private Integer size; // To hold size of the item
    private String type; //  To hold type of the item

    //Constructor that accept name as parameter.
    public Book(String title, String category, String author, Integer size )
    {
        this.title = title;
        this.category = category;
        this.author = author;
        this.size = size;
        this.type = "Book";
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