package com.nazrul.model;
// Generated Apr 24, 2017 8:24:38 PM by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private String division;
     private int empId;

    public Users() {
    }

    public Users(String username, String password, String division, int empId) {
       this.username = username;
       this.password = password;
       this.division = division;
       this.empId = empId;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
    }
    public int getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }
public Users(Integer id, String username, String password, String division) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.division = division;
    }

    public Users(String username, String password, String division) {
        this.username = username;
        this.password = password;
        this.division = division;
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }



}


