
    public class Adress {

        public String gouvernorat;
        public String ville;
        public int codepostale;

        public Adress(String gouvernorat, String ville, int codepostale) {
            this.gouvernorat = gouvernorat;
            this.ville = ville;
            this.codepostale = codepostale;
        }

        public Adress() {
        }
        public void Afficher(){
            System.out.println("gouvernorat:"+gouvernorat+"ville"+ ville+"codepostale"+codepostale);
        }

    }

