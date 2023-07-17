/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5_2;

/**
 *
 * @author richied
 */
public class TernaryTester {
    public static void main(String[] args) {
        
        int a=2,b=3,c=1,min;
        
//        if(a<b)
//            min=a;
//        else
//            min=b;
//        
//        System.out.println(min);
        
        //ternary operator
        //kondisi ?nilai true:nilai false <-- cara penulisan
        
         min=a<b?a:b;
//        System.out.println(min);
        
        //bagaimana jika 3 variable dicek untuk dibandingkan dengan ternary
//        min=a<b?a:a<c?b:b; --> javascriptcek
          min =a<b?(a<c?a:c):(b<c?b:c);
        System.out.println(min);
    }
}
