package sortierren;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 
				int[] zahlen = { 17, 9, 44, 12, 99, 22, 51, 21, 7 };
				System.out.println("Die Reihe hat " + zahlen.length + " Zahlen");
				for (int i = 0; i < zahlen.length; i++) {
					System.out.println(zahlen[i]);
				}
				//
				System.out.println("");
				//
				//
				for (int z = zahlen.length; z > 1; z--)       {
					for (int s = 0; s < z - 1; s++) {
						if (zahlen[s] > zahlen[s + 1]) {
							int a = zahlen[s];
							zahlen[s] = zahlen[s + 1];
							zahlen[s + 1] = a;

						}
					}
				}
				for (int i = 0; i < zahlen.length; i++) {
					System.out.println(zahlen[i]);
				}

			}
		}
