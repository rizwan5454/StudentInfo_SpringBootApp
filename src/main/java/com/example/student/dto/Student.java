package com.example.student.dto;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "student")
public @Data
class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stdId;
    private String stdName;
    private String stdEmail;
}

