package dao;

import entity.Program;

import java.util.List;

public interface queryDAO extends proDA0 {
    List<Program> findProgramDetails(String value);
}
