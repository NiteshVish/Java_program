public class ReversedString {
    public static void main(String[] args){
        String str="Nitesh is great";
        String resStr="";
        for(int i=str.length()-1;i>=0;i--){
            resStr=resStr+str.charAt(i);
        }
        System.out.println(resStr);
    }
}
    

