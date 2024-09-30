import java.util.*;
import java.io.*;

public class CCC24S5 {
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

        int l = nextInt();
        int[][] bar = new int[l][2];
        int sum = 0;
        for(int i=0; i<l; i++){
            bar[i][0] = nextInt();
            sum+=bar[i][0];
        }
        for(int i=0; i<l; i++){
            bar[i][1] = nextInt();
            sum+=bar[i][0];
        }
        for(int i=l; i>0; i--){
            for(int j=1; j<=l-i; j++){

            }
        }

        /*
        if(l==2){
            double a = bar[0][0];
            double b = bar[0][1];
            double c = bar[1][0];
            double d = bar[1][1];
            if(a==b&&b==c&&c==d){
                out.print(4);
            }
            else if(a==b&&a==(c+d)/2){
                out.print(3);
            }
            else if(a==c&&a==(b+d)/2){
                out.print(3);
            }
            else if(d==b&&d==(c+a)/2){
                out.print(3);
            }
            else if(d==c&&d==(b+a)/2){
                out.print(3);
            }
            else if(a+b==c+d){
                out.print(2);
            }
            else if(a+c==b+d){
                out.print(2);
            }

            else if(a==(b+c+d)/3){
                out.print(2);
            }
            else if(b==(a+c+d)/3){
                out.print(2);
            }
            else if(c==(b+a+d)/3){
                out.print(2);
            }
            else if(d==(b+c+a)/3){
                out.print(2);
            }
            else{
                out.print(1);
            }

        }
        else{
            out.print(":(");

        }
         */
        out.close();
    }
}
