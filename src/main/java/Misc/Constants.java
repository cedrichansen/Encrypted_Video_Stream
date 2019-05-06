package Misc;

import java.awt.image.BufferedImage;

public class Constants {
    public static final String IP_MULTICAST = "230.12.123.4";
    public static final int PORT = 2709;
    public static final int BUFFER_SIZE = 1024;

    public static final int IMAGE_CHUNK_SIZE = BUFFER_SIZE + Integer.BYTES + (2 * Short.BYTES);


    public static final int BIG_TEST_BUFFER = 10000;

}
