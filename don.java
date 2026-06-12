public class don {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = 5;

        arr[0]=10; arr[1]=20; arr[2]=30; arr[3]=40; arr[4]=50;

        int pos = 2, value = 25;

        for(int i=n; i>pos; i--)
            arr[i]=arr[i-1];

        arr[pos]=value;
        n++;

        for(int i=pos; i<n-1; i++)
            arr[i]=arr[i+1];

        n--;
}
}





