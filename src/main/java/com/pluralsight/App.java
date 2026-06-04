package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

public class App {

    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("");


    }

}
