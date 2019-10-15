package Oct26;

public class DonateToPaw {
	public static void main(String[] args) {
		System.out.println(donateFee(40000));
	}

	public static double donateFee(double amount) {
		double fee = 0;
		if (amount < 150)
			fee = 3;
		if (amount > 150 && amount < 1500) {
			fee = amount * 0.04;
			if (fee < 8)
				fee = 8;
		}
		if (amount >= 1500 && amount < 15000) {
			fee = amount * 0.1;
			if (fee < 20)
				fee = 20;
		}
		if (amount >= 15000) {

			fee = 150;

			double t = amount - 15000;
			if (t < 4000) {
				fee = fee + t * 0.02;
			} else {
				fee = fee + 4000 * 0.02;
				t = t - 4000;
				fee = fee + t * 0.03;
			}
			if (fee < 20)
				fee = 20;
		}
		return fee;
	}
}
