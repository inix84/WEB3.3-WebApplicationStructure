package me.shulinina.web33.model;
        import lombok.Data;
@Data
public class Ingredients {
    private final String nameIngredient;
    private final int  amountOfIngredient;     //ингредиенты
    private final String unitOfMeasurement;    //Единица измерения
    public Ingredients(String nameIngredient, int amountOfIngredient, String unitOfMeasurement) {
        this.nameIngredient = nameIngredient;
        this.amountOfIngredient = amountOfIngredient;
        this.unitOfMeasurement = unitOfMeasurement;
    }
    @Override
    public String toString() {
        return nameIngredient + amountOfIngredient + unitOfMeasurement;
    }
    public String getNameIngredient() {
        return nameIngredient;
    }
    public int getAmountOfIngredient() {
        return amountOfIngredient;
    }
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }
}