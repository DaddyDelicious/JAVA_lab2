package lab2;

import java.io.*;


public class Lab2 {
    private static BufferedReader consoleReader;
    private static BufferedReader fileReader;
    private static BufferedWriter fileWriter;



    public static void main(String[] args) throws IOException{
        File myFile = newFile("firstFile.txt");
        FileReader fileReader = new FileReader(MyFile);
        BufferedReader myBufferedReader = new BufferedReader(fileReader);
        BufferedReader consoleReader = new BufferedReader(consoleInput(arg)); //probably wrong
        String myString;
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(myFile, false));
        while((myString = myBufferedReader.readLine()) != null){
            System.out.println(myString);
        }
        myBufferedReader.close();
        fileReader.close();

    }



    public static String consoleInput(String arg){

        return null; //fix later
    }
}

