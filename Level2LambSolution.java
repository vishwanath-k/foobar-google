public class AnswerLamb {

	public static int answer(int total_lambs) {
		return find_stingy(total_lambs) - find_generous(total_lambs);

	}

	public static int find_stingy(int tot_lambs) {
		int prev_place = 0;
		int next_place = 1;
		int henchman_count = 0;
		int sum_lamb = 1;
		int act_lamb = 0;

		while (tot_lambs > act_lamb) {
			sum_lamb = prev_place + next_place;
			prev_place = next_place;
			next_place = sum_lamb;
			act_lamb += sum_lamb;
			if (tot_lambs > sum_lamb || tot_lambs == sum_lamb)
				henchman_count += 1;

		}

		return henchman_count;
	}

	public static int find_generous(int total_lambs) {
		int act_lamb = 1;
		int lamb_sum = 1;
		int henchman_count = 1;
		int next_place = 2;

		while (total_lambs > act_lamb) {

			next_place = lamb_sum;
			lamb_sum = lamb_sum * 2;
			act_lamb += lamb_sum;
			if (total_lambs > act_lamb)
				henchman_count += 1;
		}

		if (total_lambs - (act_lamb - lamb_sum) >= next_place + (next_place / 2))
			henchman_count += 1;
		return henchman_count;
	}

}
