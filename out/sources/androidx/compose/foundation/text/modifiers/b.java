package androidx.compose.foundation.text.modifiers;

import Na.l;
import androidx.compose.foundation.text.s;
import androidx.compose.ui.text.style.m;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: LayoutUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final long a(long j, boolean z10, int i10, float f10) {
        int iH = ((z10 || m.a(i10, 2) || m.a(i10, 4) || m.a(i10, 5)) && p013b0.a.d(j)) ? p013b0.a.h(j) : BrazeLogger.SUPPRESS;
        if (p013b0.a.j(j) != iH) {
            iH = l.D(s.a(f10), p013b0.a.j(j), iH);
        }
        return p013b0.a.C0206a.b(0, iH, 0, p013b0.a.g(j));
    }
}
