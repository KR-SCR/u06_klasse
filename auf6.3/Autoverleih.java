// loe06_klasse
// auf6.1

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto auto1 = new Auto();
      Auto auto2 = new Auto();
      Auto auto3 = new Auto();

      auto1.autonummer = "HH-KR";
      auto2.autonummer = "HH-PH";
      auto3.autonummer = "HH-MS";
      
      auto1.tagespreis = 50;
      auto2.tagespreis = 75;
      auto3.tagespreis = 100;

      auto1.farbe = Farbe.schwarz;
      auto2.farbe = Farbe.rot;
      auto3.farbe = Farbe.blau;

      Kunde kunde1 = new Kunde();
      Kunde kunde2 = new Kunde();

      kunde1.name = "Schindler";
      kunde1.stammkunde = false;

      kunde2.name = "Raden";
      kunde2.stammkunde = true;

      Darsteller.zeige(auto1, auto2, auto3, kunde1, kunde2);
   }
}