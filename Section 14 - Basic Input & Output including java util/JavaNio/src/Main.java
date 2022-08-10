import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel = binFile.getChannel();
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(100);

            /*byte[] outputBytes = "Hello World!".getBytes();
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
            buffer.flip();
            */

            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            long int1pos = outputBytes.length;
            buffer.putInt(245);
            long int2pos = int1pos + Integer.BYTES;
            buffer.putInt(-98765);
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes2);
            long int3pos = int2pos + Integer.BYTES + outputBytes2.length;
            buffer.putInt(1000);
            buffer.flip();

            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
            channel.position(int3pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int3 = " + readBuffer.getInt());
            readBuffer.flip();
            channel.position(int2pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int2 = " + readBuffer.getInt());
            readBuffer.flip();
            channel.position(int1pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int1 = " + readBuffer.getInt());

            byte[] outputString = "Hello, World!".getBytes();
            long str1pos = 0;
            long newInt1pos = outputString.length;
            long newInt2pos = newInt1pos + Integer.BYTES;
            byte[] outputString2 = "Nice to meet you".getBytes();
            long str2pos = newInt2pos + Integer.BYTES;
            long newInt3pos = str2pos + outputString2.length;

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            binChannel.position(newInt1pos);
            binChannel.write(intBuffer);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            binChannel.position(newInt2pos);
            binChannel.write(intBuffer);

            intBuffer.flip();
            intBuffer.putInt(1000);
            intBuffer.flip();
            binChannel.position(newInt3pos);
            binChannel.write(intBuffer);

            binChannel.position(str1pos);
            binChannel.write(ByteBuffer.wrap(outputString));
            binChannel.position(str2pos);
            binChannel.write(ByteBuffer.wrap(outputString2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}