package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends androidx.compose.ui.node.H<WrapContentNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Direction f10235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lambda f10237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10238e;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(Direction direction, boolean z10, Ia.p pVar, Object obj) {
        this.f10235b = direction;
        this.f10236c = z10;
        this.f10237d = (Lambda) pVar;
        this.f10238e = obj;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        WrapContentNode wrapContentNode = new WrapContentNode();
        wrapContentNode.f10239p = this.f10235b;
        wrapContentNode.f10240q = this.f10236c;
        wrapContentNode.f10241r = this.f10237d;
        return wrapContentNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        WrapContentNode wrapContentNode = (WrapContentNode) cVar;
        wrapContentNode.f10239p = this.f10235b;
        wrapContentNode.f10240q = this.f10236c;
        wrapContentNode.f10241r = this.f10237d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f10235b == wrapContentElement.f10235b && this.f10236c == wrapContentElement.f10236c && kotlin.jvm.internal.i.a(this.f10238e, wrapContentElement.f10238e);
    }

    public final int hashCode() {
        return this.f10238e.hashCode() + androidx.compose.animation.D.b(this.f10235b.hashCode() * 31, 31, this.f10236c);
    }
}
