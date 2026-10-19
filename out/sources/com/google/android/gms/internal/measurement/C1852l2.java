package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1852l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f25782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25785d;

    public C1852l2(Uri uri, String str, String str2, boolean z10, boolean z11) {
        this.f25782a = uri;
        this.f25783b = str;
        this.f25784c = str2;
        this.f25785d = z10;
    }

    public final C1831i2 a(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = AbstractC1803e2.f25685g;
        return new C1831i2(this, str, lValueOf);
    }

    public final C1845k2 b(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = AbstractC1803e2.f25685g;
        return new C1845k2(this, str, boolValueOf);
    }

    public final C1859m2 c(String str, String str2) {
        Object obj = AbstractC1803e2.f25685g;
        return new C1859m2(this, str, str2);
    }
}
