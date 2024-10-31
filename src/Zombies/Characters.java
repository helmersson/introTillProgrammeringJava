package Zombies;

//  En superclass för alla characters
abstract class Characters {
    protected String name;
    protected int hp;
    protected int posX;
    protected int posY;


    public Characters(String name, int hp, int startX, int startY); {
        this.name = name;
        this.hp = hp;
        this.posX = startX;
        this.posY = startY;
    }

    //  Funktion för hur charters rör sig
    public abstract void move();

    //  Funktion för att attack
    public void attack(Charater target) {
        if (this.Alive()) {
            target.takeDamage(10);
            System.out.println(this.name + "attacks" + target.name + "!");
        }
    }

    //  Funktion för att ta skada
    public void takeDamage(int amount) {
        this.hp -= amount;
        if (this.hp <= 0 ) {
            this.hp = 0;
            System.out.println(this.name + "Has died!");
        }
    }

    //  Kontrollerar om något lever
    public boolean isAlive() {
        return this.hp > 0;
    }

    // Subklass för spelarkaraktärer
    class PlayerCharater extends Characters {

        public PlayerCharater(String name, int hp, int startX, int startY) {
            super(name, hp,startX, startY );
        }

        //  PlayerCharater movement
        public void move(String Directions) {
            switch (directions.toLowerCase) {
                case "up" : posY--; break;
                case "down" : posY++; break;
                case "left" : posX--; break;
                case "right" : posX++; break;
                default: System.out.println("Invalid Movement!");
            }
            System.out.println(name + "moved to" + posX + ","+ posY);
        }
        //  Spelare attackerar zombie
        public void attack(Zombie zombie) {
            super.attack(zombie);
        }
    }

    // Subklass för zombies
    class Zombie extends Characters {
        public Zombie(String name, int hp, int, startX, int StartY)   {
            super(name, hp, startX, startY);
        }

        //  Zombie movement
        public void move() {
            posX += (Math.random() < 0.5) ? -1 : 1
            posY += (Math.random() < 0.5) ? -1 : 1
        }

        // Zombie attackerar spelare
        public void attack(PlayerCharater player) {
            super.attack(player);
        }
    }

}