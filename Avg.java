public class Avg {
    public static void main(String[] args){
        //Dotie skaitļi
        double sk1 = 8;
        double sk2 = 2;
        double sk3 = 3;

        //Rezultāta aprēķināšana
        double result = (sk1 + sk2 + sk3) / 3;

        //Rezultāta izvade 1 variants
        System.out.println(result);

        //Rezultāta aprēķināšana un izvade bez liekas rindiņas
        System.out.println((sk1 + sk2 + sk3) / 3);
    }
}