public class Zadacka_ot_Kudra {
    public static void main (String [] args){
        int stol = 10;
        boolean bodriy = true;
        boolean sitost = true;
        if (bodriy == true && sitost == false)        {
            System.out.println("Роман был бодр и сыт, и потому перетащил " + stol + " столов");
        }else if (bodriy == false && sitost == true) {
            System.out.println("Роман был уставший и сытый, и потому перетащил " + stol + " столов");
        }else if (bodriy == true && sitost == true){
            stol+=6;
            System.out.println("Роман был бодрый и сытый, и потому перетащил " + stol + " столов");
        }else if (bodriy == false && sitost == false){
            stol-=6;
            System.out.println("Роман был уставший и голодный, и потому перетащил " +stol + " столов");
        }

        }

        }


