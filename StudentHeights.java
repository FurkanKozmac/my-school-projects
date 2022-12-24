// ESTU BIM101 COMPUTER PROGRAMMING I ASSIGNMENT 4 - Furkan KOZMAÇ

import java.util.Arrays;

public class StudentHeights {

    public static String[] sortByHeight(String names[],int heights []){

        for (int i=0;i< heights.length-1;i++){
            for(int k=0;k<heights.length;k++){
                if (i+k>= heights.length){
                    break;
                }
 
                if(heights[i]<heights[i+k]){

                    String temp=names[i+k];
                    names[i+k]=names[i];
                    names[i]=temp;

                    int temp_1=heights[i+k];
                    heights[i+k]=heights[i];
                    heights[i]=temp_1;
                }
            }
        }
        return names;

    }
    public static void main(String[] args) {
 
        String names[] = new String[4];
        int heights[] = new int[4];

        names[0]="Furkan";
        names[1]="Yusuf";
        names[2]="Erdem";
        names[3]="Poyraz";

        heights[0]=175;
        heights[1]=170;
        heights[2]=169;
        heights[3]=187;

        System.out.println(Arrays.toString(sortByHeight(names,heights)));
    }
}