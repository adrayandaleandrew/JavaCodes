
public class LabActivity1 {
    public static void main(String[] args) {
       
       String str = "FEU INSTITUTE OF TECHNOLOGY";
       String [] words = str.split(" ",3);
       
        System.out.println("1. " + str.charAt(2));
        
        System.out.println("2. " + str.length());
        
        System.out.println("3. " + str.indexOf("TECHNOLOGY"));
        
        if(str.startsWith("FEU"))
            System.out.println("4. " + "Yes");
        else
            System.out.println("4. " + "NO");
        
        if(str.endsWith("LOGY"))
            System.out.println("5. " + "Yes");
        else
            System.out.println("5. " + "NO");
        
        System.out.println("6. " + str.substring(4,13));
        
        System.out.println("7. " + str.toLowerCase());
        
        int number = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'E'){
                number++;
            }
        }
        
        System.out.println("8. " + number);
        System.out.println("9. " + str.replace('O', '0'));
        System.out.println("10. " + str.hashCode());
    }
}
