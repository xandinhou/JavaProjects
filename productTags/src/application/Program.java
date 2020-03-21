package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();
		sc.hasNextLine();
		
		for(int i = 0; i < quantity ; i++) {
			System.out.printf("Product #%d Data:",i+1);
			System.out.print("Cummon,Used or Imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(type == 'c') {
				list.add(new Product(name,price));
			}
			if(type == 'u') {
				System.out.print("Manufacture Date: ");
				Date x1 = sdf.parse(sc.next());
				sc.nextLine();
				list.add(new UsedProduct(name,price,x1));
			}
			if(type == 'i') {
				System.out.print("Custom Fee: ");
				double fee = sc.nextDouble();
				sc.nextLine();
				list.add(new ImportedProduct(name,price,fee));
			}
		}
		
		for(Product obj : list) {
			System.out.println(obj.priceTag());
		}
		
		
		sc.close();

	}

}
