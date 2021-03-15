package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) {
        SimpleDateFormat simpl=new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar= Calendar.getInstance();
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个生产日期格式yyyy-MM-dd");
        String str=sc.nextLine();
        System.out.println("输入保质期天数");
        int num=sc.nextInt();
        try {
            Date date =simpl.parse(str);
            calendar.setTime(date);
        calendar.add(Calendar.DATE,num-14);
        calendar.set(Calendar.DAY_OF_WEEK,4);
      Date time= calendar.getTime();
            System.out.println("促销日"+time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
