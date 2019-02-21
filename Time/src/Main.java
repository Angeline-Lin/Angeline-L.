public class Main {
    public static void main(String[] args) {

        Time tim = new Time(9,57,59);
        for(int i = 0;i<300;i++){
            tim.nextSecond();
            System.out.println(tim);
        }
    }
}
