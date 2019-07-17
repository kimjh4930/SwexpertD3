package d3024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1 {
    private static int MAX_N = 999;
    private static int n, k;
    private static boolean[] area;
    private static int[] era;

    private static void getEratos() {
        area[0] = area[1] = true;
        for (int i = 2; i < MAX_N; i++) {
            if (!area[i]) for (int j = i + i; j < MAX_N; j += i) area[j] = true;
        }
        for (int i = 2; i < MAX_N; i++) if (!area[i]) era[k++] = i;
    }

    private static int go(int lo, int sum, int cur) {
        int ret = 0;
        if (lo == 3){
            if(sum == n) return 1;
            return 0;
        }
        for (int i = cur; i < k; i++) {
            if (sum + era[i] > n) break;
            if (sum + era[i] <= n) ret += go(lo + 1, sum + era[i], i);
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tcase = Integer.parseInt(st.nextToken());

        era = new int[MAX_N];
        area = new boolean[MAX_N];

        getEratos();

        for (int t = 1; t <= tcase; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            MAX_N = n;
            System.out.printf("#%d %d\n", t, go(0, 0, 0));
        }
    }
}
