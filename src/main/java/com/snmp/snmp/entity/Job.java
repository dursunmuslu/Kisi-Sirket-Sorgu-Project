package com.snmp.snmp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Job {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String position;  // Kullanıcının pozisyonu (örneğin: Yazılım Mühendisi)

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;  // Kullanıcı

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;  // Şirket
}
