import java.util.ArrayList;
import java.util.List;

public class FootballLeague {
    private String name;
    private long moneyBonus;
    private ArrayList<FootballTeam> footballTeams = new ArrayList<>();

    public FootballLeague() {
    }

    public FootballLeague(String name, long moneyBonus, ArrayList<FootballTeam> footballTeams) {
        this.name = name;
        this.moneyBonus = moneyBonus;
        this.footballTeams = footballTeams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoneyBonus() {
        return moneyBonus;
    }

    public void setMoneyBonus(long moneyBonus) {
        this.moneyBonus = moneyBonus;
    }

    public ArrayList<FootballTeam> getFootballTeams() {
        return footballTeams;
    }

    public void setFootballTeams(ArrayList<FootballTeam> footballTeams) {
        this.footballTeams = footballTeams;
    }

    public void display() {
        System.out.println("League name: " + name);
        for (FootballTeam ft : footballTeams) {
            ft.display();
        }
    }

    public static ArrayList<FootballLeague> getMaxLeagueTeam(ArrayList<FootballLeague> fl) {
        ArrayList<FootballLeague> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < fl.size(); i++) {
            if (fl.get(i).getFootballTeams().size() > max) {
                max = fl.get(i).getFootballTeams().size();
            }
        }
        for (FootballLeague fLeague : fl) {
            if (max == fLeague.getFootballTeams().size() ) {
                result.add(fLeague);
            }
        }
        return result;
    }
}
