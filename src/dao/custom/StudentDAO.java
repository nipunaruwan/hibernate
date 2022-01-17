package dao.custom;

import dao.SuperDAO;
import entity.Student;

import java.util.List;

public interface StudentDAO extends SuperDAO<Student, String> {
    boolean register(Student student, String cmb1, String cmb2, String cmb3);

    boolean deleteRegister(Student student, String cmb1, String cmb2, String cmb3);

    List<Student> searchStudent(String value);

    boolean update(String studentRegNo, String cmb1);

}
