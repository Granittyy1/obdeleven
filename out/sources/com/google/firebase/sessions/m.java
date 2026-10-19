package com.google.firebase.sessions;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;

/* JADX INFO: compiled from: SessionDataStoreConfigs.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28729b;

    static {
        String strA;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            strA = Process.myProcessName();
            kotlin.jvm.internal.i.d(strA, "myProcessName()");
        } else if ((i10 < 28 || (strA = Application.getProcessName()) == null) && (strA = Y4.f.a()) == null) {
            strA = "";
        }
        byte[] bytes = strA.getBytes(kotlin.text.a.f43120b);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        f28728a = androidx.compose.foundation.gestures.d.b("firebase_session_", strEncodeToString, "_data");
        f28729b = androidx.compose.foundation.gestures.d.b("firebase_session_", strEncodeToString, "_settings");
    }
}
