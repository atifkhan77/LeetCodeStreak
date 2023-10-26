
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        for (int i=0; i<heights.length; i++){
            treeMap.put(heights[i],names[i]);
        }

        String[] sortName= new String[names.length];
        int i=sortName.length-1;

        for (int sort : treeMap.keySet()){
            sortName[i]=treeMap.get(sort);
            i--;
        }
        return sortName;
        
    }
}