/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public int[] bubbleSort(int[] dataArray) {

        for (int i = 0; i < dataArray.length - 1; i++) {

            for (int j = 0; j < dataArray.length - i - 1; j++) {

                if (dataArray[j] > dataArray[j + 1]) {

                    int temp = dataArray[j];
                    dataArray[j] = dataArray[j + 1];
                    dataArray[j + 1] = temp;

                }

            }
        }

        return dataArray;

    }

}
