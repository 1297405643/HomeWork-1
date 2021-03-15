package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 *
 * @author Bonnie
 */
public class Test03 {
    public static void main(String[] args) {
        SimpleDateFormat simpl = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入生日，格式为yyyy-MM-dd");
        String str = sc.nextLine();
        //String->Date  parse();
        try {
            Date birthTime = simpl.parse(str);
            Date nowTime = new Date();
            //Date->Long  getTime()
            long time = nowTime.getTime() - birthTime.getTime();
            int weekNum = (int) (time / (24 * 60 * 60 * 1000 * 7));
            System.out.println("出生到现在经历了" + weekNum + "周");
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
