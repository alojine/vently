package com.management.vently.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "password")
public class Password {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100, name = "application_name")
    private String applicationName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(nullable = false, name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(nullable = false, name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;
}
