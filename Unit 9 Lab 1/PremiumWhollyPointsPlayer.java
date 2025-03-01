public class PremiumWhollyPointsPlayer extends WhollyPointsPlayer {
    int[] premiumHighScores = new int[40];

    public PremiumWhollyPointsPlayer() {
        super();
    }
    
    int getHighScore(int lvl) {
        if (lvl > premiumHighScores.length || lvl <= 0) {
            System.out.println("ERR: Level does not exist!");
            return -1;
        } else {
            return premiumHighScores[lvl - 1];
        }
    }
    void setHighScore(int lvl, int score) {
        if (lvl > premiumHighScores.length || lvl <= 0) {
            System.out.println("ERR: Level does not exist!");
        } else {
            if (lvl > 3) {
                if (premiumHighScores[lvl - 2] < 100)
                System.out.println("ERR: Must have more points in previous levels!");
            }
            else {
                premiumHighScores[lvl - 1] = score;
            }
        }
    }
}
