package lesson30.task2;

public class JoinTest {

    public static void main(String[] args) {

        /*
	1. Написать класс MyThread, метод run которого может запускаться в отдельном потоке.
	2. Метод run должен выводить информацию о том, что поток с таким-то именем начал работу,
	затем ждать 5 секунд и выводить информацию, что поток с таким-то именем закончил работу.
	3. В главном потоке запустить три потока и дать им какие-то имена.
	4. При помощи методов join(final long millis) и join() добиться следующего выполнения программы:
		а. Стартует первый поток.
		б. Второй поток должен стартовать когда или закончит работу первый поток,
		или пройдёт две секунды с момента его старта.
		в. Третий поток должен стартовать когда закончит работу первый поток.
		г. Главный поток должен вывести информацию о том, что все потоки отработали,
		когда это действительно произойдёт.
		д. Конец работы программы.
	*/

        ThreadJoin thread1 = new ThreadJoin();
        ThreadJoin thread2 = new ThreadJoin();
        ThreadJoin thread3 = new ThreadJoin();

        thread1.setName("Альфа");
        thread2.setName("Бета");
        thread3.setName("Гамма");

        thread1.start();

        try {
            thread1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все потоки завершили работу");
    }
}