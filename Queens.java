public class Queens {
    public static void main(String[] args) {
        Queens queen = new Queens();
        int[][] board = queen.generate(8);
        for (int yCor = 0; yCor < 8; yCor++) {
            for (int xCor = 0; xCor < 8; xCor++) {
                System.out.print(board[yCor][xCor]+" ");
            }
            System.out.println();
        }
    }

    public int[][] generate(int xyBound) {
        int[][] board;
        int[][] validMap = new int[xyBound][xyBound];
        int[] coords = new int[2];

        for (int yCor = 0; yCor < xyBound; yCor++) {
            for (int xCor = 0; xCor < xyBound; xCor++) {
                board = new int[xyBound][xyBound]; // TODO

                int[][] solution = queen(board, validMap, coords);
                
                if (isValidBoard(board)) {
                    return solution;
                }
            }
        }
        return new int[xyBound][xyBound];
    }

    public boolean isViablePlacement(int[][] board, int[] coords) {
        for (int i = 0; i < 8; i++) {
            if (board[coords[0]][i] == 1) return false;
            if (board[i][coords[1]] == 1) return false;
        }
        int yCor;
        int xCor;

        yCor = coords[0];
        xCor = coords[1];

        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            if(board[yCor][xCor] == 1) return false;
            yCor += 1;
            xCor += 1;
        }

        yCor = coords[0];
        xCor = coords[1];

        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            if(board[yCor][xCor] == 1) return false;
            yCor += 1;
            xCor -= 1;
        }
        
        yCor = coords[0];
        xCor = coords[1];

        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            if(board[yCor][xCor] == 1) return false;
            yCor -= 1;
            xCor += 1;
        }

        yCor = coords[0];
        xCor = coords[1];

        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            if(board[yCor][xCor] == 1) return false;
            yCor -= 1;
            xCor -= 1;
        }
        return true;
    }

    public int[][] placeQueen(int[][] validMap, int[] coords) {
        for (int i = 0; i < 8; i++) {
            validMap[coords[0]][i] = 1;
            validMap[i][coords[1]] = 1;
        }

        int yCor;
        int xCor;

        yCor = coords[0];
        xCor = coords[1];

        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            validMap[yCor][xCor] = 1;
            yCor += 1;
            xCor += 1;
        }

        yCor = coords[0];
        xCor = coords[1];

        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            validMap[yCor][xCor] = 1;
            yCor -= 1;
            xCor += 1;
        }

        yCor = coords[0];
        xCor = coords[1];
        
        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            validMap[yCor][xCor] = 1;
            yCor -= 1;
            xCor -= 1;
        }

        yCor = coords[0];
        xCor = coords[1];
        
        while (yCor >=0 && xCor >= 0 && yCor < 8 && xCor < 8) {
            validMap[yCor][xCor] = 1;
            yCor += 1;
            xCor -= 1;
        }
        return validMap;
    }


    public int[][] queen(int[][] board, int[][] validMap, int[] coords) {
        if (isValidBoard(board)) return board;

        if (coords[1] == 8){
            coords[1]=0;
            coords[0]+=1;
        }
        if (coords[0] == 8) return board;


        if (board[coords[0]][coords[1]] == 0) { // positions with -1 don't count
            if (isViablePlacement(board, coords)) {
                placeQueen(validMap, coords);
                board[coords[0]][coords[1]] = 1;
            }
        }

        if (!isValidBoard( queen(board, validMap, new int[]{coords[0], coords[1]+1}) )) {
            board[coords[0]][coords[1]] = -1;
            return queen(board, validMap, coords);
        }
        return board;
    }

    private boolean isValidBoard(int[][] board) {
        int ctr = 0;
        for (int yCor = 0; yCor < 8; yCor++) {
            for (int xCor = 0; xCor < 8; xCor++) {
                if (board[yCor][xCor] == 1) ctr++;
            }
        }
        return ctr==8;
    }

}
