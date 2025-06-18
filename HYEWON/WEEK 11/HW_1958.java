import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HW_1958{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        System.out.println(LCS(str1, str2, str3));
    }
    private static int LCS(String a, String b, String c){
        int alen = a.length();
        int blen = b.length();
        int clen = c.length();

        int[][][] dp = new int[alen + 1][blen + 1][clen + 1];

        for(int i=1; i<=alen; i++){
            char aChar = a.charAt(i - 1);
            for(int j=1; j<=blen; j++){
                char bChar = b.charAt(j - 1);
                for(int k=1; k<=clen; k++){
                    char cChar = c.charAt(k - 1);
                    if(aChar==bChar && bChar==cChar){
                        dp[i][j][k] = dp[i - 1][j - 1][k - 1]+1;
                    } else{
                        dp[i][j][k] = Math.max(Math.max(dp[i - 1][j][k], dp[i][j-1][k]), dp[i][j][k - 1]);
                    }
                }
            }
        }
        return dp[alen][blen][clen];
    }
}