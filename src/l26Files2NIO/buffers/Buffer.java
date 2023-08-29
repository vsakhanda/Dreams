package l26Files2NIO.buffers;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Buffer {

    public static void main(String[] args) {

  //  byteBuffer();
        byteBufferWithFewExamples();


        System.out.println("буфер для п'яти цілих чисел");
        IntBuffer intBuffer = IntBuffer.allocate(5);  // буфер для п'яти цілих чисел

        intBuffer.put(10);
        intBuffer.put(20);
        intBuffer.put(30);
        intBuffer.put(40);
        intBuffer.put(50);

        intBuffer.flip();

        while (intBuffer.hasRemaining()) {
            int number = intBuffer.get();
            System.out.println(number);  // Виведе 10, 20 і 30

        }
    }

    private static void byteBuffer() {
        // Створюємо буфер на 1024 байти
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // запис в буфер
        buffer.put((byte) 65); // Додаємо байт (значення ASCII для 'A')
        buffer.flip(); //Переключення буфера з режиму запису на режим читання
        //читаємо з буфера :
        while (buffer.hasRemaining()) {
            byte b = buffer.get();
            System.out.println(b);// Виводить 65, якщо це єдиний байт в буфері
            buffer.clear(); //Очищення буфера для повторного запису
            buffer.mark(); // Маркуємо поточну позицію
            // ... читання або запис ...
            buffer.reset(); // Відновлюємо позицію до позначеного місця
        }
    }

    private static void byteBufferWithFewExamples() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.put((byte) 65);
        buffer.put((byte) 66);
        buffer.put((byte) 67);
        buffer.put((byte) 68);
        buffer.put((byte) 69);
        buffer.put((byte) 70);

        // Ілюстрація того, що після flip() не можна записати в буфер
        buffer.rewind();
        //

        try {
            buffer.put((byte) 68);  // Спроба записати після flip() спричинить BufferOverflowException
        } catch (BufferOverflowException e) {
            System.out.println("Caught BufferOverflowException as expected.");
        }

        // Ілюстрація використання mark() і reset()
        buffer.mark(); // Маркуємо поточну позицію після читання першого байта
        byte first = buffer.get();
        System.out.println("First byte: " + first);  // Виводить 65



        byte second = buffer.get();
        System.out.println("Second byte: " + second);  // Виводить 66

          // Відновлюємо позицію до місця маркування


        byte secondAgain = buffer.get();
        System.out.println("Second byte again: " + secondAgain);  // Знову виводить 66

        buffer.reset();

        byte third = buffer.get();
        System.out.println("Third byte again: " + third);  // Знову виводить 66



        byte forth = buffer.get();
        System.out.println("Forth byte again: " + forth);  // Знову виводить 66

        byte fifth = buffer.get();
        System.out.println("Fifth byte again: " + fifth);  // Знову виводить 66
    }

}

/*

    Теперь давайте рассмотрим основной набор методов, которые позволяют работать с нашим буфером (блоком памяти) для чтения и записи данных в каналы и из каналов.

        allocate (int capacity) — метод используется для выделения нового буфера с емкостью в качестве параметра. Метод allocate() выдает исключение IllegalArgumentException в случае, если переданная емкость является отрицательным целым числом.
        capacity() — возвращает емкость (capacity) текущего буфера.
        position() — возвращает текущую позицию курсора. Как операции чтения, так и записи перемещают курсор в конец буфера. Возвращаемое значение всегда меньше или равно limit.
        limit() — возвращает лимит текущего буфера.
        mark() — используется для обозначения (маркировки) текущей позиции курсора.
        reset() — вернет курсор в ранее отмеченную (маркированную) позицию.
        clear() — устанавливает позицию в ноль и ограничивает ее до емкости. В этом методе данные в буфере не очищаются, только маркеры инициализируются повторно.
        flip() — переключает режим буфера с режима записи на режим чтения. Он также устанавливает позицию обратно в ноль и устанавливает лимит, в котором позиция была во время записи.
        read() — метод чтения канала используется для записи данных из канала в буфер, а put() — метод буфера, который используется для записи данных в буфер.
        write() — метод записи канала используется для записи данных из буфера в канал, в то время как get() является методом буфера, который используется для чтения данных из буфера.
        rewind() — метод перемотки. Используется, когда требуется перечитывание, так как он устанавливает позицию в ноль и не изменяет значение лимита.*/
