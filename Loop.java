import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enetr you number");
        // int x=sc.nextInt();

        // for(int i=1;i<11;i++){
        // System.out.println(x+"*"+i +"= "+x*i);

        // }
        // ************************* * pattern problem
        // for(int i=1;i<=5;i++){
        // for(int j=1;j<=5;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }
        // output==> *****
        // *****
        // *****
        // *****
        // -------------------------------------------------------------
        // int m=5;
        // int n=4;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=m;j++){
        // if(i==1||i==n||j==1||j==m){ *****
        // System.out.print("*"); * *
        // }else{ * *
        // System.out.print(" "); *****
        // }
        // }
        // System.out.println();
        // }

        // int m=5; *
        // **
        // for(int i=1;i<=m;i++){ ***
        // for(int j=1;j<=i;j++){ ****
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // int m=5;

        // for(int i=1;i<=m;i++){
        // for(int j=m;j>=i;j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // *****
        // ****
        // ***
        // **
        // *
        // int m=4;
        // for(int i=1;i<=m;i++){
        // for(int j=1;j<=m-i;j++){
        // System.out.print(" ");

        // }
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // *
        // **
        // ***
        // ****

        // int n=5;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // 1
        // 12
        // 123
        // 1234
        // 12345

        // int n=5;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n-i+1;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // 12345
        // 1234
        // 123
        // 12
        // 1

        // int n=5;
        // int num=1;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(num+" ");
        // num++;
        // }
        // System.out.println();
        // }
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // int n = 5;
        // // int num=1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }

        // }
        // System.out.println();
        // }

        // }
        // }
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        // int n=5;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n-i+1;j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=n;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // int n=5;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n-i+1;j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // int n = 5;
        // // upper half
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {

        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // lower half
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {

        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // * *
        // ** **
        // *** ***
        // **** ****
        // **********
        // **********
        // **** ****
        // *** ***
        // ** **
        // * *

//         int n = 5;
//         // int number = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--) {

//                 System.out.print(j);

//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     1
//     212
//    32123
//   4321234
//  543212345


// int n = 4;
//         // int number = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--) {

//                 System.out.print("*");

//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--) {

//                 System.out.print("*");

//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         *
//         ***
//        *****
//       *******
//       *******
//        *****
//         ***
//          *










    }
}
