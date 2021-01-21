import java.util.Scanner;
public class HuaWei3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int s4=0;
        while (s1.hasNext()){
            String s=s1.next();
            int sl=s.length();
            for (int i=2;i<s.length();i++){
                String s2=s.substring(i,i+1);
                int s3=strtoint(s2);
                s4+=s3*Math.pow(16,sl-1-i);
            }
            System.out.println(s4);
        }
        s1.close();
    }
    public static int strtoint(String s2){
        int s3=0;
        if(s2.equals("1")){
            return s3=1;
        }else if(s2.equals("2")){
            return s3=2;
        }else if(s2.equals("3")){
            return s3=3;
        }else if(s2.equals("4")){
            return s3=4;
        }else if(s2.equals("5")){
            return s3=5;
        }else if(s2.equals("6")){
            return s3=6;
        }else if(s2.equals("7")){
            return s3=7;
        }else if(s2.equals("8")){
            return s3=8;
        }else if(s2.equals("9")){
            return s3=9;
        }else if(s2.equals("A")){
            return s3=10;
        }else if(s2.equals("B")){
            return s3=11;
        }else if(s2.equals("C")){
            return s3=12;
        }else if(s2.equals("D")){
            return s3=13;
        }else if(s2.equals("E")){
            return s3=14;
        }else if(s2.equals("F")){
            return s3=15;
        }else{
            System.out.println("您输入的不是十六进制字符");
        }return s3;
    }
}
