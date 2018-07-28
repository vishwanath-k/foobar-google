
public class Answer {
	public static String[] answer(String[] l) {
		return bubbleSort(l);
	}

	public static String[] bubbleSort(String[] stringArray) {
		int n = stringArray.length;
		String temp;
		String a;
		String b;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				a = stringArray[j - 1];
				b = stringArray[j];

				if (compareArray(a, b) > 0) {
					temp = stringArray[j - 1];
					stringArray[j - 1] = stringArray[j];
					stringArray[j] = temp;
				}
			}
		}
		return stringArray;
	}

	public static int compareArray(String a, String b) {
		String[] first_str = a.split("\\.", 0);
		String[] second_str = b.split("\\.", 0);
		int ret_val = 2;
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				if (Integer.parseInt(first_str[i]) > Integer.parseInt(second_str[i]))
					return 1;
				if (Integer.parseInt(first_str[i]) < Integer.parseInt(second_str[i]))
					return 0;
			}

			if (i == 1 && ret_val == 2) {
				// if (first_str[i] != null && second_str[i] != null) {
				if (first_str.length > 1 && second_str.length > 1) {
					if (Integer.parseInt(first_str[i]) > Integer.parseInt(second_str[i]))
						ret_val = 1;
					if (Integer.parseInt(first_str[i]) < Integer.parseInt(second_str[i]))
						ret_val = 0;
				} else {
					if (first_str.length < 2)
						ret_val = 0;
					if (second_str.length < 2)
						ret_val = 1;
				}
			}
			if (i == 2 && ret_val == 2) {
				if (first_str.length == 3 && second_str.length == 3) {
					if (Integer.parseInt(first_str[i]) > Integer.parseInt(second_str[i]))
						ret_val = 1;
					if (Integer.parseInt(first_str[i]) < Integer.parseInt(second_str[i]))
						ret_val = 0;
				} else {

					if (first_str.length < second_str.length)
						return 0;
					else
						return 1;
				}
			}
		}
		return ret_val;
	}
}
