package TD3.Exercice2;

public class Point {
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


