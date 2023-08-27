package HW4;

import org.openqa.selenium.WebElement;

public class ElementComparator {
    public void compareElements(WebElement element1, WebElement element2) {
        int x1 = element1.getLocation().getX();
        int y1 = element1.getLocation().getY();
        int x2 = element2.getLocation().getX();
        int y2 = element2.getLocation().getY();

        int width1 = element1.getSize().getWidth();
        int height1 = element1.getSize().getHeight();
        int width2 = element2.getSize().getWidth();
        int height2 = element2.getSize().getHeight();

        System.out.println("Element 1:");
        System.out.println("Coordinates: x=" + x1 + ", y=" + y1);
        System.out.println("Size: width=" + width1 + ", height=" + height1);

        System.out.println("Element 2:");
        System.out.println("Coordinates: x=" + x2 + ", y=" + y2);
        System.out.println("Size: width=" + width2 + ", height=" + height2);

        if (y1 < y2) {
            System.out.println("Element 1 is positioned above Element 2.");
        } else if (y2 < y1) {
            System.out.println("Element 2 is positioned above Element 1.");
        } else {
            System.out.println("Elements are positioned at the same vertical level.");
        }

        if (x1 < x2) {
            System.out.println("Element 1 is positioned to the left of Element 2.");
        } else if (x2 < x1) {
            System.out.println("Element 2 is positioned to the left of Element 1.");
        } else {
            System.out.println("Elements are positioned at the same horizontal level.");
        }

        int area1 = width1 * height1;
        int area2 = width2 * height2;

        if (area1 > area2) {
            System.out.println("Element 1 occupies a larger area.");
        } else if (area2 > area1) {
            System.out.println("Element 2 occupies a larger area.");
        } else {
            System.out.println("Elements occupy the same area.");
        }
    }
}