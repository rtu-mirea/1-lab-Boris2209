package main_pack;

import java.util.ArrayList;
import java.util.List;

public class Array {

    int length;     // size array
    int[] array;    // array declaration

    //class constructor
    Array (int length){
        this.length = length;
        array = new int[this.length];
    }

    //manual input
    public void m_input(){
        java.util.Scanner inp = new java.util.Scanner(System.in);
        System.out.println("Вводите числа массива: ");
        for (int i = 0; i<array.length; i++){
            array[i] = inp.nextInt();
        }
    }

    //random input
    public void r_input(){
        for (int i=0; i<length; i++){
            array[i] = 1 + (int)(Math.random() * 1000);
        }
    }

    //output from left to right by iterators
    public void l_out(){
        for(int i:array){
            System.out.print(i + " ");          //print is used for single-line output
        }
        System.out.println("\n");
    }

    //output from right to left
    public void r_out(){
        for (int i = length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    //sum of numbers
    private int sum_of_numbers(int numb){
        int sum = 0;
        while(numb != 0){
            sum += numb % 10;
            numb /= 10;
        }
        return sum;
    }

    //my task 1
    public int task_1(int value){
        int count = 0;
        for (int i : array){
            if (sum_of_numbers(i) > value)
                count++;
        }
        return count;
    }

    //first and last digit
    private boolean comparison(int num){
        if (num<=11)
            return false;
        int last = num % 10;
        while(num>9){
            num /= 10;
        }
        if (num<last)
            return true;
        else
            return false;
    }


    public String task_2(){
        //save the values to a list for convenience
        ArrayList <Integer> numb = new ArrayList();
        int count =0;
        for (int i : array){
            if (comparison(i)) {
                numb.add(i);
                count++;
            }
        }
        //overwriting in the array
        int [] true_num = new int[count];
        int t = 0;
        for (int i : numb){
            true_num[t] = i;
            t++;
        }
        //the formation of the conclusion
        String str = "";
        for (int i=0; i<true_num.length; i++){
            str += true_num[i];
            str += " ";
        }
        return str;
    }

}
