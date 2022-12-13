package ranking;

public class OnlineRanker {
    private int rrank;
    private String rname;
    private int rscore;
    public OnlineRanker(int rank, String name, int score){
        rrank = rank;
        rname = name;
        rscore = score;
    }

    public int getRank(){
        return rrank;
    }

    public String getName(){
        return rname;
    }

    public int getScore(){
        return rscore;
    }
}
