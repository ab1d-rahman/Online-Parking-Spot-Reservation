package Services;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ab1d_rahman
 */
public class timeDiff {
    
    public int getHourDifference(String dateStart, String dateStop) {       

        //HH converts hour in 24 hours format (0-23), day calculation
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
        long hours=0;
        try {
                d1 = format.parse(dateStart);
                d2 = format.parse(dateStop);

                //in milliseconds
                long diff = d2.getTime() - d1.getTime();
                hours=diff /(1000*60*60);
                System.out.println(hours);



        } catch (Exception e) {
                e.printStackTrace();
        }
        
        return (int)hours;
    }
}
