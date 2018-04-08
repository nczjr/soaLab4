package zad4;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ListsUtil implements Serializable{

    private List<String> womansKinds;
    private List<String> mansKinds;
    private List<String> frequency;
    private List<String> sex;
    private List<String> money;
    private List<String> colors;
    private List<String> date;
    private List<String> satisfaction;

    public ListsUtil() {
            womansKinds = List.of("Garsonki", "Bluzki", "Spodniczki", "Spodnie");
            mansKinds = List.of("Spodnie", "Spodenki", "Garnitury", "Koszule", "Krawaty");
            frequency = List.of("Codziennie", "Raz w tygodniu", "Raz w miesiacu", "Raz w miesiacu", "Kilka razy w roku");
            sex = List.of("Woman" , "Man");
            money = List.of("do 100 zl", "100 - 500 zl", "500 - 1000 zl","powyzej 1000 zl");
            colors = List.of("Kolorowo-jaskrawe", "Stonowane szarosci","Czarno biale", "Czarno biale", "Sama czern");
            date = List.of("Wczoraj", "W zeszlym tygodniu" , "W zeszlym miesiacu" , "Nie pamietam" );
            satisfaction = List.of("Tak", "Raczej tak", "Raczej nie", "Nie", "Nie wiem");
    }

    public String waist(String sex){
        return sex.equalsIgnoreCase("Woman") ? "Talia" : "Pas";
    }

    public String satisfied(String sex) {
        return sex.equalsIgnoreCase("Woman") ? "zadowolona" : "zadowolony";
    }

    public String did(String sex){
        return sex.equalsIgnoreCase("Woman") ? "robilas" : "robiles";
    }

    public List<String> getKinds(String sex) {
        return sex.equalsIgnoreCase("Woman") ? womansKinds : mansKinds;
    }

    public List<String> getWomansKinds() {
        return womansKinds;
    }

    public List<String> getMansKinds() {
        return mansKinds;
    }

    public List<String> getFrequency() {
        return frequency;
    }

    public List<String> getSex() {
        return sex;
    }

    public List<String> getMoney() {
        return money;
    }

    public List<String> getColors() {
        return colors;
    }

    public List<String> getDate() {
        return date;
    }

    public List<String> getSatisfaction() {
        return satisfaction;
    }
}
