/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author log
 */
package model ;
public class Employee {
  
     private int id ;
     private String firstName ;
     private String secondName ;
     private  String employeeTitle ;
     private String employeeBirthDate ;
     private String employeeHireDat ;
     private String employeeAddress;
     private  String  employeeCity;
     private String employeeRegion ;
     private String employeePostalCode ;
     private String employeeCountry ;
     private String employeePhone ;

    public Employee() {
    }

    public Employee(int id, String firstName, String secondName, String employeeCity, String employeePhone) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.employeeCity = employeeCity;
        this.employeePhone = employeePhone;
    }

    public Employee(int id, String firstName, String secondName, String employeeTitle, String employeeBirthDate, String employeeHireDat, String employeeAddress, String employeeCity, String employeeRegion, String employeePostalCode, String employeeCountry, String employeePhone) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.employeeTitle = employeeTitle;
        this.employeeBirthDate = employeeBirthDate;
        this.employeeHireDat = employeeHireDat;
        this.employeeAddress = employeeAddress;
        this.employeeCity = employeeCity;
        this.employeeRegion = employeeRegion;
        this.employeePostalCode = employeePostalCode;
        this.employeeCountry = employeeCountry;
        this.employeePhone = employeePhone;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public String getEmployeeBirthDate() {
        return employeeBirthDate;
    }

    public String getEmployeeHireDat() {
        return employeeHireDat;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public String getEmployeeRegion() {
        return employeeRegion;
    }

    public String getEmployeePostalCode() {
        return employeePostalCode;
    }

    public String getEmployeeCountry() {
        return employeeCountry;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public void setEmployeeBirthDate(String employeeBirthDate) {
        this.employeeBirthDate = employeeBirthDate;
    }

    public void setEmployeeHireDat(String employeeHireDat) {
        this.employeeHireDat = employeeHireDat;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public void setEmployeeRegion(String employeeRegion) {
        this.employeeRegion = employeeRegion;
    }

    public void setEmployeePostalCode(String employeePostalCode) {
        this.employeePostalCode = employeePostalCode;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", employeeTitle=" + employeeTitle + ", employeeBirthDate=" + employeeBirthDate + ", employeeHireDat=" + employeeHireDat + ", employeeAddress=" + employeeAddress + ", employeeCity=" + employeeCity + ", employeeRegion=" + employeeRegion + ", employeePostalCode=" + employeePostalCode + ", employeeCountry=" + employeeCountry + ", employeePhone=" + employeePhone + '}';
    }
     
     
    
    
    
    
    
}
