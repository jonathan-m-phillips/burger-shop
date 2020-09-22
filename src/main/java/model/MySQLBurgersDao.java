package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class MySQLBurgersDao implements Burgers {

    private Connection connection;

    public MySQLBurgersDao() {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Long findById(long id) {
        return null;
    }

    @Override
    public List<Burger> all() {
        List<Burger> burgers = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                Burger burger = new Burger(rs.getLong("id"), rs.getString("burger_name"), rs.getString("ingredients"));
                burgers.add(burger);
            }
            return burgers;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return burgers;
    }

//    @Override
//    public long createBurger(Burger burger) {
//        return 0;
//    }
}
