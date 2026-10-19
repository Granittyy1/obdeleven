package io.intercom.android.sdk.ui.common;

import A1.C0575j;
import androidx.compose.foundation.layout.C0945e;
import kotlin.jvm.internal.i;
import p013b0.c;

/* JADX INFO: compiled from: IntercomArrangement.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomArrangement {
    public static final int $stable = 0;
    public static final IntercomArrangement INSTANCE = new IntercomArrangement();

    private IntercomArrangement() {
    }

    public final C0945e.l itemAtBottom(final int i10) {
        return new C0945e.l() { // from class: io.intercom.android.sdk.ui.common.IntercomArrangement.itemAtBottom.1
            @Override // androidx.compose.foundation.layout.C0945e.l
            public void arrange(c cVar, int i11, int[] sizes, int[] outPositions) {
                i.e(cVar, "<this>");
                i.e(sizes, "sizes");
                i.e(outPositions, "outPositions");
                int i12 = i10;
                int length = sizes.length;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < length) {
                    int i16 = sizes[i13];
                    int i17 = i14 + 1;
                    if (i14 == i12) {
                        outPositions[i14] = i11 - i16;
                    } else {
                        outPositions[i14] = i15;
                        i15 += i16;
                    }
                    i13++;
                    i14 = i17;
                }
            }

            @Override // androidx.compose.foundation.layout.C0945e.l
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public float mo1getSpacingD9Ej5fM() {
                return 0;
            }

            public String toString() {
                return C0575j.b(new StringBuilder("Arrangement#itemAtBottom("), i10, ')');
            }
        };
    }
}
