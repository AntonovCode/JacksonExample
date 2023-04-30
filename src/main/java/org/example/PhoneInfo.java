package org.example;

public class PhoneInfo {
    private String phone;
    private boolean isMain;

    public PhoneInfo() {}

    public PhoneInfo(String phone, boolean isMain) {
        this.phone = phone;
        this.isMain = isMain;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(boolean isMain) {
        this.isMain = isMain;
    }

    @Override
    public String toString() {
        return String.format("%s - %s основной", phone, isMain ? "" : "не");
    }
}
