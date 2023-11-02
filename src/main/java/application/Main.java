package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println("===== TEST 1: SELLER FINDBYID =====");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
        System.out.println("===== TEST 2: SELLER FINDBYDEPARTMENT =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}