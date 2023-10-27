public class Bureau {
    public String nom;
    public int code;
    Chercheur[] chercheur = new Chercheur[5];

    public void Afficher() {
        System.out.println("nom:" + nom + "code" + code);
    }
}
