package hw6;

public class Calculator {
	private int x;
	private int y;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) throws CalException {

		if (y < 0) {
			throw new CalException ("次方為負值 結果回傳不為整數");

		} else {

			this.y = y;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void powerXY() {
		int z;
		z = (int) Math.pow(x, y);
		System.out.println(x+"的"+y+"次方為"+z);
	}

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		}
		else if(x == 0 && y < 0) {
			throw new CalException("0的負數次方沒有意義");
		}
		else {
			setX(x);
			setY(y);
		}
	}

}
