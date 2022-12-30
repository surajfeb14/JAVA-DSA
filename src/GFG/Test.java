package GFG;
public class Test {
    public static void main(String[] args) {
        int num = 9889;
        String str = String.valueOf(num);
        int len=str.length();

//            System.out.println(Integer.parseInt(str.substring(len/2-1,len/2+1))+11);
        if(len==1&&len>0&&len<9){
            System.out.println(num+1);
        }
        else if(Boolean.valueOf(String.valueOf(Integer.parseInt(String.valueOf(num+1).substring(1))))){
            System.out.println(num+2);
        }else if(len % 2 != 0){
            System.out.println(str.substring(0,len/2)+(Integer.parseInt(str.substring(len/2,len/2+1))+1)+str.substring(len/2+1));
        }else{
            System.out.println(str.substring(0,len/2-1)+(Integer.parseInt(str.substring(len/2-1,len/2+1))+11)+str.substring(len/2+1));
        }
    }
}