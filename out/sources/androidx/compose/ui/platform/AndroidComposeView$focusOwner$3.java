package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import androidx.compose.ui.focus.C1123e;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$3 extends FunctionReferenceImpl implements Ia.l<C1123e, Boolean> {
    @Override // Ia.l
    public final Boolean invoke(C1123e c1123e) {
        int i10 = c1123e.f13449a;
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class<?> cls = AndroidComposeView.f14644V0;
        androidComposeView.getClass();
        boolean zM = false;
        if (!C1123e.a(i10, 7) && !C1123e.a(i10, 8)) {
            Integer numN = C.e.n(i10);
            if (numN == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numN.intValue();
            I.f fVarG = androidComposeView.G();
            Rect rectA = fVarG != null ? androidx.compose.ui.graphics.g0.a(fVarG) : null;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View viewFindNextFocus = rectA == null ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(androidComposeView, rectA, iIntValue);
            if (viewFindNextFocus != null) {
                zM = C.e.m(viewFindNextFocus, Integer.valueOf(iIntValue), rectA);
            }
        }
        return Boolean.valueOf(zM);
    }
}
