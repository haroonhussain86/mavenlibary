package company.company;

public abstract class Library {

/////////////////////////////////////Attributes//////////////////////////////////////////////

    private String name ;
    private String location;

    /////////////////////////////////////Constructors/////////////////////////////////////////////

    public Library(String name, String location){
        this.name = name;
        this.location = location;
    }

    /////////////////////////////////////Methods//////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
