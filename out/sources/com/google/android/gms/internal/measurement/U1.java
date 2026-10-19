package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class U1 implements InterfaceC1789c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.collection.X<String, androidx.collection.X<String, String>> f25605a;

    public U1(androidx.collection.X<String, androidx.collection.X<String, String>> x10) {
        this.f25605a = x10;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1789c2
    public final String a(String str, String str2, Uri uri) {
        androidx.collection.X<String, String> x10;
        if (uri != null) {
            x10 = this.f25605a.get(uri.toString());
        } else {
            x10 = null;
        }
        if (x10 == null) {
            return null;
        }
        if (str != null) {
            str2 = androidx.compose.ui.text.font.s.b(str, str2);
        }
        return x10.get(str2);
    }
}
