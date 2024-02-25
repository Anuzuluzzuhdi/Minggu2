public class Dragon01 {
    int x, y, width, height;

    public Dragon01(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // method gerakKiri
    void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision(x, y);
        }
    }

    // method gerakKanan
    void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision(x, y);
        }
    }

    // method gerakAtas
    void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision(x, y);
        }
    }

    // method gerakBawah
    void moveDown() {
        if (y < height) {
            y++;
        } else {
            detectCollision(x, y);
        }
    }

    // method printPosisi
    void printPosition() {
        System.out.println("Dragon is at position (" + x + ", " + y + ")");
    }

    // method deteksiTabrakan
    void detectCollision(int x, int y) {
        if (x == 0 || x == width || y == 0 || y == height) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {
        Dragon01 naga = new Dragon01(3, 4, 8, 6);
        naga.moveLeft(); 
        naga.moveUp();
        naga.moveRight(); 
        naga.moveDown();
        //naga.gerakBawah(); 
        naga.printPosition(); 
    }

}
