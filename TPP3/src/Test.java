public class Test{
    public static void main(String[] args) {
        Adress adr1=new Adress();
        adr1.gouvernorat="Kasserine";
        adr1.ville="mghila";
        adr1.codepostale=1290;
        adr1.Afficher();
        adr1.codepostale=1240;
        adr1.Afficher();
        Adress adr2=new Adress("sidi bouzid","sabela",1550);
        adr2.ville="sousse";
        adr2.Afficher();
        Chercheur ch1=new Chercheur();
        ch1.nom="wael";
        ch1.poste="postdev";
        ch1.numero=1;
        ch1.Afficher();
        Chercheur ch2=new Chercheur("bourak","postres",2);
        ch2.Afficher();
        System.out.println("le nombre de chercheurs est"+Chercheur.nombre);
        ch1.numero=3;
        Chercheur ch3=new Chercheur();
        ch3.nom="ilyes";
        ch3.poste="hkjgf";
        ch3.numero=4;
        Bureau bureau=new Bureau();
        bureau.nom="service";
        bureau.code=7458;
        bureau.chercheur[0]=ch1;
        bureau.chercheur[1]=ch2;
        bureau.chercheur[2]=ch3;
        Bureau bureau2=new Bureau();
        bureau2.nom="devoirs";
        bureau2.code=2546;
        bureau2.chercheur[0]=ch1;
        bureau2.chercheur[1]=ch2;
        bureau2.chercheur[2]=ch3;
        Laboratoire Lab1=new Laboratoire();
        Lab1.Afficher();
        Laboratoire laboratoire=new Laboratoire();
        laboratoire.nom="technique";
        laboratoire.adress=adr1;
        laboratoire.bureaux[0]=bureau;
        laboratoire.bureaux[1]=bureau2;
        laboratoire.specialite="developpement";
        laboratoire.Afficher();
        for (int i = 0; i < 2; i++) {
            laboratoire.bureaux[i].Afficher();
            for (int j = 0; j < 3; j++) {
                laboratoire.bureaux[i].chercheur[j].Afficher();

            }

        }






    }





}

