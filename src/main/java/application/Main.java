package application;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

//        System.out.println("===== TEST 1: SELLER FINDBYID =====");
//        Seller seller = sellerDAO.findById(3);
//        System.out.println(seller);

//        System.out.println("===== TEST 2: SELLER FINDBYDEPARTMENT =====");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDAO.findByDepartment(department);
//        for (Seller obj : list){
//            System.out.println(obj);
//        }

//        System.out.println("===== TEST 3: SELLER FINDALL =====");
//        list = sellerDAO.findAll();
//        for (Seller obj : list){
//            System.out.println(obj);
//        }

//        System.out.println("===== TEST 4: SELLER INSERT =====");
//        Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDAO.insert(newseller);
//        System.out.println("INSERTED! NEW ID = " + newseller.getId());

//        System.out.println("===== TEST 5: SELLER UPDATE =====");
//        seller = sellerDAO.findById(1);
//        seller.setName("Maria");
//        sellerDAO.update(seller);
//        System.out.println("UPDATE COMPLETED!");

//        System.out.println("===== TEST 6: SELLER UPDATE =====");
//        System.out.println("ENTER ID FOR DELETE TEST: ");
//        Scanner scanner = new Scanner(System.in);
//        int id = scanner.nextInt();
//        sellerDAO.deleteById(id);
//        System.out.println("DELETE COMPLETED");
//        scanner.close();

        DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();

        System.out.println("===== TEST 1: DEPARTMENT FIND BY ID =====");
        Department department = departmentDAO.findById(1);
        System.out.println(department);

        System.out.println("===== TEST 2: DEPARTMENT FIND ALL =====");
        List<Department> list = departmentDAO.findAll();
        for (Department dep : list){
            System.out.println(dep);
        }

        System.out.println("===== TEST 3: DEPARTMENT INSERT =====");
        Department newDepartment = new Department(null, "Analytics");
        departmentDAO.insert(newDepartment);
        System.out.println("INSERTED! NEW ID = " + newDepartment.getId());

        System.out.println("===== TEST 5: DEPARTMENT UPDATE =====");
        Department department1 = departmentDAO.findById(6);
        department.setName("Marketing");
        departmentDAO.update(department1);
        System.out.println("UPDATE COMPLETED!");

        System.out.println("===== TEST 6: DEPARTMENT UPDATE =====");
        System.out.println("ENTER ID FOR DELETE TEST: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        departmentDAO.deleteById(id);
        System.out.println("DELETE COMPLETED");
        scanner.close();
    }
}