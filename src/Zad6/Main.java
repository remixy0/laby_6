package Zad6;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Renderable [] scene = new Renderable[10];
        scene[0] = new RectangleShape();
        scene[1] = new TextLabel();
        scene[2] = new ImageTexture();
        scene[3] = new RectangleShape();
        scene[4] = new Sprite();
        scene[5] = new RectangleShape();
        scene[6] = new Sprite();
        scene[7] = new ImageTexture();
        scene[8] = new Sprite();
        scene[9] = new RectangleShape();

        for(Renderable r : scene){
            r.render();
        }
    }
}
