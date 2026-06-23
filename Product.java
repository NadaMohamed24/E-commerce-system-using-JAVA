
package ecommercesystem;
public class Product {
  private String name;
  private int productId;
  private float price;
// at the product class I have the name the productID the price for any extended product 
  // weive made setters and getters that follow the restrections 
  // constructor to initatilze the products at once not to use to much setters so code may be not clean 
  //setters to perform encapsilation(so any programmer canot enter a non valid data , accesss my data directlty )
        //if you as a programmer wants to change any initalized value 
  // getters to perform encapsulation so I can access the private data out of the class  
    public Product(String name, int productId, float price) {
      setName(name);
      setProductId(productId);
      setPrice(price);
    }

    public void setProductId(int productId) {
            this.productId=Math.abs(productId);     
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
    this.price = Math.abs(price);
    }
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
        /*
1. Product: This is the superclass that represents a generic product. 
    Attributes: 
 productId: positive integer (else take absolute value)
 name: String
 price: positive float (else take absolute value)
Methods: Setters and getters for the attributes.
    */ 

}
