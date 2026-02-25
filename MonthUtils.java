//Создать класс MonthUtils который бы хранил подготовленные
// месяцы или их массивы для использования (объекты класса Month).

public class MonthUtils {
    public static Month JAN = new Month("Январь", 31, 20);
    public static Month FEB = new Month("Февраль", 28, 19);
    public static Month MAR = new Month("Март", 31, 22);
    public static Month APR = new Month("Апрель", 30, 21);
    public static Month MAY = new Month("Май", 31, 20);
    public static Month JUN = new Month("Июнь", 30, 21);
    public static Month JUL = new Month("Июль", 31, 22);
    public static Month AUG = new Month("Август", 31, 22);
    public static Month SEPT = new Month("Сентябрь", 30, 21);
    public static Month OCT = new Month("Октябрь", 31, 22);
    public static Month NOV = new Month("Ноябрь", 30, 20);
    public static Month DEC = new Month("Декабрь", 31, 21);
    public static Month[] allMonth ={JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEPT,OCT,NOV,DEC};
}