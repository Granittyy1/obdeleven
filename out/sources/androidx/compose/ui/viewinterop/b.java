package androidx.compose.ui.viewinterop;

import I.f;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.focus.p;
import androidx.compose.ui.h;
import androidx.compose.ui.node.C1185f;

/* JADX INFO: compiled from: FocusGroupNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(p pVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        f fVarL = pVar.l();
        if (fVarL == null) {
            return null;
        }
        int i10 = (int) fVarL.f3757a;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = (int) fVarL.f3758b;
        int i14 = iArr[1];
        int i15 = iArr2[1];
        return new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) fVarL.f3759c) + i11) - i12, (((int) fVarL.f3760d) + i14) - i15);
    }

    public static final View c(h.c cVar) {
        AndroidViewHolder androidViewHolder = C1185f.f(cVar.f13985b).f14413p;
        View interopView = androidViewHolder != null ? androidViewHolder.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
