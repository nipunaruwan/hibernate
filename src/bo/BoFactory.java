package bo;

import bo.custom.impl.ProgramBOImpl;
import bo.custom.impl.StudentBOImpl;

public class BoFactory {
    private static BOFactory boFactory;

    private void BOFactory(){

    }
    public static BOFactory getBoFactory(){
        if(boFactory == null){
            boFactory =new BOFactory();
        }
        return boFactory;
    }
    public SuperBO getBo(BoTypes types){
        switch (types){
            case STUDENT:
                return new StudentBOImpl();
            case PROGRAM:
                return new ProgramBOImpl();
            default:
                return  null;
        }
    }
    public enum BoTypes{
        STUDENT,PROGRAM
    }

    private static class BOFactory {
    }
}
