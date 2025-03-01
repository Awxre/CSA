public class Main
{
    public static void main(String[] args) {
        int[] myScores1 = new int[9];
        
        BaseballGame game1 = new BaseballGame();
        game1.setT1scores(0,2);
        game1.setT1scores(2,1);
        System.out.println(game1.getT1scores(0));
        System.out.println();
    }
}
