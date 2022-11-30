package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserServiceImpl service = new UserServiceImpl();

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
