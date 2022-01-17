package dao;

import entity.SuperEntity;

import java.util.List;

public interface SuperDAO<Entity extends SuperEntity,Id> extends proDA0{
    boolean add(Entity entity);
    boolean update(Entity entity);
    boolean delete(Id s);

    List<Entity> find();

}
