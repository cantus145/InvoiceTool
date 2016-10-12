import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Invoicetool {

	// 98 09~10
	//static final String[] spam = new String[] {"568", "911", "779", "495", "479", "353"};
	
	// 98 11~12
	//	static final String[] spam = new String[] { "154", "574", "400", "321",	"582", "891" };
	
	// 99 01~02
	//static final String[] spam = new String[] { "556", "330", "775", "940", "077", "165" };
	
	// 99 03~04
	static final String[] spam = new String[] { "190", "632", "867", "175", "077", "263" };
	
	// 99 05~06
	//static final String[] spam = new String[] { "315", "783", "073", "685", "092", "998" };
	
	// 99 07~08
	//static final String[] spam = new String[] { "354", "755", "610", "740", "838", "137" };

	// 100 3~4
	// static final String[] spam = new String[] { "825", "735", "009", "353",
	// "072" };
	
	// 100 5~6
	//static final String[] spam = new String[] { "726", "510", "689", "544", "259"};

	// 100 9~10
	// static final String[] spam = new String[] { "465", "487", "106", "929", "557" };

	static List<String> intlist;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intlist = Arrays.asList(spam);

		if (!validList()) {
			System.out.println("list錯誤");
			return;
		}

		String num1;
		Scanner scanner = new Scanner(System.in);
		boolean start = true;
		
		while (start) {
			System.out.println("\n請輸後3碼：");
			num1 = scanner.next();
			
			if(num1.equals("end")) {
				start = false;
				continue;
			}

			if (num1.length() != 3) {
				System.out.println("errrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
				continue;
			}

			if (checkDigit(num1)) {
				System.out.println("===========> 中3碼：" + num1);
				System.out.println("===========> 中3碼：" + num1);
				System.out.println("===========> 中3碼：" + num1);
			} else {
			}
		}

		scanner.close();
		System.out.println("stop");
	}

	private static boolean validList() {
		for (String dig : intlist) {
			if (dig.length() != 3) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkDigit(String num1) {
		boolean resultBool = false;
		for (String dig : intlist) {
			resultBool = check3digit(dig, num1);
			if (resultBool) {
				break;
			}
		}
		return resultBool;
	}

	private static boolean check3digit(String dig, String num1) {
		if (dig.equals(num1)) {
			return true;
		} else {
			return false;
		}
	}

}
