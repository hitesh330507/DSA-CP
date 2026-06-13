class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n=nums1.length;

        Map<Integer,Integer>map=new HashMap<>();

        for (int x:nums1) map.put(x,map.getOrDefault(x,0)+1);
        for (int x:nums2) map.put(x,map.getOrDefault(x,0)+1);

        for (int v:map.values()) {
            if (v%2!=0) return -1;
        }

        Map<Integer,Integer>map1=new HashMap<>();
        Map<Integer,Integer>map2=new HashMap<>();

        for(int x:nums1) map1.put(x,map1.getOrDefault(x,0)+1);
        for(int x:nums2) map2.put(x,map2.getOrDefault(x,0)+1);

        int ans=0;

        for(int i:map.keySet()){
            int get1=map1.getOrDefault(i,0);
            int get2=map2.getOrDefault(i,0);
            ans+=Math.abs(a-b)/2;
        }

        return ans/2;
    }
}