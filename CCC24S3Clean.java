import java.util.*;
import java.io.*;
public class CCC24S3Clean{
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

    static class groupData{
        int left;
        int right;
        int val;
        int post;
        public groupData(int l, int r, int v){
            left=l;
            right=r;
            val=v;
        }
        int getLeft(){return left;}
        int getRight(){return right;}
        int getVal(){return val;}
        int getPost(){return post;}
        void setPost(int a){post=a;}
    }
    static ArrayList<groupData> groups;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int l = nextInt();
        int[] arr1 = new int[l];
        int[] arr2 = new int[l];
        for(int i=0; i<l; i++){
            arr1[i]=nextInt();
        }
        for(int i=0; i<l; i++){
            arr2[i]=nextInt();
        }
        groups = new ArrayList<>();
        int prev = arr2[0];
        int left = 0;
        for(int i=1; i<l; i++){
            if(arr2[i]!=prev){
                groupData temp = new groupData(left,i-1,prev);
                groups.add(temp);
                prev=arr2[i];
                left=i;

            }
        }

        groupData temp = new groupData(left,l-1,prev);
        groups.add(temp);
        if(check(arr1)){
            out.println("YES");
        }
        else{
            out.println("NO");
            out.close();
        }

        Queue<groupData> swipeLeft = new LinkedList<>();
        LinkedList<groupData> swipeRight = new LinkedList<>();
        Queue<groupData> outpostInside = new LinkedList<>();

        for(groupData a : groups) {
            if (a.getPost() > a.getRight()) {
                swipeLeft.add(a);
            } else if (a.getPost() < a.getLeft()) {
                swipeRight.add(a);
            } else {
                outpostInside.add(a);
            }
        }
        int ans = groups.size();
        for(groupData a : outpostInside){
            if(a.getPost()<a.getRight()&&a.getPost()>a.getLeft()){
                ans++;
            }
            else if(a.getPost()==a.getRight()&&a.getPost()==a.getLeft()){
                ans--;
            }
        }
        int leftSize = swipeLeft.size();
        int rightSize = swipeRight.size();
        int bothSize = outpostInside.size();

        out.println(ans);
        for(int i=0; i<leftSize; i++){
            groupData a = swipeLeft.remove();
            out.println("L "+a.getLeft()+" "+a.getPost());
        }

        for(int i=0; i<rightSize; i++){
            groupData a = swipeRight.removeLast();
            out.println("R "+a.getPost()+" "+a.getRight());
        }
        for(int i=0; i<bothSize; i++){
            groupData a = outpostInside.remove();
            if(a.getPost()!=a.getLeft()){
                out.println("L "+a.getLeft()+" "+a.getPost());
            }
            if(a.getPost()!=a.getRight()){
                out.println("R "+a.getPost()+" "+a.getRight());
            }

        }
        out.close();
    }
    static boolean check(int[] arr){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==groups.get(index).getVal()){
                groups.get(index).setPost(i);
                index++;
                if(index>=groups.size()){
                    return true;
                }
            }
        }
        return false;
    }
}
