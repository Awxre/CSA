public class Main
{
    public static void main(String[] args) {
        int[] myScores1 = {5,12,4,1,2,6,1,1,9};
        int[] myScores2 = {2,5,1,10,4,2,1,5,5};
        BaseballGame game1 = new BaseballGame();
        game1.setT1scores(0,2);
        game1.setT1scores(2,1); // Show wrong inning error
        System.out.println(game1.getT1scores(0));
        game1.setT1scores(myScores1);
        game1.setT2scores(myScores2);
        System.out.println(game1.getT2scores(4));
        System.out.println(game1.winner());

        int[] myScores3 = {5,12,4,1,2,6,1};
        int[] myScores4 = {2,5,1,10,4,2,12};
        HighSchoolBaseballGame game2 = new HighSchoolBaseballGame();
        game2.setT1scores(0,2);
        game2.setT1scores(2,1); // Show wrong inning error
        System.out.println(game2.getT1scores(0));
        game2.setT1scores(myScores3);
        game2.setT2scores(myScores4);
        System.out.println(game2.getT2scores(4));
        System.out.println(game2.winner());

        int[] myScores5 = {5,12,4,1,2,6};
        LittleLeagueBaseballGame game3 = new LittleLeagueBaseballGame();
        game3.setT1scores(0,2);
        game3.setT1scores(1,1);
        System.out.println(game3.getT1scores(0));
        game3.setT1scores(myScores5);
        game3.setT2scores(myScores5);
        System.out.println(game3.getT2scores(4));
        System.out.println(game3.winner());
    }
}
