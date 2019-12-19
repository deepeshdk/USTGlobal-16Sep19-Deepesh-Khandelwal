package com.ustglobal.datastructureandalgorithm.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {

	public static void main(String[] args) {

		long number = 9999999L;
		System.out.println(addUpto(number));
		System.out.println(addUptoQuick(number));
		//countingDuration(); here we have to wait till first execute
		countingDuration2(); // this is faster than first
		countingDuration(); // here we get second method output and then wait for these method output
	}

	public static long addUpto(long number) { // it has more operation and occupying more memory.
		long total = 0L;
		for(long i = 0; i <= number; i++) {
			total = total + i;
		}
		return total;
	}
	
	public static long addUptoQuick(long number) { //it has smaller operation then first and alos it is not occupying memory also than first that"s why it is fater than first
		return number * (number+1)/2;
	}
	
	public static void countingDuration() {
		long number = 99999999L;
		Instant start = Instant.now();
		System.out.println("addUpto: " + addUpto(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUpto time: " + seconds + "seconds");
	}
	
	public static void countingDuration2() {
		long number = 99999999L;
		Instant start = Instant.now();
		System.out.println("addUptoQuick: " + addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUptoQuick time: " + seconds + "seconds");
	}
}