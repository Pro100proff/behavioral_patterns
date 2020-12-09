package ru.geekbrains.mediator.after;

public class Branch {
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
}
