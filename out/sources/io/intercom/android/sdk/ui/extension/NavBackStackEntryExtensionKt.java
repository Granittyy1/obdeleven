package io.intercom.android.sdk.ui.extension;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.i;
import p141l2.C2749t;
import p271w0.b;

/* JADX INFO: compiled from: NavBackStackEntryExtension.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NavBackStackEntryExtensionKt {
    public static final <T extends Parcelable> T getParcelableObject(C2749t c2749t, String key, Class<T> clazz, T defaultValue) {
        T t8;
        i.e(c2749t, "<this>");
        i.e(key, "key");
        i.e(clazz, "clazz");
        i.e(defaultValue, "defaultValue");
        Bundle bundleA = c2749t.f44305i.a();
        return (bundleA == null || (t8 = (T) b.a(bundleA, key, clazz)) == null) ? defaultValue : t8;
    }
}
