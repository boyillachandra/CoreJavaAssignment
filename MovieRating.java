public class MovieRating {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");

		n = sc.nextInt();

		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int negative = 0;
		int positive = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0) {
				positive = positive + array[i];

			} else if (array[i] < 0) {
				negative = negative + array[i];
			}
		}

		int value = positive + negative;

		System.out.println(" output is :  " + value);

		for (int i = 0; i < array.length; i++) {

		}
	}

}
