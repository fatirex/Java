public class App {
    public static void main(String[] args) throws Exception {
        String nombre = "Fatima";
        System.out.println("Hola " + nombre);
        int a=5;
        int b=4;
        int c= a + b;
        System.out.println("la suma de a+b = "+ c); 
        Ejercicio1 obj = new Ejercicio1();
        String resp = obj.saludar ("hola", nombre);
        System.out.println(resp);
        System.out.println(Ejercicio1.saludar2("hola", nombre));
        System.out.println("La suma es = "+Ejercicio1.suma(5, 4));
        
    }

   
}
