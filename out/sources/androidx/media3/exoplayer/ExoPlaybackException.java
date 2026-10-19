package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    final boolean isRecoverable;
    public final androidx.media3.exoplayer.source.h.b mediaPeriodId;
    public final p078g1.n rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    public ExoPlaybackException(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    public final ExoPlaybackException a(androidx.media3.exoplayer.source.h.b bVar) {
        String message = getMessage();
        int i10 = p114j1.A.f40996a;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, bVar, this.timestampMs, this.isRecoverable);
    }

    public ExoPlaybackException(String str, Throwable th, int i10, int i11, String str2, int i12, p078g1.n nVar, int i13, androidx.media3.exoplayer.source.h.b bVar, long j, boolean z10) {
        super(str, th, i10, Bundle.EMPTY, j);
        p241t7.b.e(!z10 || i11 == 1);
        p241t7.b.e(th != null || i11 == 3);
        this.type = i11;
        this.rendererName = str2;
        this.rendererIndex = i12;
        this.rendererFormat = nVar;
        this.rendererFormatSupport = i13;
        this.mediaPeriodId = bVar;
        this.isRecoverable = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i10, Exception exc, int i11, String str, int i12, p078g1.n nVar, int i13, boolean z10) {
        String string;
        String str2;
        if (i10 == 0) {
            string = "Source error";
        } else if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" error, index=");
            sb2.append(i12);
            sb2.append(", format=");
            sb2.append(nVar);
            sb2.append(", format_supported=");
            int i14 = p114j1.A.f40996a;
            if (i13 == 0) {
                str2 = "NO";
            } else if (i13 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i13 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str2);
            string = sb2.toString();
        } else if (i10 != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? string : androidx.compose.ui.text.font.s.b(string, ": null"), exc, i11, i10, str, i12, nVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }
}
