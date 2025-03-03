import java.util.*;


//1 D Array
//public class L8_2DArray6july {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] a = new int[n];
//
//        //Input
//        for(int i=0; i<n; i++){
//            a[i] = sc.nextInt();
//        }
//        //Output
//        for(int i=0; i<n; i++){
//            System.out.println(a[i]);
//        }
//    }
//}

//
//public class L8_2DArray6july {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int [][] arr = new int[r][c];
//
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++)
////                System.out.print("* ");
//                System.out.print((j+1) + " ");
//            System.out.println();
//        }
//    }
//}


//public class L8_2DArray6july {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++)
////                System.out.print((i+1) + " ");
//                System.out.print((j+1) + " ");
//            System.out.println();
//        }
//    }
//}

//
//Pattern
//public class L8_2DArray6july {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=i; j++)
////                System.out.print((i+1) + " ");
//                System.out.print((j+1) + " ");
//            System.out.println();
//        }
//    }
//}

//
//public class L8_2DArray6july {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++)
////            for(int j=0; j<i; j++)
//                System.out.print((j+1) + " ");
//            System.out.println();
//        }
//    }
//}

//
//public class L8_2DArray6july {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int [][] arr = new int[r][c];
//
//        for(int i=0; i<r; i++)
//            for(int j=0; j<c; j++)
//                arr[i][j] = sc.nextInt();
//
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++)
//                System.out.print(arr[i][j] + " ");
//
//            System.out.println();
//        }
//    }
//}


//
public class L8_2DArray6july {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n-1];

        for(int i=0; i<n-1; i++)
           a[i]= sc.nextInt();
        int i, j = 0;

        for( i=1; i<=n; i++){
                for(j=0; j<n-1; j++)
                    if (a[j] == i) {
                        break;
                    }
                    if (j == n - 1) {
                        System.out.println(i);
                        break;
                    }
        }
    }
}

//
//public class L8_2DArray6july {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        for (int i = 0, p = 0; i < n; i++, p += 6) {
//            for (int j = 0, q = p; j < n; j++, q += 4) {
//                System.out.print(q + " ");
//            }
//            System.out.println();
//        }
//    }
//    }

