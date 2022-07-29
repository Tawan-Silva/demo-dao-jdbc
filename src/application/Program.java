package application;

import java.util.Date;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "Books"); 
		
		
		Seller seller = new Seller(21, "Tawan", "tawan.tls43@gmail.com", new Date(), 6000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
