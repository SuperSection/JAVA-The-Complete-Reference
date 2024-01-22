package operators.bitwise;

// Unsigned shifting a byte value.
class ByteUnsignedShift {
    static public void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4); // b is converted to int, becoming 0xfffffff1 then shifted to the right by 4 bits, resulting in 0x0fffffff
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println("                    b = 0x"
                + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
                //        00001111          00000001
        System.out.println("               b >> 4 = 0x"
                + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
                //        00001111          00001111
        System.out.println("              b >>> 4 = 0x"
                + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
                //        00001111          00001111
        System.out.println("      (b & 0xff) >> 4 = 0x"
                + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
                //        00000000          00001111
    }
}
