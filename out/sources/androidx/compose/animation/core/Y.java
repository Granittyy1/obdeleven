package androidx.compose.animation.core;

import androidx.compose.runtime.N0;
import androidx.lifecycle.AbstractC1382z;
import androidx.navigation.compose.C1412e;
import java.util.Iterator;
import java.util.List;
import p141l2.C2749t;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9511c;

    public /* synthetic */ Y(Object obj, int i10, Object obj2) {
        this.f9509a = i10;
        this.f9510b = obj;
        this.f9511c = obj2;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        switch (this.f9509a) {
            case 0:
                ((Transition) this.f9510b).f9437i.remove((Transition.d) this.f9511c);
                break;
            case 1:
                ((AbstractC1382z) this.f9510b).i((androidx.compose.runtime.livedata.a) this.f9511c);
                break;
            default:
                Iterator it = ((List) ((N0) this.f9510b).getValue()).iterator();
                while (it.hasNext()) {
                    ((C1412e) this.f9511c).b().b((C2749t) it.next());
                }
                break;
        }
    }
}
