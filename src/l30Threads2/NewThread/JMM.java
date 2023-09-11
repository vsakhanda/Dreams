package l30Threads2.NewThread;

public class JMM {

    /*
        JMM
        Java Memory Model (JMM) — це ключова частина специфікації Java, яка описує,
         як потоки взаємодіють з пам'яттю в мультипоточних Java-програмах.
         JMM визначає правила та гарантії, які допомагають розробникам розуміти, як потоки "бачать" змінні, які змінюються іншими потоками.

        Ось декілька ключових аспектів JMM:

        Видимість: Однією з основних проблем у мультипоточних програмах є "видимість" змін.
        Якщо один потік змінює змінну, коли і як інші потоки побачать цю зміну? JMM вводить поняття "передбачуваної видимості",
        щоб визначити, коли зміни, зроблені одним потоком, стануть видимими для інших потоків.

        Порядок: В мультипоточних програмах порядок виконання операцій може бути непередбачуваним через оптимізації,
        які роблять компілятори та процесори. JMM визначає, які переупорядкування допустимі, а які ні.

        Атомарність: Деякі операції вважаються атомарними в JMM. Наприклад, читання та запис змінних типу int і long (на 32-бітних JVM)
        є атомарними. Однак, для long та double на 32-бітних JVM, операції можуть не бути атомарними. (на 64 бітних - атомарні)

        Синхронізація: JMM вводить поняття "заблокованої пам'яті" через синхронізовані блоки.
        Коли потік входить в синхронізований блок, він отримує свіжий вид даних, а при виході з блоку — зміни,
        зроблені в блоку, стають видимими для інших потоків.

        Волатильні змінні: Змінні, оголошені як volatile, мають спеціальні правила видимості.
        Зміни в volatile змінних завжди видимі для інших потоків.
         Це може бути корисно для створення безпечних мультипоточних конструкцій без використання синхронізації.

        Happens-before відносини: Це фундаментальне поняття в JMM, яке визначає порядок дій у мультипоточних програмах.
        Якщо одна дія "happens-before" іншої, то перша дія буде повністю завершена перед початком другої дії з точки зору всіх потоків.
     */

        public static void main(String[] args) {

        /*
        Java Memory Model (JMM) визначає "правила гри" для мультипоточності в Java.
        Вона встановлює гарантії та поведінку, яких розробники можуть очікувати від мультипоточних програм.
        Але реалізація цих гарантій та правил залежить від розробника.

        Видимість: Щоб забезпечити видимість змін між потоками, розробники можуть використовувати volatile або блоки synchronized.
         Ці механізми гарантують, що зміни, зроблені одним потоком, будуть видимі іншим потокам.

        Атомарність: Хоча деякі базові операції (наприклад, читання та запис змінних) можуть бути атомарними за природою,
         складніші операції, такі як збільшення значення, не є атомарними.
         Тут на допомогу приходять атомарні класи з пакету java.util.concurrent.atomic, такі як AtomicInteger, які надають атомарні операції.

        Порядок: Щоб забезпечити конкретний порядок виконання операцій між потоками,
        розробники можуть використовувати механізми синхронізації, такі як synchronized, ReentrantLock тощо.

        Таким чином, JMM встановлює очікування та гарантії,
        а розробники використовують конкретні механізми та інструменти, щоб забезпечити ці гарантії в реальних програмах.
         */

        }
    }

