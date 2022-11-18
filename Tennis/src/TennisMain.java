public class TennisMain {

    public static String [] points = {"0", "15", "30", "40", "A"};
    public static int server = 0;
    public static int receiver = 4;
    public static void main(String[] args) {
        winPoint(false);
        System.out.println(points[server] + ":" + points[receiver]);
    }

    public static void winPoint(Boolean isServer){
        if(isServer) {
            if(server==4){
                System.out.println("Server wins!!!");
            }else if(server == 3 && receiver == 4){
                receiver--;
            }else{
                server++;
            }
        }else{
            if(receiver==4){
                System.out.println("Receiver wins!!!");
            }else if(receiver == 3 && server == 4){
                server--;
            }else{
                receiver++;
            }
        }
    }
}