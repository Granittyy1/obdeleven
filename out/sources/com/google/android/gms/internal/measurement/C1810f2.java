package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.C0873a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1810f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0873a<String, Uri> f25703a = new C0873a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        C0873a<String, Uri> c0873a = f25703a;
        uri = c0873a.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c0873a.put(str, uri);
        }
        return uri;
    }
}
