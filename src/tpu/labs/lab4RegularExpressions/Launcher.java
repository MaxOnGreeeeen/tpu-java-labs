package tpu.labs.lab4RegularExpressions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Launcher {
    public static String numberRegExp = "-?(\\d+)";
    public static String operationRegExp = "(\\s[-+*/]\\s)";
    public static String errorMessage = "Expression is not valid";

    //path to .txt file with expressions
    public static String filePath = "C:\\Users\\User\\tpu-java-labs\\src\\tpu\\labs\\lab4RegularExpressions\\in.txt";

    public static void main (String[] args){
        readFile(filePath);
    }

    public static void readFile(String fileName){
        try{
            File file = new File(fileName);

            FileReader fileReader = new FileReader(file);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();

            while (line != null){
                System.out.println(calculateExpression(line));

                line = reader.readLine();
            }

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }

    public static String calculateExpression(String expressionToCalculate){
        Pattern expressionPatternDigit = Pattern.compile(numberRegExp);
        Pattern expressionPatternOperation = Pattern.compile(operationRegExp);

        String[] matchesOfDigits = new String[2];
        String matchesOfOperation = "";

        Matcher expressionMatcherDigit = expressionPatternDigit.matcher(expressionToCalculate);
        Matcher expressionMatcherOperation = expressionPatternOperation.matcher(expressionToCalculate);

        int counterOfMatches = 0;

        while (expressionMatcherDigit.find()){
            matchesOfDigits[counterOfMatches] = expressionMatcherDigit.group();

            counterOfMatches++;
        }

        while (expressionMatcherOperation.find()){
            matchesOfOperation = expressionMatcherOperation.group();
        }

        if(matchesOfDigits[0] != null && matchesOfDigits[1] != null && matchesOfOperation.length() == 3 ){
            int firstIntValue = Integer.parseInt(matchesOfDigits[0]);
            int secondIntValue = Integer.parseInt(matchesOfDigits[1]);

            int result = 0;

            switch (Character.toString(matchesOfOperation.charAt(1))) {
                case "+" -> result = firstIntValue + secondIntValue;

                case "-" -> result = firstIntValue - secondIntValue;

                case "*" -> result = firstIntValue * secondIntValue;

                case "/" -> {
                    try {
                        result = firstIntValue / secondIntValue;
                    } catch (Exception ex){
                        System.err.println("Деление на ноль " + ex.getMessage());
                    }
                }

                default -> {
                }
            }

            return expressionToCalculate + " = " + result;
        }

        return errorMessage;

    }
}
