package Packets.MyException;

import java.io.File;

/**
 * Created by Ciobotaru on 31.10.2014.
 */
public class MyException extends Exception {

    int codEroare;
    public int existaFisier(String a)
    {

        File f=new File(a);
        if(f==null)
            return 0;
        return 1;
    }
}
