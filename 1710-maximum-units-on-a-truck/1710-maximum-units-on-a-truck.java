class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int boxes = 0;
        int units  = 0;
        int i = 0;
        int n = boxTypes.length;
        for(i = 0; i<n; i++){
          int box1 =  Math.min(truckSize, boxTypes[i][0]);
            units = units + box1 * boxTypes[i][1];
            boxes = boxes + box1;
            truckSize -= box1;
            if(truckSize == 0)
            break;
        }
        return units;     
    }
}