package androidx.compose.ui.platform;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$4 extends FunctionReferenceImpl implements Ia.a<p293xa.r> {
    @Override // Ia.a
    public final p293xa.r invoke() {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class<?> cls = AndroidComposeView.f14644V0;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
        return p293xa.r.f47939a;
    }
}
