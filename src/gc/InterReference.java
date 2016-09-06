package gc;

public class InterReference {
    private static final int _MB = 1024 * 1024;

    public Object instance = null;
    
    private byte[] memoryHolder = new byte[2 * _MB];

    public static void main(String[] args) {
        InterReference ir1 = new InterReference();
        InterReference ir2 = new InterReference();
        ir1.instance = ir2;
        ir2.instance = ir1;

        ir1 = null;
        ir2 = null;

        System.gc();
    }
}
