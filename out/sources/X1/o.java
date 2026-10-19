package X1;

import A1.C0576k;
import A1.K;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.braze.Constants;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p078g1.t;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: SubtitleTranscodingTrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f7162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l.a f7163b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f7168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p078g1.n f7169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7170i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7165d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7166e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f7167f = A.f40998c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f7164c = new r();

    public o(K k10, l.a aVar) {
        this.f7162a = k10;
        this.f7163b = aVar;
    }

    @Override // A1.K
    public final void b(final long j, final int i10, int i11, int i12, K.a aVar) {
        if (this.f7168g == null) {
            this.f7162a.b(j, i10, i11, i12, aVar);
            return;
        }
        p241t7.b.d("DRM on subtitles is not supported", aVar == null);
        int i13 = (this.f7166e - i12) - i11;
        try {
            this.f7168g.a(this.f7167f, i13, i11, l.b.f7152c, new p114j1.f() { // from class: X1.n
                @Override // p114j1.f
                public final void a(Object obj) {
                    c cVar = (c) obj;
                    o oVar = this.f7159b;
                    p241t7.b.l(oVar.f7169h);
                    ImmutableList<p102i1.a> immutableList = cVar.f7141a;
                    long j10 = cVar.f7143c;
                    O.a aVar2 = new O.a();
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
                    Iterator<p102i1.a> it = immutableList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((Bundle) aVar2.apply(it.next()));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("c", arrayList);
                    bundle.putLong(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, j10);
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeBundle(bundle);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    r rVar = oVar.f7164c;
                    rVar.getClass();
                    rVar.E(bArrMarshall.length, bArrMarshall);
                    oVar.f7162a.a(bArrMarshall.length, rVar);
                    long j11 = cVar.f7142b;
                    long j12 = j;
                    if (j11 == -9223372036854775807L) {
                        p241t7.b.k(oVar.f7169h.f35307s == Long.MAX_VALUE);
                    } else {
                        long j13 = oVar.f7169h.f35307s;
                        j12 = j13 == Long.MAX_VALUE ? j12 + j11 : j11 + j13;
                    }
                    oVar.f7162a.b(j12, i10 | 1, bArrMarshall.length, 0, null);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f7170i) {
                throw e10;
            }
            p114j1.k.g("Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f7165d = i14;
        if (i14 == this.f7166e) {
            this.f7165d = 0;
            this.f7166e = 0;
        }
    }

    @Override // A1.K
    public final void c(r rVar, int i10, int i11) {
        if (this.f7168g == null) {
            this.f7162a.c(rVar, i10, i11);
            return;
        }
        g(i10);
        rVar.f(this.f7167f, this.f7166e, i10);
        this.f7166e += i10;
    }

    @Override // A1.K
    public final void d(p078g1.n nVar) {
        nVar.f35302n.getClass();
        String str = nVar.f35302n;
        p241t7.b.e(t.h(str) == 3);
        boolean zEquals = nVar.equals(this.f7169h);
        l.a aVar = this.f7163b;
        if (!zEquals) {
            this.f7169h = nVar;
            this.f7168g = aVar.c(nVar) ? aVar.d(nVar) : null;
        }
        l lVar = this.f7168g;
        K k10 = this.f7162a;
        if (lVar == null) {
            k10.d(nVar);
            return;
        }
        g1.n.a aVarA = nVar.a();
        aVarA.f35338m = t.m("application/x-media3-cues");
        aVarA.j = str;
        aVarA.f35343r = Long.MAX_VALUE;
        aVarA.f35323I = aVar.e(nVar);
        C0576k.b(aVarA, k10);
    }

    @Override // A1.K
    public final int e(p078g1.i iVar, int i10, boolean z10) throws IOException {
        if (this.f7168g == null) {
            return this.f7162a.e(iVar, i10, z10);
        }
        g(i10);
        int i11 = iVar.read(this.f7167f, this.f7166e, i10);
        if (i11 != -1) {
            this.f7166e += i11;
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void g(int i10) {
        int length = this.f7167f.length;
        int i11 = this.f7166e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f7165d;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f7167f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f7165d, bArr2, 0, i12);
        this.f7165d = 0;
        this.f7166e = i12;
        this.f7167f = bArr2;
    }
}
