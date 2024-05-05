public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 133;
        double height = 1.80;
        int bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела = " + bmi);
        /* if (bmi <= 16) {
            System.out.println("Индекс массы тела очень низкий! Возможен дефицит массы");
        }
        else if (16<bmi<=18.5) {
            System.out.println("Индекс массы тела низкий. Недостаток массы тела.");
        }
        else if (18.5<bmi<=25) {
            System.out.println("Индекс массы тела в норме! Так держать!");
        }
        else if (25<bmi<=30) {
            System.out.println("Индекс массы тела очень высокий! Возможно 'предожирение'");
        }
        else if (30<bmi<=35) {
            System.out.println("Индекс массы тела очень высокий! Возможно ожирение 1 степеени");
        }
        else if (35<bmi<=40) {
            System.out.println("Индекс массы тела очень высокий! Возможно ожирение 2 степени");
        }
        else if (bmi>40) {
            System.out.println("Индекс массы тела очень высокий! Возможно ожирение 3 степени");
        } */
        // Хотел добавить градации ИМЛ и предупреждающие сообщения, но не знаю синтаксиса.
        // Как это правильно записать???

    }
}