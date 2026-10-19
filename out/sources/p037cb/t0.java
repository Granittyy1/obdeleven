package p037cb;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import p011ab.e;
import p011ab.m;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements e, InterfaceC1535l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f22657c;

    public t0(e original) {
        i.e(original, "original");
        this.f22655a = original;
        this.f22656b = original.a() + '?';
        this.f22657c = C1528h0.a(original);
    }

    @Override // p011ab.e
    public final String a() {
        return this.f22656b;
    }

    @Override // p037cb.InterfaceC1535l
    public final Set<String> b() {
        return this.f22657c;
    }

    @Override // p011ab.e
    public final boolean c() {
        return true;
    }

    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        return this.f22655a.d(name);
    }

    @Override // p011ab.e
    public final m e() {
        return this.f22655a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return i.a(this.f22655a, ((t0) obj).f22655a);
        }
        return false;
    }

    @Override // p011ab.e
    public final int f() {
        return this.f22655a.f();
    }

    @Override // p011ab.e
    public final String g(int i10) {
        return this.f22655a.g(i10);
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return this.f22655a.getAnnotations();
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        return this.f22655a.h(i10);
    }

    public final int hashCode() {
        return this.f22655a.hashCode() * 31;
    }

    @Override // p011ab.e
    public final e i(int i10) {
        return this.f22655a.i(i10);
    }

    @Override // p011ab.e
    public final boolean isInline() {
        return this.f22655a.isInline();
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        return this.f22655a.j(i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22655a);
        sb2.append('?');
        return sb2.toString();
    }
}
