package bo.custom;

import bo.SuperBO;
import dto.StudentDTO;
import javafx.collections.ObservableList;
import views.tm.StudentTM;
import views.tm.StudentTM;

public interface StudentBO extends SuperBO {
    boolean add(StudentDTO studentDTO);
  ObservableList<StudentTM> find();
    boolean delete(String id);
    boolean update(StudentDTO studentDTO);
    ObservableList<StudentTM> search(String value);
}
