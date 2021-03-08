public class Trainer extends Person{






        private int erfahrung;



        public Trainer(String name,int alter, int erfahrung){
            super(alter, name);
            this.erfahrung=erfahrung;

            this.name=name;

            this.alter=alter;

            this.erfahrung=erfahrung;

        }



        public int getErfahrung(){

            return this.erfahrung;

        }







        public void setErfahrung(int erfahrung) {

            this.erfahrung = erfahrung;

        }



        //setter

        public void setName(){

            this.name=name;

        }

        @Override public String toString() { String text = "Name: " + name; text = text + "\n\t" + ", Alter: " + alter; text = text + "\n\t" + ", Erfahrung: " + erfahrung; return text; }

    }

