package homeWork8;

public class Main {
    public static void main(String[] args) {
        Product actionCam = new Product();
        actionCam.setProductsName("Aceline");
        actionCam.setProductID(1144956);
        actionCam.setPrice(1499);
        actionCam.setAvailable(true);
        actionCam.setType("S-40");
        actionCam.setValuation(3.90);

        Characteristic color = new Characteristic();
        color.setKey("Цвет");
        color.setValue("Серебристый");

        Characteristic videoQuality = new Characteristic();
        videoQuality.setKey("Качество видео");
        videoQuality.setValue("Full HD");

        Characteristic viewingAngle = new Characteristic();
        viewingAngle.setKey("Угол обзора");
        viewingAngle.setValue("120°");

        Characteristic weight = new Characteristic();
        weight.setKey("Вес");
        weight.setValue("58 грамм");

        Characteristic batteryCap = new Characteristic();
        batteryCap.setKey("Емкость аккумулятора");
        batteryCap.setValue("900 мА*ч");

        actionCam.addCharacteristic(color);
        actionCam.addCharacteristic(videoQuality);
        actionCam.addCharacteristic(viewingAngle);
        actionCam.addCharacteristic(weight);
        actionCam.addCharacteristic(batteryCap);

        Opinion opinion1 = new Opinion();
        opinion1.setClientsName("Дмитрий ");
        opinion1.setAge(32);
        opinion1.setCity("Старый Оскол");
        opinion1.setDateComment("2 января 2018 г. 20:59");
        opinion1.setComments("Процавец-консультант сказал что отстаёт звук, но это не правда всё работает отлично!!! Рекомендую-дёшево");
        opinion1.setLike(24);
        opinion1.setDislike(0);
        opinion1.setPlus("Хроший звук, качество видео отличное за эту цену.");
        opinion1.setMinus("Пока не обнаружил. Крепежа для головы нету.");
        opinion1.setRaiting(5.0);

        actionCam.addOpinion(opinion1);
        actionCam.printInfo();





    }
}
