import java.util.Scanner;

class Innings {
    private String battingTeam;
    private int runs;

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Innings[] inningsArray = new Innings[2];

        for (int i = 0; i < 2; i++) {
            inningsArray[i] = new Innings();

            System.out.println("Enter details for Innings " + (i + 1) + ":");

            System.out.print("Enter the batting team: ");
            String battingTeam = scanner.nextLine();
            inningsArray[i].setBattingTeam(battingTeam);

            System.out.print("Enter the runs scored: ");
            int runs = scanner.nextInt();
            scanner.nextLine(); 
            inningsArray[i].setRuns(runs);
        }

        System.out.println("\nDetails of the innings:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Innings " + (i + 1) + ":");
            System.out.println("Batting Team: " + inningsArray[i].getBattingTeam());
            System.out.println("Runs Scored: " + inningsArray[i].getRuns());
        }

        scanner.close();
    }
}
