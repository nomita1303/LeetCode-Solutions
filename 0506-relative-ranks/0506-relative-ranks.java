import java.util.PriorityQueue;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++)
            pq.offer(new int[]{score[i], i});

        int rank = 1;

        while (!pq.isEmpty()) {
            int i = pq.poll()[1];

            if (rank == 1) ans[i] = "Gold Medal";
            else if (rank == 2) ans[i] = "Silver Medal";
            else if (rank == 3) ans[i] = "Bronze Medal";
            else ans[i] = String.valueOf(rank);

            rank++;
        }

        return ans;
    }
}