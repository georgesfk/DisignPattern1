package bridge;

public class Telecommande {

        protected Appareil appareil;

        public Telecommande(Appareil appareil) {
            this.appareil = appareil;
        }

        public void allumer() {
            appareil.allumer();
        }

        public void eteindre() {
            appareil.eteindre();
        }

        public void changerCanal(int canal) {
            appareil.changerCanal(canal);
        }
    }

