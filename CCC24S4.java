import java.util.*;
import java.io.*;

public class CCC24S4 {
    static StringTokenizer st;
    static BufferedReader br;
    static PrintWriter out;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int r = nextInt();
        String[] colours = {"R","B","G"};
        for(int i=0; i<r; i++){
            int a = nextInt();
            int b = nextInt();
            if(b-a==1){
                out.print(colours[a%2]);
            }
            else{
                out.print(colours[2]);
            }
        }
        out.close();
    }
}
