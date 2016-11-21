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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author rene
 */
public class RobotBot {

    /**
     * @param args the command line arguments
     */
    //red 51 green 255 blue 51
    int win[] = {51, 255, 51};
    int perder[] = {255, 102, 102};

    public static WebDriver driver = null;
    public static String usuario = "usuario";
    public static String contra = "asd";
    public static String url_login = "https://freebitco.in";
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

    static void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void moverMultiBet() {
        robot.mouseMove(613, 87);
        leftClick();
    }

    public void bajarBarra() {
        robot.mouseMove(1359, 718);
        leftClick();
        leftClick();
    }

    public void autoBet() {
        robot.mouseMove(743, 218);
        leftClick();
    }

    public void maximoBet() {
        robot.mouseMove(450, 418);
        leftClick();
        leftClick();
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_2);
    }

    public void betOdds() {
        robot.mouseMove(345, 511);
        leftClick();
        leftClick();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_9);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_5);
    }

    public void lo() {
        robot.mouseMove(345, 586);
        robot.delay(200);
        leftClick();
        leftClick();

        robot.delay(200);

    }

    public void noRoll() {

        robot.mouseMove(475, 513);
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

        robot.mouseMove(905, 370);
        leftClick();
        robot.delay(200);
        robot.mouseMove(855, 450);
        leftClick();
        robot.mouseMove(1003, 450);
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
        robot.mouseMove(676, 446);
        leftClick();
    }

    public void manualBet() {
        robot.mouseMove(623, 295);
        leftClick();
    }

    public void payoutManualBet() {
        robot.mouseMove(338, 537);
        robot.delay(200);
        leftClick();
        leftClick();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyRelease(KeyEvent.VK_PERIOD);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_6);
        robot.keyRelease(KeyEvent.VK_6);
        leftClick();
    }

    public void autoStopBet() {
        robot.mouseMove(853, 609);
        leftClick();

    }

    public void manualbetHit() {
        robot.mouseMove(607, 343);
        leftClick();
    }

    public void manualAmount() {
        robot.mouseMove(435, 390);
        leftClick();
        leftClick();
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_5);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_0);

    }

    public void manualAmount2() {
        robot.mouseMove(435, 390);
        leftClick();
        leftClick();
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(400);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_0);

    }

    public boolean gano() {
        int count = 1;
        while (count <= 3) {
            Color color = robot.getPixelColor(596, 425);
//            System.out.println(color);
//              System.out.println(win[0]+" "+win[1]+" "+win[2]+" "+color.getRed() +" "+color.getGreen()+" "+color.getBlue());
            if (color.getRed() == win[0] && color.getGreen() == win[1] && color.getBlue() == win[2]) {
                count += 1;
            } else {
                count = 1;
//                System.out.println("No ganaste");
            }
            robot.delay(2000);
        }
        System.out.println("sali");
        return true;
    }

    public boolean ganoManualBet() {
        int count = 1;
        boolean gano=false;
        for (int i = 0; i < 3; i++) {
            
     
            Color color = robot.getPixelColor(665, 378);
//            System.out.println(color);
//              System.out.println(win[0]+" "+win[1]+" "+win[2]+" "+color.getRed() +" "+color.getGreen()+" "+color.getBlue());
            if (color.getRed() == win[0] && color.getGreen() == win[1] && color.getBlue() == win[2]) {
                count += 1;
                gano=true;
            } else {
                count = 1;
                gano=false;
//                System.out.println("No ganaste");
            }
            robot.delay(2000);
        }
        System.out.println("sali");
        return gano;
    }

    public static void main(String[] args) throws AWTException {
        robot = new Robot();

        RobotBot Robot = new RobotBot();
        Robot.moverMultiBet();
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
        while (true) {

            if (Robot.gano()) {
                Robot.manualBet();
                Robot.payoutManualBet();
                Robot.manualAmount();
                Robot.manualbetHit();
                if (Robot.ganoManualBet()) {
                    Robot.autoBet();
                    Robot.autobetStart();
                } else {
                    Robot.manualAmount2();
                    Robot.manualbetHit();
                }
            }
        }

    }

}
