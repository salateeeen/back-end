import java.nio.ByteBuffer;

public class Buffers {
    public static void main(java.lang.String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        buffer.put((byte) 65);
        buffer.put((byte) 66);

        buffer.flip();

        System.out.println((char) buffer.get());
        System.out.println((char) buffer.get());
    }
}
