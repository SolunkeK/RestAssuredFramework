package payloads;

import java.util.Random;

import com.github.javafaker.Faker;

import pojo.Product;

/*
 * String title;
double price;
String description;
String category;
String image;

Catagories : electronics, furniture, clothing , beauty, books

*/


public class Payload 
{
	Faker faker = new Faker();
	
	Random random =new Random();

	
	Product product; 
	
	String str =  "electronics";
	
	String catagories[] = {"electronics", "furniture", "clothing" , "beauty", "books"};

	public Product productPayload()
	{
		String title = faker.commerce().productName();
		
		double price = Double.parseDouble(faker.commerce().price());
		
		String desription = faker.lorem().sentence();
		
		String catagory = catagories[random.nextInt(catagories.length)];
		
		String image = "";
		
		return new Product(title, price,desription,catagory,image);
		
		
	}
	
}
