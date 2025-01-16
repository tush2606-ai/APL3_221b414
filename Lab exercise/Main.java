/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
 

class GetSet {
 
   
    private String name;
 
    
    public String getName() { return name; }
 

    public void setName(String N)
    {
 
       
        this.name = N;
    }
}
 

class Main {
 
    
    public static void main(String[] args)
    {
       
        GetSet obj = new GetSet();
 
        
        obj.setName("My getter and setter program");
        
        System.out.println(obj.getName());
    }
}
