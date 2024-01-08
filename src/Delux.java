public class Delux extends Pizza{
    public Delux(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
        super.takeout();
    }

    @Override
    void addExtraCheese() {

    }

    @Override
    void addExtraTopping() {

    }
}
