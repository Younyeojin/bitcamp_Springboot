package UtilService;

import com.example.demo.util.service.LambdaUtils;

public class UtilServiceImplTest extends LambdaUtils {
    public static void main(String[] args) {
        String result = "";
        for(int i=0; i<4; i++){
            result += (int)(Math.random()*10);
        }
        print.accept(result);
    }
}

        /*String first = utilService.randomNumbers(4);
        if(first == first){
          String str = new String();
            //char
        }
        String result = "";
        for (int i=0; i<4; i++){
            result += (int)(Math.random()*10); //->0012 같은 숫자가 나왔을때를 대비한 식
        }

        System.out.println(result);
       /* String result = "";
        for (int i=0; i<4; i++){
           result += (int)(Math.random()*10000)+1+"\t";
        }
        System.out.println(result);*/
