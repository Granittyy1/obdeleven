package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements Ia.a<T.b> {
    @Override // Ia.a
    public final T.b invoke() {
        ContentCaptureSession contentCaptureSessionA;
        View view = (View) this.receiver;
        Ia.l<? super androidx.compose.ui.text.input.t, ? extends androidx.compose.ui.text.input.t> lVar = AndroidComposeView_androidKt.f14790a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            T.d.a(view);
        }
        if (i10 < 29 || (contentCaptureSessionA = T.c.a(view)) == null) {
            return null;
        }
        return new T.b(contentCaptureSessionA, view);
    }
}
