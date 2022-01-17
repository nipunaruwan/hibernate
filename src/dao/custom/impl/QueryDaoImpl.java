package dao.custom.impl;


import dao.queryDAO;
import entity.Program;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import utill.FactoryConfiguration;

import java.util.List;

public class QueryDaoImpl implements queryDAO {
    @Override
    public List<Program> findProgramDetails(String value) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        String sql = "select p.* from Student_Program sp inner join Program p ON sp.programList_programId = p.programId where sp.studentList_regNo=?1";
        NativeQuery nativeQuery = session.createNativeQuery(sql).addEntity(Program.class);
        nativeQuery.setParameter(1, value);
        List list = nativeQuery.list();
        transaction.commit();
       session.close();
        return list;


    }
}
