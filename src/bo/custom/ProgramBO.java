package bo.custom;

import bo.SuperBO;
import dto.ProgramDTO;
import javafx.collections.ObservableList;
import views.tm.ProgramTM;
import views.tm.ProgramTM;

import java.util.List;

public interface ProgramBO extends SuperBO {
    boolean add(ProgramDTO programDTO);
    ObservableList<ProgramTM> find();
    boolean delete(String id);
    boolean update(ProgramDTO programDTO);
    ObservableList<ProgramTM> search(String value);
    List<String> getAllProgramIds();
    ProgramDTO getProgrsmDetails(String id);
    ObservableList<ProgramTM> findStudentProgram(String value);
}
