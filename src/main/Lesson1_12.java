package main;

import java.util.Scanner;

public class Lesson1_12 {


    public static void main(String[] args){



        //1. massivde olan sade ededlerin sayini tapmaq


//        int[] arr = new int[]{1,2,3,6,10,7,12};
//        int countDivide = 0;
//        int totalSimpleNumbers=0;
//        System.out.print("Simple numbers -> ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i] % arr[j]==0){
//                    countDivide++;
//                }
//            }
//            if(countDivide<=2){
//                System.out.print(" "+ arr[i]);
//                totalSimpleNumbers++;
//            }
//
//            countDivide=0;
//        }
//        System.out.println("\nTotal simple numbers = "+totalSimpleNumbers);



       // 2. massivde 7e qaliqsiz bolunen element sayini tapmaq

//        int[] arr = new int[]{1,2,3,6,10,7,14,12};
//        int counter=0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 7==0){
//                counter++;
//                //burda da cxarda bilerik reqemi hansiki bolunur
//            }
//        }
//        System.out.println("The total numbers whom divide by 7 is -> "+counter);



       // 3. massivin en kicik cut ve en boyuk tek ededinin tapilmasi

//        int[] arr = {154, 2, 3, 4, 5, 8, 11, 12};
//
//        int minEven = arr[0];
//        int maxOdd = 2;  // arr[0] versek ref problemi ola biler
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] < minEven) {
//                minEven = arr[i];
//            } else if (arr[i] % 2 != 0 && arr[i] > maxOdd) {
//                maxOdd = arr[i];
//            }
//        }
//
//        System.out.println("Minimum Even number of array is -> " + minEven);
//        System.out.println("Maximum Odd number of array is -> " + maxOdd);




        //4. tek indexde durmus elementleri 0la evez etmek

//        int[] arr = new int[]{1,2,4,7,8,10};
//
//        for (int i = 1; i < arr.length; i++) {
//            if(i % 2 !=0){
//                arr[i] = 0;
//            }
//        }
//        System.out.println("Changed array with new values ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }


        //5. massivde tekrarlanan elementler var,
        // burda olan elementleri tekrarsiz sekilde yeni massive kocurmek
        // (1,2,3,1,4,5,2) -> (1,2,3,4,5)

//        int[] arr = new int[]{1, 2, 3, 1, 4, 5, 2};
//        int[] newArray = new int[arr.length];
//        int newIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < newIndex; j++) {
//                if (arr[i] == newArray[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                newArray[newIndex] = arr[i];
//                newIndex++;
//            }
//        }
//        System.out.print("Our new array without duplicate -> ");
//        for (int i = 0; i < newIndex; i++) {
//            System.out.print(newArray[i] + " ");
//        }


        //6 elementler artaraq duzulub duzulmemesini yoxlamaq (1,2,3) positive case, (1,3,2) negative case

//        int counter = 0;
//
//        int[] posArray = {1,2,3,4,5,6};
//        int[] negArray = {6,5,4,3,2,1};
//
//        for (int i = 0; i < negArray.length -1; i++) {
//            if((negArray[i+1])-negArray[i]==1){
//                counter++;
//                if(counter==negArray.length-1){
//                    System.out.println("This Array is possitive case");
//                }
//            } else if (((negArray[i])-negArray[i+1])==1) {
//                counter++;
//                if(counter==negArray.length-1){
//                    System.out.println("This Array is neggative case");
//                }
//            }
//            else {
//                System.out.println("This is chaotic array");
//            }
//        }
//
//        //cox varinatlarla elemek olardi bir forla duwundum ki eger bir arrayimiz olacaq onu yoxluyaq



        //7 arrayin elementlerinin polindrom olub olmamasini yoxlamaq

//        int[] arr= {1,2,3,4,5,4,3,2,1};
//        boolean isPolindrom=false;
//        int counter = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr.length-1; j >0; j--) {
//                if(arr[i]==arr[j]){
//                    counter++;
//                }
//            }
//            if(counter-1==arr.length){
//                isPolindrom=true;
//            }
//        }
//        if(isPolindrom){
//            System.out.println("This array is polindrom )))");
//        }
//        else {
//            System.out.println("This array is not polindrom )))");
//
//        }



        //8 eyniolculu massivin elementlerinin ust uste dusub dusmemesini yoxlamaq


        int[] firstArr= {1,2,3,4,6} ;
        int[] secondArr= {1,2,3,4,6} ;
        int counter = 0;

        for (int i = 0; i < firstArr.length; i++) {
            if(firstArr[i]==secondArr[i]){
                counter++;
                if(counter==firstArr.length){
                    System.out.println("This is duplicate array");
                }
            }
            else if(firstArr[i]!=secondArr[i]){
                System.out.println("This is not duplicate array");
                break;
            }
        }



    }



}
