class Hanoi {
    
    void printTower(int disk, int sourceDisk, int destDisk){
        System.out.println("move disk "+disk+" from rod "+sourceDisk+" to rod "+destDisk);
    }

    public long toh(int N, int source, int destination, int aux) {
        // Your code here
        if(N == 1)
        {
            printTower(N, source, destination);
            return 1;
        }
        
        toh(N-1, source, aux, destination);
        printTower(N, source, destination);
        toh(N-1, aux, destination, source);
        
        return (int) Math.pow(2, N)-1;
    }
}
