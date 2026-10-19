package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final ResolvedTextDirection a(B b10, int i10) {
        if (b10.f15300a.f15276a.f15408c.length() != 0) {
            C1268i c1268i = b10.f15301b;
            int iD = c1268i.d(i10);
            if ((i10 != 0 && iD == c1268i.d(i10 - 1)) || (i10 != b10.f15300a.f15276a.f15408c.length() && iD == c1268i.d(i10 + 1))) {
                return b10.a(i10);
            }
        }
        return b10.h(i10);
    }
}
