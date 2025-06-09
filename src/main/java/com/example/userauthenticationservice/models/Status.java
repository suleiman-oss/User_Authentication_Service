package com.example.userauthenticationservice.models;

public enum Status {
    ACTIVE("active"),
    INACTIVE("inactive"),;

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
