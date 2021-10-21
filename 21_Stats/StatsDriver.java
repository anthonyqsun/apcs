public class StatsDriver {
	public static void main(String[] args) {
		System.out.print(Stats.mean(1,2));
		System.out.println("...should be 1");
		System.out.print(Stats.mean(12.4,10.0));
		System.out.println("...should be 11.2");
		System.out.print(Stats.max(5,1));
		System.out.println("....should be 5");
		System.out.print(Stats.max(5.3,1.1));
                System.out.println("...should be 5.3");
		System.out.print(Stats.geoMean(4,9));
		System.out.println("...should be 6");
		System.out.print(Stats.geoMean(0.25,0.04));
		System.out.println("...should be 0.1");
	
		System.out.println("\nTesting negative numbers:");
                System.out.print(Stats.mean(-10,-20));
                System.out.println("...should be -15");
                System.out.print(Stats.mean(-17.4,-6.0));
                System.out.println("...should be -11.7");
                System.out.print(Stats.max(-50,-1));
                System.out.println("....should be -1");
                System.out.print(Stats.max(-5.3,1.1));
                System.out.println("...should be 1.1");
                System.out.print(Stats.geoMean(-40,9));
                System.out.println("...should throw error");
                System.out.print(Stats.geoMean(-0.25,-0.04));
                System.out.println("...should be 0.1");

	}
}
