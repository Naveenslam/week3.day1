package org.system;

public class Desktop extends Computer {
    public void desktopSize() {
        System.out.println("my Desktop size is : 1920 x 1080");

    }

    public static void main(String[] args) {
        Desktop computerDetails = new Desktop();

        computerModel();
        computerDetails.desktopSize();
    }

}
