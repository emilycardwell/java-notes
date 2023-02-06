import java.util.*;
import java.util.HashSet;

// input: array (A) of ints len = N
// output: lowest positive int not in A
class Sets {
    public int solution(int[] A) {
        Set<Integer> pos = new HashSet<Integer>();

        for (int x: A) {
            if (x > 0) {
                pos.add(x);
            }
        }

        if (pos.isEmpty()) {
            return 1;
        }

        int m = Collections.max(pos);

        Set<Integer> r = new HashSet<Integer>();

        for (int j = 1; j <= m; j++) {
            r.add(j);
        }

        r.removeAll(pos);

        if (r.isEmpty()) {
            return m + 1;
        } else {
            return Collections.min(r);
        }

    }
}
