
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        
        String fileName = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        int gameCount = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner sc = new Scanner(Paths.get(fileName))){
            while(sc.hasNextLine()){
                String match = sc.nextLine();
                if(match.contains(team)){
                    gameCount += 1;
                    String[] matchRecords = match.split(",");
                    String hometeam = matchRecords[0];
                    String awayTeam = matchRecords[1];
                    int homeScore = Integer.valueOf(matchRecords[2]);
                    int awayScore = Integer.valueOf(matchRecords[3]);
                    if(team.equals(hometeam)){
                        if(homeScore > awayScore){
                            wins += 1;
                        }
                        else{
                            losses += 1;
                        }
                    }
                    else{
                        if(awayScore > homeScore){
                            wins += 1;
                        }
                        else{
                            losses += 1;
                        }
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println("Unable to read file " + fileName);
        }
        
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
