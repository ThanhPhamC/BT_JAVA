import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FootballPlayer fP1= new FootballPlayer("Pl1",0,"HN",1.80,80,2000);
        FootballPlayer fP2= new FootballPlayer("Pl2",0,"HN",2.80,80,3000);
        FootballPlayer fP3= new FootballPlayer("Pl3",0,"HN",2.80,80,6000);
        FootballPlayer fP4= new FootballPlayer("Pl4",0,"HN",2.80,80,1000);
        fP1.display();
        ArrayList<FootballPlayer> teamList1= new ArrayList<>();
        teamList1.add(fP1);
        teamList1.add(fP2);
        teamList1.add(fP3);
        teamList1.add(fP4);
        FootballTeam fTeam1= new FootballTeam("Team 1",10000000,teamList1);
        FootballPlayer fP5= new FootballPlayer("Pl5",0,"HN",2.80,80,5000);
        FootballPlayer fP6= new FootballPlayer("Pl6",0,"HN",2.80,80,7000);
        FootballPlayer fP7= new FootballPlayer("Pl7",0,"HN",2.80,80,3000);
        FootballPlayer fP8= new FootballPlayer("Pl8",0,"HN",2.80,80,4000);
        ArrayList<FootballPlayer> teamList2= new ArrayList<>();
        teamList2.add(fP5);
        teamList2.add(fP6);
        teamList2.add(fP7);
        FootballTeam fTeam2= new FootballTeam("Team 2",15000000,teamList2);
        FootballPlayer fP9= new FootballPlayer("Pl9",0,"HN",2.80,80,10000);
        FootballPlayer fP10= new FootballPlayer("Pl10",0,"HN",2.80,80,7000);
        FootballPlayer fP11= new FootballPlayer("Pl11",0,"HN",2.80,80,2000);
        FootballPlayer fP12= new FootballPlayer("Pl12",0,"HN",2.80,80,1000);
        FootballPlayer fP13= new FootballPlayer("Pl13",0,"HN",2.80,80,3000);
        FootballPlayer fP14= new FootballPlayer("Pl14",0,"HN",2.80,80,4000);
        ArrayList<FootballPlayer> teamList3= new ArrayList<>();
        teamList3.add(fP9);
        teamList3.add(fP10);
        teamList3.add(fP11);
        teamList3.add(fP12);
        teamList3.add(fP13);
        teamList3.add(fP14);
        FootballTeam fTeam3= new FootballTeam("Team 3",15000000,teamList3);
        ArrayList<FootballTeam> teamArrayList = new ArrayList<>();
        teamArrayList.add(fTeam1);
        teamArrayList.add(fTeam2);
        teamArrayList.add(fTeam3);
        List<FootballTeam> findMaxValuesTeam =FootballTeam.findMaxValuesTeam(teamArrayList);


    }
}