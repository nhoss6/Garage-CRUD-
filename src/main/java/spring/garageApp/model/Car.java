package spring.garageApp.model;

import org.springframework.data.annotation.Id;

@javax.persistence.Entity

@Entity
public class Car {

    public enum Color {
        RED, BLUE, GREEN, YELLOW, BLACK, WHITE, ORANGE, PURPLE, BROWN, PINK, GREY, SILVER, GOLD, OTHER
    }
@Id
    private long id;
    private String model;
    private String brand;
    private int year;
    private Color color;

    public Car() {

    } 

    public Car(long id, String model, String brand, int year, Color color) {
        super();
        this.model = model;
        this.id =id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

}