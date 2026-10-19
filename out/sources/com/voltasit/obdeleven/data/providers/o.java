package com.voltasit.obdeleven.data.providers;

import G8.C0707i;
import com.voltasit.obdeleven.domain.models.NavigationType;
import com.voltasit.obdeleven.domain.models.Screen;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C2688e;

/* JADX INFO: compiled from: NavigationProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements K8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f30270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.flow.r f30271b;

    public o() {
        kotlinx.coroutines.flow.v vVarB = kotlinx.coroutines.flow.w.b(0, 1, BufferOverflow.f43244c, 1);
        this.f30270a = vVarB;
        this.f30271b = C2688e.a(vVarB);
    }

    @Override // K8.i
    public final void a(C0707i c0707i) {
        this.f30270a.f(c0707i);
    }

    @Override // K8.i
    public final void b(Screen popUntilScreen, boolean z10) {
        kotlin.jvm.internal.i.e(popUntilScreen, "popUntilScreen");
        this.f30270a.f(new C0707i(popUntilScreen, null, false, z10 ? NavigationType.f30489d : NavigationType.f30488c, 6));
    }

    @Override // K8.i
    public final kotlinx.coroutines.flow.r c() {
        return this.f30271b;
    }
}
