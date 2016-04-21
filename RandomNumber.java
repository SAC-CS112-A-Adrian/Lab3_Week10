
public class RandomNumber {

	private double highNum;

	public RandomNumber(double high) {
		highNum = high;
	}

	public double GetANumber() {

		double computerNum = 1 + (int) (Math.random() * highNum);
		return computerNum;
	}

}
