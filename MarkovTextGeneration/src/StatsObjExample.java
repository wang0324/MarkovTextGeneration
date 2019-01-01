public class StatsObjExample {
	public static void main(String[] args) {
		// This file reminds you how Bags work.
		
		StatsObj b = new StatsObj(3);
		
		// Add things to the bag
		b.add("a");
		b.add("a");
		b.add("a");

		System.out.println("Most frequent is: "+ b.getTopMostFreq());

		b.add("b");
		b.add("b");
        b.add("b");
        b.add("b");

		System.out.println("Most frequent is: "+ b.getTopMostFreq());

		b.add("x");
		b.add("w");
		b.add("p");
		b.add("q");

		System.out.println("Most frequent is: "+ b.getTopMostFreq());

		// You can then get the frequency of each thing
		System.out.println("Freq of a: " + b.getCountOf("a"));
		System.out.println("Freq of q: " + b.getCountOf("q"));
		System.out.println("Freq of g: " + b.getCountOf("g"));
		
		// You can get the most frequently occuring thing
		System.out.println("Most frequent is: "+ b.getTopMostFreq());
		
		// Or you can get a random element according to its frequency in the bag.
		// In this example I get 100 random elements.  notice that the most freqent
		// thing occurs most often in the results:
		for (int i = 0; i < 100; i++) {
			System.out.print( b.getRandom() );
		}
	}
}