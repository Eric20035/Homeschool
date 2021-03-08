import java.io.IOException;

public class Bevoelkerung {
    public static void main(String[] args) throws IOException {

        System.out.println("Bitte die aktuelle Populationsgröße in Milliarden eingeben");
        double popugroe= IO.readDouble();
        System.out.println("Bitte den jährlichen zuwachs in Prozent angeben");
        double zuwachs= IO.readDouble();
        System.out.println("Bitte die Laufzeit der Prognose in Jahren angeben");
        int jahr = IO.readInteger();
        System.out.println("Auf wie viele Stellen soll das Ergebnis genu angezeigt werden?");
        int stellen=IO.readInteger();
        System.out.println("jahr\t\t"+"Anzahl am Jahresanfang\t\t"+"Zuwachs\t\t"+"Anzahl am Jahresende");
        for (int i = 1; i<=jahr;i++) {
            double pro = popugroe / 100;
            double prozu = pro * zuwachs;
            double neupopugroe = popugroe + prozu;
            //ausgaben
            System.out.print(i);
            System.out.print(popugroe);
            System.out.print(prozu);
            System.out.println(neupopugroe);
            neupopugroe=popugroe;
        }




    }

}
