package dev.ehedei.exerciseob.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents a laptop")
public class LaptopDto {

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Model of laptop")
    private String model;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Manufacturer of laptop")
    private String manufacturer;


    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
