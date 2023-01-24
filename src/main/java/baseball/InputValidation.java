package baseball;

public class InputValidation {
	// 변수 final 관리
	static final int MIN_NUM = 1;
	static final int MAX_NUM = 9;
	public static boolean validNum(int num) {
		return num >= MIN_NUM && num <=MAX_NUM;
	}

}
