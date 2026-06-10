package basicSyntax;

public class test {

	public static void main(String[] args) {

		boolean iskid = true;
		String name = "xx";

		System.out.println(getMessage(name, iskid));

	}

	public static String getMessage(String name, boolean iskid) {

		if (iskid) {
			return ("こんにちは。" + name + "ちゃん。");
		} else {
			return ("こんにちは。" + name + "さん。");
		}

	}

}