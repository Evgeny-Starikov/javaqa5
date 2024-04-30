public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 98;
        int IML = service.calculate(weight);

        System.out.println("Индекс массы тела = " + IML);
        /* if (IML <= 16) {
            System.out.println("Индекс массы тела очень низкий! Возможен дефицит массы");
        }
        else if (16<IML<=18.5) {
            System.out.println("Индекс массы тела низкий. Недостаток массы тела.");
        }
        else if (18.5<IML<=25) {
            System.out.println("Индекс массы тела в норме! Так держать!");
        }
        else if (25<IML<=30) {
            System.out.println("Индекс массы тела очень высокий! Возможно 'предожирение'");
        }
        else if (30<IML<=35) {
            System.out.println("Индекс массы тела очень высокий! Возможно ожирение 1 степеени");
        }
        else if (35<IML<=40) {
            System.out.println("Индекс массы тела очень высокий! Возможно ожирение 2 степени");
        }
        else if (IML>40) {
            System.out.println("Индекс массы тела очень высокий! Возможно ожирение 3 степени");
        } */
        // Хотел добавить градации ИМЛ и предупреждающие сообщения, но не знаю синтаксиса.
        // Как это правильно записать???

    }
}