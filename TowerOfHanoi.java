import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerOfHanoi {

	private static void movingDisks(int numberOfDisks, int startingPoleDisks, int finishPoleDisks, int sparePoleDisks, String startingPole, String finishPole, String sparePole)
	{
		//reversion case
		if (numberOfDisks > 0){
			movingDisks(numberOfDisks-1, startingPoleDisks, finishPoleDisks, sparePoleDisks, startingPole, sparePole, finishPole);
			if ((startingPole == "A") && (finishPole == "B")) {
				startingPoleDisks = startingPoleDisks - 1; //++A
				finishPoleDisks = finishPoleDisks + 1; 
			} else if ((startingPole == "A") && (finishPole == "C")) {
				startingPoleDisks = startingPoleDisks - 1;
				sparePoleDisks = sparePoleDisks + 1;
			} else if ((startingPole == "B") && (finishPole == "A")) {
				finishPoleDisks = finishPoleDisks - 1;
				startingPoleDisks = startingPoleDisks + 1;
			} else if ((startingPole == "B") && (finishPole == "C")) {
				finishPoleDisks = finishPoleDisks - 1;
				sparePoleDisks = sparePoleDisks + 1;
			} else if ((startingPole == "C") && (finishPole == "A")) {
				sparePoleDisks = sparePoleDisks - 1;
				startingPoleDisks = startingPoleDisks + 1;
			} else if ((startingPole == "C") && (finishPole == "B")) {
				sparePoleDisks = sparePoleDisks - 1;
				finishPoleDisks = finishPoleDisks + 1;
			}		
			System.out.println("//////// \n" + "pole A: " + startingPoleDisks + "\n" + "pole B: "  + finishPoleDisks + "\n" + "pole C: " + sparePoleDisks + "\n////////");
			movingDisks(numberOfDisks-1, startingPoleDisks, finishPoleDisks, sparePoleDisks, sparePole, finishPole, startingPole);
		}
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		int numberOfDisks;
		System.out.println("put the number of disks for the computer to solve");
		numberOfDisks = Integer.parseInt(br.readLine());
		
		String startingPole = "A";
		String finishPole = "B";
		String sparePole = "C";
		
		int startingPoleDisks = numberOfDisks;
		int finishPoleDisks = 0;
		int sparePoleDisks = 0;
		
		System.out.println("pole A: " + startingPoleDisks + "\n" + "pole B: "  + finishPoleDisks + "\n" + "pole C: " + sparePoleDisks);
		
		movingDisks(numberOfDisks, startingPoleDisks, finishPoleDisks, sparePoleDisks, startingPole, finishPole, sparePole);
		
	}

}
