package coverage2;

public class Home {
    private String name;
    private String address1;
    private String address2;
    
    public Home(String name,String address1){
        this.name=name;
        this.address1=address1;
    }

    //add comments
    public String getName(){
        return name;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
}
