import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OpgaverTests {

    @Test
    void addTwoNumbersOpg1() {

        //Arrange
        int a = 4;
        int b = 5;

        Opgaver opg1Test = new Opgaver();
        int expected = 9;

        //Act
        int actual = opg1Test.addTwoNumbers(a, b);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void elementInListOpg2() {

        //Arrange
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        int target = 2;

        Opgaver opg2Test = new Opgaver();
        int expected = 2;

        //Act
        int actual = opg2Test.elementInList(list, target);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void elementNotInListOpg2() {

        //Arrange
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        int target = 5;
        Opgaver opg2Test = new Opgaver();
        int expected = -1;

        //Act
        int actual = opg2Test.elementInList(list, target);

        //Assert
        assertEquals(expected, actual); // -1 da 5 ikke findes i listen
    }


    @Test
    void binarySearchList() {

        //Arrange
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(5);

        int target = 5;
        Opgaver opg3Test = new Opgaver();
        int expected = 3;

        //Act
        int actual = opg3Test.elementInList(list, target);

        //Assert
        assertEquals(expected, actual);
    }
}