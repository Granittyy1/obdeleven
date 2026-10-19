package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0946f {
    public static androidx.compose.ui.h a(androidx.compose.ui.h hVar) {
        return hVar.i(new AspectRatioElement(InspectableValueKt.f14929a, false));
    }

    public static final boolean b(long j, int i10, int i11) {
        int iJ = p013b0.a.j(j);
        if (i10 <= p013b0.a.h(j) && iJ <= i10) {
            int i12 = p013b0.a.i(j);
            if (i11 <= p013b0.a.g(j) && i12 <= i11) {
                return true;
            }
        }
        return false;
    }
}
