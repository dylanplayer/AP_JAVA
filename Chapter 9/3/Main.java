class Main {
  public static void main(String[] args) {
    
		TeamLeader teamLeader = new TeamLeader("Bill", "12345", "01/02/03", 1500, 30);

		teamLeader.setCompleteTrainingHours(15);

		teamLeader.print();


  }
}