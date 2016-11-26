/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rene
 */
public class RobotBot {

    /**
     * @param args the command line arguments
     */
    //red 51 green 255 blue 51
    public static int win[] = {51, 255, 51};
    public static int perder[] = {255, 102, 102};

    public static Robot robot;

    public void Color() {
        try {
            Robot robot = new Robot();
            for (int j = 405; j < 426; j++) {
                for (int i = 688; i < 759; i++) {

                    Color color = robot.getPixelColor(i, j);
                    if (color.getRed() + color.getGreen() + color.getBlue() > 500) {
                        System.out.print("X");
                    } else {
                        System.out.print("0");
                    }

                }
                System.out.println("");

            }
//            Color color = robot.getPixelColor(624, 251);
//            System.out.println(color);
//             System.out.println("Red   = " + color.getRed());
//    System.out.println("Green = " + color.getGreen());
//    System.out.println("Blue  = " + color.getBlue());
        } catch (Exception e) {
        }

    }

    public synchronized void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void moverMultiBet() {
        robot.mouseMove(315, 86);
        leftClick();
    }

    public synchronized void bajarBarra() {
//        System.out.println("estoy andetro del metodo bajarbarra");
        robot.delay(600);
        robot.mouseMove(1012, 717);

        leftClick();
        robot.delay(600);
        leftClick();
        robot.delay(600);
    }

    public void autoBet() {
        robot.mouseMove(1017, 91);
        leftClick();
        robot.delay(1100);
        bajarBarra();
        robot.delay(1100);

        robot.mouseMove(570, 222);
        leftClick();
        robot.delay(1100);
    }

    public void maximoBet() {
        robot.mouseMove(429, 418);
        leftClick();
        leftClick();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_2);
    }

    public void betOdds() {
        robot.mouseMove(313, 505);
        leftClick();
        leftClick();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_9);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_5);
    }

    public void lo() {
        robot.mouseMove(318, 585);
        robot.delay(200);
        leftClick();
        leftClick();

        robot.delay(200);

    }

    public void noRoll() {

        robot.mouseMove(438, 509);
        leftClick();
        leftClick();
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);

    }

    public void losebet() {

        robot.mouseMove(538, 451);
        leftClick();
        robot.delay(200);
//        robot.mouseMove(855, 450);
//        leftClick();
        robot.mouseMove(702, 453);
        leftClick();
        leftClick();
        leftClick();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);

    }

    public void autobetStart() {
        bajarBarra();
        bajarBarra();
        bajarBarra();

        robot.mouseMove(507, 650);
        robot.delay(400);
        leftClick();
        robot.delay(700);

        robot.mouseMove(500, 533);
        robot.delay(700);
    }

    public void manualBet() {
        robot.mouseMove(1015, 86);

        leftClick();
        robot.delay(200);
        bajarBarra();
        robot.delay(200);
        robot.mouseMove(439, 289);
        leftClick();
    }

    public void payoutManualBet() {
        robot.mouseMove(338, 537);
        robot.delay(200);
        leftClick();
        leftClick();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_1);
         robot.delay(200);
        robot.keyRelease(KeyEvent.VK_1);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_PERIOD);
         robot.delay(200);
        robot.keyRelease(KeyEvent.VK_PERIOD);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);
         robot.delay(200);
        robot.keyRelease(KeyEvent.VK_0);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_6);
         robot.delay(200);
        robot.keyRelease(KeyEvent.VK_6);
        leftClick();
    }

    public void autoStopBet() {
        robot.mouseMove(535, 611);
        leftClick();

    }

    public void manualbetHit() {
        bajarBarra();
        robot.mouseMove(450, 630);
        leftClick();
    }

    public void manualbetHit2() {

        robot.mouseMove(449, 638);
        leftClick();
    }

    public void manualAmount() {
        robot.mouseMove(412, 389);
        leftClick();
        leftClick();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
apuesta1+=1;
        System.out.println("apuesta de 1 000 cantidad "+apuesta1);
    }

    public void manualAmount2() {
        robot.mouseMove(413, 315);
        leftClick();
        leftClick();
        leftClick();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_2);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
 apuesta2+=1;
        System.out.println("apuesta de 20 000 cantidad "+apuesta2);
    }
