package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int[][] matriz = new int[3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;

		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;

		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;

		// array bidimencional con valores asignados desde inicio

		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();

			for (int j = 0; j < matriz2.length; j++) {

				System.out.print(matriz2[i][j] + " ");
			}
		}
		System.out.println();

		Object[] array = { 1, "Alex", 1000.501 };
		for(Object i:array) {
			System.out.println(i);
		}

	}

}
