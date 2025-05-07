import java.io.*;

public class HJ8911 {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int currDir = 0;

    private static int findArea(String commands) {
        int area = 0;
        currDir = 0;

        int maxRow = 0;
        int minRow = 0;
        int maxCol = 0;
        int minCol = 0;

        int currRow = 0;
        int currCol = 0;

        for(int i = 0; i < commands.length(); i++) {
            char currCommand = commands.charAt(i);
            if(currCommand == 'F') {
                currRow += dx[currDir];
                currCol += dy[currDir];
            } else if(currCommand == 'B') {
                currRow -= dx[currDir];
                currCol -= dy[currDir];
            } else if(currCommand == 'L') {
                currDir = (currDir + 3) % 4;
            } else {
                currDir = (currDir + 1) % 4;
            }

            maxRow = Math.max(maxRow, currRow);
            minRow = Math.min(minRow, currRow);
            maxCol = Math.max(maxCol, currCol);
            minCol = Math.min(minCol, currCol);
        }

        area = (maxRow - minRow) * (maxCol - minCol);

        return area;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String commands = br.readLine();
            sb.append(findArea(commands)).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
