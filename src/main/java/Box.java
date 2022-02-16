public class Box {
    int length;
    int width;
    int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int squareBox() {
        int vol1 = length*width*height;
        return vol1;

    }
    public int perimeterBox() {
        int vol2 = length+width+height;
        return vol2;

    }
    public double averageSide() {
        int vol3 = (length+height+width)/3;
        return vol3;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
