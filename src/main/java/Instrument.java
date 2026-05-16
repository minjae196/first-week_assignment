public class Instrument {
    private String name;
    private int price;
    private int age;
    private String type;
    private String color;
    private String brand;

    public Instrument(String name, int price, int age, String type, String color, String brand) {
        this.name = name;
        this.price = price;
        this.age = age;
        this.type = type;
        this.color = color;
        this.brand = brand;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getType(){
        return this.type;
    }
    public int getAge(){
        return this.age;
    }
    public String getColor(){
        return this.color;
    }
    public String getBrand(){
        return this.brand;
    }

}
