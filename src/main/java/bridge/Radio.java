package bridge;

public class Radio implements Appareil {
    private static final int MAX_CANAL = 10;
    private int canal;

    public Radio() {
        this.canal = 1; // default channel number
    }

    @Override
    public void allumer() {
        System.out.println("Radio allumée");
    }

    @Override
    public void eteindre() {
        System.out.println("Radio éteinte");
    }

    @Override
    public void changerCanal(int canal) {
        if (canal >= 1 && canal <= MAX_CANAL) {
            this.canal = canal;
            System.out.println("Canal changé à " + canal);
        } else {
            System.out.println("Canal invalide");
        }
    }

    public void canalSuivant() {
        canal = (canal % MAX_CANAL) + 1;
        System.out.println("Canal changé à " + canal);
    }

    public void canalPrecedent() {
        canal = (canal + MAX_CANAL - 2) % MAX_CANAL + 1;
        System.out.println("Canal changé à " + canal);
    }
}