public class WhollyPointsPlayer {
    private int idNumber;
    private String screenName;
    private int[] highScores;

    public WhollyPointsPlayer() {
        idNumber = 0;
        screenName = "";
        highScores = new int[10];
    }

    // Getters
    int getIdNumber() {
        return idNumber;
    }
    String getScreenName() {
        return screenName;
    }
    int getHighScore(int lvl) {
        if (lvl > highScores.length || lvl <= 0) {
            System.out.println("ERR: Level does not exist!");
            return -1;
        } else {
            return highScores[lvl - 1];
        }
    }

    // Setters
    void setIdNumber(int id) {
        idNumber = id;
    }
    void setScreenName(String ign) {
        screenName = ign;
    }
    void setHighScore(int lvl, int score) {
        if (lvl > highScores.length || lvl <= 0) {
            System.out.println("ERR: Level does not exist!");
        } else {
            if (lvl > 3) {
                if (highScores[lvl - 2] < 100)
                System.out.println("ERR: Must have more points in previous levels!");
            }
            else {
                highScores[lvl - 1] = score;
            }
        }
    }
}
