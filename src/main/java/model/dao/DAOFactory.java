package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAOJDBCImpl;
import model.dao.impl.SellerDAOJDBCImpl;

public class DAOFactory {

    public static SellerDAO createSellerDAO(){
        return new SellerDAOJDBCImpl(DB.getConnection());
    }

    public static DepartmentDAO createDepartmentDAO(){
        return new DepartmentDAOJDBCImpl(DB.getConnection());
    }
}
