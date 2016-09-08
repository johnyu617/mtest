package coverage2;

public class Home {
    private String zip;
    private String address1;
    private String city;
    
    public Home(String city, String address1, String zip){
        this.city=city;
        this.address1=address1;
        this.zip=zip;
    }

    //add comments uuuu
    public Home(){
    	reset();
    }
    
    //add comments yyyy
    public void reset(){
        this.city="";
        this.address1="";
        this.zip="";
    }

    //add zip methods
    public String getZip(){
        return zip;
    }
    
    public void setZip(String zip)
    {
    	this.zip=zip;
    }
    
    public void setAddress(String address1)
    {
    	this.address1=address1;
    }
    
    public String getAddress(){
        return address1;
    }
    
    //add city methods
    public String getCity(){
        return city;
    }
    
    public void setCity(String city)
    {
    	this.city=city;
    }

}
