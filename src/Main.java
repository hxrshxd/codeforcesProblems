import round859.PlusMinus;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        PlusMinus pM = new PlusMinus();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(pM.checkPlusMinus(a, b, c));
        }
    }
}