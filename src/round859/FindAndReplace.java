package round859;

// https://codeforces.com/contest/1807/problem/C

//    Scanner sc = new Scanner(System.in);
//    int tc = sc.nextInt();
//    for (int i=0; i<tc; i++) {
//        int n = sc.nextInt();
//        String str = sc.next();
//        FindAndReplace ans = new FindAndReplace();
//        System.out.println(ans.getAns(str));
//    }
public class FindAndReplace {

    public String getAns(String str) {
        boolean binary = true;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch-'0' != 0 && ch-'0' != 1) {
                if (binary) {
                    str = str.replaceAll(String.valueOf(ch), "1");
                } else {
                    str = str.replaceAll(String.valueOf(ch), "0");
                }
            }
            binary = !binary;
        }

        return checkValidity(str);
    }

    public String checkValidity(String str) {
        for (int i=0; i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) return "NO";
        }
        return "YES";
    }
}
