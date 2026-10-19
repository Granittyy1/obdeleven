package p037cb;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlin.text.l;
import p011ab.e;
import p011ab.m;
import p011ab.n;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f22587b;

    public V(e eVar, e eVar2) {
        this.f22586a = eVar;
        this.f22587b = eVar2;
    }

    @Override // p011ab.e
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p011ab.e
    public final boolean c() {
        return false;
    }

    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        Integer numA = l.A(name);
        if (numA != null) {
            return numA.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // p011ab.e
    public final m e() {
        return n.c.f8126a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        v10.getClass();
        return this.f22586a.equals(v10.f22586a) && this.f22587b.equals(v10.f22587b);
    }

    @Override // p011ab.e
    public final int f() {
        return 2;
    }

    @Override // p011ab.e
    public final String g(int i10) {
        return String.valueOf(i10);
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f42983b;
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        if (i10 >= 0) {
            return EmptyList.f42983b;
        }
        throw new IllegalArgumentException(J4.i.c(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f22587b.hashCode() + ((this.f22586a.hashCode() + 710441009) * 31);
    }

    @Override // p011ab.e
    public final e i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f22586a;
        }
        if (i11 == 1) {
            return this.f22587b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // p011ab.e
    public final boolean isInline() {
        return false;
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(J4.i.c(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f22586a + ", " + this.f22587b + ')';
    }
}
