public class Chercheur {
    public String nom;
    public String poste;
    public int numero;
    public static int nombre;

    public Chercheur(String nom, String poste, int numero) {
        this.nom = nom;
        this.poste = poste;
        this.numero = numero;
        nombre++;
    }

    public Chercheur() {
        nombre++;
    }
    public void Afficher(){
        System.out.println("nom:"+nom+" poste"+poste+"numero"+numero);
    }
    public Boolean comparer(Chercheur ch){

        return nom==ch.nom&&poste==ch.poste&&numero==ch.numero;





    }
}
