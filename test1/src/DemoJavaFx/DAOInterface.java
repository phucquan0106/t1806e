package DemoJavaFx;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAOInterface<T> {

    T getByUserPass(String username,String password) throws SQLException;
    void save(T t);
    ArrayList<T> list();
    int update(int id,T t) throws SQLException;
    int delete(int id) throws SQLException;

}
