package aplication;

import java.util.List;
import java.util.Scanner;

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
		

		IO.println("\n======= TEST 3: Find All =======");
		List<Seller> list = sellerDao.findAll();
		
		for (Seller seller2 : list) {
			IO.println(seller2);
		}
		
		IO.println("\n======= TEST 4: seller Insert =======");
		/*Seller obj = new Seller(null, "Layne Stanley", "aliceinchains@gmail.com", new Date(), 4000.00, dep);
		sellerDao.insert(obj);
		System.out.println("Returned id: "+ obj.getId());*/
		
		IO.println("\n======= TEST 5: seller update =======");
		seller = sellerDao.findById(2);
		seller.setSalary(3300.0);
		sellerDao.update(seller);
		System.out.println("Updated");

		
		IO.println("\n======= TEST 6: seller update =======");
		IO.print("Digite um id: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		IO.println("Delete complete");
	}

}
