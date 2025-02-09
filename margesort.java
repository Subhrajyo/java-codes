public class margesort {
    public static void merge(int []arr,int s,int mid,int e) {
        int[] temp = new int[e - s + 1];
        int l_a = s;
        int r_a = mid + 1;
        int idx = 0;
        while (l_a <= mid && r_a <= e) {
            if (arr[l_a] <= arr[r_a]) {
                temp[idx] = arr[l_a];
                idx++;
                l_a++;
            }
            else {
                temp[idx] = arr[r_a];
                idx++;
                r_a++;
            }
        }
        while (l_a <= mid) {
            temp[idx] = arr[l_a];
            idx++;
            l_a++;
        }
        while (r_a <= e) {
            temp[idx] = arr[r_a];
            idx++;
            r_a++;
        }
        int count = 0;
        for (int i = s; i<=e; i++) {
            arr[i] = temp[count];
            count++;
        }
    }

    public static void mergesort(int []arr,int s,int e){
        if(s==e)return;
        int mid=s+(e-s)/2;
        mergesort(arr,s,mid); //left array;
        mergesort(arr,mid+1,e); //right array;
        merge(arr,s,mid,e);
    }
    public static void main(String[] args) {
        int []arr={7,1,2,8,7,94,54,3,8,7};
        int s=0;
        int e=arr.length-1;
//

        mergesort(arr,s,e);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
}

}
}

