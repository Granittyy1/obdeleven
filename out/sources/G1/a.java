package G1;

import A1.C;
import A1.C0566a;
import A1.C0569d;
import A1.C0574i;
import A1.C0576k;
import A1.C0578m;
import A1.E;
import A1.F;
import A1.K;
import A1.p;
import A1.q;
import J4.i;
import androidx.media3.exoplayer.source.k;
import androidx.media3.extractor.flv.TagPayloadReader;
import com.braze.models.inappmessage.InAppMessageBase;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p078g1.n;
import p078g1.t;
import p114j1.r;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3350a = new r(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f3351b = new r(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f3352c = new r(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f3353d = new r();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f3354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f3355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3358i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.media3.extractor.flv.a f3363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.media3.extractor.flv.b f3364p;

    public a() {
        b bVar = new b(new C0578m());
        bVar.f3365b = -9223372036854775807L;
        bVar.f3366c = new long[0];
        bVar.f3367d = new long[0];
        this.f3354e = bVar;
        this.f3356g = 1;
    }

    public final r c(C0574i c0574i) throws IOException {
        int i10 = this.f3360l;
        r rVar = this.f3353d;
        byte[] bArr = rVar.f41062a;
        if (i10 > bArr.length) {
            rVar.E(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            rVar.G(0);
        }
        rVar.F(this.f3360l);
        c0574i.a(rVar.f41062a, 0, this.f3360l, false);
        return rVar;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        if (j == 0) {
            this.f3356g = 1;
            this.f3357h = false;
        } else {
            this.f3356g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029a  */
    /* JADX WARN: Code duplicated, block: B:139:0x037c  */
    /* JADX WARN: Code duplicated, block: B:142:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0395  */
    /* JADX WARN: Code duplicated, block: B:146:0x0399  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0284  */
    /* JADX WARN: Code duplicated, block: B:96:0x0287  */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        long j;
        long j10;
        int i10;
        boolean z10;
        boolean z11;
        long j11;
        p241t7.b.l(this.f3355f);
        while (true) {
            int i11 = this.f3356g;
            if (i11 == 1) {
                r rVar = this.f3351b;
                if (!((C0574i) qVar).a(rVar.f41062a, 0, 9, true)) {
                    return -1;
                }
                rVar.G(0);
                rVar.H(4);
                int iU = rVar.u();
                boolean z12 = (iU & 4) != 0;
                boolean z13 = (iU & 1) != 0;
                if (z12 && this.f3363o == null) {
                    this.f3363o = new androidx.media3.extractor.flv.a(this.f3355f.p(8, 1));
                }
                if (z13 && this.f3364p == null) {
                    this.f3364p = new androidx.media3.extractor.flv.b(this.f3355f.p(9, 2));
                }
                this.f3355f.j();
                this.j = rVar.h() - 5;
                this.f3356g = 2;
            } else if (i11 == 2) {
                ((C0574i) qVar).i(this.j);
                this.j = 0;
                this.f3356g = 3;
            } else if (i11 == 3) {
                r rVar2 = this.f3352c;
                if (!((C0574i) qVar).a(rVar2.f41062a, 0, 11, true)) {
                    return -1;
                }
                rVar2.G(0);
                this.f3359k = rVar2.u();
                this.f3360l = rVar2.x();
                this.f3361m = rVar2.x();
                this.f3361m = (((long) (rVar2.u() << 24)) | this.f3361m) * 1000;
                rVar2.H(3);
                this.f3356g = 4;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                boolean z14 = this.f3357h;
                b bVar = this.f3354e;
                if (z14) {
                    j = this.f3358i + this.f3361m;
                } else {
                    if (bVar.f3365b == -9223372036854775807L) {
                        j10 = 0;
                    } else {
                        j = this.f3361m;
                    }
                    i10 = this.f3359k;
                    if (i10 == 8 || this.f3363o == null) {
                        if (i10 == 9 || this.f3364p == null) {
                            if (i10 == 18 || this.f3362n) {
                                ((C0574i) qVar).i(this.f3360l);
                                z10 = false;
                            } else {
                                r rVarC = c((C0574i) qVar);
                                bVar.getClass();
                                bVar.getClass();
                                if (rVarC.u() == 2 && "onMetaData".equals(b.c(rVarC)) && rVarC.a() != 0 && rVarC.u() == 8) {
                                    HashMap<String, Object> mapB = b.b(rVarC);
                                    Object obj = mapB.get(InAppMessageBase.DURATION);
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            bVar.f3365b = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapB.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            bVar.f3366c = new long[size];
                                            bVar.f3367d = new long[size];
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj5 = list.get(i12);
                                                Object obj6 = list2.get(i12);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    bVar.f3366c = new long[0];
                                                    bVar.f3367d = new long[0];
                                                    break;
                                                }
                                                bVar.f3366c[i12] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                bVar.f3367d[i12] = ((Double) obj5).longValue();
                                                i12++;
                                                list = list;
                                            }
                                        }
                                    }
                                }
                                long j12 = bVar.f3365b;
                                if (j12 != -9223372036854775807L) {
                                    this.f3355f.g(new C(j12, bVar.f3367d, bVar.f3366c));
                                    this.f3362n = true;
                                }
                                z10 = true;
                            }
                            z11 = false;
                        } else {
                            if (!this.f3362n) {
                                this.f3355f.g(new F.b(-9223372036854775807L));
                                this.f3362n = true;
                            }
                            androidx.media3.extractor.flv.b bVar2 = this.f3364p;
                            r rVarC2 = c((C0574i) qVar);
                            bVar2.getClass();
                            int iU2 = rVarC2.u();
                            int i13 = (iU2 >> 4) & 15;
                            int i14 = iU2 & 15;
                            if (i14 != 7) {
                                throw new TagPayloadReader.UnsupportedFormatException(i.b(i14, "Video format not supported: "));
                            }
                            bVar2.f18844g = i13;
                            if (i13 != 5) {
                                int iU3 = rVarC2.u();
                                byte[] bArr = rVarC2.f41062a;
                                int i15 = rVarC2.f41063b;
                                int i16 = i15 + 1;
                                rVarC2.f41063b = i16;
                                int i17 = ((bArr[i15] & 255) << 24) >> 8;
                                int i18 = i15 + 2;
                                rVarC2.f41063b = i18;
                                int i19 = ((bArr[i16] & 255) << 8) | i17;
                                rVarC2.f41063b = i15 + 3;
                                long j13 = (((long) ((bArr[i18] & 255) | i19)) * 1000) + j10;
                                boolean z15 = true;
                                K k10 = bVar2.f18834a;
                                if (iU3 != 0 || bVar2.f18842e) {
                                    if (iU3 == 1 && bVar2.f18842e) {
                                        int i20 = bVar2.f18844g == 1 ? 1 : 0;
                                        if (bVar2.f18843f || i20 != 0) {
                                            r rVar3 = bVar2.f18840c;
                                            byte[] bArr2 = rVar3.f41062a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i21 = 4 - bVar2.f18841d;
                                            int i22 = 0;
                                            while (rVarC2.a() > 0) {
                                                rVarC2.f(rVar3.f41062a, i21, bVar2.f18841d);
                                                rVar3.G(0);
                                                int iY = rVar3.y();
                                                r rVar4 = bVar2.f18839b;
                                                rVar4.G(0);
                                                k10.a(4, rVar4);
                                                k10.a(iY, rVarC2);
                                                i22 = i22 + 4 + iY;
                                            }
                                            bVar2.f18834a.b(j13, i20, i22, 0, null);
                                            bVar2.f18843f = true;
                                        }
                                    }
                                    if (z15) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    byte[] bArr3 = new byte[rVarC2.a()];
                                    r rVar5 = new r(bArr3);
                                    rVarC2.f(bArr3, 0, rVarC2.a());
                                    C0569d c0569dA = C0569d.a(rVar5);
                                    bVar2.f18841d = c0569dA.f475b;
                                    n.a aVar = new n.a();
                                    aVar.f35337l = t.m("video/x-flv");
                                    aVar.f35338m = t.m("video/avc");
                                    aVar.j = c0569dA.f484l;
                                    aVar.f35345t = c0569dA.f476c;
                                    aVar.f35346u = c0569dA.f477d;
                                    aVar.f35349x = c0569dA.f483k;
                                    aVar.f35341p = c0569dA.f474a;
                                    C0576k.b(aVar, k10);
                                    bVar2.f18842e = true;
                                }
                                z15 = false;
                                if (z15) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                        }
                        if (!this.f3357h && z11) {
                            this.f3357h = true;
                            if (bVar.f3365b == -9223372036854775807L) {
                                j11 = -this.f3361m;
                            } else {
                                j11 = 0;
                            }
                            this.f3358i = j11;
                        }
                        this.j = 4;
                        this.f3356g = 2;
                        if (z10) {
                            return 0;
                        }
                    } else {
                        if (!this.f3362n) {
                            this.f3355f.g(new F.b(-9223372036854775807L));
                            this.f3362n = true;
                        }
                        androidx.media3.extractor.flv.a aVar2 = this.f3363o;
                        r rVarC3 = c((C0574i) qVar);
                        if (aVar2.f18836b) {
                            rVarC3.H(1);
                        } else {
                            int iU4 = rVarC3.u();
                            int i23 = (iU4 >> 4) & 15;
                            aVar2.f18838d = i23;
                            K k11 = aVar2.f18834a;
                            if (i23 == 2) {
                                int i24 = androidx.media3.extractor.flv.a.f18835e[(iU4 >> 2) & 3];
                                n.a aVar3 = new n.a();
                                aVar3.f35337l = t.m("video/x-flv");
                                aVar3.f35338m = t.m("audio/mpeg");
                                aVar3.f35317C = 1;
                                aVar3.f35318D = i24;
                                C0576k.b(aVar3, k11);
                                aVar2.f18837c = true;
                            } else if (i23 == 7 || i23 == 8) {
                                String str = i23 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                n.a aVar4 = new n.a();
                                aVar4.f35337l = t.m("video/x-flv");
                                aVar4.f35338m = t.m(str);
                                aVar4.f35317C = 1;
                                aVar4.f35318D = 8000;
                                C0576k.b(aVar4, k11);
                                aVar2.f18837c = true;
                            } else if (i23 != 10) {
                                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + aVar2.f18838d);
                            }
                            aVar2.f18836b = true;
                        }
                        int i25 = aVar2.f18838d;
                        K k12 = aVar2.f18834a;
                        z11 = true;
                        if (i25 == 2) {
                            int iA = rVarC3.a();
                            k12.a(iA, rVarC3);
                            aVar2.f18834a.b(j10, 1, iA, 0, null);
                        } else {
                            int iU5 = rVarC3.u();
                            if (iU5 == 0 && !aVar2.f18837c) {
                                int iA2 = rVarC3.a();
                                byte[] bArr4 = new byte[iA2];
                                rVarC3.f(bArr4, 0, iA2);
                                C0566a.C0000a c0000aB = C0566a.b(new p114j1.q(iA2, bArr4), false);
                                n.a aVar5 = new n.a();
                                aVar5.f35337l = t.m("video/x-flv");
                                aVar5.f35338m = t.m("audio/mp4a-latm");
                                aVar5.j = c0000aB.f457c;
                                aVar5.f35317C = c0000aB.f456b;
                                aVar5.f35318D = c0000aB.f455a;
                                aVar5.f35341p = Collections.singletonList(bArr4);
                                C0576k.b(aVar5, k12);
                                aVar2.f18837c = true;
                            } else if (aVar2.f18838d != 10 || iU5 == 1) {
                                int iA3 = rVarC3.a();
                                k12.a(iA3, rVarC3);
                                aVar2.f18834a.b(j10, 1, iA3, 0, null);
                            }
                            z11 = false;
                        }
                    }
                    z10 = true;
                    if (!this.f3357h) {
                        this.f3357h = true;
                        if (bVar.f3365b == -9223372036854775807L) {
                            j11 = -this.f3361m;
                        } else {
                            j11 = 0;
                        }
                        this.f3358i = j11;
                    }
                    this.j = 4;
                    this.f3356g = 2;
                    if (z10) {
                        return 0;
                    }
                }
                j10 = j;
                i10 = this.f3359k;
                if (i10 == 8) {
                    if (i10 == 9) {
                    }
                    if (i10 == 18) {
                        ((C0574i) qVar).i(this.f3360l);
                        z10 = false;
                    } else {
                        ((C0574i) qVar).i(this.f3360l);
                        z10 = false;
                    }
                    z11 = false;
                } else {
                    if (i10 == 9) {
                    }
                    if (i10 == 18) {
                        ((C0574i) qVar).i(this.f3360l);
                        z10 = false;
                    } else {
                        ((C0574i) qVar).i(this.f3360l);
                        z10 = false;
                    }
                    z11 = false;
                }
                if (!this.f3357h) {
                    this.f3357h = true;
                    if (bVar.f3365b == -9223372036854775807L) {
                        j11 = -this.f3361m;
                    } else {
                        j11 = 0;
                    }
                    this.f3358i = j11;
                }
                this.j = 4;
                this.f3356g = 2;
                if (z10) {
                    return 0;
                }
            }
        }
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        r rVar = this.f3350a;
        C0574i c0574i = (C0574i) qVar;
        c0574i.c(rVar.f41062a, 0, 3, false);
        rVar.G(0);
        if (rVar.x() != 4607062) {
            return false;
        }
        c0574i.c(rVar.f41062a, 0, 2, false);
        rVar.G(0);
        if ((rVar.A() & androidx.recyclerview.widget.t.d.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        c0574i.c(rVar.f41062a, 0, 4, false);
        rVar.G(0);
        int iH = rVar.h();
        c0574i.f525f = 0;
        c0574i.k(iH, false);
        c0574i.c(rVar.f41062a, 0, 4, false);
        rVar.G(0);
        return rVar.h() == 0;
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f3355f = (k) rVar;
    }

    @Override // A1.p
    public final void a() {
    }
}
