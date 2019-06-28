
public class StringAndMethods {

	public static void main(String[] args) {

		capitalize("blaZes");
		wheresWaldo("I wish waldo was dead");
		firstThingsFirst("gator", "billy");
		soLong("bean", "pea");
		reverse("happy");
		afterMath("My floor mat is so keen!");
		lettersize("Java");

	}

// Methods Section

	// capitalize method
	public static void capitalize(String word) {
		String first = word.substring(0, 1).toUpperCase();
		String rest = word.substring(1).toLowerCase();
		System.out.println(first + rest);
	}

	// wheresWaldo method
	public static void wheresWaldo(String phrase) {
		phrase = phrase.toLowerCase();
		System.out.println(phrase.indexOf("waldo"));
	}

	// firstThingsFirst method
	public static void firstThingsFirst(String a, String b) {
		int stringCompare = a.compareToIgnoreCase(b);
		if (stringCompare < 0) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b + " " + a);
		}

	}

	// soLong method
	public static void soLong(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();

		if (aLength < bLength) {
			System.out.println(b);
		} else if (aLength > bLength) {
			System.out.println(a);
		} else {
			System.out.println(a + " " + b);
		}
	}

	// reverse method
	public static void reverse(String s) {
		int i;
		int stringLength = s.length();

		for (i = stringLength - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

	// afterMath method
	public static void afterMath(String phrase) {
		int stringIndex = phrase.toLowerCase().indexOf("math");
		if (stringIndex < 0) {
			System.out.println("dud");
		} else {
			System.out.println(phrase.substring(stringIndex));
		}

	}

	// lettersize method
	public static void lettersize(String word) {
		int wordLength = word.length();
		int i;
		for (i = 0; i < wordLength; i++) {
			System.out.println(word.charAt(i));
		}

	}

}