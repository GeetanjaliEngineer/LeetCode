class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int mA[]= new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]) mA[k++] =arr1[i++];
            else mA[k++]=arr2[j++];
        }
        //left values in 2nd array
        while(j<n) mA[k++]=arr2[j++];
        //left value in first array
        while(i<m) mA[k++]=arr1[i++];

        //dumo all values into first array 
        for(int x=0; x<m+n; x++){
            arr1[x]=mA[x];
        }
    }
}
