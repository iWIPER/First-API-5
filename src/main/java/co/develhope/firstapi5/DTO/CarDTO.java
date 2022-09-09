package co.develhope.firstapi5.DTO;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CarDTO {
    @NotBlank (message="Mandatory!")
    private String id;
    @NotBlank (message="Mandatory!")
    private String modelName;
    private double price;


    public CarDTO() {
    }

    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

