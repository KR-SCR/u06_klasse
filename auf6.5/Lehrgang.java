public class Lehrgang
{
   public static void main(String[] args)
   {
      Teilnehmer teilnehmer1 = new Teilnehmer();
      Teilnehmer teilnehmer2 = new Teilnehmer();
      Teilnehmer teilnehmer3 = new Teilnehmer();
      Teilnehmer teilnehmer4 = new Teilnehmer();
      Teilnehmer teilnehmer5 = new Teilnehmer();
      
      teilnehmer1.name = "Hinz";
      teilnehmer1.vorname = "Patrick";
      teilnehmer1.alter = 44;
      teilnehmer1.fachrichtung = "FIAE";

      teilnehmer2.name = "Berchneider";
      teilnehmer2.vorname = "Marc";
      teilnehmer2.alter = 31;
      teilnehmer2.fachrichtung = "FIAE";

      teilnehmer3.name = "Salihovic";
      teilnehmer3.vorname = "Mirza";
      teilnehmer3.alter = 31;
      teilnehmer3.fachrichtung = "FISI";

      teilnehmer4.name = "Yildiz";
      teilnehmer4.vorname = "Sercan";
      teilnehmer4.alter = 25;
      teilnehmer4.fachrichtung = "FIAE";

      teilnehmer5.name = "Raden";
      teilnehmer5.vorname = "Kai";
      teilnehmer5.alter = 28;
      teilnehmer5.fachrichtung = "FIAE";

      System.out.println("Name: " + teilnehmer1.name + " Vorname: " + teilnehmer1.vorname + " Alter: " + teilnehmer1.alter + " Fachrichtung: " + teilnehmer1.fachrichtung);
      System.out.println("Name: " + teilnehmer2.name + " Vorname: " + teilnehmer2.vorname + " Alter: " + teilnehmer2.alter + " Fachrichtung: " + teilnehmer2.fachrichtung);
      System.out.println("Name: " + teilnehmer3.name + " Vorname: " + teilnehmer3.vorname + " Alter: " + teilnehmer3.alter + " Fachrichtung: " + teilnehmer3.fachrichtung);
      System.out.println("Name: " + teilnehmer4.name + " Vorname: " + teilnehmer4.vorname + " Alter: " + teilnehmer4.alter + " Fachrichtung: " + teilnehmer4.fachrichtung);
      System.out.println("Name: " + teilnehmer5.name + " Vorname: " + teilnehmer5.vorname + " Alter: " + teilnehmer5.alter + " Fachrichtung: " + teilnehmer5.fachrichtung);
   }
}
