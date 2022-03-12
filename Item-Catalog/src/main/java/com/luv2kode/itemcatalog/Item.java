package com.luv2kode.itemcatalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Item(String name) {
        this.name = name;
    }
}