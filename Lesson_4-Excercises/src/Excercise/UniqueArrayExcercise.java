package Excercise;

public class UniqueArrayExcercise {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
			System.out.print(arr[i] + ", ");
		}

		System.out.println();

		int[] uniqueArr = new int[arr.length];

		uniqueArr[0] = arr[0];
		int size = 1;

		lbl: for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < size; j++) {
				if (arr[i] == uniqueArr[j]) {
					continue lbl;
				}

			}

			uniqueArr[size] = arr[i];
			size++;

		}

		int[] tmp = new int[size];
		System.arraycopy(uniqueArr, 0, tmp, 0, size);
		uniqueArr = tmp;

		for (int i = 0; i < uniqueArr.length; i++) {
			System.out.print(uniqueArr[i] + ", ");
		}
		System.out.println();
	}
}
