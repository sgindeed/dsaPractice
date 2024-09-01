class Solution {
    
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return sameCol(coordinate1) == sameCol(coordinate2);
    }
    
    public boolean sameCol(String coordinate){
        char column = coordinate.charAt(0);
        int row = coordinate.charAt(1) - '0';
        int colVal = column -'a' + 1;
        return (row + colVal) % 2 == 1;
    }
}
