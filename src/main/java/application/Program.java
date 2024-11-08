package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("===== Teste 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n===== Teste 2: seller findByDepartment =====");
        Department department = new Department(2,null);
        List<Seller> sellerList = sellerDao.findByDepartment(department);
        for (Seller sellerDaVez : sellerList) {
            System.out.println(sellerDaVez);
        }

    }
}
