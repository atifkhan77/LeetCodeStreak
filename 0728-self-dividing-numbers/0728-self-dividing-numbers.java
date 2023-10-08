class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int count = 0;
            while(num>0){
                int r=num%10;
                if(r==0){
                    count=0;
                    break;
                }else if(i%r==0){
                    count++;
                    num /=10;
                }else{
                    count=0;
                    break;
                }
            }if(count>0){
                arr.add(i);
            }
        }return arr;
    }

}