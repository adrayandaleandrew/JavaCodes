class SetupAppStore {
    
    public String Name;
    public  String Type;
    public int Size;
    public int Price;
    public String Developer;
    
    //setters
    public void setName(String name){
        this.Name = name;
    } 
    public void setType(String type){
        this.Type = type;
    }
    public void setSize(int size){
        this.Size = size;
    }
    public void setPrice(int price){
        this.Price = price;
    }
    public void setDeveloper(String developer){
        this.Developer = developer;
    }
    
    //getters
    public String getName(){
        return Name;
    }
    public String getType(){
        return Type;
    }
    public int getSize(){
        return Size;
    }
    public int getPrice(){
        return Price;
    }
    public String getDeveloper(){
        return Developer;
    }
}
