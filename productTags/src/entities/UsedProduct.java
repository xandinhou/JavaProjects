package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + " (Used) $" + price + " (Manucfacture Date: " + sdf.format(manufactureDate) + ")";
	}
}
