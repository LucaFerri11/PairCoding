    public class BerlinClock {

        public static String seconds(int sec){
            String [] secondsPosition = {"OOOO","YOOO", "YYOO","YYYO","YYYY"};
            return secondsPosition[sec%5];
        }
        public static String seconds2(int sec){
            return sec%2==0 ? "Y" : "O";
        }
        public static String minutes(int min){
            String [] minutesPosition = {
                    "OOOOOOOOOOO",
                    "YOOOOOOOOOO",
                    "YYOOOOOOOOO",
                    "YYROOOOOOOO",
                    "YYRYOOOOOOO",
                    "YYRYYOOOOOO",
                    "YYRYYROOOOO",
                    "YYRYYRYOOOO",
                    "YYRYYRYYOOO",
                    "YYRYYRYYROO",
                    "YYRYYRYYRYO",
                    "YYRYYRYYRYY"};
            return minutesPosition[min%12];
        }
        public static String hours1(int hour){
            String [] hoursPosition = {"OOOO","ROOO", "RROO","RRRO","RRRR"};
            return hoursPosition[hour%5];
        }
        public static String hours5(int hour){
            String [] hoursPosition = {"OOOO","ROOO", "RROO","RRRO","RRRR"};
            return hoursPosition[Integer.valueOf(hour/5)];
        }


        public static int hourConver(String time){
            int local=0;
            switch (time){
                case "OOOO": local=0;
                    break;
                case "ROOO": local=1;
                    break;
                case "RROO": local=2;
                    break;
                case "RRRO": local=3;
                    break;
                case "RRRR": local=4;
                    break;
            }
            return local;
        }
        public static int minuteConver(String time){
            int local=0;
            switch (time){
                case "OOOOOOOOOOO": local=0;
                    break;
                case "YOOOOOOOOOO": local=1;
                    break;
                case "YYOOOOOOOOO": local=2;
                    break;
                case "YYROOOOOOOO": local=3;
                    break;
                case "YYRYOOOOOOO": local=4;
                    break;
                case "YYRYYOOOOOO": local=5;
                    break;
                case "YYRYYROOOOO": local=6;
                    break;
                case "YYRYYRYOOOO": local=7;
                    break;
                case "YYRYYRYYOOO": local=8;
                    break;
                case "YYRYYRYYROO": local=9;
                    break;
                case "YYRYYRYYRYO": local=10;
                    break;
                case "YYRYYRYYRYY": local=11;
                    break;
            }
            return local;
        }
        public static int secondConver(String time){
            int local=0;
            switch (time){
                case "OOOO": local=0;
                    break;
                case "YOOO": local=1;
                    break;
                case "YYOO": local=2;
                    break;
                case "YYYO": local=3;
                    break;
                case "YYYY": local=4;
                    break;
            }
            return local;
        }
        public static int secondConver2(String time){
            int local=0;
            switch (time){
                case "Y": local=0;
                    break;
                case "O": local=1;
                    break;
            }
            return local;
        }
    }
