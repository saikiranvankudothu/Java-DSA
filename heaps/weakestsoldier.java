import java.util.PriorityQueue;

public class weakestsoldier {
    static class row implements Comparable<row> {
        int idx;
        int soldiers;

        public row(
                int soldiers,
                int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(row w2) {
            if (this.soldiers == w2.soldiers) {
                return this.idx - w2.idx;
            }
            return this.soldiers - w2.soldiers;
        }
    }

    public static void main(String[] args) {
        int army[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        int k = 2;
        PriorityQueue<row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }
}