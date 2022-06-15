/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpas1720
 */
public class Cards {
    private int value;
    private String family;
    private String role;
    
    public Cards(int n, String f){
      value=n;
      family=f;
      role=""+n;
    }
    public Cards(int n, String f, String r){
      value=n;
      family=f;
      role=r;
    }
    public int getValue(){
        return value;
    }
     public String getFamily(){
        return family;
    }
     public String getRole(){
        return role;
    }
     public String toString(){
      return ""+role+" of "+family;   
     }
}
