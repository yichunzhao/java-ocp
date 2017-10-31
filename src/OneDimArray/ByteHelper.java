/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDimArray;

/**
 *
 * @author YNZ
 */
public class ByteHelper {

    public static byte[] toPrimitive(Byte[] bs) {
        byte[] result = new byte[bs.length];
        for (int i = 0; i < bs.length; i++) {
            result[i] = bs[i];
        }
        return result;
    }

    public static Byte[] toWrapper(byte[] bs) {
        Byte[] result = new Byte[bs.length];
        for (int i = 0; i < bs.length; i++) {
            result[i] = bs[i];
        }

        return result;
    }
}
