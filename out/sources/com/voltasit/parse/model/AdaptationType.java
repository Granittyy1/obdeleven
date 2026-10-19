package com.voltasit.parse.model;

/* JADX INFO: loaded from: classes3.dex */
public enum AdaptationType {
    UNKNOWN("Unknown"),
    ADAPTATION("ADAPTATION"),
    LONG_ADAPTATION("LONG_ADAPTATION");

    private final String name;

    AdaptationType(String str) {
        this.name = str;
    }

    public static AdaptationType a(String str) {
        for (AdaptationType adaptationType : values()) {
            if (adaptationType.name.equals(str)) {
                return adaptationType;
            }
        }
        return UNKNOWN;
    }

    public final String b() {
        return this.name;
    }
}
