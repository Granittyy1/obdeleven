package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0942b {
    public static final androidx.compose.ui.h a(float f10, float f11) {
        boolean zIsNaN = Float.isNaN(f10);
        androidx.compose.ui.h alignmentLineOffsetDpElement = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h alignmentLineOffsetDpElement2 = !zIsNaN ? new AlignmentLineOffsetDpElement(AlignmentLineKt.f14165a, f10, Float.NaN, InspectableValueKt.f14929a) : alignmentLineOffsetDpElement;
        if (!Float.isNaN(f11)) {
            alignmentLineOffsetDpElement = new AlignmentLineOffsetDpElement(AlignmentLineKt.f14166b, Float.NaN, f11, InspectableValueKt.f14929a);
        }
        return alignmentLineOffsetDpElement2.i(alignmentLineOffsetDpElement);
    }
}
