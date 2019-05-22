package lesson7;

public class CalcDrobei {
    public Drobi sum(Drobi dr1, Drobi dr2) {
        int commonZnam = dr1.getZnamenatel() * dr2.getZnamenatel(); //приведение к общему знаменателю
        int resChis = (dr1.getChislitel() * dr2.getZnamenatel())
                + (dr2.getChislitel() * dr1.getZnamenatel());

        Drobi res = new Drobi();
        res.setChislitel(resChis);
        res.setZnamenatel(commonZnam);

        return res;

    }

}
