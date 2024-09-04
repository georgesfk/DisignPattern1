package proxy;

public class ImageProxyPattern {
    public class ProxyPatternDemo {
        public static void main(String[] args) {

            Image image1 = new ProxyImage("photo1.jpg");
            Image image2 = new ProxyImage("photo2.jpg");


            System.out.println("1er affichage de photo1:");
            image1.display();  // loading et affichage de l'image1

            System.out.println("\n2nd affichage de photo1:");
            image1.display(); // seulement affichage de l'image1.jpg

            System.out.println("\naffichage de photo2:");
            image2.display();  // loading et affichage de l'image2
        }
    }
}
