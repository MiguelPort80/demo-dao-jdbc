package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		IO.println("======= TEST 1: Find By Id =======");
		
		Seller seller = sellerDao.findById(3);
		
		IO.println(seller);
		
		IO.println("\n======= TEST 2: Find By Department =======");
		Department dep = new Department(2,null);
		List<Seller> sellers = sellerDao.findByDepartment(dep);
		
		for (Seller seller2 : sellers) {
			IO.println(seller2);
		}
		
	}

}
