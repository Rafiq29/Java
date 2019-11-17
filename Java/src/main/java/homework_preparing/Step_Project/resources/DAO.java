package homework_preparing.Step_Project.resources;

import java.util.List;
import java.util.Map;

public interface DAO<T> {
    void add(T data);

    void add(List<T> data);

    T set(int id);

    List<T> getAll();

    //List<T> getBy(Map<K,V>);
    void delete(int id);

    void update(int id, int new_id);//i guess we don't need it
}
