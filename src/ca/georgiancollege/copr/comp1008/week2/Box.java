package ca.georgiancollege.copr.comp1008.week2;

public class Box {

    public String material;
    private double dimension;
    protected boolean airCargoQualify;

    private double width;
    protected String name;
    public boolean bigOrNot;

    private double length;
    public String color;
    protected String manufacturer;

    public boolean checkBoxSize() {
        if (dimension < 5000) {
            airCargoQualify = true;
        }
        return airCargoQualify;
    }

    public boolean boxLengthConfirmation()
    {
        return length >= 5;
    }

    public boolean isBoxBiggerThanThis(double length){
        return this.length > length;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public Box(){}

    public Box(String material, double dimension, boolean airCargoQualify, double width, String name, boolean bigOrNot, double length, String color, String manufacturer) {
        this.material = material;
        this.dimension = dimension;
        this.airCargoQualify = airCargoQualify;
        this.width = width;
        this.name = name;
        this.bigOrNot = bigOrNot;
        this.length = length;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public Box(boolean airCargoQualify, boolean bigOrNot, String color) {
        this.airCargoQualify = airCargoQualify;
        this.bigOrNot = bigOrNot;
        this.color = color;
    }
    public Box(boolean bigOrNot, String color,boolean airCargoQualify ) {
        this(airCargoQualify, bigOrNot, color);
    }
    public Box(String color, boolean airCargoQualify, boolean bigOrNot) {
        this(airCargoQualify, bigOrNot, color);

    }
}
