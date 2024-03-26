package p20;

 class Product{
	int productID;
	String productName;
	double price;
	
	Product(int productID, String productName, double price){
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	void display() {
		System.out.println("Product ID : "+ productID);
		System.out.println("Product Name: "+ productName);
		System.out.println("Price: "+ price);
			}
 }
 
 class Electronics extends Product{
	 String manufacturer;
	 
	 Electronics(int productID, String productName, double price, String manufacturer){
		
		 super(productID,productName,price);
		 this.manufacturer=manufacturer;
		 
	 }
	 
	 void display() {
		    System.out.println("Product ID : "+ productID);
			System.out.println("Product Name: "+ productName);
			System.out.println("Price: "+ price);
			System.out.println("Manufacturer: "+ manufacturer);
	 }
	 
 }
 
 class Clothing extends Product{
	 String size;
	 String color;
	 
	 Clothing(int productID, String productName, double price, String size, String color){
		 super(productID,productName,price);
		 this.size=size;
		 this.color=color;
	 }
	 void display() {
			System.out.println("Product ID : "+ productID);
			System.out.println("Product Name: "+ productName);
			System.out.println("Price: "+ price);
			System.out.println("Product Size: "+size);
			System.out.println("Product Color: "+color);
				}
	 
 }
 
 class Books extends Product{
	 String author;
	 int pages;
	 Books(int productID, String productName, double price, String author,int pages){
		 super(productID,productName,price);
		 this.author=author;
		 this.pages=pages;
	 }
	 void display() {
			System.out.println("Product ID : "+ productID);
			System.out.println("Product Name: "+ productName);
			System.out.println("Price: "+ price);
			System.out.println("Author: "+ author);
			System.out.println("No. of pages: "+pages);
				}
 }
public class Main {
	public static void main(String args[]) {
		Product e = new Electronics(1,"Laptop",23000,"HP");
		Product c = new Clothing(2,"T-Shirt",350,"L","Blue");
		Product b = new Books(3,"Shatter Me",450,"Tahereh Mafi",750);
		
		e.display();
		c.display();
		b.display();
	}

}
