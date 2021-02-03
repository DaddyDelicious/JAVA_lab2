package lab2;

import java.io.*;


public class Lab2 {
    private static BufferedReader consoleReader;
    private static BufferedReader fileReader;
    private static BufferedWriter fileWriter;


    //trash main
    public static void main(String[] args) throws Exception{

        //ska denna ligga i mainen eller consoleInput()?
        /*
        String input = consoleInput();
        switch (arg){
            case "end":
                System.out.println("Bye.");
            case "1":
                System.out.println("Load from file");
                System.out.println("File name: ");
                consoleReader.readLine();
                if(line.equals("Sourcetext.txt")){

                }
        }
        */
        FileReader fr = new FileReader("src/lab2/Sourcetext.txt");
        BufferedReader br = new BufferedReader(fr);
        String result;
        while((result = br.readLine()) != null){
            Dictionary dictionary = new Dictionary();
            dictionary.addWords(result);
            dictionary.countOccurrences();
            System.out.println(result);
        }
    }



    public static String consoleInput(String arg) throws IOException{
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Select option: ");
            String line = consoleReader.readLine();

        } catch (IOException e) {
            return "";
        }

        return null;
    }
}

