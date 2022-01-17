package dao;

import dao.custom.impl.ProgramDAOImpl;
import dao.custom.impl.QueryDaoImpl;
import dao.custom.impl.StudentDAOImpl;

public class DAOFactory {
    public static DAOFactory daoFactory;
    private DAOFactory(){

    }
    public static DAOFactory getDaoFactory() {
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public proDA0 getDAO(DAOTypes types){
        switch (types){
            case STUDENT :
                return new StudentDAOImpl();
            case PROGRAM:
                return new ProgramDAOImpl();
            default:
                return null;
            case QUERY:
                return new QueryDaoImpl();
        }
    }
    public enum DAOTypes{
        STUDENT,PROGRAM,QUERY
    }
}
