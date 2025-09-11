package matrix;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[][] twodarray=new int [3][4];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				twodarray[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(twodarray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
