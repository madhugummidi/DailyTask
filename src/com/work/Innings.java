package com.work;

public class Innings {
		String teamname;
		String inningsname;
		int runs;
		
		public String getTeamname() {
			return teamname;
		}
		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}
		public String getInningsname() {
			return inningsname;
		}
		public void setInningsname(String inningsname) {
			this.inningsname = inningsname;
		}
		public int getRuns() {
			return runs;
		}
		public void setRuns(int runs) {
			this.runs = runs;
		}
		
		public void displayInningsDetails()
		{
			System.out.println("Name "+teamname);
			System.out.println("Runs "+runs);
			
			if(inningsname.equals("First"))
			{
				int r = runs+1;
				System.out.println("Need "+r+" to win");
			}
			else
			{
				System.out.println("Match Ended");
			}
		}
		
}
