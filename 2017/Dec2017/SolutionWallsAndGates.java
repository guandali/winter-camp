class SolutionWallsAndGates {
    private int m = 0;
    private int n = 0;
    private int[][] rooms;
    public void wallsAndGates(int[][] rooms) {
        this.m = rooms.length;
        if(m < 1) return;
        this.n = rooms[0].length;
        this.rooms = rooms;
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(rooms[i][j] == 0) findNearestRooms(i, j, 0);
            }
        }
        return;
    }
    
    private void findNearestRooms(int i, int j, int distance ){
        if((i < 0 || i >= this.m) || (j < 0 || j >= this.n)) return;
        if((distance != 0) &&((rooms[i][j] != -1 && rooms[i][j] < distance)||(rooms[i][j] == 0 ||rooms[i][j] == -1 ) )) return;
        rooms[i][j] = distance;
        findNearestRooms(i+1, j, distance+1);
        findNearestRooms(i-1, j, distance+1);
        findNearestRooms(i, j-1, distance+1);
        findNearestRooms(i, j+1, distance+1);
    }
}