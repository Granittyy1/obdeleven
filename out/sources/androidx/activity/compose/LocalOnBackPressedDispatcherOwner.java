package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.C;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.voltasit.obdeleven.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LocalOnBackPressedDispatcherOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f8209a = CompositionLocalKt.c(new Ia.a<androidx.activity.C>() { // from class: androidx.activity.compose.LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1
        @Override // Ia.a
        public final /* bridge */ /* synthetic */ androidx.activity.C invoke() {
            return null;
        }
    });

    public static androidx.activity.C a(InterfaceC1084f interfaceC1084f) {
        androidx.activity.C c10 = (androidx.activity.C) interfaceC1084f.x(f8209a);
        Context context = null;
        if (c10 == null) {
            interfaceC1084f.L(544166745);
            View view = (View) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14797f);
            i.e(view, "<this>");
            while (true) {
                if (view == null) {
                    c10 = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                androidx.activity.C c11 = tag instanceof androidx.activity.C ? (androidx.activity.C) tag : null;
                if (c11 != null) {
                    c10 = c11;
                    break;
                }
                Object objE = G0.a.e(view);
                view = objE instanceof View ? (View) objE : null;
            }
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(544164296);
            interfaceC1084f.D();
        }
        if (c10 != null) {
            interfaceC1084f.L(544164377);
            interfaceC1084f.D();
            return c10;
        }
        interfaceC1084f.L(544168748);
        for (Context baseContext = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.activity.C) {
                context = baseContext;
                break;
            }
        }
        androidx.activity.C c12 = (androidx.activity.C) context;
        interfaceC1084f.D();
        return c12;
    }
}
