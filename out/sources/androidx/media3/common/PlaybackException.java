package androidx.media3.common;

import android.os.Bundle;
import com.obdeleven.service.core.b;
import p114j1.A;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {
    public final int errorCode;
    public final Bundle extras;
    public final long timestampMs;

    static {
        b.b(0, 1, 2, 3, 4);
        A.B(5);
    }

    public PlaybackException(String str, Throwable th, int i10, Bundle bundle, long j) {
        super(str, th);
        this.errorCode = i10;
        this.extras = bundle;
        this.timestampMs = j;
    }
}
