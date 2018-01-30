/*
 * @uthor: Alok Tibrewala
 */

package survey;

import java.util.Scanner;

public class SurveyProcessor {
	
	public void responses(){
		int a,b,c = 0;
	}
	
	public double percentage(){
		double output = 0;
		
		return output;
	}
	
	

	public static void main(String[] args) {
		Team2_3Survey survey = new Team2_3Survey();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter number of section: ");
		int numberOfSection = scan.nextInt();
		
		int[] sectionNumbers = new int [numberOfSection];
		
		System.out.println("Please enter sections: ");
		for(int i = 0; i < numberOfSection; i++){
			System.out.println(i);
			sectionNumbers[i] = scan.nextInt();
		}
		
		System.out.println("Please enter number of teams per section:");
		int numberOfTeams = scan.nextInt();
		
		int[] teamNumbers = new int [numberOfTeams];
		
		System.out.println("Please enter teams: ");
		for(int i = 0; i < numberOfTeams; i++){
			teamNumbers[i] = scan.nextInt();
		}
		
		System.out.println("Please enter number of questions: ");
		int numberOfQuestions = scan.nextInt();
		
		String input;
		boolean flag = false;
		
		int responseA = 0, responseB = 0, responseC = 0, responseD = 0, responseE = 0, totalResponse = 0;
		
		for(int section = 0; section < numberOfSection; section++){
			System.out.println("Section "+sectionNumbers[section]);
			for(int team = 0; team < numberOfTeams; team++){
				System.out.println("Team "+teamNumbers[section]);
				
				for(int question = 0; question < numberOfQuestions; question++){
					System.out.println("Please enter response for question "+(question+1));
					input = scan.next();
					if(input.equalsIgnoreCase("a")){
						responseA++;
						continue;
					} else if (input.equalsIgnoreCase("b")){
						responseB++;
						continue;
					} else if(input.equalsIgnoreCase("c")){
						responseC++;
						continue;
					}else if(input.equalsIgnoreCase("d")){
						responseD++;
						continue;
					}else if(input.equalsIgnoreCase("e")){
						responseE++;
						continue;
					}
				}
			}
		}
		
		/*	while(!flag){
					input = scan.next();
					if(input.equalsIgnoreCase("exit")){
						flag = true;
						break;
					} else {			
						if(input.equalsIgnoreCase("a")){
							
							continue;
						} else if (input.equalsIgnoreCase("b")){
							
							continue;
						} else if(input.equalsIgnoreCase("c")){
							
							continue;
						}
					}
				}
		*/
	}

}
