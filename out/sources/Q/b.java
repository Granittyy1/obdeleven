package Q;

import Ia.l;
import androidx.compose.ui.h;

/* JADX INFO: compiled from: RotaryInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h.c implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l<? super c, Boolean> f4980p;

    public b() {
        throw null;
    }

    @Override // Q.a
    public final boolean h1(c cVar) {
        l<? super c, Boolean> lVar = this.f4980p;
        if (lVar != null) {
            return lVar.invoke(cVar).booleanValue();
        }
        return false;
    }

    @Override // Q.a
    public final boolean x0(c cVar) {
        return false;
    }
}
