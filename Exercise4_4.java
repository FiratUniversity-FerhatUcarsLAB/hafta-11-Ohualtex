public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        /* Bu satir derlenir ve calisir. Metod 42 degerini dondurur ama bu deger hicbir yerde kullanilmaz. */

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        
        /* Bu satir DERLENMEZ. void bir metod herhangi bir deger dondurmez,
        bu nedenle sayHello() + 7 gibi bir ifadenin icinde kullanilamaz. */

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
