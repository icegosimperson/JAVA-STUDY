import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HW_2580{
    private static int[][] arr = new int[9][9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        simulation(0, 0);
    }
    private static void simulation(int r, int c){
        if(c==9){
            simulation(r + 1, 0);
            return;
        }
        if(r==9){
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if(arr[r][c]==0){
            for(int i=1; i<=9; i++){
                if (isValid(r, c, i)) {
                    arr[r][c] = i;
                    simulation(r, c + 1);
                }
            }
            arr[r][c]=0;
            return;
        }
        simulation(r, c + 1);
    }
    private static boolean isValid(int r, int c, int value){
        for(int i=0; i<9; i++){
            if(arr[r][i] == value){
                return false;
            }
        }

        for(int i=0; i<9; i++){
            if(arr[i][c]==value){
                return false;
            }
        }

        int nRow = (r/3) * 3;
        int nCol = (c/3) * 3;

        for(int i=nRow; i<nRow+3; i++){
            for(int j=nCol; j<nCol+3; j++){
                if(arr[i][j]==value){
                    return false;
                }
            }
        }
        return true;
    }
}