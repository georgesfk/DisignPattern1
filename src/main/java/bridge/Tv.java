package bridge;
public class Tv{

public class TV implements Appareil {
    private static final int MAX_CANAL = 10;
    private int canalActuel = 1;

    @Override
    public void allumer() {
        System.out.println("TV allumée.");
    }

    @Override
    public void eteindre() {
        System.out.println("TV éteinte.");
    }

    @Override
    public void changerCanal(int canal) {
        if (canal >= 1 && canal <= MAX_CANAL) {
            canalActuel = canal;
            System.out.println("Canal TV changé à " + canalActuel);
        } else {
            System.out.println("Canal invalide");
        }
    }

    public void canalSuivant() {
        canalActuel = (canalActuel % MAX_CANAL) + 1;
        System.out.println("Canal TV changé à " + canalActuel);
    }

    public void canalPrecedent() {
        canalActuel = (canalActuel + MAX_CANAL - 2) % MAX_CANAL + 1;
        System.out.println("Canal TV changé à " + canalActuel);
    }

    public void main(String[] args) {
        Appareil tv = new TV();
        Telecommande telecommandeTv = new Telecommande(tv);

        telecommandeTv.allumer();
        telecommandeTv.changerCanal(5);
        telecommandeTv.eteindre();
    }
}}