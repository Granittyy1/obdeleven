package p247u1;

import I4.l;
import X1.a;
import X1.i;
import X1.j;
import X1.k;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.compose.foundation.gestures.snapping.c;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC1389g;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.source.h;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.braze.Constants;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import p078g1.n;
import p078g1.t;
import p241t7.b;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1389g implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public k f47392A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public k f47393B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f47394C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Handler f47395D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final K.a f47396E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Q f47397F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f47398G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f47399H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public n f47400I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f47401J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f47402K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public IOException f47403L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f47404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecoderInputBuffer f47405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f47406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d.a f47407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f47408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f47409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f47410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f47411z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(K.a aVar, Looper looper) {
        super(3);
        d.a aVar2 = d.f47390a;
        this.f47396E = aVar;
        this.f47395D = looper == null ? null : new Handler(looper, this);
        this.f47407v = aVar2;
        this.f47404s = new a();
        this.f47405t = new DecoderInputBuffer(1);
        this.f47397F = new Q();
        this.f47402K = -9223372036854775807L;
        this.f47401J = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void H() {
        this.f47400I = null;
        this.f47402K = -9223372036854775807L;
        R();
        this.f47401J = -9223372036854775807L;
        if (this.f47410y != null) {
            V();
            i iVar = this.f47410y;
            iVar.getClass();
            iVar.a();
            this.f47410y = null;
            this.f47409x = 0;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void J(long j, boolean z10) {
        this.f47401J = j;
        a aVar = this.f47406u;
        if (aVar != null) {
            aVar.clear();
        }
        R();
        this.f47398G = false;
        this.f47399H = false;
        this.f47402K = -9223372036854775807L;
        n nVar = this.f47400I;
        if (nVar == null || Objects.equals(nVar.f35302n, "application/x-media3-cues")) {
            return;
        }
        if (this.f47409x == 0) {
            V();
            i iVar = this.f47410y;
            iVar.getClass();
            iVar.flush();
            iVar.c(this.f18372m);
            return;
        }
        V();
        i iVar2 = this.f47410y;
        iVar2.getClass();
        iVar2.a();
        this.f47410y = null;
        this.f47409x = 0;
        U();
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void O(n[] nVarArr, long j, long j10, h.b bVar) {
        n nVar = nVarArr[0];
        this.f47400I = nVar;
        if (Objects.equals(nVar.f35302n, "application/x-media3-cues")) {
            this.f47406u = this.f47400I.f35285J == 1 ? new c() : new c();
            return;
        }
        Q();
        if (this.f47410y != null) {
            this.f47409x = 1;
        } else {
            U();
        }
    }

    public final void Q() {
        b.i("Legacy decoding is disabled, can't handle " + this.f47400I.f35302n + " samples (expected application/x-media3-cues).", Objects.equals(this.f47400I.f35302n, "application/cea-608") || Objects.equals(this.f47400I.f35302n, "application/x-mp4-cea-608") || Objects.equals(this.f47400I.f35302n, "application/cea-708"));
    }

    public final void R() {
        ImmutableList immutableListK = ImmutableList.K();
        T(this.f47401J);
        p102i1.b bVar = new p102i1.b(immutableListK);
        Handler handler = this.f47395D;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
            return;
        }
        K.a aVar = this.f47396E;
        K.this.f18033m.e(27, new l(bVar.f36544a));
        K k10 = K.this;
        k10.f18014a0 = bVar;
        k10.f18033m.e(27, new F1.a(2, bVar));
    }

    public final long S() {
        if (this.f47394C == -1) {
            return Long.MAX_VALUE;
        }
        this.f47392A.getClass();
        if (this.f47394C >= this.f47392A.e()) {
            return Long.MAX_VALUE;
        }
        return this.f47392A.b(this.f47394C);
    }

    public final long T(long j) {
        b.k(j != -9223372036854775807L);
        return j - this.f18371l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    public final void U() {
        X1.e eVar;
        i bVar;
        byte b10 = 1;
        this.f47408w = true;
        n nVar = this.f47400I;
        nVar.getClass();
        d.a aVar = this.f47407v;
        aVar.getClass();
        String str = nVar.f35302n;
        if (str != null) {
            int i10 = nVar.f35284I;
            switch (str.hashCode()) {
                case 930165504:
                    b10 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b10 = -1;
                    }
                    break;
                case 1566016562:
                    b10 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                    bVar = new Y1.a(str, i10);
                    break;
                case 2:
                    bVar = new Y1.c(i10, nVar.f35305q);
                    break;
                default:
                    eVar = aVar.f47391b;
                    if (eVar.c(nVar)) {
                        throw new IllegalArgumentException(B7.b.c("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    X1.l lVarD = eVar.d(nVar);
                    lVarD.getClass().getSimpleName().concat("Decoder");
                    bVar = new b(lVarD);
                    break;
                    break;
            }
        } else {
            eVar = aVar.f47391b;
            if (eVar.c(nVar)) {
                throw new IllegalArgumentException(B7.b.c("Attempted to create decoder for unsupported MIME type: ", str));
            }
            X1.l lVarD2 = eVar.d(nVar);
            lVarD2.getClass().getSimpleName().concat("Decoder");
            bVar = new b(lVarD2);
        }
        this.f47410y = bVar;
        bVar.c(this.f18372m);
    }

    public final void V() {
        this.f47411z = null;
        this.f47394C = -1;
        k kVar = this.f47392A;
        if (kVar != null) {
            kVar.l();
            this.f47392A = null;
        }
        k kVar2 = this.f47393B;
        if (kVar2 != null) {
            kVar2.l();
            this.f47393B = null;
        }
    }

    @Override // androidx.media3.exoplayer.m0
    public final boolean b() {
        if (this.f47400I == null) {
            return true;
        }
        if (this.f47403L == null) {
            try {
                z();
            } catch (IOException e10) {
                this.f47403L = e10;
            }
        }
        if (this.f47403L != null) {
            n nVar = this.f47400I;
            nVar.getClass();
            if (Objects.equals(nVar.f35302n, "application/x-media3-cues")) {
                a aVar = this.f47406u;
                aVar.getClass();
                return aVar.a(this.f47401J) != Long.MIN_VALUE;
            }
            if (!this.f47399H) {
                if (this.f47398G) {
                    k kVar = this.f47392A;
                    long j = this.f47401J;
                    if (kVar == null || kVar.b(kVar.e() - 1) <= j) {
                        k kVar2 = this.f47393B;
                        long j10 = this.f47401J;
                        if ((kVar2 == null || kVar2.b(kVar2.e() - 1) <= j10) && this.f47411z != null) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.n0
    public final int c(n nVar) {
        if (!Objects.equals(nVar.f35302n, "application/x-media3-cues")) {
            d.a aVar = this.f47407v;
            aVar.getClass();
            if (!aVar.f47391b.c(nVar)) {
                String str = nVar.f35302n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return t.k(str) ? n0.n(1, 0, 0, 0) : n0.n(0, 0, 0, 0);
                }
            }
        }
        return n0.n(nVar.f35288M == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.m0
    public final boolean d() {
        return this.f47399H;
    }

    @Override // androidx.media3.exoplayer.m0, androidx.media3.exoplayer.n0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        p102i1.b bVar = (p102i1.b) message.obj;
        ImmutableList<p102i1.a> immutableList = bVar.f36544a;
        K.a aVar = this.f47396E;
        K.this.f18033m.e(27, new l(immutableList));
        K k10 = K.this;
        k10.f18014a0 = bVar;
        k10.f18033m.e(27, new F1.a(2, bVar));
        return true;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void v(long j, long j10) throws DecoderException {
        boolean z10;
        int i10;
        long jB;
        int i11 = 1;
        if (this.f18374o) {
            long j11 = this.f47402K;
            if (j11 != -9223372036854775807L && j >= j11) {
                V();
                this.f47399H = true;
            }
        }
        if (this.f47399H) {
            return;
        }
        n nVar = this.f47400I;
        nVar.getClass();
        boolean zEquals = Objects.equals(nVar.f35302n, "application/x-media3-cues");
        K.a aVar = this.f47396E;
        Handler handler = this.f47395D;
        boolean zB = false;
        Q q10 = this.f47397F;
        if (zEquals) {
            this.f47406u.getClass();
            if (!this.f47398G) {
                DecoderInputBuffer decoderInputBuffer = this.f47405t;
                if (P(q10, decoderInputBuffer, 0) == -4) {
                    if (decoderInputBuffer.g(4)) {
                        this.f47398G = true;
                    } else {
                        decoderInputBuffer.n();
                        ByteBuffer byteBuffer = decoderInputBuffer.f17941e;
                        byteBuffer.getClass();
                        long j12 = decoderInputBuffer.f17943g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f47404s.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        J4.n nVar2 = new J4.n(i11);
                        ImmutableList.b bVar = ImmutableList.f27874c;
                        ImmutableList.a aVar2 = new ImmutableList.a();
                        for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i12);
                            bundle2.getClass();
                            aVar2.c(nVar2.apply(bundle2));
                        }
                        X1.c cVar = new X1.c(j12, bundle.getLong(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), aVar2.h());
                        decoderInputBuffer.k();
                        zB = this.f47406u.b(cVar, j);
                    }
                }
            }
            long jA = this.f47406u.a(this.f47401J);
            if (jA == Long.MIN_VALUE && this.f47398G && !zB) {
                this.f47399H = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zB = true;
            }
            if (zB) {
                ImmutableList<p102i1.a> immutableListC = this.f47406u.c(j);
                long jD = this.f47406u.d(j);
                T(jD);
                p102i1.b bVar2 = new p102i1.b(immutableListC);
                if (handler != null) {
                    handler.obtainMessage(1, bVar2).sendToTarget();
                } else {
                    K.this.f18033m.e(27, new l(bVar2.f36544a));
                    K k10 = K.this;
                    k10.f18014a0 = bVar2;
                    k10.f18033m.e(27, new F1.a(2, bVar2));
                }
                this.f47406u.f(jD);
            }
            this.f47401J = j;
            return;
        }
        Q();
        this.f47401J = j;
        if (this.f47393B == null) {
            i iVar = this.f47410y;
            iVar.getClass();
            iVar.d(j);
            try {
                i iVar2 = this.f47410y;
                iVar2.getClass();
                this.f47393B = iVar2.e();
            } catch (SubtitleDecoderException e10) {
                p114j1.k.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f47400I, e10);
                R();
                V();
                i iVar3 = this.f47410y;
                iVar3.getClass();
                iVar3.a();
                this.f47410y = null;
                this.f47409x = 0;
                U();
                return;
            }
        }
        if (this.f18369i != 2) {
            return;
        }
        if (this.f47392A != null) {
            long jS = S();
            z10 = false;
            while (jS <= j) {
                this.f47394C++;
                jS = S();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        k kVar = this.f47393B;
        if (kVar != null) {
            if (kVar.g(4)) {
                if (!z10 && S() == Long.MAX_VALUE) {
                    if (this.f47409x == 2) {
                        V();
                        i iVar4 = this.f47410y;
                        iVar4.getClass();
                        iVar4.a();
                        this.f47410y = null;
                        this.f47409x = 0;
                        U();
                    } else {
                        V();
                        this.f47399H = true;
                    }
                }
            } else if (kVar.f44563c <= j) {
                k kVar2 = this.f47392A;
                if (kVar2 != null) {
                    kVar2.l();
                }
                this.f47394C = kVar.a(j);
                this.f47392A = kVar;
                this.f47393B = null;
                z10 = true;
            }
        }
        if (z10) {
            this.f47392A.getClass();
            int iA = this.f47392A.a(j);
            if (iA == 0 || this.f47392A.e() == 0) {
                jB = this.f47392A.f44563c;
            } else if (iA == -1) {
                k kVar3 = this.f47392A;
                jB = kVar3.b(kVar3.e() - 1);
            } else {
                jB = this.f47392A.b(iA - 1);
            }
            T(jB);
            p102i1.b bVar3 = new p102i1.b(this.f47392A.c(j));
            if (handler != null) {
                handler.obtainMessage(1, bVar3).sendToTarget();
                i10 = 2;
            } else {
                K.this.f18033m.e(27, new l(bVar3.f36544a));
                K k11 = K.this;
                k11.f18014a0 = bVar3;
                i10 = 2;
                k11.f18033m.e(27, new F1.a(i10, bVar3));
            }
        } else {
            i10 = 2;
        }
        if (this.f47409x == i10) {
            return;
        }
        while (!this.f47398G) {
            try {
                j jVarF = this.f47411z;
                if (jVarF == null) {
                    i iVar5 = this.f47410y;
                    iVar5.getClass();
                    jVarF = iVar5.f();
                    if (jVarF == null) {
                        return;
                    } else {
                        this.f47411z = jVarF;
                    }
                }
                if (this.f47409x == 1) {
                    jVarF.f6597b = 4;
                    i iVar6 = this.f47410y;
                    iVar6.getClass();
                    iVar6.b(jVarF);
                    this.f47411z = null;
                    this.f47409x = 2;
                    return;
                }
                int iP = P(q10, jVarF, 0);
                if (iP == -4) {
                    if (jVarF.g(4)) {
                        this.f47398G = true;
                        this.f47408w = false;
                    } else {
                        n nVar3 = (n) q10.f18136b;
                        if (nVar3 == null) {
                            return;
                        }
                        jVarF.j = nVar3.f35307s;
                        jVarF.n();
                        this.f47408w &= !jVarF.g(1);
                    }
                    if (!this.f47408w) {
                        i iVar7 = this.f47410y;
                        iVar7.getClass();
                        iVar7.b(jVarF);
                        this.f47411z = null;
                    }
                } else if (iP == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                p114j1.k.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f47400I, e11);
                R();
                V();
                i iVar8 = this.f47410y;
                iVar8.getClass();
                iVar8.a();
                this.f47410y = null;
                this.f47409x = 0;
                U();
                return;
            }
        }
    }
}
