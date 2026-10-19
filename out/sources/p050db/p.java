package p050db;

import Ia.a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p011ab.e;
import p011ab.m;
import p293xa.g;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f34689a;

    public p(a<? extends e> aVar) {
        this.f34689a = kotlin.a.a(aVar);
    }

    @Override // p011ab.e
    public final String a() {
        return b().a();
    }

    public final e b() {
        return (e) this.f34689a.getValue();
    }

    @Override // p011ab.e
    public final boolean c() {
        return false;
    }

    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        return b().d(name);
    }

    @Override // p011ab.e
    public final m e() {
        return b().e();
    }

    @Override // p011ab.e
    public final int f() {
        return b().f();
    }

    @Override // p011ab.e
    public final String g(int i10) {
        return b().g(i10);
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f42983b;
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        return b().h(i10);
    }

    @Override // p011ab.e
    public final e i(int i10) {
        return b().i(i10);
    }

    @Override // p011ab.e
    public final boolean isInline() {
        return false;
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        return b().j(i10);
    }
}
