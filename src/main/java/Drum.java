public class Drum extends Instrument {
    private int pieceCount;
    private String material;

    public Drum(String name, int price, int age, String type, String color,String brand, int pieceCount, String material){
        super(name, price, age, type, color,brand);

        this.pieceCount = pieceCount;
        this.material = material;
    }

    public int getPieceCount(){
        return this.pieceCount;
    }
    public String getMaterial(){
        return this.material;
    }
}
