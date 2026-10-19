package com.voltasit.parse.util;

/* JADX INFO: loaded from: classes3.dex */
public enum VehicleComparator$By {
    NAME("model"),
    YEAR("year"),
    DATE_CREATED("createdAt"),
    DATE_UPDATED("updatedAt");

    private final String dbField;

    VehicleComparator$By(String str) {
        this.dbField = str;
    }

    public final String a() {
        return this.dbField;
    }
}
