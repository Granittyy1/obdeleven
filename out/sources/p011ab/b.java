package p011ab;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8091c;

    public b(h hVar, c kClass) {
        i.e(kClass, "kClass");
        this.f8089a = hVar;
        this.f8090b = kClass;
        this.f8091c = hVar.f8107a + '<' + kClass.a() + '>';
    }

    @Override // p011ab.e
    public final String a() {
        return this.f8091c;
    }

    @Override // p011ab.e
    public final boolean c() {
        return false;
    }

    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        return this.f8089a.d(name);
    }

    @Override // p011ab.e
    public final m e() {
        return this.f8089a.f8108b;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f8089a.equals(bVar.f8089a) && i.a(bVar.f8090b, this.f8090b);
    }

    @Override // p011ab.e
    public final int f() {
        return this.f8089a.f8109c;
    }

    @Override // p011ab.e
    public final String g(int i10) {
        return this.f8089a.f8112f[i10];
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return this.f8089a.f8110d;
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        return this.f8089a.f8114h[i10];
    }

    public final int hashCode() {
        return this.f8091c.hashCode() + (this.f8090b.hashCode() * 31);
    }

    @Override // p011ab.e
    public final e i(int i10) {
        return this.f8089a.f8113g[i10];
    }

    @Override // p011ab.e
    public final boolean isInline() {
        return false;
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        return this.f8089a.f8115i[i10];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f8090b + ", original: " + this.f8089a + ')';
    }
}
