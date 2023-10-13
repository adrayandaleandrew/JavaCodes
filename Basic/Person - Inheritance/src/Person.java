
public class Person {
    public String Name;
    public int Age;
    public String Gender;
    
    public Person(){
        this.Name = "";
        this.Age = 0;
        this.Gender = "";
    }
    
    public void setName(String name){
        this.Name = name;
    }
    public void setAge(int age){
        this.Age = age;
    }
    public void setGender(String gender){
        this.Gender = gender;
    }
    
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    } 
    public String getGender(){
        return Gender;
    }
}
