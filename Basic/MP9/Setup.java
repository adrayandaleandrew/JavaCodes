
package MP9;
import java.util.ArrayList;
import java.util.List;

public class Setup {
    //CLUBS
    private List<Clubs> clubs = new ArrayList<Clubs>();
    public void addClubs(String club, String ranks){
        clubs.add(new Clubs(club,ranks));
    }
    public void showClubs(){
        System.out.println("------------------------------------");
        for(Clubs c:clubs){
            System.out.print(c.getRank() + " of " + c.getClubs());
        }
        System.out.println();
    }
    
    //HEARTS
    private List<Heart> heart = new ArrayList<Heart>();
    public void addHearts(String hearts,String ranks){
        heart.add(new Heart(hearts,ranks));
    }
    public void showHearts(){
        System.out.println("------------------------------------");
        for(Heart h: heart){
            System.out.println(h.getRank() + " of " + h.getHeart());
        }
        System.out.println();
    }
    
    //DIAMONDS
    private List<Diamond> dia = new ArrayList<Diamond>();
    public void addDiamonds(String diamonds,String ranks){
        dia.add(new Diamond(diamonds,ranks));
    }
    public void showDiamonds(){
        for(Diamond d: dia){
            System.out.println(d.getRank() + " of " + d.getDiamond());
        }
        System.out.println();
    }
    
    //SPADES
    private List<Spade> spayd = new ArrayList<Spade>();
    public void addSpade(String spades,String ranks){
        spayd.add(new Spade(spades,ranks));
    }
    public void showSpade(){
        for(Spade s: spayd){
            System.out.println(s.getRank() + " of " + s.getSpade());
        }
    }
}
