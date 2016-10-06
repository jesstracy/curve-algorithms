import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jessicatracy on 10/6/16.
 */
public class CurveRunner {
    public static void main(String[] args) {

    }

    // Curves the highest grade to 100 and adds the difference to each grade
    public ArrayList<Integer> flatCurve(ArrayList<Integer> gradesToCurve) {
        //Make sure all grades are valid? I think do this in controller instead.

        // Find maximum of list passed in
        int maxGrade = gradesToCurve.get(0);
        for (int index = 1; index < gradesToCurve.size(); index++) {
            if (maxGrade < gradesToCurve.get(index)) {
                maxGrade = gradesToCurve.get(index);
            }
        }

        //Find the difference between maxGrade and 100
        int flatCurveAmount = 100 - maxGrade;

        //Add the difference to every grade in the list
        for (int index = 0; index < gradesToCurve.size(); index++) {
            gradesToCurve.set(index, gradesToCurve.get(index) + flatCurveAmount);
        }

        return gradesToCurve;
    }


    // Adds any amount of extra credit to each grade
    public ArrayList<Integer> addExtraCredit(ArrayList<Integer> gradesToCurve, int amountToAdd) {
        for (int index = 0; index < gradesToCurve.size(); index++) {
            gradesToCurve.set(index, gradesToCurve.get(index) + amountToAdd);
        }

        return gradesToCurve;
//        return new ArrayList<Integer>(Arrays.asList(-1, -1, -1));
    }


}
