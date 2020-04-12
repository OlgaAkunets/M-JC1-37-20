package com.company;

public class EasySearch2 implements ISearchEngine {
    public int search (String [] stringArray, String keyWord ){
        int count=0;
        int length = stringArray.length;
        for (int i=0; i<length; i++){
            if (keyWord.length()==stringArray[i].length())
            {
                String upperWord = keyWord.toUpperCase();
                String upperCurrent = stringArray[i].toUpperCase();
                int number = upperCurrent.indexOf(upperWord);

                if (number!=-1){
                    count++;
                }
            }

        }
        return count;
    }
}
