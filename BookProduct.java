package ecommercesystem;
public class BookProduct extends Product {
    
   private String author ;
   private String publisher ;
   
   public BookProduct(String name,int productId,  float price,String author,String publisher){
       super(name,productId,price);
       setAuthor(this.author);
       setPublisher(this.publisher);
   }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
   
   
}
