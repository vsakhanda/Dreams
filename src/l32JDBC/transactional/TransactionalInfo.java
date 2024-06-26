package l32JDBC.transactional;

public class TransactionalInfo {

    /*
    Транзакції - це важливий аспект роботи з базами даних, який дозволяє забезпечити цілісність даних під час виконання декількох пов'язаних операцій.

    Що таке транзакції?
    Транзакція - це послідовність однієї або декількох операцій з базою даних,
     яка вважається однією логічною одиницею роботи. Ці операції або повністю виконуються (commit),
     або повністю скасовуються (rollback). Основні властивості транзакцій відомі як ACID:

    Atomicity: Гарантує, що всі операції в межах транзакції виконуються успішно; якщо ж одна з них скасовується,
     всі інші також скасовуються.
    Consistency: Гарантує, що база даних завжди буде в консистентному стані після завершення транзакції.
    Isolation: Гарантує, що всі операції в межах певної транзакції ізольовані від інших транзакцій.
    Durability: Гарантує, що після завершення транзакції результати її виконання будуть незмінними.
    Управління транзакціями в JDBC
    В JDBC транзакції керуються за допомогою методів commit(), rollback() та setAutoCommit() об'єкта Connection.

    commit(): Застосовує зміни, внесені під час транзакції.
    rollback(): Скасовує всі зміни, внесені під час транзакції.
    setAutoCommit(): Якщо встановлено значення true, кожна операція з базою даних вважається окремою транзакцією.
    Якщо false, дозволяє групувати декілька операцій в одну транзакцію.


    Навіщо створювати транзакції руками?
    Контроль: Ручне керування транзакціями дає вам повний контроль над тим, коли транзакція починається,
    коли вона завершується, і коли зміни застосовуються або скасовуються.
    Цілісність даних: У випадках, коли потрібно виконати декілька пов'язаних операцій, транзакції забезпечують,
     що або всі операції виконуються успішно, або жодна з них.
    Відновлення від помилок: Якщо під час транзакції виникає помилка, ви можете легко скасувати всі зміни
    за допомогою rollback().
    Наприклад, якщо ви хочете переказати гроші між двома банківськими рахунками,
     вам потрібно виконати дві операції: відняти гроші з одного рахунку і додати їх до іншого.
     Якщо одна з операцій зазнає невдачі (наприклад, через збій у системі),
     транзакція дозволить вам скасувати обидві операції, забезпечуючи цілісність даних.
     */

    /*
    Коли setAutoCommit() встановлено в true на рівні JDBC:

    Так, транзакція все одно відкривається на рівні бази даних для кожної окремої операції,
    яка змінює дані (наприклад, INSERT, UPDATE або DELETE).
    Однак ця транзакція автоматично завершується (commit) після виконання кожної такої операції.
    Тобто, для кожного виклику executeUpdate(), транзакція відкривається і автоматично закривається.
    Ви не маєте можливості групувати декілька операцій в одній транзакції на рівні Java/JDBC,
    коли setAutoCommit() встановлено в true.

    Коли setAutoCommit() встановлено в false:

    Транзакція на рівні бази даних відкривається, коли ви починаєте виконувати операції, які змінюють дані,
    і вона залишається відкритою, поки ви явно не викличете commit() або rollback().
    Ви маєте можливість групувати декілька операцій в одній транзакції на рівні Java/JDBC.
    Отже, на рівні бази даних транзакція завжди відкривається,
     незалежно від значення setAutoCommit().
      Проте поведінка цієї транзакції (автоматичне завершення або очікування явного commit()/rollback())
      залежить від значення setAutoCommit().


   Рівень ізоляції транзакції визначає, як транзакції взаємодіють одна з одною. Він контролює видимість незавершених змін однієї транзакції для інших транзакцій.

    В JDBC ви можете встановити рівень ізоляції для транзакції за
    допомогою методу setTransactionIsolation(int level) об'єкта Connection.
    допомогою методу setTransactionIsolation(int level) об'єкта Connection.

    Ось основні рівні ізоляції, які підтримуються в JDBC:

    Connection.TRANSACTION_READ_UNCOMMITTED: Найнижчий рівень ізоляції. Дозволяє читання незавершених змін інших транзакцій,
     що може призвести до "брудного" читання.
    Connection.TRANSACTION_READ_COMMITTED: Забороняє "брудне" читання, але дозволяє "непостійне" читання.
    Connection.TRANSACTION_REPEATABLE_READ: Забороняє "брудне" та "непостійне" читання,
    але може допустити "фантомне" читання.
    Connection.TRANSACTION_SERIALIZABLE: Найвищий рівень ізоляції. Забороняє всі види аномалій читання.

    Брудне читання (Dirty Read):

    Відбувається, коли одна транзакція читає незафіксовані зміни іншої транзакції.
    Наприклад, транзакція A змінила рядок, але ще не викликала commit або rollback.
    Транзакція B може прочитати цей незафіксований рядок. Якщо пізніше транзакція A вирішить викликати rollback,
    транзакція B вже прочитала недійсні дані.

    Непостійне читання (Non-repeatable Read):

    Відбувається, коли дані, прочитані транзакцією A на початку, змінюються іншою транзакцією B і зафіксовані
    перед тим, як транзакція A завершиться.
    Наприклад, транзакція A читає рядок. Транзакція B змінює цей рядок і викликає commit.
    Коли транзакція A знову прочитає цей рядок, вона побачить різні дані.

    Фантомне читання (Phantom Read):

    Відбувається, коли нові рядки вставляються або існуючі рядки видаляються іншою транзакцією,
    так що вони стають видимими для поточної транзакції.
    Наприклад, транзакція A виконує запит, який вибирає рядки, що відповідають певному критерію.
     Транзакція B вставляє новий рядок, який відповідає цьому критерію і викликає commit.
     Коли транзакція A повторно виконує свій запит, вона побачить "фантомний" рядок,
     якого не було при першому виконанні запиту.
    Ці аномалії читання можуть призводити до непередбачуваної поведінки в програмах.
    Тому важливо розуміти рівні ізоляції та вибирати відповідний рівень для конкретних завдань.


    В MySQL, дефолтний рівень ізоляції для InnoDB (який є дефолтним типом сховища) є REPEATABLE READ.

    Цей рівень ізоляції забезпечує досить високий рівень захисту від більшості аномалій читання,
    але він все ще може допустити так зване "фантомне" читання в деяких ситуаціях.

    Важливо зазначити, що поведінка REPEATABLE READ в MySQL може відрізнятися від інших систем управління
    базами даних. Наприклад, в MySQL, під рівнем ізоляції REPEATABLE READ, "фантомні" рядки (рядки, які були вставлені або змінені
    іншою транзакцією після початку поточної транзакції) не будуть видимі в нових вибірках в рамках поточної транзакції,
    завдяки використанню версіонування рядків.
     */
}