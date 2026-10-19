package androidx.compose.ui.platform;

import java.util.ArrayList;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H0 implements androidx.compose.ui.node.V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f14919d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f14920e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.compose.ui.semantics.j f14921f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.compose.ui.semantics.j f14922g = null;

    public H0(int i10, ArrayList arrayList) {
        this.f14917b = i10;
        this.f14918c = arrayList;
    }

    @Override // androidx.compose.ui.node.V
    public final boolean a0() {
        return this.f14918c.contains(this);
    }
}
