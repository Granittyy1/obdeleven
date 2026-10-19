package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.P;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.C1081d0;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1081d0 f10386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1081d0 f10387b;

    @Override // androidx.compose.foundation.lazy.b
    public final androidx.compose.ui.h a(float f10) {
        return new ParentSizeElement(f10, this.f10386a, null, 4);
    }

    @Override // androidx.compose.foundation.lazy.b
    public final androidx.compose.ui.h b(androidx.compose.ui.h hVar, P p10, P p11) {
        return (p10 == null && p11 == null) ? hVar : hVar.i(new LazyLayoutAnimateItemElement(p10, p11));
    }

    @Override // androidx.compose.foundation.lazy.b
    public final androidx.compose.ui.h c(float f10) {
        return new ParentSizeElement(f10, null, this.f10387b, 2);
    }
}
