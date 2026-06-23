
package ecommercesystem;
public class ClothingProduct extends Product{
private String size ;
private String fabric ;
// only added the size and fabric and extends the super class 
//products to make use of its feilds and initalized it bby super ()keyword at classProduct constructor 
public ClothingProduct( String name ,int productId,float price ,String size ,String fabric){
    super(name,productId,price);
    setSize(this.size);
    setFabric(this.fabric);    
}
    public void setSize(String size) {
        this.size = size;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }    
}
