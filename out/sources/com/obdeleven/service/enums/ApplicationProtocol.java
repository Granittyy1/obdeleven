package com.obdeleven.service.enums;

import android.text.TextUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationProtocol {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ApplicationProtocol f29262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ApplicationProtocol f29263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ApplicationProtocol f29264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ApplicationProtocol f29265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ApplicationProtocol f29266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ApplicationProtocol[] f29267g;

    static {
        ApplicationProtocol applicationProtocol = new ApplicationProtocol("KWP1281", 0);
        f29262b = applicationProtocol;
        ApplicationProtocol applicationProtocol2 = new ApplicationProtocol("KWP2000", 1);
        f29263c = applicationProtocol2;
        ApplicationProtocol applicationProtocol3 = new ApplicationProtocol("UDS", 2);
        f29264d = applicationProtocol3;
        ApplicationProtocol applicationProtocol4 = new ApplicationProtocol("OBD2", 3);
        f29265e = applicationProtocol4;
        ApplicationProtocol applicationProtocol5 = new ApplicationProtocol("UNKNOWN", 4);
        f29266f = applicationProtocol5;
        f29267g = new ApplicationProtocol[]{applicationProtocol, applicationProtocol2, applicationProtocol3, applicationProtocol4, applicationProtocol5};
    }

    public ApplicationProtocol() {
        throw null;
    }

    public static ApplicationProtocol a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ApplicationProtocol applicationProtocol = f29266f;
        if (zIsEmpty) {
            return applicationProtocol;
        }
        for (ApplicationProtocol applicationProtocol2 : values()) {
            if (str.toUpperCase().contains(applicationProtocol2.name())) {
                return applicationProtocol2;
            }
        }
        return applicationProtocol;
    }

    public static ApplicationProtocol valueOf(String str) {
        return (ApplicationProtocol) Enum.valueOf(ApplicationProtocol.class, str);
    }

    public static ApplicationProtocol[] values() {
        return (ApplicationProtocol[]) f29267g.clone();
    }
}
