package lesson8;

public class Main {
    public static void main(String[] args) {
        Tovar blender = new Tovar();
        blender.setNameTovar("Philips");
        blender.setId_tovara(654986);
        blender.setFixPrice(12200);
        blender.setDiscount(19);
        blender.setAvailable(true);

        Charachteristic volume = new Charachteristic();
        volume.setKey("Объем, л");
        volume.setValue("0.8");

        Charachteristic color = new Charachteristic();
        color.setKey("Цвет");
        color.setValue("белый");

        blender.addCharachteristic(volume);
        blender.addCharachteristic(color);

        Otziv otziv1 = new Otziv();
        otziv1.setClientsName("George");
        otziv1.setAge(32);
        otziv1.setComments("Рад и доволен");
        otziv1.setMinus("Купила их в подарок мужу, так как он фанат спартака. В итоге из спартаковского только ремешок и упаковка. Купон на циферблат не работает. Могли бы изначально закачать спартаковскую тему в сами часы ");
        otziv1.setPlus("Хорошие умные часы ");
        otziv1.setComments("Добрый день. Приобрел часы 23 марта 2019. В часах все устраивает, только ремень очень сильно загрязняется. Все функции работают отлично, в том числе и NFC (у меня huawei p20 lite). Недостаток только в ремешке. Может в дальнейшем использовании выявится ещё что-то. Пока только плюсы. Ничего не люфтит. ");
        otziv1.setLike(15);
        otziv1.setBuyedHere(true);
        otziv1.setRaiting(4.0);

        blender.addOtziv(otziv1);
        blender.printInfo();


    }
}
