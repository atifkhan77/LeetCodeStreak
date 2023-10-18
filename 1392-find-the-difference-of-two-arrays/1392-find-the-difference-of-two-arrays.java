class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
      List<List<Integer>> li = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();
        for (int num : nums1) {
            s1.add(num);
        }
        for (int num : nums2) {
            s3.add(num);
        }

        for (int num : nums2) {
            if (!s1.contains(num)) {
                s2.add(num);
            }
        }
        s1.removeAll(s3);
        li.add(new ArrayList<>(s1));
        li.add(new ArrayList<>(s2));
        

        return li;  
    }
}