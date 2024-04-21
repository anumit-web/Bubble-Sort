/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Bubble Sort");

        int[] dataArray = { -2, 45, 0, 11, -9 };

        Solution solution = new Solution();

        int output1[] = solution.bubbleSort(dataArray);
        System.out.println("Output = " + Arrays.toString(output1));

    }
}
