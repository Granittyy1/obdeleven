package androidx.compose.foundation.selection;

import Ia.l;
import androidx.compose.foundation.C0938j;
import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.i;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.v;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.state.ToggleableState;
import p293xa.r;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends C0938j {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f11050I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public l<? super Boolean, r> f11051J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Ia.a<r> f11052K;

    public d() {
        throw null;
    }

    public d(final boolean z10, k kVar, boolean z11, i iVar, final l lVar) {
        super(kVar, null, z11, null, iVar, new Ia.a<r>() { // from class: androidx.compose.foundation.selection.ToggleableNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                lVar.invoke(Boolean.valueOf(!z10));
                return r.f47939a;
            }
        });
        this.f11050I = z10;
        this.f11051J = lVar;
        this.f11052K = new Ia.a<r>() { // from class: androidx.compose.foundation.selection.ToggleableNode$_onClick$1
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                d dVar = this.this$0;
                dVar.f11051J.invoke(Boolean.valueOf(!dVar.f11050I));
                return r.f47939a;
            }
        };
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void T1(w wVar) {
        ToggleableState toggleableState = this.f11050I ? ToggleableState.f15273b : ToggleableState.f15274c;
        Oa.l<Object>[] lVarArr = t.f15251a;
        v<ToggleableState> vVar = SemanticsProperties.f15142H;
        Oa.l<Object> lVar = t.f15251a[23];
        vVar.getClass();
        wVar.e(vVar, toggleableState);
    }
}
