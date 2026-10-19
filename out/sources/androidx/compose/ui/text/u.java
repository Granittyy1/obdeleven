package androidx.compose.ui.text;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u implements androidx.compose.runtime.saveable.i<Object, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f15688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lambda f15689c;

    /* JADX WARN: Multi-variable type inference failed */
    public u(Ia.p<? super androidx.compose.runtime.saveable.j, Object, Object> pVar, Ia.l<Object, Object> lVar) {
        this.f15688b = (Lambda) pVar;
        this.f15689c = (Lambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.saveable.i
    public final Object a(Object obj) {
        return this.f15689c.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.p, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.saveable.i
    public final Object c(androidx.compose.runtime.saveable.j jVar, Object obj) {
        return this.f15688b.invoke(jVar, obj);
    }
}
