package Ya;

import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p037cb.AbstractC1515b;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f<T> extends AbstractC1515b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.c f7642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmptyList f7643b = EmptyList.f42983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7644c = kotlin.a.b(LazyThreadSafetyMode.f42972c, new d(0, this));

    public f(kotlin.jvm.internal.c cVar) {
        this.f7642a = cVar;
    }

    @Override // p037cb.AbstractC1515b
    public final Oa.c<T> c() {
        return this.f7642a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return (p011ab.e) this.f7644c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f7642a + ')';
    }
}
