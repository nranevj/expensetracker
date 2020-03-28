package com.project.expensetracker.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    @OneToMany(orphanRemoval = true)
    private Set<Category> category;
}
