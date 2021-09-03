

class Main{

    public static void main(String[] args){

        TestScores scores = new TestScores(70, 80, 90);

        scores.printScores();

        System.out.printf("Average: %.2f", scores.getAvg());


    }

}