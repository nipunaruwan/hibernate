package bo.custom.impl;

import bo.custom.ProgramBO;
import dao.DAOFactory;
import dao.custom.impl.ProgramDAOImpl;
import dao.custom.impl.QueryDaoImpl;
import dto.ProgramDTO;
import entity.Program;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import views.tm.ProgramTM;
import views.tm.ProgramTM;

import java.util.List;

public class ProgramBOImpl implements ProgramBO {
    ProgramDAOImpl programDAO = (ProgramDAOImpl) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.PROGRAM);
   QueryDaoImpl queryDAO=(QueryDaoImpl)  DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.QUERY);
    @Override
    public boolean add(ProgramDTO programDTO) {
        return programDAO.add(new Program(
                programDTO.getProgramId(),
                programDTO.getProgramName(),
                programDTO.getDuration(),
                programDTO.getFee()
        ));
    }

    @Override
    public ObservableList<ProgramTM> find() {
        List<Program> list = programDAO.find();
        ObservableList<ProgramTM> dtoArrayList = FXCollections.observableArrayList();
        // ProgramDTO programDTO=null;

        for (Program program : list) {
            dtoArrayList.add(new ProgramTM(
                    program.getProgramId(),
                    program.getProgramName(),
                    program.getDuration(),
                    program.getFee()
            ));
        }
        return dtoArrayList;
    }

    @Override
    public boolean delete(String id) {
        return programDAO.delete(id);
    }

    @Override
    public boolean update(ProgramDTO programDTO) {
        return programDAO.update(new Program(
                programDTO.getProgramId(),
                programDTO.getProgramName(),
                programDTO.getDuration(),
                programDTO.getFee()
        ));
    }

    @Override
    public ObservableList<ProgramTM> search(String value) {
        List<Program> list = programDAO.searchPrograms(value);
        ObservableList<ProgramTM> dtoArrayList = FXCollections.observableArrayList();
        for (Program program : list) {
            dtoArrayList.add(new ProgramTM(
                    program.getProgramId(),
                    program.getProgramName(),
                    program.getDuration(),
                    program.getFee()
            ));
        }
        return dtoArrayList;
    }

    @Override
    public List<String> getAllProgramIds() {
        return programDAO.getAllProgrammeId();
    }

    @Override
    public ProgramDTO getProgrsmDetails(String id) {
        return programDAO.getProgramList(id);
    }

    @Override
    public ObservableList<ProgramTM> findStudentProgram(String value) {
        List<Program> list = queryDAO.findProgramDetails(value);
        ObservableList<ProgramTM> dtoArrayList = FXCollections.observableArrayList();

        ProgramDTO programDTO = null;

        for (Program program : list
        ) {
            dtoArrayList.add(new ProgramTM(
                    program.getProgramId(),
                    program.getProgramName(),
                    program.getDuration(),
                    program.getFee()
            ));

        }
        return dtoArrayList;
    }

}
