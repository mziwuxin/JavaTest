package cn.leslie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestTwo {

    public static void main( String[] args ){
        BufferedReader bufferedReader = null;
        try {
            //读取硬盘文件
            bufferedReader = new BufferedReader(new FileReader("D:\\names.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String str= null;
        try {
            //按行读取
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //建立一个之存储姓名和数字的集合用来遍历名字
        List<String> names = new ArrayList<String>();
        while(str!=null){  //1,张三,28
            String []st=str.split(",");
            //拆分字符串保留前边的姓名
            names.add(st[1]);//只把姓名添加进去就可以了
            try {
                str= bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
                   //存储姓名的集合
            Set<String> name =new HashSet<String>(names);
            for(String set :name){
                //存储姓名的集合
                String temp=set;
                int num=0;
                for(String c : names)  //list集合里有很多重复的。对每次迭代的元素，要是次数大于2就表示重复
                {
                    if(temp.equals(c)){
                        num++;
                    }
                }
                if(num>=2){
                    System.out.println(temp+"重复次数："+num);

                }

            }

        }
    }
}
