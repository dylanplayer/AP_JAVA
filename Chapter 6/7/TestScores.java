import java.util.ArrayList;

public class TestScores{


    private ArrayList<Double> TEST_SCORES = new ArrayList<Double>();

    /**
     * Create TestScores class
     * @param score1 score2 score3
     */
    public TestScores(double score1, double score2, double score3){

         TEST_SCORES.add(score1);
         TEST_SCORES.add(score2);
         TEST_SCORES.add(score3);

    }

    /**
     * Gets score at index
     * @param index
     * @return score at index
     */
    public Double getScore(int index){

        return TEST_SCORES.get(index);

    }

    /**
     * Gets the average of all test scores
     * @return average
     */
    public Double getAvg(){

        double sum = 0;
        
        for(int i = 0; i < TEST_SCORES.size(); i++){

            sum += TEST_SCORES.get(i);

        }

        return sum / TEST_SCORES.size();

    }

    /**
     * Set score at index
     * @param index
     * @param score
     */
    public void setScore(int index, double score){

        TEST_SCORES.set(index, score);

    }

    /**
     * Prints scores to console
     */
    public void printScores(){

        for(int i = 0; i < TEST_SCORES.size(); i++){

            System.out.printf("Score %d: %.2f\n", i + 1 , TEST_SCORES.get(i));

        }

    }

    /**
     * Print score at index to console
     * @param index
     */
    public void printScore(int index){

        System.out.printf("Score %d: %.2f\n", index + 1, TEST_SCORES.get(index));

    }


}