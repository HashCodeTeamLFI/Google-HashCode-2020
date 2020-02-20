/* initial commit for hashcode

 */

import java.util.*;
import java.io.*;

public static void main(String[]args){
        File inputFile="a_example.txt";
        Scanner input=new Scanner(inputFile);
        String firstLine=input.nextLine();
        int[]arr=firstLine.split(" ");
        int numBooks=arr[0];
        int numLibraries=arr[1];
        int numDays=arr[2];
        String secondLine=input.nextLine();
        int[]scores=secondLine.split(" ");
        for(int i=0;i<numBooks; i++){
        Book.setScore(i);
        }
        // Library sections
        ArrayList<Library> libraries=new ArrayList<>();

        while(input.hasNext()){
        string=sl;
        if()

        }
        