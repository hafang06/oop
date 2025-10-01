

public class InversePermutation{

    public static void main(String[] args){
        int n = args.length;
        int a[] = new int[n];

        boolean cnt[] = new boolean[n];
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(args[i]);
            if(a[i] < 0 || a[i] >=n || cnt[a[i]]){
                System.out.println("Not a valid permutation");
                return;
            }
            ans[a[i]] = i;
        }
        for(int i = 0; i < n; i++) System.out.print(ans[i] + " ");
    }
}