package model.dao;

import model.dao.impl.SellerDAOJDBCImpl;

public class DAOFactory {

    public static SellerDAO createSellerDAO(){
        return new SellerDAOJDBCImpl();
    }

}
