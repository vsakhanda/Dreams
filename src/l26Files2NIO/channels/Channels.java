package l26Files2NIO.channels;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Channels {

    public static void main(String[] args) throws IOException {

        try (RandomAccessFile file = new RandomAccessFile("HomeWork.txt", "rw");


             FileChannel fileChannel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(8);// визначається розмір буферу. може бути визначеного розміру, або функцією.
            int bytesRead = fileChannel.read(buffer);

            while (bytesRead != -1) {

                // flip() переключає буфер з режиму запису в режим читання,

                buffer.flip();  // Переключаємо буфер для читання

                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                buffer.clear();  // Підготовка буфера для наступного читання
                bytesRead = fileChannel.read(buffer);
            }
        }

    }

}
