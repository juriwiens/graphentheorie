public class Delivery {

    enum VisitState {
        WHITE, GRAY, BLACK
    }

    private static VisitState[][] visited;

    private static String visit(int x, int y, boolean[][] map, String path) {
        final int minIndex = 0;
        final int maxIndex = map.length - 1;
        String subPath = null;

        if (!(x == maxIndex && y == maxIndex)) { // We have not reached our final destination, so keep visiting...
            visited[x][y] = VisitState.GRAY;

            // Visit RIGHT neighbour if this cell exists and if there is no "rock" (value is false)
            if (y < maxIndex && !map[x][y + 1]) {
                if (visited[x][y + 1] == VisitState.WHITE) {
                    subPath = visit(x, y + 1, map, path + 'r');
                }
            }

            // Visit DOWN neighbour if this cell exists and if there is no "rock" (value is false)
            if (subPath == null && x < maxIndex && !map[x + 1][y]) {
                if (visited[x + 1][y] == VisitState.WHITE) {
                    subPath = visit(x + 1, y, map, path + 'd');
                }
            }

            // Visit LEFT neighbour if this cell exists and if there is no "rock" (value is false)
            if (subPath == null && y > minIndex && !map[x][y - 1]) {
                if (visited[x][y - 1] == VisitState.WHITE) {
                    subPath = visit(x, y - 1, map, path + 'l');
                }
            }

            // Visit UP neighbour if this cell exists and if there is no "rock" (value is false)
            if (subPath == null && x > minIndex && !map[x - 1][y]) {
                if (visited[x - 1][y] == VisitState.WHITE) {
                    subPath = visit(x - 1, y, map, path + 'r');
                }
            }

            visited[x][y] = VisitState.BLACK;

            return subPath;
        } else { // We have finally found a path to our destination
            return path;
        }
    }

    public static String search(boolean[][] map) {
        // Init visit states
        visited = new VisitState[map.length][map.length];
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited.length; j++) {
                visited[i][j] = VisitState.WHITE;
            }
        }

        // Start visiting at cell (0,0) with an empty path
        return visit(0, 0, map, "");
    }

}
