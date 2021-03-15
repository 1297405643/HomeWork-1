package day03;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        //Calendar ————>Date
        Date date=calendar.getTime();
        System.out.println("当前系统时间"+date);
        //3天后时间 add()
        calendar.add(Calendar.DATE,3);
        Date date1=calendar.getTime();
        System.out.println("3天后这一刻时间"+date1);

    }


}
