package streams;

import java.util.Arrays;
import java.util.List;

public class ThreadedStreams {

	private final static List<String> words =
			Arrays.asList("This", "is", "my", "first", "streams", "test", "I", "am", "Santi", "Barbat");
	
	public static void main(String[] args) {
		
		// Paralell Stream
		(new Thread(() -> {
			words.parallelStream()
				.forEach((s) -> { System.out.println(s); });
		})).start();

		// Async Stream
		(new Thread(() -> {
			words.stream()
				.forEach((s) -> { System.out.println(s); });
		})).start();
	}
}