int apuesta3=0;
int apuesta2=0;
int apuesta1=0;
    public void manualAmount3() {
        robot.mouseMove(413, 315);
        leftClick();
        leftClick();
        leftClick();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_3);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_9);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        apuesta3+=1;
        System.out.println("apuesta de 390 000 cantidad "+apuesta3);
    }

    public void manualAmount4() {
        robot.mouseMove(413, 315);
        leftClick();
        leftClick();
        leftClick();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_7);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_5);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_0);

    }

    public boolean gano() {
        boolean gano = false ;
        int count = 1;
        while (count <= 9) {
            Color color = robot.getPixelColor(522, 637);
//            System.out.println(color);
          gano=true;
//              System.out.println(win[0]+" "+win[1]+" "+win[2]+" "+color.getRed() +" "+color.getGreen()+" "+color.getBlue());
            if (color.getRed() == win[0] && color.getGreen() == win[1] && color.getBlue() == win[2]) {
                count += 1;
            }else if(timeInt>=600){
                gano=false;
            count=10;
            } else {
                gano=false;
                count = 1;
//                System.out.println("No ganaste");
            }
            robot.delay(1000);
        }
//        System.out.println("sali");
        return gano;
    }

    public static boolean ganoManualBet() {
        int count = 1;
        boolean gano = false;
        for (int i = 0; i < 3; i++) {

            Color color = robot.getPixelColor(512, 661);
//            System.out.println(color);
//              System.out.println(win[0]+" "+win[1]+" "+win[2]+" "+color.getRed() +" "+color.getGreen()+" "+color.getBlue());
            if (color.getRed() == win[0] && color.getGreen() == win[1] && color.getBlue() == win[2]) {
                count += 1;
                gano = true;
            } else {
                count = 1;
                gano = false;
//                System.out.println("No ganaste");
            }
            robot.delay(1000);
        }
//        System.out.println("sali");
        return gano;
    }

    public static boolean ganoManualBet2() {
        int count = 1;
        boolean gano = false;
        for (int i = 0; i < 3; i++) {
            Color color2 = robot.getPixelColor(681, 554);
            Color color = robot.getPixelColor(512, 660);
//            System.out.println(color);
//              System.out.println(win[0]+" "+win[1]+" "+win[2]+" "+color.getRed() +" "+color.getGreen()+" "+color.getBlue());
            if (color.getRed() == perder[0] && color.getGreen() == perder[1] && color.getBlue() == perder[2]) {
                count += 1;
                gano = true;
            } else if (color2.getRed() == perder[0] && color2.getGreen() == perder[1] && color2.getBlue() == perder[2]) {
                count += 1;
                gano = true;

            } else {
                count = 1;
                gano = false;
//                System.out.println("No ganaste");
            }
            robot.delay(1000);
        }
//        System.out.println("sali");
        return gano;
    }

    public void reset() {
//        System.out.println("estoy en el reset metodo");
        moverMultiBet();

        bajarBarra();
        autoBet();
        maximoBet();
        betOdds();
        lo();
        noRoll();
        losebet();
        autoStopBet();

        autobetStart();

    }

    public static boolean paso = false;
    public static boolean paso2 = false;
    static RobotBot Robot;

    public static void main(String[] args) throws AWTException {
        robot = new Robot();

        tiempo timeclass = new tiempo();
        Thread time = new Thread(timeclass);
        time.start();
        Robot = new RobotBot();
        Robot.moverMultiBet();

        Robot.bajarBarra();
        Robot.autoBet();
        Robot.maximoBet();
        Robot.betOdds();
        Robot.lo();
        Robot.noRoll();
        Robot.losebet();
        Robot.autoStopBet();

        Robot.autobetStart();
//        while (true) {
        paso=true;
//        System.out.println(" " + paso);
       
        while (true) {            
            if (paso == true &&paso2==false) {
                        paso=false;
//                        System.out.println("entrando en el cuerpo ");
                        Robot.cuerpo();
                    }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RobotBot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        }
    }

    public void cuerpo() {

        if (Robot.gano()) {
            paso = false;
            System.out.println(" " + paso);
            Robot.manualBet();
            robot.delay(400);
            Robot.payoutManualBet();
            robot.delay(400);
            Robot.manualAmount();
            robot.delay(400);
            Robot.manualbetHit();
            robot.delay(400);
            if (Robot.ganoManualBet()) {
                robot.delay(1000);
                Robot.autoBet();
                robot.delay(2000);

                Robot.autobetStart();
                robot.delay(1000);
            } else if (Robot.ganoManualBet2()) {
                Robot.manualAmount2();
                robot.delay(400);
                Robot.manualbetHit2();
                robot.delay(400);
                if (Robot.ganoManualBet2()) {
//                    Robot.manualAmount3();
//                    robot.delay(400);
//                    Robot.manualbetHit2();
//                    robot.delay(400);
 Robot.autoBet();
                    robot.delay(1000);
                    Robot.autobetStart();
                    robot.delay(400);

////                    if (Robot.ganoManualBet2()) {
////                        Robot.manualAmount4();
////                        robot.delay(400);
////                        Robot.manualbetHit2();
////                    } else {
////                        Robot.autoBet();
////                        robot.delay(1000);
////                        Robot.autobetStart();
////                    }
                } else {
//                    Robot.autoBet();
//                    robot.delay(1000);
//                    Robot.autobetStart();
//                    robot.delay(400);
                }
            } else {
                robot.delay(400);
                Robot.autoBet();
                robot.delay(1000);
                Robot.autobetStart();
                robot.delay(400);
            }
//                if (timeInt >= 10) {
//                    Robot.recargarPagina();
//                    robot.delay(1400);
//                    Robot.reset();
//                    timeInt=1;
//
//                }
        }
        paso = true;

    }

    public void recargarPagina() {
//        System.out.println("recargando pagina adentro del metodo");
        robot.mouseMove(304, 48);
        robot.delay(400);
        leftClick();
        leftClick();
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public static int timeInt;
static int total;
    public static class tiempo implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    timeInt = timeInt + 1;
                    total =total+timeInt;
                    if (timeInt >=300 && paso == true) {
                        System.out.println("total " + total/60);
                        paso2 = true;
                        System.out.println("recargando pagina");
                        Robot.recargarPagina();
                        robot.delay(2800);
                        Robot.reset();
                        paso2 = false;
                        timeInt = 1;

                    } 
                         System.out.println("minuto " + timeInt/60);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(RobotBot.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }
}
