package com.example.tugas6;

public class Country {
    private String name;
    private String description;
    private String rating;
    private String image; // Mengubah tipe data dari int ke String

    public Country(String name, String description, String rating, String image) {
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
