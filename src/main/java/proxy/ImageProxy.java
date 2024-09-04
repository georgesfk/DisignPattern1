package proxy;

//  ProxyImage qui controlera l'objet image réelle

class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Load the image only when it's actually needed
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}