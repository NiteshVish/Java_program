
import java.util.Scanner;

public class Strings {
    public static void main(String[]args){
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your String!");
        String str=sc.nextLine();
        // if(num==1){
        //     System.out.println("NO");
        //     return ;
        // }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                // System.out.println("NO");
                
                count++;
                return;
            }
            

        }
        System.out.println("Yes");

    }
    
}

    
}
