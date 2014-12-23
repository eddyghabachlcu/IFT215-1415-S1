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
    
    public int getPrice(){
        int m2price, parkingPrice, price;
        switch(location){
            case "North":
                m2price=1000;
                parkingPrice=10000;
                break;
            case "Mount Lebanon":
                m2price=1500;
                parkingPrice=15000;
                break;
            case "Beirut":
                m2price=2000;
                parkingPrice=20000;
                break;
            default: 
                m2price=0;
                parkingPrice=0;
        }
        if(parking==false){
            parkingPrice=0;
        }
        price = (m2price*surface)+parkingPrice;
        return price;
    }
    
    public String getInvoice(){
        String invoice;
        
        invoice="A house at "+location
                +" with a surface of "+surface+" m2";
        if(parking==true){
            invoice+=" including a parking";
        }
        invoice+=" priced "+getPrice()+" was sold to "
                +buyerName;
        return invoice;
    }
    
}
