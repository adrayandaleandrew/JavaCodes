
package StudentDatabase;

public class Info {
    private int ID;
    private String FullName;
    private String Address;
    private String MobNum;
    
    public Info(int id){
        this.ID = id;
    }

    Info(String fullname, String address, String mobnum) {
        
        this.FullName = fullname;
        this.Address = address;
        this.MobNum = mobnum;
//        throw new Info(int id); //To change body of generated methods, choose Tools | Templates.
    }
    public void setFullName(String fullname){
        this.FullName = fullname;
    }
    public void setAddress(String address){
        this.Address = address;
    }
    public void setMobNum(String mobnum){
        this.MobNum = mobnum;
    }

    public int getID(){
        return ID;
    }
    public String getFullName(){
        return FullName;
    }
    public String getAddress(){
        return Address;
    }
    public String getMobNum(){
        return MobNum;
    }
    
    
}
