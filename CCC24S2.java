import java.util.*;
import java.io.*;

public class CCC24S2 {
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
        int cases = nextInt();
        int length = nextInt();

        for(int i=0; i<cases; i++){
            int[] arr = new int[26];
            String curr = next();
            for(int j=0; j<length; j++){
                int index = curr.charAt(j)-'a';
                arr[index]++;
                arr[index]=Math.min(arr[index],2);
            }
            if(check(arr,length,curr)){
                out.println("T");
            }
            else{
                out.println("F");
            }
//            for(int j : arr){
//                System.out.print(j+" ");
//            }
//            System.out.println();
        }

        out.close();
    }
    static boolean check(int[] a, int l, String c){
        int start = a[c.charAt(0)-'a'];
//        System.out.println(start);
        start = swap(start);
        for(int i=1; i<l; i++){
            if(a[c.charAt(i)-'a']!=start){
                return false;
            }
            start=swap(start);
        }
        return true;
    }
    static int swap(int a){
        if(a==1){
            return 2;
        }
        else{
            return 1;
        }
    }
}
