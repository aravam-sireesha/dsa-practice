class Solution {
    public boolean canSplit(int arr[]) {
        int total = 0;

        for(int i=0; i<arr.length; i++){
            total += arr[i];
        }

        if(total % 2 != 0){
            return false;
        }

        int half = total / 2;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum == half){
                return true;
            }
        }

        return false;
    }
}
