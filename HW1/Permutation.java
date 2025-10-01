public class Permutation{

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = i;
        for (int i = 0; i < n; i++) {
            int randomNum = (int) (Math.random() * (i + 1));
            int tmp = a[randomNum];
            a[randomNum] = a[i];
            a[i] = tmp;
        }
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (a[j] == i) System.out.print("* ");
                else System.out.print(". ");

            System.out.println("");
        }

    }
}