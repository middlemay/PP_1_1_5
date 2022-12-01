package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Util.getConnection();
        UserService service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Petr", "Petrov", (byte)30);
        service.saveUser("Mark", "Ivanov", (byte)31);
        service.saveUser("Anna", "Petrova", (byte)32);
        service.saveUser("Maria", "Ivanova", (byte)33);

        System.out.println(service.getAllUsers());
        service.cleanUsersTable();
        service.dropUsersTable();

    }
}
