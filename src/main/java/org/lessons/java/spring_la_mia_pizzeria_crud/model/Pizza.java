package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table( name = "pizze")
public class Pizza {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "must not be null, empty or blank")
    private String name;
    @NotBlank(message = "must not be null, empty or blank")
    private String description;
    
    private String image;
    @NotNull
    @Min(value = 0,  message = "the price cannot be negative")
    private BigDecimal price;
    
    
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getImage() {
        return image;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setId (Integer id){
    this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %f ", name, description, image, price);
    }
}
