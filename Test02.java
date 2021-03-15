package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        System.out.println(date);
        //public final String format(Date date) 将一个 Date 格式化为日期/时间字符串
        String str=sdf.format(date);
        System.out.println(str);
    }


}
