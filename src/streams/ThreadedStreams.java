package streams;

import data.ProjectData;

public class ThreadedStreams {

	public static void main(String[] args) {
		
		// Parallel Stream
		(new Thread(() -> {
			ProjectData.WORDS.parallelStream()
				.forEach((s) -> { System.out.println(s); });
		})).start();

		// Async Stream
		(new Thread(() -> {
			ProjectData.WORDS.stream()
				.forEach((s) -> { System.out.println(s); });
		})).start();
	}
	
}
