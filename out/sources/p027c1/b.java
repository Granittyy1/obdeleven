package p027c1;

import android.view.View;
import androidx.compose.runtime.C;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.Q0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.c0;
import kotlin.jvm.internal.h;

/* JADX INFO: compiled from: LocalViewModelStoreOwner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f22275a = new C(new a(0), Q0.f12888a);

    public static c0 a(InterfaceC1084f interfaceC1084f) {
        c0 c0VarF = (c0) interfaceC1084f.x(f22275a);
        if (c0VarF == null) {
            interfaceC1084f.L(1260197609);
            c0VarF = h.f((View) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14797f));
        } else {
            interfaceC1084f.L(1260196493);
        }
        interfaceC1084f.D();
        return c0VarF;
    }
}
