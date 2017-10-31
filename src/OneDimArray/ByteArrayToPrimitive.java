/*
 * converting byte[] to Byte[], or converting Byte[] to byte[]; 
 * converting 5M bytes costing 80 ms in my laptop(made in 2013) 
 * byte[] is an instance
 */
package OneDimArray;

/**
 *
 * @author YNZ
 */
public class ByteArrayToPrimitive {

    public static void main(String[] args) {
        byte[] bs = new byte[1024 * 1024 * 5];
        for (int i = 0; i < bs.length; i++) {
            bs[i] = 'a';
        }

        Long start = System.currentTimeMillis();
        Byte[] wrapper = ByteHelper.toWrapper(bs);
        Long end = System.currentTimeMillis();

        System.out.println("time cost : " + (end - start));
        System.out.println("wrapper length " + wrapper.length);
        byte d =  'a';
        System.out.println("byte : "  + d);
    }
}
