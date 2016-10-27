/*
 * Created by: Michael Balcerzak
 * Created on: 27-Oct-2016
 * Created for: ICS4U
 * dally assignment: 6-04
 * This program solves the tower of hanoi by it self.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerOfHanoi2 {

	private static void movingDisks(int numberOfDisks, String startingPole, String finishPole, String sparePole)
	{
		//reversion case
		if (numberOfDisks > 0){
			movingDisks(numberOfDisks-1, startingPole, sparePole, finishPole);
			System.out.println("move disk from " + startingPole + " to " + finishPole);
			movingDisks(numberOfDisks-1, sparePole, finishPole, startingPole);
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
		
		movingDisks(numberOfDisks, startingPole, finishPole, sparePole);
		
	}

}
