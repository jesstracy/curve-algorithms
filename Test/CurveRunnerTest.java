import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 10/6/16.
 */
public class CurveRunnerTest {
    CurveRunner myRunner = new CurveRunner();
    ArrayList<Integer> listOfGradesToCurve;
    ArrayList<Integer> curvedGrades;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    // Tests for flatCurve
    @Test
    public void testFlatCurve1() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(70, 75, 80, 89, 97));
        curvedGrades = myRunner.flatCurve(listOfGradesToCurve);
        assertEquals(73, (int)curvedGrades.get(0));
        assertEquals(78, (int)curvedGrades.get(1));
        assertEquals(83, (int)curvedGrades.get(2));
        assertEquals(92, (int)curvedGrades.get(3));
        assertEquals(100, (int)curvedGrades.get(4));
    }

    @Test
    public void testFlatCurveAllSameGrade() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(85, 85, 85));
        curvedGrades = myRunner.flatCurve(listOfGradesToCurve);
        assertEquals(100, (int)curvedGrades.get(0));
        assertEquals(100, (int)curvedGrades.get(1));
        assertEquals(100, (int)curvedGrades.get(2));
    }

    @Test
    public void testFlatCurveTwoHighestSameGrade() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(41, 82, 82, 36));
        curvedGrades = myRunner.flatCurve(listOfGradesToCurve);
        assertEquals(59, (int)curvedGrades.get(0));
        assertEquals(100, (int)curvedGrades.get(1));
        assertEquals(100, (int)curvedGrades.get(2));
        assertEquals(54, (int)curvedGrades.get(3));
    }

    @Test
    public void testFlatCurveTwoLowestSameGrade() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(99, 80, 80, 90));
        curvedGrades = myRunner.flatCurve(listOfGradesToCurve);
        assertEquals(100, (int)curvedGrades.get(0));
        assertEquals(81, (int)curvedGrades.get(1));
        assertEquals(81, (int)curvedGrades.get(2));
        assertEquals(91, (int)curvedGrades.get(3));
    }

    @Test
    public void testFlatCurveOneGrade() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(70));
        curvedGrades = myRunner.flatCurve(listOfGradesToCurve);
        assertEquals(100, (int)curvedGrades.get(0));
    }

    @Test
    public void testFlatCurveAll100() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(100, 100));
        curvedGrades = myRunner.flatCurve(listOfGradesToCurve);
        assertEquals(100, (int)curvedGrades.get(0));
        assertEquals(100, (int)curvedGrades.get(1));
    }


    // Tests for addExtraCredit
    @Test
    public void testAddExtraCredit() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(92, 67, 83, 90));
        curvedGrades = myRunner.addExtraCredit(listOfGradesToCurve, 10);
        assertEquals(102, (int)curvedGrades.get(0));
        assertEquals(77, (int)curvedGrades.get(1));
        assertEquals(93, (int)curvedGrades.get(2));
        assertEquals(100, (int)curvedGrades.get(3));
    }

    @Test
    public void testAddExtraCreditOneGrade() throws Exception {
        listOfGradesToCurve = new ArrayList<Integer>(Arrays.asList(50));
        curvedGrades = myRunner.addExtraCredit(listOfGradesToCurve, 5);
        assertEquals(55, (int)curvedGrades.get(0));
    }

}