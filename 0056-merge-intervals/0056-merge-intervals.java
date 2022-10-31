class Solution {
    public int[][] merge(int[][] intervals) {
        
        // sort array in multiarraydimension
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> li = new ArrayList<>();
        
        li.add(intervals[0]);
        
        int prev = 0;
        
        
        for(int i = 1; i < intervals.length; i++){
            // check end value list with first value intervals
            if(li.get(prev)[1] >= intervals[i][0]){
                li.get(prev)[1] = Math.max(li.get(prev)[1], intervals[i][1]);
            } else {
                li.add(intervals[i]);
                prev++;
            }
        }
        
        int[][] rs = new int[li.size()][2];
        
        rs = li.toArray(rs);
        
        return rs;
        
    }
}