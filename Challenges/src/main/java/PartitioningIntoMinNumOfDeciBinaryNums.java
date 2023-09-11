public class PartitioningIntoMinNumOfDeciBinaryNums {

    public int minPartitions(String n) {
        int min = 0;
        for (char c : n.toCharArray()) {
            if (c == '9') {
                return 9;
            }
            if (c > min) {
                min = c;
            }
        }
        return min - 48;
    }
}
/*
Notes: First attempt -> works on test cases but exceeds time limit when trying large values for n

    public int minPartitions(String n) {
        int count = 0;
        Double numN = Double.valueOf(n);
        if(numN < 10){
            return 0;
        }

        while(numN > 10){
            numN = numN - 11;
            if (numN == 10){
                count++;
            }
            count++;
        }
        return count;
    }    */

