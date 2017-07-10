/**
 * 
 */

import java.util.*;
/**
 * @author kvito
 *
 */


public class Challenge24 {
	static class Results{
		String homeTeam;
		String awayTeam;
		int homeTeamScore;
		int awayTeamScore;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Results[] res = new Results[10];
		for(int i = 0; i <res.length; i++) res[i] = new Results();
		System.out.println("1.Add a result\n2.Search for all results for a team\n3.Exit");
		int choice = Integer.parseInt(in.nextLine());
		int currRes = 0;
		while(choice != 3 || currRes > 9){
			if(choice == 1){
				System.out.print("Home team name? ");
				res[currRes].homeTeam = in.nextLine();
				
				System.out.print("Home team score? ");
				res[currRes].homeTeamScore = Integer.parseInt(in.nextLine());
				
				System.out.print("Away team name? ");
				res[currRes].awayTeam = in.nextLine();
				
				System.out.print("Away team score? ");
				res[currRes].homeTeamScore = Integer.parseInt(in.nextLine());
				
				currRes++;
			}
			else if (choice == 2){
				System.out.print("Which team? ");
				String team = in.nextLine();
				for(int i = 0; i < res.length; i++){
					try{
						if(res[i].awayTeam.equals(team))
							System.out.println(res[i].homeTeam + " " + res[i].homeTeamScore + " - " + res[i].awayTeam + " " + res[i].awayTeamScore);
						else if(res[i].homeTeam.equals(team))
							System.out.println(res[i].homeTeam + " " + res[i].homeTeamScore + " - " + res[i].awayTeam + " " + res[i].awayTeamScore);
						else
							System.out.println("No results for this team");	
					}catch(NullPointerException e){
						
					}						
				}
			}
			System.out.println("\n1.Add a result\n2.Search for all results for a team\n3.Exit");
			choice = Integer.parseInt(in.nextLine());
		}
		in.close();
	}
}
