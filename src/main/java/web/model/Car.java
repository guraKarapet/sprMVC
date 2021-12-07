package web.controller;

public class Car {
    private String model;
    private int age;
    private int series;

    public Car(String model, int age, int series) {
        this.model = model;
        this.age = age;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public int getSeries() {
        return series;
    }
}
