package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.C1150a;
import androidx.compose.ui.input.pointer.C1151b;
import com.braze.Constants;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f14643a = new A();

    public final void a(View view, androidx.compose.ui.input.pointer.m mVar) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (mVar instanceof C1150a) {
            ((C1150a) mVar).getClass();
            systemIcon = null;
        } else {
            systemIcon = mVar instanceof C1151b ? PointerIcon.getSystemIcon(context, ((C1151b) mVar).f14069b) : PointerIcon.getSystemIcon(context, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        }
        if (kotlin.jvm.internal.i.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
