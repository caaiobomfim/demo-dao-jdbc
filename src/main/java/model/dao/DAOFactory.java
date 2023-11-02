package model.dao;

import db.DB;
import model.dao.impl.SellerDAOJDBCImpl;

public class DAOFactory {

    public static SellerDAO createSellerDAO(){
        return new SellerDAOJDBCImpl(DB.getConnection());
    }
}
