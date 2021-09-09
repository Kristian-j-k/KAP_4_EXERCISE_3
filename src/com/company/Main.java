/*FORVENTET OUTPUT:
No, I wug.
You wugga wug.
I wug.
 */

package com.company;

public class Main {


    public static void zoop() {              //3,1
        baffle();                            //3,2 ->
        System.out.print("You wugga ");      //3,3
        baffle();                            //3,4 ->
    }
    public static void main(String[] args) { //1
        System.out.print("No, I ");          //2
        zoop();                              //3 ->
        System.out.print("I ");              //4
        baffle();                            //5
    }
    public static void baffle() {            //3,2,1   :  3,4,1
        System.out.print("wug");             //3,2,2   :  3,4,2
        ping();                              //3,2,3-> :  3,4,3 ->
    }
    public static void ping() {              //3,2,3,1 : 3,4,3,1
        System.out.println(".");             //3,2,3,2 : 3,4,3,2
    }
}
