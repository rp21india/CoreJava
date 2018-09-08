
import java.util.*;
public class Job_Sequencing_Problem_GreedyAlgorithm {
	public static class Job implements Comparable<Job>{
		String id;
		int profit;
		int deadline;
		
		Job(String id, int profit, int deadline){
			this.id = id;
			this.profit = profit;
			this.deadline = deadline;
		}
		
		@Override
		public int compareTo(Job j){
			return this.profit - j.profit;
		}
		
		public static Comparator<Job> decscendingOrder = new Comparator<Job>(){
			public int compare(Job j1, Job j2){
				return j2.profit - j1.profit;
			}
		};
		
		public String toString(){
			return "["+this.id+", "+this.profit+", "+this.deadline+"]";
		}
	}
	
	public static void main(String[] args) {
		TreeSet<Job> set = new TreeSet<Job>(Job.decscendingOrder);
		set.add(new Job("a", 100, 2));
		set.add(new Job("b", 19, 1));
		set.add(new Job("c", 27, 2));
		set.add(new Job("d", 25, 1));
		set.add(new Job("e", 15, 3));
		int maxDeadline = 3;
		printScheduledJobs(set, maxDeadline);
	}
	
	public static void printScheduledJobs(Set<Job> set, int maxDeadline){
		int count = 0;
		boolean[] slot = new boolean[Math.min(set.size(), maxDeadline)];
		for(Job j:set){	
			for(int i=Math.min(slot.length,j.deadline)-1; i>=0; i--){
				if(!slot[i]){
					System.out.println("Time : "+i+" "+j.toString());
					slot[i] = true;
					count++;
					break;
				}
			}
			if(count==slot.length){
				break;
			}
		}
	}}