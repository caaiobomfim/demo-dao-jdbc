package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);
        Seller seller = new Seller(21, "Lucas", "lucas@mail.com", new Date(), 3000.0, department);
        System.out.println(seller);
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
    }
}