
package ecommercesystem;
import ecommercesystem.Order;
public class Cart {
    // I have to take the customer id , i have to instant the order class from here 
private int customerId = 23011170;
private Product products [];
private int nproducts ;


// Is there a way to link between the customerId at customer class and here ???????????
    public Cart(int customerId, int nproducts) {
        setCustomerId(this.customerId);
        setNproducts(this.nproducts);
        //setProducts( new Product[this.nproducts]);
        this.products=new Product[nproducts];
    }
    
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void setNproducts(int nproducts) {
        this.nproducts = nproducts;
        setProducts(new Product[nproducts]);
    }
    public int getCustomerId() {
        return customerId;
    }
    public Product[] getProducts() {
        return products;
    }
    public int getNproducts() {
        return nproducts;
    }   
    public void addProduct (Product product){ 
      

    for ( int i = 0 ; i < products.length; i++){

    if(products[i] == null){
    products[i] = product ;
    return;
    }

}}

   
    public void removeProduct(Product product) {
    if (nproducts == 0) {
        System.out.println("The cart is already empty.");
        return;}
    boolean productRemoved = false;
    for (int i = 0; i < products.length; i++) {
        if (products[i] != null && products[i].equals(product)) {
            // Create a new array with one less element
            Product[] newProducts = new Product[nproducts - 1];

            // Copy elements from the original array to the new array
            int newIndex = 0;
            for (int j = 0; j < products.length; j++) {
                if (j != i) { // Skip the element to be removed
                    newProducts[newIndex] = products[j];
                    newIndex++;}}
            // Update the products array reference
            products = newProducts;
            nproducts--;
            System.out.println("Product removed from cart.");
            productRemoved = true;
            break;}}
    if (!productRemoved) {
        System.out.println("Product not found in cart.");
    }
}
  // why not to give it a parameter
 /* public double calculatePrice (){
     double  totalPrice =0; 
    if (nproducts == 0) {
        System.out.println("The cart is already empty.");       
  }else{
    for (Product product : products) {
        totalPrice += product.getPrice();
    }}  
  return totalPrice;}*/
    public float calculatePrice(){
        float totalPrice=0;
        for(int i=0;i<products.length;i++){
            totalPrice+=products[i].getPrice();
        }
        return totalPrice;
    }
  
  public void placeOrder(){
      Order o = new Order(this.customerId,1,products,calculatePrice ());
   
      this.getCustomerId();
      o.printOrderInfo();
    
  }
  }  
// is it more efficicent to make the return or the else if 
        // I will pass only one object not the whole array 
        // check if the array is full 
        //add product 
        //       performs a check to see if the product object being passed to the addProduct method is null. If it is null, 
//       it prints a message indicating that a null 
//       product cannot be added to the cart. This check helps prevent the addition of invalid or non-existent products to the cart.




//public void removeProduct(Product product) {
//    if (nproducts == 0) {
//        System.out.println("The cart is already empty.");
//        return;
//    }    
//    boolean productRemoved = false;
//    for (int i = 0; i < products.length; i++) {
//        if (products[i] != null && products[i].equals(product)) {
//            products[i] = null;
//            nproducts--;
//            System.out.println("Product removed from cart.");
//            productRemoved = true;
//            break; 
//        }
//    }   
//    if (!productRemoved) {
//        System.out.println("Product not found in cart.");
//    }
//}





//if(index>=0&&index<nproducts){
//    products[index]=product;
//    System.out.println("Product added to cart.");
//   }else
//    System.out.println("Invalid index");