public class Main {
    public static void main(String[] args) {
       // Animal n = new Animal(); java: Animal is abstract; cannot be instantiated

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara a1 = new Arara();

        c.locomover();
        k.locomover();

        c.emitirSom();
        k.emitirSom();
    }
}
