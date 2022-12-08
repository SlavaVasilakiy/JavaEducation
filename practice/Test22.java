// На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
//
//Поверните матрице на 90 градусов по часовой стрелке.
//
//Sample Input:
//
//1 2 3
//4 5 6
//7 8 9
//Sample Output:
//
//7 4 1
//8 5 2
//9 6 3

package practice;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=0;
        int k=0;
        String str="";
        while(sc.hasNextLine()){
            String str1 = sc.nextLine();
            str=str+str1+" ";
            counter++;

        }

        String[] arr =str.split(" ");
        String[][] matrix = new String[counter][arr.length/counter];
        for (int i=0 ; i<counter; i++){
            for (int j=0 ; j<(arr.length/counter); j++){
                matrix[i][j] = arr[k];
                k++;
            }
        }

        String[][] matrix2 = new String[arr.length/counter][counter];
        for (int x=0; x<counter ;x++) {
            for (int y = (arr.length/counter)-1; y>=0 ;y--) {
                matrix2[y][x] = arr[k-1];
                k--;
            }
        }

        for (int m = 0; m<(arr.length/counter); m++) {
            for (int n = 0; n<counter; n++) {
                if (n==(counter-1)) System.out.print(matrix2[m][n]);
                else System.out.print(matrix2[m][n] + " ");
            }
            System.out.println();
        }
    }
}
