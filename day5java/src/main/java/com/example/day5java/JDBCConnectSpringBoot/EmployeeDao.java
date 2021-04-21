package com.example.day5java.JDBCConnectSpringBoot;

import java.util.List;

public interface EmployeeDao {

    List<Employee> showAllData();

    void createTable();

    void insertData(Employee employee);

    void deleteData(String id);

    void deleteTable();
}
