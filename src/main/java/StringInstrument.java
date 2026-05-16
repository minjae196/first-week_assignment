public class StringInstrument extends Instrument {
    private int numberOfString;
    private String shape;
    private String pickup;

    public StringInstrument(String name, int price, int age, String type, String color,String brand,
                            int numberOfString, String shape, String pickup){

        super(name, price, age, type, color,brand);

        this.numberOfString = numberOfString;
        this.shape = shape;
        this.pickup = pickup;

    }

    public int getNumberOfString(){
        return this.numberOfString;
    }

    public String getShape(){
        return this.shape;
    }

    public String getPickup(){
        return this.pickup;
    }
}
