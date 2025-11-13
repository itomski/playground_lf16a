package de.gfn.playground.basics;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.StringJoiner;

public class StringTest {

    public static void main(String[] args) {

        String s = "Das ist";
        s += " das Haus";
        s += " von";
        s += " Nikigraus";

        Fahrzeug f = new Fahrzeug("HH:AB123", "Fiat", "500", 2015, "Ok");
        System.out.println(f);

    }
}

class Fahrzeug {

    private String kennzeichen;
    private String marke;
    private String modell;
    private int baujahr;
    private String status;

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, String status) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.status = status;
    }

    //    @Override
//    public String toString() {
//        return "Fahrzeug{" +
//                "kennzeichen='" + kennzeichen + '\'' +
//                ", marke='" + marke + '\'' +
//                ", modell='" + modell + '\'' +
//                ", baujahr=" + baujahr +
//                ", status='" + status + '\'' +
//                '}';
//    }


//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Fahrzeug{");
//        sb.append("kennzeichen='").append(kennzeichen).append('\'');
//        sb.append(", marke='").append(marke).append('\'');
//        sb.append(", modell='").append(modell).append('\'');
//        sb.append(", baujahr=").append(baujahr);
//        sb.append(", status='").append(status).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

//    @Override
//    public String toString() {
//        return new StringJoiner(", ", Fahrzeug.class.getSimpleName() + "[", "]")
//                .add("kennzeichen='" + kennzeichen + "'")
//                .add("marke='" + marke + "'")
//                .add("modell='" + modell + "'")
//                .add("baujahr=" + baujahr)
//                .add("status='" + status + "'")
//                .toString();
//    }


    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("kennzeichen", kennzeichen)
//                .toString();

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}