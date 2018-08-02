package cn.leslie;

import java.io.UnsupportedEncodingException;

/**
 * Hello world!
 *
 */
public class App 
{
    //我是真的牛逼
    static String  str1="我ABC";
    static String str2="我ABC汉DEF";
    private static int count=10;
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );

      //  splitString1(str1,4);
        //splitString2(str2,6);
      //  App app=new App();
       // System.out.println(app.add(1,2)+app.add(3,4,5));
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }

    }
   private int add(int a,int b){
        return a+b;
   }
    private int add(int a,int b,int c){
        return a+b+c;
    }
    private static void splitString2(String str2, int i) {
      /*  int strlength=0;
        strlength=str2.length();
        byte[] bytes= new byte[0];
        try {
            bytes = str2.getBytes("GBK");
            for (int j = 0; j <i-1; j++) {
                char c= ((char) bytes[j]);

                System.out.print(c);
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
    }

    private static void splitString1(String str1, int i) {
        //创建一个int类型的变量存储一下str1的长度
       /* int strlength=0;
        //System.out.println(str1);
        strlength=str1.length();
        //System.out.println(strlength);============保证字符串的
        //转化为byte数组
        byte[] bytes= new byte[0];
        try {
            bytes = str1.getBytes("GBK");
            for (int j = 0; j < i; j++) {
                char c= ((char) bytes[j]);

                System.out.print(c);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //乱码问题 可能是解决不了
        // System.out.println(bytes.length);

            /*if(bytes[i]>0){
                //System.out.println(bytes[i]);
                //当输入4的时候拿到字节66的B字符
                char c= ((char) bytes[i]);

                System.out.println(c);

            }
*/








    }
}
