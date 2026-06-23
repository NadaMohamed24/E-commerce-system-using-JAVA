package ecommercesystem;
import java.util.Scanner;
public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in );
        
        //At main : create some products    !!!!!!!!!!!!!!!!!!!!!prices
        ElectronicProduct Phones =new ElectronicProduct("Smartphone" ,900856, 200000,"OPPO",1);
        ClothingProduct Hoodies =new ClothingProduct("Hoodie",30097,1059,"Meduim","Melton");
        BookProduct Books =new BookProduct("Ekadolli book" ,200987,125,"Hanan Lashen","3aser el kotob");
        
       // 4. Create a customer with your data: (take it as input from the user)
       // you are gonna be the user
       System.out.println("Welcome to our E-commerce System");
       
       System.out.println("Please, enter your ID :");
       int cID=input.nextInt();
       
       System.out.println("Please, enter your name :");
       String cName=input.next();
       
       System.out.println("Please, enter your address");
       String cAddress =input.next();
       
       Customer c = new Customer (cID,cName,cAddress);
      
       System.out.println("How many product do you expect to buy ");
       int numProducts =input.nextInt();
       c.getCustomerId();
       Cart cart =new Cart(c.getCustomerId(),numProducts);        
        // Add products to the cart
        int nProductsAdded=0; // Track the number of products added
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Choose a product:");
            System.out.println("1. " + Phones.getName());
            System.out.println("2. " + Hoodies.getName());
            System.out.println("3. " + Books.getName());
            System.out.println("To stop adding products: input 0 ");            
            int productType = input.nextInt();
            input.nextLine(); // Consume newline !!!!!!!!!!             
            if ( productType== 0) {
                System.out.println("Stopping input of products.");
                break;
            }
            switch (productType) {
                case 1:
                    cart.addProduct(Phones);
                    // nProductsAdded++;
                    break;
                case 2:
                    cart.addProduct(Hoodies);
                     //nProductsAdded++;
                    break;
                case 3:
                    cart.addProduct(Books);
                    // nProductsAdded++;
                    break;
                default:
                    System.out.println("Invalid product type.");
                     i--; // Decrement i to allow the user to choose again
                    break;}}   // If the user wants to order fewer products than initially specified
       /* if (nProductsAdded < numProducts) {
    System.out.println("You wanted to order " + numProducts + " products, but you added only " + nProductsAdded + " products to the cart.");
    System.out.println("Ordering " + nProductsAdded + " products instead.");}*/
     
     // Ask if the user wants to place an order
        System.out.println("Do you want to place an order?");
        System.out.println("1-> \"Yes\"");
        System.out.println("2-> \"No\"");
        int ans = input.nextInt();
        if (ans==1) {
            cart.placeOrder();
  /*       
//        for (int i = 0; i < cart.getProducts().length; i++) {
//            cart.getProducts()[i] = null; // Reset each element to null
//        }
//        numProducts = 0; // Reset the number of products to 0
    }
        else{
         System.out.println("1->To cancel the order\n2->To add a product\n3->To remove a product");
         int answer =input.nextInt();
         if(answer==1){             
        for (int i = 0; i < cart.getProducts().length; i++) {
            cart.getProducts()[i] = null;} // Reset each element to null
        numProducts = 0; // Reset the number of products to 0 
          System.out.println("Order is cancelled");   
        return; }
         if(answer==2){
             if(numProducts==cart.getProducts().length){
              System.out.println("The cart is full you can not add more");   
             return;}
             System.out.println("Which product do you want to add");
            System.out.println("1. " + Phones.getName());
            System.out.println("2. " + Hoodies.getName());
            System.out.println("3. " + Books.getName());           
            int Type = input.nextInt();
            input.nextLine(); // Consume newline !!!!!!!!!!             
            switch (Type) {
                case 1:
                    cart.addProduct(Phones);
                    break;
                case 2:
                    cart.addProduct(Hoodies);
                    break;
                case 3:
                    cart.addProduct(Books);
                    break;
                default:
                    System.out.println("Invalid product type.");
                    break;}}
          if(answer==3) {
             System.out.println("Which product do you want to remove"); 
            
            System.out.println("1. " + Phones.getName());
            System.out.println("2. " + Hoodies.getName());
            System.out.println("3. " + Books.getName());         
            int product = input.nextInt();
            switch (product) {
                case 1:
                    cart.removeProduct(Phones);
                    break;
                case 2:
                    cart.removeProduct(Hoodies);                    
                    break;
                case 3:
                    cart.removeProduct(Books);
                    break;
                default:
                    System.out.println("Invalid product type.");
                    break;}}   //
          */
         } else {
            System.out.println("thanks for using my system");
        }
    }
}
    





