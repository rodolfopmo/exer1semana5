public class Exer1Semana5{
    public static void main(String [] oliveira){
        //fazer o fatorial, testar 20; 30; 40
//5*4*3*2*1
//120
        long fatorial = 1;
        for(int f = 20; f >= 1; f --){
            fatorial = f * fatorial;
        }
        System.out.println(fatorial);
    }
}