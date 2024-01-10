package heap_usage;

//Your First Program

class HeapUsage {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("I'm creating an array of first 1000000 odd numbers...");
		int odd_nums[] = new int[100000000];
		int k = 1;
		
		/*
		 * In java each integer takes up 4 bytes. 100,000,000 integers approximately
		 * take up 400MB.
		 */		
		for (int i = 0; i < 100000000; i++) {
			odd_nums[i] = k;
			k = k + 2;
			System.out.println("The value of K is : " + k);
		}
	}
}
