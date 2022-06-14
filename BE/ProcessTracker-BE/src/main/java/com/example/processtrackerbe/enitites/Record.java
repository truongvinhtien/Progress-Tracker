package com.example.processtrackerbe.enitites;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "record")
public class Record {
    @Id
    @GeneratedValue()
    private Long id;

    @ManyToOne
    private RecordHolder holder;

    private Date createdDate;
    private String description;
}
