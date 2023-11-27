package com.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "publisher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    private String address;

    @Column(name = "establishment_year", nullable = false)
    private Integer establishmentYear;

    @OneToMany (mappedBy = "publisher", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Book> bookList;


}
