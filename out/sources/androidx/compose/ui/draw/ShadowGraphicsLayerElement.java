package androidx.compose.ui.draw;

import C4.v;
import androidx.compose.animation.D;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.node.NodeCoordinator;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends H<BlockGraphicsLayerModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f13388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13391f;

    public ShadowGraphicsLayerElement(float f10, l0 l0Var, boolean z10, long j, long j10) {
        this.f13387b = f10;
        this.f13388c = l0Var;
        this.f13389d = z10;
        this.f13390e = j;
        this.f13391f = j10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new BlockGraphicsLayerModifier(new ShadowGraphicsLayerElement$createBlock$1(this));
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) cVar;
        blockGraphicsLayerModifier.f13474p = new ShadowGraphicsLayerElement$createBlock$1(this);
        NodeCoordinator nodeCoordinator = C1185f.d(blockGraphicsLayerModifier, 2).f14528q;
        if (nodeCoordinator != null) {
            nodeCoordinator.V1(blockGraphicsLayerModifier.f13474p, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return p013b0.f.a(this.f13387b, shadowGraphicsLayerElement.f13387b) && kotlin.jvm.internal.i.a(this.f13388c, shadowGraphicsLayerElement.f13388c) && this.f13389d == shadowGraphicsLayerElement.f13389d && androidx.compose.ui.graphics.H.c(this.f13390e, shadowGraphicsLayerElement.f13390e) && androidx.compose.ui.graphics.H.c(this.f13391f, shadowGraphicsLayerElement.f13391f);
    }

    public final int hashCode() {
        int iB = D.b((this.f13388c.hashCode() + (Float.hashCode(this.f13387b) * 31)) * 31, 31, this.f13389d);
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f13391f) + C4.b.c(this.f13390e, iB, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb2.append((Object) p013b0.f.b(this.f13387b));
        sb2.append(", shape=");
        sb2.append(this.f13388c);
        sb2.append(", clip=");
        sb2.append(this.f13389d);
        sb2.append(", ambientColor=");
        v.h(this.f13390e, ", spotColor=", sb2);
        sb2.append((Object) androidx.compose.ui.graphics.H.i(this.f13391f));
        sb2.append(')');
        return sb2.toString();
    }
}
