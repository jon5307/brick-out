package ranking;

public class OnlineRanker {
    private String rname;
    private int rscore;
    public OnlineRanker(String name, int score){
        rname = name;
        rscore = score;
    }

    public String getName(){
        return rname;
    }

    public int getScore(){
        return rscore;
    }
}
