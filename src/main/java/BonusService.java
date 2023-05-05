public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100; //использование тут long тоже конечно сомнительно. Не стал справлять
        int limit = 500; //смысл для числа 500 объявлять переменную типа long ?
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}