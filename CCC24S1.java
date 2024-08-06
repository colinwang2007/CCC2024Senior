import java.util.*;
import java.io.*;

public class CCC24S1 {
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
        int num = nextInt();
        int[] arr = new int[num*2];
        for(int i=0; i<num; i++){
            int a = nextInt();
            arr[i]=a;
            arr[i+num]=a;
        }
        int ans = 0;
        for(int i=0; i<num; i++){
            if(arr[i]==arr[i+num/2]){
                ans++;
            }
        }
        out.print(ans);

        out.close();
    }
}
