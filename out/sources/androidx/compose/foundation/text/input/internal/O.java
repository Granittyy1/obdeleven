package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.HandwritingGesture;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.C1269a;
import androidx.compose.ui.text.input.C1273e;

/* JADX INFO: compiled from: HandwritingGesture.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class O {
    public static int a(HandwritingGesture handwritingGesture, Ia.l lVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ((RecordingInputConnection.AnonymousClass1) lVar).invoke(new C1269a(fallbackText, 1));
        return 5;
    }

    public static void b(long j, C1260a c1260a, boolean z10, Ia.l lVar) {
        if (z10) {
            int i10 = androidx.compose.ui.text.E.f15315c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c1260a, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c1260a.f15408c.length() ? Character.codePointAt(c1260a, iCharCount2) : 10;
            if (Q.i(iCodePointBefore) && (Q.h(iCodePointAt) || Q.g(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c1260a, iCharCount);
                    }
                } while (Q.i(iCodePointBefore));
                j = O.h.b(iCharCount, iCharCount2);
            } else if (Q.i(iCodePointAt) && (Q.h(iCodePointBefore) || Q.g(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c1260a.f15408c.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c1260a, iCharCount2);
                    }
                } while (Q.i(iCodePointAt));
                j = O.h.b(iCharCount, iCharCount2);
            }
        }
        int i11 = (int) (4294967295L & j);
        ((RecordingInputConnection.AnonymousClass1) lVar).invoke(new P(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.x(i11, i11), new C1273e(androidx.compose.ui.text.E.c(j), 0)}));
    }
}
