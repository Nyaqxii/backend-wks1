public class TennisGame2 {
        private int p1Point;
        private int p2Point;

        private final String player1Name;
        private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    public String getResult(int point){
        switch(point){  //ref.tennis1
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
        }
        return "Forty";
    }
        public String getScore(){
        String p1Res = "";
        String p2Res = "";
        String score = "";
        //p1
        if (p1Point == p2Point && p1Point < 4)
        {
            score = getResult(p1Point);
            score += "-All";
        }
        if (p1Point == p2Point && p1Point >=3)
            score = "Deuce";

        if (p1Point > 0 && p2Point ==0)
        {

            p1Res = getResult(p1Point);
            p2Res = "Love";
            score = p1Res + "-" + p2Res;
        }
        //p2
        if (p2Point > 0 && p1Point ==0)
        {
            if (p2Point ==1)
                p2Res = "Fifteen";
            if (p2Point ==2)
                p2Res = "Thirty";
            if (p2Point ==3)
                p2Res = "Forty";

            p1Res = "Love";
            score = p1Res + "-" + p2Res;
        }

        if (p1Point > p2Point && p1Point < 4)
        {
            if (p1Point ==2)
                p1Res="Thirty";
            if (p1Point ==3)
                p1Res="Forty";
            if (p2Point ==1)
                p2Res="Fifteen";
            if (p2Point ==2)
                p2Res="Thirty";
            score = p1Res + "-" + p2Res;
        }
        if (p2Point > p1Point && p2Point < 4)
        {
            if (p2Point ==2)
                p2Res="Thirty";
            if (p2Point ==3)
                p2Res="Forty";
            if (p1Point ==1)
                p1Res="Fifteen";
            if (p1Point ==2)
                p1Res="Thirty";
            score = p1Res + "-" + p2Res;
        }

        if (p1Point > p2Point && p2Point >= 3)
        {
            score = "Advantage player1";
        }

        if (p2Point > p1Point && p1Point >= 3)
        {
            score = "Advantage player2";
        }

        if (p1Point >=4 && p2Point >=0 && (p1Point - p2Point)>=2)
        {
            score = "Win for player1";
        }
        if (p2Point >=4 && p1Point >=0 && (p2Point - p1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

        public void p1Score(){
        p1Point++;
    }

        public void p2Score(){
        p2Point++;
    }

        public void wonPoint(String player) {
        if ("player1".equals(player)) //แนะนำให้แบบนี้ Null Safety เพราะว่า player1 จะไม่มีโอกาสเป็น null
            // (player.equals("player1")) // แบบนี้อาจะเกิด Null Pointer Exception เราเรฟไปยัง obj.ที่เป็น null
            p1Score();
        else
            p2Score();
    }
    }


