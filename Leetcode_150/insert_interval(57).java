class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for(int[] interval: intervals){
            if(interval[0]>newInterval[1]) {
                ans.add(newInterval);
                newInterval=interval;
            }
            if(interval[1] < newInterval[0]) ans.add(interval);
            else{
                newInterval[0]=Math.min(interval[0],newInterval[0]);
                newInterval[1]=Math.max(interval[1],newInterval[1]);

            }
        } ans.add(newInterval);
        return ans.toArray(new int[0][]);
    }
}
