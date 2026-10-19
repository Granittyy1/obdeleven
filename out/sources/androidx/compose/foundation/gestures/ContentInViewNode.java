package androidx.compose.foundation.gestures;

import A8.A;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1197s;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2715z;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: ContentInViewNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContentInViewNode extends androidx.compose.ui.h.c implements InterfaceC1197s, InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Orientation f9908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScrollingLogic f9909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f9911s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC1170p f9913u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9915w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9917y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f9912t = new b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f9916x = 0;

    /* JADX INFO: compiled from: ContentInViewNode.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ia.a<I.f> f9918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2693i f9919b;

        public a(Ia.a aVar, C2693i c2693i) {
            this.f9918a = aVar;
            this.f9919b = c2693i;
        }

        public final String toString() {
            String strB;
            C2693i c2693i = this.f9919b;
            C2715z c2715z = (C2715z) c2693i.f43448f.get(C2715z.f43620c);
            String str = c2715z != null ? c2715z.f43621b : null;
            StringBuilder sb2 = new StringBuilder("Request@");
            int iHashCode = hashCode();
            O.h.c(16);
            String string = Integer.toString(iHashCode, 16);
            kotlin.jvm.internal.i.d(string, "toString(...)");
            sb2.append(string);
            if (str == null || (strB = d.b("[", str, "](")) == null) {
                strB = "(";
            }
            sb2.append(strB);
            sb2.append("currentBounds()=");
            sb2.append(this.f9918a.invoke());
            sb2.append(", continuation=");
            sb2.append(c2693i);
            sb2.append(')');
            return sb2.toString();
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z10, c cVar) {
        this.f9908p = orientation;
        this.f9909q = scrollingLogic;
        this.f9910r = z10;
        this.f9911s = cVar;
    }

    public static final float Q1(ContentInViewNode contentInViewNode, c cVar) {
        I.f fVar;
        float fA;
        int iCompare;
        if (!p013b0.l.b(contentInViewNode.f9916x, 0L)) {
            androidx.compose.runtime.collection.c<a> cVar2 = contentInViewNode.f9912t.f10003a;
            int i10 = cVar2.f12945d - 1;
            a[] aVarArr = cVar2.f12943b;
            if (i10 < aVarArr.length) {
                fVar = null;
                while (i10 >= 0) {
                    I.f fVarInvoke = aVarArr[i10].f9918a.invoke();
                    if (fVarInvoke != null) {
                        long jC = fVarInvoke.c();
                        long jK = A.k(contentInViewNode.f9916x);
                        int iOrdinal = contentInViewNode.f9908p.ordinal();
                        if (iOrdinal == 0) {
                            iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jK & 4294967295L)));
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jK >> 32)));
                        }
                        if (iCompare > 0) {
                            if (fVar != null) {
                                break;
                            }
                            fVar = fVarInvoke;
                            break;
                        }
                        fVar = fVarInvoke;
                    }
                    i10--;
                }
            } else {
                fVar = null;
            }
            if (fVar == null) {
                I.f fVarS1 = contentInViewNode.f9914v ? contentInViewNode.S1() : null;
                if (fVarS1 != null) {
                    fVar = fVarS1;
                }
            }
            long jK2 = A.k(contentInViewNode.f9916x);
            int iOrdinal2 = contentInViewNode.f9908p.ordinal();
            if (iOrdinal2 == 0) {
                float f10 = fVar.f3760d;
                float f11 = fVar.f3758b;
                fA = cVar.a(f11, f10 - f11, Float.intBitsToFloat((int) (jK2 & 4294967295L)));
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                float f12 = fVar.f3759c;
                float f13 = fVar.f3757a;
                fA = cVar.a(f13, f12 - f13, Float.intBitsToFloat((int) (jK2 >> 32)));
            }
            return fA;
        }
        return 0.0f;
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final Object R1(Ia.a<I.f> aVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        I.f fVarInvoke = aVar.invoke();
        if (fVarInvoke == null || T1(fVarInvoke, this.f9916x)) {
            return p293xa.r.f47939a;
        }
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        final a aVar2 = new a(aVar, c2693i);
        final b bVar = this.f9912t;
        bVar.getClass();
        I.f fVarInvoke2 = aVar.invoke();
        if (fVarInvoke2 == null) {
            c2693i.resumeWith(p293xa.r.f47939a);
        } else {
            c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Throwable th) {
                    bVar.f10003a.m(aVar2);
                    return p293xa.r.f47939a;
                }
            });
            androidx.compose.runtime.collection.c<a> cVar2 = bVar.f10003a;
            Na.i iVarJ = Na.l.J(0, cVar2.f12945d);
            int i10 = iVarJ.f4687b;
            int i11 = iVarJ.f4688c;
            if (i10 > i11) {
                cVar2.a(0, aVar2);
                break;
            }
            while (true) {
                I.f fVarInvoke3 = cVar2.f12943b[i11].f9918a.invoke();
                if (fVarInvoke3 != null) {
                    I.f fVarD = fVarInvoke2.d(fVarInvoke3);
                    if (!fVarD.equals(fVarInvoke2)) {
                        if (!fVarD.equals(fVarInvoke3)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int i12 = cVar2.f12945d - 1;
                            if (i12 <= i11) {
                                while (true) {
                                    cVar2.f12943b[i11].f9919b.o(cancellationException);
                                    if (i12 == i11) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    } else {
                        cVar2.a(i11 + 1, aVar2);
                        break;
                    }
                }
                if (i11 == i10) {
                    cVar2.a(0, aVar2);
                    break;
                }
                i11--;
            }
            if (!this.f9917y) {
                U1();
            }
        }
        Object objP = c2693i.p();
        return objP == CoroutineSingletons.f43038b ? objP : p293xa.r.f47939a;
    }

    public final I.f S1() {
        if (!this.f13997o) {
            return null;
        }
        NodeCoordinator nodeCoordinatorE = C1185f.e(this);
        InterfaceC1170p interfaceC1170p = this.f9913u;
        if (interfaceC1170p != null) {
            if (!interfaceC1170p.c()) {
                interfaceC1170p = null;
            }
            if (interfaceC1170p != null) {
                return nodeCoordinatorE.H(interfaceC1170p, false);
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void T(long j) {
        int iG;
        I.f fVarS1;
        long j10 = this.f9916x;
        this.f9916x = j;
        int iOrdinal = this.f9908p.ordinal();
        if (iOrdinal == 0) {
            iG = kotlin.jvm.internal.i.g((int) (j & 4294967295L), (int) (4294967295L & j10));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iG = kotlin.jvm.internal.i.g((int) (j >> 32), (int) (j10 >> 32));
        }
        if (iG >= 0 || this.f9917y || this.f9914v || (fVarS1 = S1()) == null || !T1(fVarS1, j10)) {
            return;
        }
        this.f9915w = true;
    }

    public final boolean T1(I.f fVar, long j) {
        long jV1 = V1(fVar, j);
        return Math.abs(Float.intBitsToFloat((int) (jV1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jV1 & 4294967295L))) <= 0.5f;
    }

    public final void U1() {
        c cVar = this.f9911s;
        if (cVar == null) {
            cVar = (c) C1183d.a(this, BringIntoViewSpec_androidKt.f9905a);
        }
        if (this.f9917y) {
            p245u.c.c("launchAnimation called when previous animation was running");
        }
        c.f10004a.getClass();
        C2680e.c(E1(), null, CoroutineStart.f43169e, new ContentInViewNode$launchAnimation$2(this, new z(c.a.f10006b), cVar, null), 1);
    }

    public final long V1(I.f fVar, long j) {
        long jFloatToRawIntBits;
        long j10;
        long jK = A.k(j);
        int iOrdinal = this.f9908p.ordinal();
        if (iOrdinal == 0) {
            c cVar = this.f9911s;
            if (cVar == null) {
                cVar = (c) C1183d.a(this, BringIntoViewSpec_androidKt.f9905a);
            }
            float f10 = fVar.f3760d;
            float f11 = fVar.f3758b;
            float fA = cVar.a(f11, f10 - f11, Float.intBitsToFloat((int) (jK & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j10 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar2 = this.f9911s;
            if (cVar2 == null) {
                cVar2 = (c) C1183d.a(this, BringIntoViewSpec_androidKt.f9905a);
            }
            float f12 = fVar.f3759c;
            float f13 = fVar.f3757a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(cVar2.a(f13, f12 - f13, Float.intBitsToFloat((int) (jK >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j10 = jFloatToRawIntBits3 << 32;
        }
        return j10 | (jFloatToRawIntBits & 4294967295L);
    }
}
