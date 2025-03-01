
public class BaseballGame
{
    private String team1;
    private String team2;
    private int[] t1scores;
    private int[] t2scores;

    public BaseballGame()
    {
        t1scores = new int[9];
        t2scores = new int[9];
    }
    
    public BaseballGame(int numOfInnings)
    {
        t1scores = new int[numOfInnings];
        t2scores = new int[numOfInnings];
    }
    public BaseballGame(int numOfInnings, String t1, String t2)
    {
        t1scores = new int[numOfInnings];
        t2scores = new int[numOfInnings];
        team1 = t1;
        team2 = t2;
    }
    
    public String getTeam1(){
        return this.team1;
    }

    public void setTeam1(String team1){
        this.team1 = team1;
    }

    public String getTeam2(){
        return this.team2;
    }

    public void setTeam2(String team2){
        this.team2 = team2;
    }

    public int getT1scores(int inning){
        return this.t1scores[inning];
    }

    public void setT1scores(int inning, int score){
        if (inning >= 1 && t1scores[inning-1] == 0) {
            System.out.println("Attempting to set wrong inning");
        } else {
            this.t1scores[inning] = score;
        }
    }
    
    public void setT1scores(int[] arr) {
        t1scores = arr;
    }

    public int getT2scores(int inning){
        return this.t2scores[inning];
    }

    public void setT2scores(int inning, int score){
        if (inning <= 1 && t2scores[inning-1] == 0) {
            System.out.println("Attempting to set wrong inning");
        } else {
            this.t2scores = t2scores;
        }
    }
    
    public void setT2scores(int[] arr) {
        t2scores = arr;
    }
    
    public String winner() {
        int t1total = 0;
        int t2total = 0;
        if (t1scores[t1scores.length-1] != 0 && t2scores[t2scores.length-1] != 0) {
            for (int i=0; i < t1scores.length; i++) {
                t1total += t1scores[i];
                t2total += t2scores[i];
            }
            if (t1total > t2total) {
                return "Team 1 Wins!!";
            } else if (t1total < t2total) {
                return "Team 2 Wins!!";
            } else {
                return "Game is a tie!";
            }
        }
        return "Game is not over yet";
    }
}