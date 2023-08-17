package com.management.vently.model;

import com.management.vently.enums.EventType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column
    private String location;

    @Column
    private Byte ticket;

    @Column
    private LocalDate date;

    @Column
    private EventType eventType;

    @Column(nullable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;
}
