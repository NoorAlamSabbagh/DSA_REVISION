package TwoPointers;

//code 1
//
import java.util.Arrays;

//public class Merge {
//    public static void main(String[] args) {
//        int a[] = {1,2,2,6,6,10};
//        int b[] = {2,4,10,15,20,30};
//
//        int n = a.length;
//        int m = b.length;
//
//        int ans[] = new int[n + m];
//
//        int i = 0;
//        for(i=0; i<n; i++)
//            ans[i] = a[i];
//
//        for(int j=0; j<m; j++,i++)
//            ans[i] = b[j];
//
//    }
//}

//
//import java.util.Arrays;
//
//public class Merge {
//    public static void main(String[] args) {
//        int a[] = {1,2,2,6,6,10};
//        int b[] = {2,4,10,15,20,30};
//
//        int n = a.length;
//        int m = b.length;
//
//        int ans[] = new int[n + m];
//
//        int i = 0;
//        for(i=0; i<n; i++)
//            ans[i] = a[i];
//
//        for(int j=0; j<m; j++,i++)
//            ans[i] = b[j];
//
//        Arrays.sort(ans);
//
//        for(i=0; i<n+m; i++)
//            System.out.print(ans[i] + " ");
//
//    }
//}


//code 2

public class Merge {
    public static void main(String[] args) {
        int a[] = {1,2,2,6,6,10};
        int b[] = {2,4,10,15,20,30};

        int n = a.length;
        int m = b.length;

        int ans[] = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<n && j<m){
            if(a[i] < b[j]){
                ans[k++] = a[i++];
            }
            else if(a[i] > b[j]){
                ans[k++] = b[j++];
            }
            else{
                ans[k++] = a[i++];
                ans[k++] = b[j++];
            }
        }
        while(i<n){
            ans[k++] = a[i++];
        }

        while(j<m){
            ans[k++] = b[j++];
        }

        for(i=0; i<n+m; i++)
            System.out.print(ans[i] + " ");
    }
}


//code 3
//code 2
//public class Merge {
//    public static void main(String[] args) {
//        int a[] = {1,2,2,6,6,10};
//        int b[] = {2,4,10,15,20,30};
//
//        int n = a.length;
//        int m = b.length;
//
//        int ans[] = new int[n + m];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while(i<n && j<m){
//            if(a[i] <= b[j]){
//                ans[k++] = a[i++];
//            }
//            else {
//                ans[k++] = b[j++];
//            }
//        }
//        while(i<n){
//            ans[k++] = a[i++];
//        }
//
//        while(j<m){
//            ans[k++] = b[j++];
//        }
//
//        for(i=0; i<n+m; i++)
//            System.out.print(ans[i] + " ");
//    }
//}