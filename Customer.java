package ecommercesystem;
public class Customer {
    private int customerId ;
    private String name ;
    private String address ;
    
     public Customer(int customerId, String name, String address) {
       //setCustomerId(this.customerId);
       this.customerId=customerId;
       setName(this.name);
       setAddress(this.address);
      
    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    } 

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    } 
}
