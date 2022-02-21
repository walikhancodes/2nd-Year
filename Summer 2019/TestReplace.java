public class TestReplace{
	
	public static void main(String[] args) {

		String prefix = "prefix*";
		String pattern = "(\\w+)([\\*])";
		prefix = prefix.replaceAll(pattern, "$1");
		System.out.println(prefix);
	}
}