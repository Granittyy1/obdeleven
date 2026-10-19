package androidx.compose.runtime.internal;

import android.os.Looper;

/* JADX INFO: compiled from: Thread.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f13071a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f13071a = id;
    }
}
