package first.repo;

public enum Rank {
    N2, N3, N4, N5, N6, N7, N8, N9, N10, J, Q, K, A;
    
    public int getValue(){
        if(this == Rank.A) {
            return 11;
        }
        if(this == Rank.J || this == Rank.Q || this == Rank.K) {
            return 10;
        }
        return Integer.valueOf(toString().substring(1));
    }
}
