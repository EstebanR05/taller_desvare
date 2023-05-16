package com.taller.desvare.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idtbl_user;
    private String name;
    private String name_company;
    private String email;
    private String password;

    public Integer getIdtbl_user() {
        return idtbl_user;
    }

    public void setIdtbl_user(Integer idtbl_user) {
        this.idtbl_user = idtbl_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName_company() {
        return name_company;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

}