package editplus;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class EditPlus {
    public void open(String path) throws IOException {
        FileInputStream in=new FileInputStream(new File(path));
        byte[] bytes=new byte[16];
        int i=0;
        while(in.read(bytes,0,bytes.length)!=-1){
            System.out.printf("%08x  ",i++*16);
            int j=0;

            for(byte b:bytes){
                System.out.printf(Integer.toHexString(b&0xFF)+" ");
                if(j==7){
                    System.out.print(" ");
                }
                j++;
            }

            System.out.print(" ");
            System.out.print(new String(bytes,"ASCII"));


            System.out.println();
        }
    }
}
