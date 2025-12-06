
void main() {
// Create a method that accepts an array of integers and returns the largest number.

    IO.println("the biggest number is: " + GetLargestSum(new int[]{1,55,32,95,123}));

}

private int GetLargestSum(int[] nums){
    int biggestNum = 0;

    for (int num : nums) {
        if (num > biggestNum) {
            biggestNum = num;
        }
    }
    return biggestNum;
}