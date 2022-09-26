package question7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] votes = generateVotes();
		 boolean stop = false;
		 while (stop != true) {
			 System.out.println("========== Options ==========");
			 System.out.println("1.Winning candidate");
			 System.out.println("2.White votes");
			 System.out.println("3.Null votes");
			 System.out.println("4.Total voting students ");
			 System.out.println("5.Total votes by candidate");
			 System.out.println("6.End");
			 System.out.print("---> Select an option: ");
			 int o = sc.nextInt();
			 sc.nextLine();
			 switch (o) {
			 	case 1:
			 		winningCandidate(votes);
			 		break;
			 	case 2:
			 		whiteVotes(votes);
			 		break;
			 	case 3:
			 		nullVotes(votes);
			 		break;
			 	case 4:
			 		totalVotingStudents(votes);
			 		break;
			 	case 5:
			 		totalVotesByCandidates(votes);
			 		break;
			 	case 6:
			 		stop = true;
			 		break;
			 }
			 System.out.println("");
		 }
		 System.out.println("================ BYE! ================");
	}
	
	private static void totalVotesByCandidates(int[] votes) {
		for (int i = 1; i < 4; i++) {
			System.out.println(String.format("Candidate %d: %d votes", i, votes[i]));
		}
	}

	private static void totalVotingStudents(int[] votes) {
		int sum = 0;
		for (int i = 1; i < 4; i++) {
			sum += votes[i];
		}
		System.out.println(String.format("Total voting students: %d students", sum));
	}

	private static void nullVotes(int[] votes) {
		System.out.println(String.format("Null Votes: %d votes", votes[4]));
	}

	private static void whiteVotes(int[] votes) {
		System.out.println(String.format("White Votes: %d votes",votes[0]));
		
	}

	private static void winningCandidate(int[] votes) {
		List<Integer> list = new ArrayList<>();
		int v = -1;
		for (int i = 1; i < 4; i++) {
			if (votes[i] > v) {
				v = votes[i];
				list.clear();
				list.add(i);
			} else if (votes[i] == v) {
				list.add(i);
			}
		}
		
		if (list.size() > 1) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(String.format("Candidate: %d - Votes: %d", list.get(i), v));
			}
			Random rand = new Random();
			int randomCandidate = list.get(rand.nextInt(list.size()));
			System.out.println(String.format("Winning Candidate: %d", randomCandidate));
		} else {
			System.out.println(String.format("Winning Candidate: %d - Votes: %d", list.get(0), v));
		}
	}
	
	private static int[] generateVotes() {
		Random rand = new Random();
		int[] r = new int[5];
		for (int i = 0; i < 4999; i++) {
			int v = rand.nextInt(110);
			if (v >= 0 && v < 30) {
				r[1]++;
			} else if (v >= 30 && v < 60) {
				r[2]++;
			} else if (v >= 60 && v < 90) {
				r[3]++;
			} else if (v >= 90 && v < 100) {
				r[0]++;
			} else {
				r[4]++;
			}
		}
		return r;
	}
}
