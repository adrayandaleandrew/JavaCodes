
public class sub {
    private String Type;
    private String Brand;
    private String Colour;
    private float Speed;
    private float Price;
    private int Model;
    
    
    public sub(){
        this.Type = "";
        this.Brand = "";
        this.Model = 0;
        this.Colour = "";
        this.Speed = 0;
        this.Price = 0;
    }
    
    //setter
    public void setType(String type){
        this.Type = type;
    }
    public void setBrand(String brand){
        this.Brand = brand;
    }
    public void setModel(int model){
        this.Model = model;
    }
    public void setColour(String colour){
        this.Colour = colour;
    }
    public void setSpeed(float speed){
        this.Speed = speed;
    }
    public void setPrice(float price){
        this.Price = price;
    }
    
    //getter
    public String getType(){
        return Type;
    }
    public String getBrand(){
        return Brand;
    }
    public int getModel(){
        return Model;
    }
    public String getColour(){
        return Colour;
    }
    public float getSpeed(){
        return Speed;
    }
    public float getPrice(){
        return Price;
    }
}
