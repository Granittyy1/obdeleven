package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1780b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f25661a;

    static {
        f25661a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
