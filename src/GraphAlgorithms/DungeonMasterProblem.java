package GraphAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class DungeonMasterProblem {

    static void initialize() {

        char[][] maze = new char[][]{
                {'0', '0', '0', '0'},
                {'#', '0', '#', '0'},
                {'0', '0', '0', '0'},
                {'0', '#', 'E', '#'}
        };
        int R = 3;
        int C = 3;

        int startRow = 0;
        int startColumn = 0;

        Queue<Integer> rowQueue = new LinkedList<>();
        Queue<Integer> columnQueue = new LinkedList<>();

        int moveCount =0 ;
        int nodesLeftInLayer = 1;
        int nodesLeftInNextLayer = 0;

        boolean reachedEnd = false;

        Boolean[][] visited = new Boolean[][]{
            {false, false, false, false},
            {false, false, false, false},
            {false, false, false, false},
            {false, false, false, false}
        };

        rowQueue.add(startRow);
        columnQueue.add(startColumn);

        visited[startRow][startColumn] = true;

        while (rowQueue.size() > 0 && columnQueue.size()>0) {
            int currentRow = rowQueue.poll();
            int currentColumn = columnQueue.poll();

            if (maze[currentRow][currentColumn]=='E') {
                reachedEnd = true;
                break;
            }
            System.out.println("maze["+currentRow+"]["+currentColumn+"] = " + maze[currentRow][currentColumn]);

//      To move to the direction of North, east, west, south
            int[] dr = new int[]{-1, +1, 0, 0};
            int[] dc = new int[]{0, 0, +1, -1};

            for (int i = 0; i < 4; i++) {
                int adjacentRow = currentRow + dr[i];
                int adjacentColumn = currentColumn + dc[i];

                if (adjacentRow < 0 || adjacentColumn < 0)
                    continue;
                if (adjacentRow > R || adjacentColumn > C)
                    continue;

                System.out.println("maze["+adjacentRow+"]["+adjacentColumn+"] = " + maze[adjacentRow][adjacentColumn]);


                if (visited[adjacentRow][adjacentColumn])
                    continue;
                if (maze[adjacentRow][adjacentColumn] == '#')
                    continue;


                rowQueue.add(adjacentRow);
                columnQueue.add(adjacentColumn);

                visited[adjacentRow][adjacentColumn] = true;
                nodesLeftInNextLayer++;

            }
            nodesLeftInLayer--;
            if (nodesLeftInLayer == 0) {
                nodesLeftInLayer = nodesLeftInNextLayer;
                nodesLeftInNextLayer = 0;
                moveCount++;
            }
        }

        if(reachedEnd)
            System.out.println("returned end with no of moves "+moveCount);
        else
            System.out.println("Didnt reach end");

    }

    public static void main(String[] args) {
        initialize();
    }
}
