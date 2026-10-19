package O;

import Ia.l;
import android.view.KeyEvent;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.compose.ui.h.c implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l<? super c, Boolean> f4723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Lambda f4724q;

    public g() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // O.f
    public final boolean G(KeyEvent keyEvent) {
        ?? r10 = this.f4724q;
        if (r10 != 0) {
            return ((Boolean) r10.invoke(new c(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // O.f
    public final boolean k0(KeyEvent keyEvent) {
        l<? super c, Boolean> lVar = this.f4723p;
        if (lVar != null) {
            return lVar.invoke(new c(keyEvent)).booleanValue();
        }
        return false;
    }
}
