package androidx.compose.runtime.snapshots;

import androidx.collection.L;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f13197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13198p;

    public b(long j, SnapshotIdSet snapshotIdSet, Ia.l<Object, p293xa.r> lVar, Ia.l<Object, p293xa.r> lVar2, a aVar) {
        super(j, snapshotIdSet, lVar, lVar2);
        this.f13197o = aVar;
        aVar.k();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void c() {
        if (this.f13206c) {
            return;
        }
        super.c();
        if (this.f13198p) {
            return;
        }
        this.f13198p = true;
        this.f13197o.l();
    }

    @Override // androidx.compose.runtime.snapshots.a
    public final h w() {
        a aVar = this.f13197o;
        if (aVar.f13196m || aVar.f13206c) {
            return new h.a();
        }
        L<o> l10 = this.f13192h;
        long j = this.f13205b;
        HashMap mapC = l10 != null ? SnapshotKt.c(aVar.g(), this, this.f13197o.d()) : null;
        Object obj = SnapshotKt.f13154c;
        synchronized (obj) {
            try {
                SnapshotKt.d(this);
                if (l10 == null || l10.f9125d == 0) {
                    a();
                } else {
                    h hVarZ = z(this.f13197o.g(), l10, mapC, this.f13197o.d());
                    if (!kotlin.jvm.internal.i.a(hVarZ, h.b.f13208a)) {
                        return hVarZ;
                    }
                    L<o> lX = this.f13197o.x();
                    if (lX != null) {
                        lX.j(l10);
                    } else {
                        this.f13197o.B(l10);
                        this.f13192h = null;
                    }
                }
                if (this.f13197o.g() < j) {
                    this.f13197o.v();
                }
                a aVar2 = this.f13197o;
                aVar2.r(aVar2.d().k(j).e(this.j));
                this.f13197o.A(j);
                a aVar3 = this.f13197o;
                int i10 = this.f13207d;
                this.f13207d = -1;
                if (i10 >= 0) {
                    int[] iArr = aVar3.f13194k;
                    kotlin.jvm.internal.i.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i10;
                    aVar3.f13194k = iArrCopyOf;
                } else {
                    aVar3.getClass();
                }
                a aVar4 = this.f13197o;
                SnapshotIdSet snapshotIdSet = this.j;
                aVar4.getClass();
                synchronized (obj) {
                    aVar4.j = aVar4.j.v(snapshotIdSet);
                    p293xa.r rVar = p293xa.r.f47939a;
                    a aVar5 = this.f13197o;
                    int[] iArr2 = this.f13194k;
                    aVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = aVar5.f13194k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            kotlin.jvm.internal.i.b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        aVar5.f13194k = iArr2;
                    }
                }
                this.f13196m = true;
                if (!this.f13198p) {
                    this.f13198p = true;
                    this.f13197o.l();
                }
                return h.b.f13208a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
