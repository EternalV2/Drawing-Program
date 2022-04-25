import java.awt.Font;
import java.awt.Color;

public class DrawingProgram{

    Picture undo;
    Color[][] cArray;

    public static void drawbutton(double a, double b, String function, double size, Color A){

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);
        StdDraw.square(a, b, b);
        StdDraw.text(a, b, function);
        StdDraw.setPenRadius(size);
        StdDraw.setPenColor(A);

    }

    public static void clear (double size, Font fonta, Color A){

        double a = .5;
        double b = .025;
        drawbutton(a, b, "CLEAR", size, A);
        if (StdDraw.mouseX() > a-b && StdDraw.mouseY() > b-b && StdDraw.mouseX() < a+b && StdDraw.mouseY()<b+b){
            StdDraw.clear();
            drawbutton(a, b, "CLEAR", size, A);
            pensize(fonta, size, A);
            pencolor(fonta, size, A);
            StdDraw.show();
        }
    }

    public static double pensize (Font fonta, double size, Color A){

        double a = .45;
        double b = .025;
        drawbutton(a, b, "SIZE", size, A);
        Font Font1 = new Font ("Times New Roman", Font.ITALIC, 25);
        StdDraw.setFont(Font1);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(.465, b, "+");
        StdDraw.text(.435, b, "-");
        StdDraw.setPenColor(A);
        StdDraw.setFont(fonta);
        if (StdDraw.mouseX() < (.465+b/3) && StdDraw.mouseY() < (b+b/3) && StdDraw.mouseX() > (.465-b/3) && StdDraw.mouseY() > (b-b/3) && StdDraw.isMousePressed()){
            StdDraw.pause(100);
            return 2;
        }else if(StdDraw.mouseX() < (.435+b/3) && StdDraw.mouseY() < (b+b/3) && StdDraw.mouseX() > (.435-b/3) && StdDraw.mouseY() > (b-b/3) && StdDraw.isMousePressed())
        {
            StdDraw.pause(100);
            return .5;
        }else{
            return 1;
        }
    }

    public static void pencolor(Font fonta, double size, Color A){

        double a = .55;
        double b = .025;
        drawbutton(a, b, "COLOR", size, A);
        if (StdDraw.mouseX() < (a+b) && StdDraw.mouseY() < (b+b) && StdDraw.mouseX() > (a-b) && StdDraw.mouseY() > (b-b)){
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(a, b, .015, .01);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(a+.01, b+.01, .005);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledSquare(a, b+.01, .005);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledSquare(a-.01, b+.01, .005);
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledSquare(a+.01, b-.01, .005);
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.filledSquare(a, b, .005);
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(a-.01, b-.01, .005);
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.filledSquare(a+.01, b, .005);
            StdDraw.setPenColor(StdDraw.DARK_GRAY);
            StdDraw.filledSquare(a-.01, b, .005);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.text(a-.01, b-.01, "D");  
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.filledSquare(a, b-.01, .005);          
            StdDraw.setPenColor(A);
        }else{
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(a, b, .02, .02);
            drawbutton(a, b, "COLOR", size, A);
            StdDraw.setPenColor(A);
        }
    }

    public static Color changecolor(double size, Font fonta, double a, double b, Color A){

        Color B = A;

        double bz = a + .005;
        double bw = b + .005;
        double sz = a - .005;
        double sw = b - .005;

        if (StdDraw.mouseX() < (bz) && StdDraw.mouseY() < (bw) && StdDraw.mouseX() > (sz) && StdDraw.mouseY() > (sw) && StdDraw.isMousePressed()){
        A = (StdDraw.ORANGE);
        return A;
        }
        else if (StdDraw.mouseX() < (bz+.01) && StdDraw.mouseY() < (bw) && StdDraw.mouseX() > (sz+.01) && StdDraw.mouseY() > (sw) && StdDraw.isMousePressed()){
        A = StdDraw.LIGHT_GRAY;
        return A;
        }
        else if (StdDraw.mouseX() < (bz-.01) && StdDraw.mouseY() < (bw) && StdDraw.mouseX() > (sz-.01) && StdDraw.mouseY() > (sw) && StdDraw.isMousePressed()){
        A = StdDraw.BLACK;
        return A;
        }
        else if (StdDraw.mouseX() < (bz) && StdDraw.mouseY() < (bw+.01) && StdDraw.mouseX() > (sz) && StdDraw.mouseY() > (sw+.01) && StdDraw.isMousePressed()){
        A = StdDraw.RED;
        return A;
        }
        else if (StdDraw.mouseX() < (bz) && StdDraw.mouseY() < (bw-.01) && StdDraw.mouseX() > (sz) && StdDraw.mouseY() > (sw-.01) && StdDraw.isMousePressed()){
        A = StdDraw.MAGENTA;
        return A;
        }
        else if (StdDraw.mouseX() < (bz-.01) && StdDraw.mouseY() < (bw-.01) && StdDraw.mouseX() > (sz-.01) && StdDraw.mouseY() > (sw-.01) && StdDraw.isMousePressed()){
        A = StdDraw.WHITE;
        return A;
        }
        else if (StdDraw.mouseX() < (bz+.01) && StdDraw.mouseY() < (bw+.01) && StdDraw.mouseX() > (sz+.01) && StdDraw.mouseY() > (sw+.01) && StdDraw.isMousePressed()){
        A = StdDraw.BLUE;
        return A;
        }
        else if (StdDraw.mouseX() < (bz+.01) && StdDraw.mouseY() < (bw-.01) && StdDraw.mouseX() > (sz+.01) && StdDraw.mouseY() > (sw-.01) && StdDraw.isMousePressed()){
        A = StdDraw.YELLOW;
        return A;
        }
        else if (StdDraw.mouseX() < (bz-.01) && StdDraw.mouseY() < (bw+.01) && StdDraw.mouseX() > (sz-.01) && StdDraw.mouseY() > (sw+.01) && StdDraw.isMousePressed()){
        A = StdDraw.GREEN;
        return A;
        }else{
        A = B;
        return A;
        }
    }

    public static void curve (Color A){
        
        StdDraw.setPenColor(A);

        if (StdDraw.isMousePressed() && StdDraw.mouseY()>.0525){
            
            double tx = StdDraw.mouseX();
            double ty = StdDraw.mouseY();
            StdDraw.pause(5);
            StdDraw.show();
            for(int i = 1; i < 30; i++){
                StdDraw.line(tx, ty, StdDraw.mouseX(), StdDraw.mouseY());
                StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());
            }
        }
    }

    /*public static void undo (){

        for (int i = 0; i < 1339; i++){
            for (int j = 0; j < 750; j++){
                Draw s = new Draw();
            } 
        }
    }*/

    public static void main (String[] args){

        double a = .55;
        double b = .025;

        StdDraw.setCanvasSize(1440, 750);
        StdDraw.setScale(0,1);
        StdDraw.enableDoubleBuffering();
        Font fonta = new Font ("Times New Roman", Font.ITALIC, 10);
        StdDraw.setFont(fonta);
        double size = .01;
        StdDraw.setPenRadius(size);

        Color A = StdDraw.RED; 

        clear(size, fonta, A);
        pensize(fonta, size, A);
        pencolor(fonta, size, A);
        changecolor(size, fonta, a, b, A);

        StdDraw.setPenColor(changecolor(size, fonta, a, b, A));

        while(true){
            pencolor(fonta, size, A);
            if (StdDraw.isMousePressed()){
                pencolor(fonta, size, A);
                StdDraw.setPenColor(changecolor(size, fonta, a, b, A));
                A = changecolor(size, fonta, a, b, A);
                size *= pensize(fonta, size, A);
                StdDraw.setPenRadius(size);
                curve(A);
                clear(size, fonta, A);
            }else{
                StdDraw.show();
            }   
        }  
    }
}