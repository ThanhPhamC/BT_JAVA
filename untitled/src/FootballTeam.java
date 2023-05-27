import java.util.ArrayList;
import java.util.List;

public class FootballTeam {
    private String name;
    private long valuesTeam;
    private ArrayList<FootballPlayer> footballPlayers = new ArrayList<>();

    public FootballTeam() {
    }

    public FootballTeam(String name, long valuesTeam, ArrayList<FootballPlayer> footballPlayers) {
        this.name = name;
        this.valuesTeam = valuesTeam;
        this.footballPlayers = footballPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValuesTeam() {
        return valuesTeam;
    }

    public void setValuesTeam(long valuesTeam) {
        this.valuesTeam = valuesTeam;
    }

    public ArrayList<FootballPlayer> getFootballPlayers() {
        return footballPlayers;
    }

    public void setFootballPlayers(ArrayList<FootballPlayer> footballPlayers) {
        this.footballPlayers = footballPlayers;
    }

    public void display() {
        System.out.println("FootballTeam name: " + name);
        System.out.println("Value team: " + valuesTeam);
        for (FootballPlayer f : footballPlayers) {
            f.display();
        }
    }

    public double avgAgeTeam() {
        double totalAge = 0;
        for (FootballPlayer f : footballPlayers) {
            totalAge += f.getAge();
        }
        return totalAge / footballPlayers.size();
    }

    public static List<FootballTeam> findMaxValuesTeam(List<FootballTeam> ft) {
        List<FootballTeam> result = new ArrayList<>();
        long max = 0;
        for (int i = 0; i < ft.size(); i++) {
            if (ft.get(i).getValuesTeam() > max) {
                max = ft.get(i).getValuesTeam();
            }
        }
        for (FootballTeam f : ft) {
            if (f.getValuesTeam()==max){
                result.add(f);
            }
        }
        return result;
    }

}
