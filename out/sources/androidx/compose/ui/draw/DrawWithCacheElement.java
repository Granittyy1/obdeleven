package androidx.compose.ui.draw;

import Ia.l;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends H<CacheDrawModifierNodeImpl> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<CacheDrawScope, g> f13373b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(l<? super CacheDrawScope, g> lVar) {
        this.f13373b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.f13373b);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = (CacheDrawModifierNodeImpl) cVar;
        cacheDrawModifierNodeImpl.f13368s = this.f13373b;
        cacheDrawModifierNodeImpl.V();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && kotlin.jvm.internal.i.a(this.f13373b, ((DrawWithCacheElement) obj).f13373b);
    }

    public final int hashCode() {
        return this.f13373b.hashCode();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f13373b + ')';
    }
}
