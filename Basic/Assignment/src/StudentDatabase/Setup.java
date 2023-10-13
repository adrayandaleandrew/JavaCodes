package StudentDatabase;
import java.util.HashMap;
import java.util.Map;

public class Setup {
    private Map<Integer, Info> info = new HashMap<Integer, Info>();
    public void addInfo(int id, String fullname, String address, String mobnum){
        info.put(id,new Info(fullname, address, mobnum));
    }
    public void showInfo(int infoNumber){
        System.out.printf("%-20s%10s%10s\n","FullName","Address","Mobile Number");
        System.out.printf("%-20s%10s%10s%20s\n",
                info.get(infoNumber).getFullName(),
                info.get(infoNumber).getAddress(),
                info.get(infoNumber).getMobNum()
                );
    }
    
}
