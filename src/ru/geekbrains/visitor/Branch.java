package ru.geekbrains.visitor;

public class Branch implements Element{
    private String name;
    private String latitude;
    private String longitude;

    public Branch(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
