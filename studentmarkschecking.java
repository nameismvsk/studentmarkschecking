package emojiesprint;

public class studentmarkschecking {
	public static void main(String args[]) {
	String ice="\uD83D\uDE00"; //😀
	String Telsub = "Telugu:";
	String hinsub = "hindi:";
	String engsub = "English:";
	String matsub = "Maths:";
	// marks for the each subject 
	int Telugu = 21;
	int hindi  = 22;
	int English= 19;
	int Maths  = 24;

	System.out.println("Good marks:"+ice);
	System.out.println(Telsub+Telugu);
	System.out.println(hinsub+hindi);
	System.out.println(engsub+English);
	System.out.println(matsub+Maths);
	int sum = Telugu+hindi+English+Maths;
	System.out.println("Final marks ="+sum+ice);
	
}

}
