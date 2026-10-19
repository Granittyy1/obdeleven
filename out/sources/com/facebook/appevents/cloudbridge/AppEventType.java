package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AppEventType f24790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AppEventType f24791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AppEventType f24792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AppEventType[] f24793f;

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class a {
    }

    static {
        AppEventType appEventType = new AppEventType("MOBILE_APP_INSTALL", 0);
        f24790c = appEventType;
        AppEventType appEventType2 = new AppEventType("CUSTOM", 1);
        f24791d = appEventType2;
        AppEventType appEventType3 = new AppEventType("OTHER", 2);
        f24792e = appEventType3;
        f24793f = new AppEventType[]{appEventType, appEventType2, appEventType3};
        f24789b = new a();
    }

    public AppEventType() {
        throw null;
    }

    public static AppEventType valueOf(String value) {
        i.e(value, "value");
        return (AppEventType) Enum.valueOf(AppEventType.class, value);
    }

    public static AppEventType[] values() {
        return (AppEventType[]) Arrays.copyOf(f24793f, 3);
    }
}
