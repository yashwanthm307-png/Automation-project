package basics;

import java.time.LocalDateTime;

public class LearnTimeStamp {
public static void main(String[] args) {
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.out.println(timeStamp);
}
}
