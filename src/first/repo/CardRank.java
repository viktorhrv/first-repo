package first.repo;

public enum CardRank {
    N2, N3, N4, N5, N6, N7, N8, N9, N10, J, Q, K, A;
    
    public int getValue(){
        if(this == CardRank.A) {
            return 11;
        }
        if(this == CardRank.J || this == CardRank.Q || this == CardRank.K) {
            return 10;
        }
        return Integer.valueOf(toString().substring(1));
    }
}
