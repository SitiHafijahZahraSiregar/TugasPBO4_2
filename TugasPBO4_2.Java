package prak4_tugaspbo2_ara;
import java.util.Scanner;
import java.util.Arrays;
public class Prak4_TugasPbo2_Ara {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int n = input.nextInt();
        int [] myNum = new int[n];
        
        for(int i = 0; i < myNum.length; i++){
            myNum[i] = input.nextInt();
        }
        
        Arrays.sort(myNum);
        
        for(int print:myNum){
            System.out.print(print + " ");
          }
       }
    }
