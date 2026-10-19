package p037cb;

import kotlin.a;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p011ab.e;
import p011ab.j;
import p011ab.k;
import p011ab.l;
import p011ab.m;
import p011ab.n;
import p293xa.g;

/* JADX INFO: renamed from: cb.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1551x extends C1536l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m.b f22671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f22672m;

    public C1551x(final String str, final int i10) {
        super(str, null, i10);
        this.f22671l = m.b.f8123a;
        this.f22672m = a.a(new Ia.a() { // from class: cb.w
            @Override // Ia.a
            public final Object invoke() {
                int i11 = i10;
                e[] eVarArr = new e[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    eVarArr[i12] = l.c(str + '.' + this.f22630e[i12], n.d.f8127a, new e[0], new k(0));
                }
                return eVarArr;
            }
        });
    }

    @Override // p037cb.C1536l0, p011ab.e
    public final m e() {
        return this.f22671l;
    }

    @Override // p037cb.C1536l0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.e() != m.b.f8123a) {
            return false;
        }
        return this.f22626a.equals(eVar.a()) && i.a(C1528h0.a(this), C1528h0.a(eVar));
    }

    @Override // p037cb.C1536l0
    public final int hashCode() {
        int iHashCode = this.f22626a.hashCode();
        p011ab.i iVar = new p011ab.i(this);
        int iHashCode2 = 1;
        while (iVar.hasNext()) {
            int i10 = iHashCode2 * 31;
            String str = (String) iVar.next();
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p037cb.C1536l0, p011ab.e
    public final e i(int i10) {
        return ((e[]) this.f22672m.getValue())[i10];
    }

    @Override // p037cb.C1536l0
    public final String toString() {
        return q.U(new j(this), ", ", this.f22626a.concat("("), ")", null, 56);
    }
}
