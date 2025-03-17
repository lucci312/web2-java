package com.example.levanluc.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String fullName;
    private String address;
    private String phone;
    private String avatar;

    @ManyToOne
    @JoinColumn(name = "roleId", nullable = false)
    private Role role;
}
