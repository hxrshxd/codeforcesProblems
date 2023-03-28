package round859;

import java.util.ArrayList;

// https://codeforces.com/contest/1807/problem/B

//    int tc = sc.nextInt();
//    for (int i=1; i<=tc; i++) {
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int j=0; j<n; j++) {
//        arr[j] = sc.nextInt();
//    }
//    GrabTheCandies candies = new GrabTheCandies();
//        System.out.println(candies.getAns(arr, n));
//    }
public class GrabTheCandies {

    public String getAns(int[] candies, int n) {
        ArrayList<Integer> evenCandies = new ArrayList<>();
        ArrayList<Integer> oddCandies = new ArrayList<>();
        int[] evenOddSum = getEvenOddCandies(candies, evenCandies, oddCandies);

        if (evenOddSum[0] <= evenOddSum[1]) return "NO";
        return "YES";
    }

    public int[] getEvenOddCandies(int[] candies, ArrayList<Integer> evenCandies, ArrayList<Integer> oddCandies) {
        int evenSum = 0, oddSum = 0;

        for (int i: candies) {
            if (i%2 == 0) {
                evenCandies.add(i);
                evenSum += i;
            }
            else {
                oddCandies.add(i);
                oddSum += i;
            }
        }

        return new int[]{evenSum, oddSum};
    }
}
