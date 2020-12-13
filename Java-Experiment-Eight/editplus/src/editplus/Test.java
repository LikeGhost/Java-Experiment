package editplus;

import java.io.IOException;

public class Test {
    public static void main(String []args) throws IOException {
        EditPlus editPlus=new EditPlus();
        editPlus.open("read.txt");
    }
}
