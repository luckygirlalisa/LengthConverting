package com.thoughtworks;
public class Length {
    private static int MILETIMEOFYARD = 1760;
    private static int YARDTIMEOFFEET = 3;
    private static int FEETTIMEOFINCH = 12;
    private static final int MILETIMEOFINCH = MILETIMEOFYARD * YARDTIMEOFFEET * FEETTIMEOFINCH;
    private static final int YARDTIMEOFINCH = YARDTIMEOFFEET * FEETTIMEOFINCH;
    private Type type;
    private int number;

    private Length(Type type, int number) {
        this.type = type;
        this.number = number;
    }

    private int getNumber() {
        return number;
    }

    static public Length createLength(Type type, int number) {
        switch (type){
            case MILE:
                return new Length(type, number * MILETIMEOFINCH);
            case YARD:
                return new Length(type, number * YARDTIMEOFINCH);
            case FEET:
                return new Length(type, number * FEETTIMEOFINCH);
            case INCH:
                return new Length(type, number);
            default:
                throw new IllegalArgumentException("Can't new illegal unit!");
        }
    }

    @Override
    public boolean equals(Object o) {
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return getNumber();
    }

    public Length plus(Length parameterLength) {
        int resultRelativeNumber = getNumber() + parameterLength.getNumber();
        return new Length(Type.INCH, resultRelativeNumber);
    }
}
