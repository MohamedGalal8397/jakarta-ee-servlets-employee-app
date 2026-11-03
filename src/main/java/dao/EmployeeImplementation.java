/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Employee;

/**
 *
 * @author log
 */
public class EmployeeImplementation implements EmployeeDao {

    @Override
    public Employee getEmployeeById(int id) {
    
    Connection connection = DBConnection.getConnection();
    Employee employee= new Employee() ;
    String query ="select * from Employees where EmployeeID= ? ";
    
    if (connection == null){
        System.out.println("Connection is failed");
       employee.setFirstName("mohamed"); // third step
    }else{
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)){
        
             preparedStatement.setInt(1,id);
                ResultSet resultSet = preparedStatement.executeQuery();
                employee.setFirstName("galal"); // second step
                   while (resultSet.next()){
                    
                    employee.setEmployeeAddress(resultSet.getNString("Address"));
                    employee.setEmployeeCity(resultSet.getNString("City"));
                    employee.setEmployeeCountry(resultSet.getNString("Country"));
                    //employee.setFirstName("galal");
                    employee.setSecondName(resultSet.getNString("SecondName"));
                    employee.setId(resultSet.getInt("EmployeeID"));
        }
        }catch(Exception exception){
         exception.printStackTrace();
        }finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }
    }
    return employee;
    }
    
    
    
    
    
    
    
}
