public class Main {
    public static void main (String[]args){
        int seg=40;
        int min=59;
        int hour1=16;

        System.out.println("Berlin Clok: ");
        System.out.print(BerlinClock.seconds2(seg));//O
        System.out.print(BerlinClock.hours5(hour1));//RRRR
        System.out.print(BerlinClock.hours1(hour1));//RRRO
        System.out.print(BerlinClock.minutes(min));//YYRYYRYYRYY
        System.out.print(BerlinClock.seconds(seg));//YYYY
        System.out.println();

        System.out.println("Digital Clok: ");
        System.out.print(BerlinClock.hourConver(BerlinClock.hours5(hour1))*5 + BerlinClock.hourConver(BerlinClock.hours1(hour1)));
        System.out.print(":");
        System.out.print((12*(min/12))+ BerlinClock.minuteConver(BerlinClock.minutes(min)));
        System.out.print(":");
        System.out.print(BerlinClock.secondConver(BerlinClock.seconds(seg)) + (((seg-(BerlinClock.secondConver(BerlinClock.seconds(seg))))/5)*5));


    }
}