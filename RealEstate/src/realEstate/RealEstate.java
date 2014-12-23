package realEstate;

public class RealEstate {
    private String location;
    private int surface;
    private boolean parking;
    private String buyerName;
    private static final String companyName="LCU Real Estate";
    
    public RealEstate(String location, int surface, 
            boolean parking, String buyerName){
        this.location=location;
        this.surface=surface;
        this.parking=parking;
        this.buyerName=buyerName;
    }
    
    public String getLocation(){
        return location;
    }
    
    public void setLocation(String location){
        this.location=location;
    }
    
    public int getSurface(){
        return surface;
    }
    
    public void setSurface(int surface){
        this.surface=surface;
    }
    
    public boolean hasParking(){
        return parking;
    }
    
    public void setParking(boolean parking){
        this.parking=parking;
    }
    
    public String getBuyerName(){
        return buyerName;
    }
    
    public void setBuyerName(String buyerName){
        this.buyerName=buyerName;
    }
}
