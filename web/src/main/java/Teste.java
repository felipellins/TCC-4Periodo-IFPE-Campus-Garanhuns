
public class Teste {

	public static void main(String[] args) {

		int a[] = { 2, 3, 5, 1, 4 };
		int aux;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; i++) {

				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;

				}

			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
