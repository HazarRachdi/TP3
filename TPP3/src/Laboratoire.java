public class Laboratoire {
    public String nom;
    public String specialite;
    Bureau[] bureaux=new Bureau[50];
    Adress adress=new Adress();
    public void Afficher(){
        System.out.println("nom:"+nom+"specialite"+specialite);
    }

}
