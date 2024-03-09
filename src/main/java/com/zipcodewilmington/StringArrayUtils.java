package com.zipcodewilmington;

import org.codehaus.plexus.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

import static org.codehaus.plexus.util.StringUtils.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String string : array){
            if(string == value){
                return true;
            }
        }return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        for (int i = array.length -1; i >= 0; i--) {
            newArray[i] = array[newArray.length -1 -i];
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = new String[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[array.length-1-i] = array[i];
        }
        return Arrays.toString(array).equals(Arrays.toString(reversedArray));
        //without 'Arrays.toString()' it compares the hex ref of the obj which is different
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String newString = Arrays.toString(array);
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'
                ,'s','t','u','v','w','x','y','z'};

        char[] charArray = newString.toCharArray();
        return Arrays.toString(charArray).trim().contains(Arrays.toString(alphabet));

//        char[] inputedAlphabet = new char[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            inputedAlphabet[i] = array[i].toCharArray()[0];
//        }
       /* String string1 = array.toString();
        string1.replaceAll("(.)(?=.*\1)","");

        return string1.length() == 26;*/

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                occurrences++;
            }
        }

        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length-1];

        int i =0;
        for(String string : array){
            if (!string.equals(valueToRemove)){
                newArray[i] = string;
                i++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : array) {
            if (arrayList.isEmpty() || (!(arrayList.get(arrayList.size() - 1).equals(str)))) {
                arrayList.add(str);
            }
        }
        return arrayList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Arrays.sort(array);
        String currentString = "";

        for(int i = 0; i < array.length; i++){
            if(i == 0){
                currentString += array[i];
            }

            else if(array[i] == currentString){
                currentString += array[i];
            }

            else {
                stringArrayList.add(currentString);
                currentString = array[i];
            }

        }

        String[] resultArray = new String[stringArrayList.size()];
        for (int i = 0; i < stringArrayList.size(); i++) {
            resultArray[i] = stringArrayList.get(i);
        }
        return resultArray;
    }


}
