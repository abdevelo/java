package bank;

public class MakeMessage {

	public static String makeMessage(String code){
		String result = "";
		switch(code) {
		case "ER0001" : result = "계좌개설 실패.."; break;
		case "EX0002" : result = "음수 입력.."; break;
		case "EX0003" : result = "잔액 부족.."; break;
		case "EX0004" : result = "계좌를 개설할 수 없습니다.."; break;
		}
		return result;

	}


}
