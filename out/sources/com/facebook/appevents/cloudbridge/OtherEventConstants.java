package com.facebook.appevents.cloudbridge;

import java.util.Arrays;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes.dex */
public enum OtherEventConstants {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");

    private final String rawValue;

    OtherEventConstants(String str) {
        this.rawValue = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static OtherEventConstants[] valuesCustom() {
        return (OtherEventConstants[]) Arrays.copyOf(values(), 5);
    }

    public final String a() {
        return this.rawValue;
    }
}
