package p037cb;

import A8.f;
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
public abstract class O implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22571a;

    public O(e eVar) {
        this.f22571a = eVar;
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
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // p011ab.e
    public final m e() {
        return n.b.f8125a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return i.a(this.f22571a, o10.f22571a) && i.a(a(), o10.a());
    }

    @Override // p011ab.e
    public final int f() {
        return 1;
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
        StringBuilder sbE = f.e(i10, "Illegal index ", ", ");
        sbE.append(a());
        sbE.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f22571a.hashCode() * 31);
    }

    @Override // p011ab.e
    public final e i(int i10) {
        if (i10 >= 0) {
            return this.f22571a;
        }
        StringBuilder sbE = f.e(i10, "Illegal index ", ", ");
        sbE.append(a());
        sbE.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbE.toString().toString());
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
        StringBuilder sbE = f.e(i10, "Illegal index ", ", ");
        sbE.append(a());
        sbE.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f22571a + ')';
    }
}
