import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            graph.add(new ArrayList<>());
        }

        int[][] dist = new int[4][4];

        for(int i = 0;i < 4; i++) {
            for(int j = 0; j < 4; j++){
                for(int k = i; k < i + 4; k++) {
                    dist[i][j] = k;
                }
            }
        }



        Arrays.sort(dist, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int sum1 = 0;
                int sum2 = 0;

                for(int i : a) {
                    sum1 += i;
                }
                for(int j : b) {
                    sum2 += j;
                }

                return sum2 - sum1;
            }
        });

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 4; i++) {
            System.out.print(dist[0][i] + " ");
        }
    }
}
