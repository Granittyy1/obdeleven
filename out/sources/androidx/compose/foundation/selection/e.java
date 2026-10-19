package androidx.compose.foundation.selection;

import Oa.l;
import androidx.compose.foundation.C0938j;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.v;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.state.ToggleableState;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends C0938j {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ToggleableState f11053I;

    public e() {
        throw null;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void T1(w wVar) {
        ToggleableState toggleableState = this.f11053I;
        l<Object>[] lVarArr = t.f15251a;
        v<ToggleableState> vVar = SemanticsProperties.f15142H;
        l<Object> lVar = t.f15251a[23];
        vVar.getClass();
        wVar.e(vVar, toggleableState);
    }
}
