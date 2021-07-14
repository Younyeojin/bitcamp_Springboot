package UtilService;

public class UtilServiceImplTest {
    public static void main(String[] args) { 
        String result = "";
        int digits = 4;
        for (int i = 0; i<digits; i++){
        result += (int)(Math.random()*10);
       }
        System.out.println(result);
       /* String result = "";
        for (int i=0; i<4; i++){
           result += (int)(Math.random()*10000)+1+"\t";
        }
        System.out.println(result);*/
    }
}
