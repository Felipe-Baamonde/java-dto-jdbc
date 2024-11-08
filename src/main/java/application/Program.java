package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);

        Seller seller = new Seller(21,"Bob", "bob@gmail.com", new Date(),3070.90,department);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
