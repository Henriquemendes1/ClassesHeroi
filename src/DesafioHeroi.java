public class DesafioHeroi {
        public static void main(String[] args) {
            class Hero {
                private String name;
                private int age;
                private String type;

                //Construtor
                public Hero(String name, int age, String type) {
                    this.name = name;
                    this.age = age;
                    this.type = type;
                }

                //Metodo pra atacar
                public void attack() {
                    String attack = "";
                    switch (this.type) {
                        case "mage":
                            attack = "the magic";
                            break;
                        case "warrior":
                            attack = "the sword";
                            break;
                        case "monge":
                            attack = "the fists";
                            break;
                        case "ninja":
                            attack = "the shuriken";
                            break;
                        default:
                            attack = "strength";
                            break;
                    }
                    System.out.println("The " + this.type + " attacked using " + attack);
                }
            }

            Hero rick = new Hero("Rick", 21, "ninja");
            rick.attack();
        }
    }
