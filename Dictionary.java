package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dictionary {
    private ArrayList<Word> theDictionary;

    //constructor
    public Dictionary(){
        //initialize ArrayList
        ArrayList<Word> theDictionary = new ArrayList<>();
    }


    public void addWords(String arg){
        String []words = arg.split(" ");
        for(int i = 0; i < words.length; i+= 1){
            Word word = new Word(words[i]);
            theDictionary.add(word);
        }
    }


    public int numberOfWords(){
        return theDictionary.size();
    }


    public void removeDuplicates(){
        for(int i = 0; i < theDictionary.size(); i+= 1){ //loop through the dictionary
            Word word = theDictionary.get(i); //saves current word.
            for(int j = 0; j < theDictionary.size(); j += 1){ //loop through again for each saved word
                if(j==i){ //if we are checking a word against itself, move up one spot.
                    j++;
                    Word temp = theDictionary.get(j); //now save current word to be checked.
                    if(temp.equals(word)){
                        theDictionary.remove(j); //removes duplicate word
                        word.increaseCounts();
                    }
                }
                else{
                    Word temp = theDictionary.get(j);
                    if(temp.equals(word)){
                        theDictionary.remove(j);
                        word.increaseCounts();
                    }
                }

            }
        }
    }



    /**
     * Want to Override function to be able to use "comparable".
     * Use "comparable" to sort by "counts" instead of by alphabetical order.
     * this function probably wont work.
     * vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
     * theDictionary.sort(Comparator.comparing(i-> Collections.frequency(theDictionary, i)).reversed());
     */

    public void sortDictionaryByCounts(){
        //counts should be the comparator: .sort(counts <...>).
        //what goes inside the <>?
        //theDictionary.sort(counts <>);
        Collections.sort(theDictionary, (o1, o2) -> o1.getCounts()); //maybe
        System.out.println(theDictionary);
    }



    /**
     * Expected output:
     * 1 words occurred 10 times.
     * 2 words occurred 8 times.
     * 1 words occurred 4 times.
     * etc...
     *
     * code below is a garbage fire
     * should be banished to the shadow realm
     */
    public void countOccurrences() {
        removeDuplicates();
        sortDictionaryByCounts(); //this will end up fucking me
        for (int i = 0; i < theDictionary.size(); i += 1) {
            int sameCounts = 0;
            Word nWord = theDictionary.get(i);
            for (int j = 0; j < theDictionary.size(); j += 1) {
                Word temp;
                if (j == i) {
                    j++;
                    temp = theDictionary.get(j);
                    if (temp.getCounts() == nWord.getCounts()) {
                        sameCounts++;
                    } else {
                        temp = theDictionary.get(j);
                        if (temp.getCounts() == nWord.getCounts()) {
                            sameCounts++;
                            j++;
                        }
                    }
                }
                System.out.println(sameCounts + "words occurred " + nWord.getCounts() + " times.");
            }

        }
    }

    public String toString(){
        return null; //fix later
    }




}
