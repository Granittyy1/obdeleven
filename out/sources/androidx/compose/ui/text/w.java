package androidx.compose.ui.text;

import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.text.style.TextForegroundStyle;
import com.google.android.gms.internal.measurement.Y;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15705a = G0.a.g(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15706b = G0.a.g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f15707c = androidx.compose.ui.graphics.H.f13503k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TextForegroundStyle f15708d;

    static {
        long j = androidx.compose.ui.graphics.H.f13495b;
        f15708d = j != 16 ? new androidx.compose.ui.text.style.c(j) : TextForegroundStyle.a.f15653a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0162  */
    /* JADX WARN: Code duplicated, block: B:104:0x0165  */
    /* JADX WARN: Code duplicated, block: B:106:0x0168  */
    /* JADX WARN: Code duplicated, block: B:108:0x016d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0176  */
    /* JADX WARN: Code duplicated, block: B:113:0x017b  */
    /* JADX WARN: Code duplicated, block: B:114:0x017e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0182  */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:119:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x018c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:84:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x0158  */
    public static final v a(v vVar, long j, androidx.compose.ui.graphics.C c10, float f10, long j10, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.d dVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.j jVar2, Z.c cVar, long j12, androidx.compose.ui.text.style.h hVar, k0 k0Var, s sVar, J.f fVar) {
        k0 k0Var2;
        J.f fVar2;
        TextForegroundStyle cVar2;
        long j13;
        androidx.compose.ui.text.font.l lVar2;
        androidx.compose.ui.text.font.j jVar3;
        androidx.compose.ui.text.style.a aVar2;
        androidx.compose.ui.text.style.j jVar4;
        Z.c cVar3;
        long j14;
        androidx.compose.ui.text.style.h hVar2;
        s sVar2;
        J.f fVar3;
        long jI;
        androidx.compose.ui.text.font.k kVar2 = kVar;
        androidx.compose.ui.text.font.d dVar2 = dVar;
        String str2 = str;
        long j15 = j11;
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        long j16 = j10 & 1095216660480L;
        if (((j16 == 0) || p013b0.n.a(j10, vVar.f15691b)) && ((c10 != null || j == 16 || androidx.compose.ui.graphics.H.c(j, vVar.f15690a.c())) && ((jVar == null || jVar.equals(vVar.f15693d)) && ((lVar == null || lVar.equals(vVar.f15692c)) && ((dVar2 == null || dVar2 == vVar.f15695f) && (((j15 & 1095216660480L) == 0 || p013b0.n.a(j15, vVar.f15697h)) && ((hVar == null || hVar.equals(vVar.f15701m)) && kotlin.jvm.internal.i.a(c10, vVar.f15690a.e()) && ((c10 == null || f10 == vVar.f15690a.a()) && ((kVar2 == null || kVar2.equals(vVar.f15694e)) && ((str2 == null || str2.equals(vVar.f15696g)) && ((aVar == null || aVar.equals(vVar.f15698i)) && ((jVar2 == null || jVar2.equals(vVar.j)) && ((cVar == null || cVar.equals(vVar.f15699k)) && (j12 == 16 || androidx.compose.ui.graphics.H.c(j12, vVar.f15700l))))))))))))))) {
            k0Var2 = k0Var;
            if (k0Var2 == null || k0Var2.equals(vVar.f15702n)) {
                if (sVar == null || sVar.equals(vVar.f15703o)) {
                    fVar2 = fVar;
                    if (fVar2 == null || fVar2.equals(vVar.f15704p)) {
                        return vVar;
                    }
                }
                cVar2 = TextForegroundStyle.a.f15653a;
                if (c10 != null) {
                    if (c10 instanceof m0) {
                        jI = Y.i(f10, ((m0) c10).f13770a);
                        if (jI != 16) {
                            cVar2 = new androidx.compose.ui.text.style.c(jI);
                        }
                    } else {
                        if (!(c10 instanceof j0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar2 = new androidx.compose.ui.text.style.b((j0) c10, f10);
                    }
                } else if (j != 16) {
                    cVar2 = new androidx.compose.ui.text.style.c(j);
                }
                TextForegroundStyle textForegroundStyleD = vVar.f15690a.d(cVar2);
                if (dVar2 == null) {
                    dVar2 = vVar.f15695f;
                }
                if (j16 == 0) {
                    j13 = vVar.f15691b;
                } else {
                    j13 = j10;
                }
                if (lVar == null) {
                    lVar2 = vVar.f15692c;
                } else {
                    lVar2 = lVar;
                }
                if (jVar == null) {
                    jVar3 = vVar.f15693d;
                } else {
                    jVar3 = jVar;
                }
                if (kVar2 == null) {
                    kVar2 = vVar.f15694e;
                }
                if (str2 == null) {
                    str2 = vVar.f15696g;
                }
                if ((j15 & 1095216660480L) == 0) {
                    j15 = vVar.f15697h;
                }
                if (aVar == null) {
                    aVar2 = vVar.f15698i;
                } else {
                    aVar2 = aVar;
                }
                if (jVar2 == null) {
                    jVar4 = vVar.j;
                } else {
                    jVar4 = jVar2;
                }
                if (cVar == null) {
                    cVar3 = vVar.f15699k;
                } else {
                    cVar3 = cVar;
                }
                if (j12 != 16) {
                    j14 = j12;
                } else {
                    j14 = vVar.f15700l;
                }
                long j17 = j14;
                if (hVar == null) {
                    hVar2 = vVar.f15701m;
                } else {
                    hVar2 = hVar;
                }
                if (k0Var2 == null) {
                    k0Var2 = vVar.f15702n;
                }
                sVar2 = vVar.f15703o;
                if (sVar2 == null) {
                    sVar2 = sVar;
                }
                if (fVar2 == null) {
                    fVar3 = vVar.f15704p;
                } else {
                    fVar3 = fVar2;
                }
                return new v(textForegroundStyleD, j13, lVar2, jVar3, kVar2, dVar2, str2, j15, aVar2, jVar4, cVar3, j17, hVar2, k0Var2, sVar2, fVar3);
            }
            fVar2 = fVar;
            cVar2 = TextForegroundStyle.a.f15653a;
            if (c10 != null) {
                if (c10 instanceof m0) {
                    jI = Y.i(f10, ((m0) c10).f13770a);
                    if (jI != 16) {
                        cVar2 = new androidx.compose.ui.text.style.c(jI);
                    }
                } else {
                    if (!(c10 instanceof j0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2 = new androidx.compose.ui.text.style.b((j0) c10, f10);
                }
            } else if (j != 16) {
                cVar2 = new androidx.compose.ui.text.style.c(j);
            }
            TextForegroundStyle textForegroundStyleD2 = vVar.f15690a.d(cVar2);
            if (dVar2 == null) {
                dVar2 = vVar.f15695f;
            }
            if (j16 == 0) {
                j13 = vVar.f15691b;
            } else {
                j13 = j10;
            }
            if (lVar == null) {
                lVar2 = vVar.f15692c;
            } else {
                lVar2 = lVar;
            }
            if (jVar == null) {
                jVar3 = vVar.f15693d;
            } else {
                jVar3 = jVar;
            }
            if (kVar2 == null) {
                kVar2 = vVar.f15694e;
            }
            if (str2 == null) {
                str2 = vVar.f15696g;
            }
            if ((j15 & 1095216660480L) == 0) {
                j15 = vVar.f15697h;
            }
            if (aVar == null) {
                aVar2 = vVar.f15698i;
            } else {
                aVar2 = aVar;
            }
            if (jVar2 == null) {
                jVar4 = vVar.j;
            } else {
                jVar4 = jVar2;
            }
            if (cVar == null) {
                cVar3 = vVar.f15699k;
            } else {
                cVar3 = cVar;
            }
            if (j12 != 16) {
                j14 = j12;
            } else {
                j14 = vVar.f15700l;
            }
            long j18 = j14;
            if (hVar == null) {
                hVar2 = vVar.f15701m;
            } else {
                hVar2 = hVar;
            }
            if (k0Var2 == null) {
                k0Var2 = vVar.f15702n;
            }
            sVar2 = vVar.f15703o;
            if (sVar2 == null) {
                sVar2 = sVar;
            }
            if (fVar2 == null) {
                fVar3 = vVar.f15704p;
            } else {
                fVar3 = fVar2;
            }
            return new v(textForegroundStyleD2, j13, lVar2, jVar3, kVar2, dVar2, str2, j15, aVar2, jVar4, cVar3, j18, hVar2, k0Var2, sVar2, fVar3);
        }
        k0Var2 = k0Var;
        fVar2 = fVar;
        cVar2 = TextForegroundStyle.a.f15653a;
        if (c10 != null) {
            if (c10 instanceof m0) {
                jI = Y.i(f10, ((m0) c10).f13770a);
                if (jI != 16) {
                    cVar2 = new androidx.compose.ui.text.style.c(jI);
                }
            } else {
                if (!(c10 instanceof j0)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2 = new androidx.compose.ui.text.style.b((j0) c10, f10);
            }
        } else if (j != 16) {
            cVar2 = new androidx.compose.ui.text.style.c(j);
        }
        TextForegroundStyle textForegroundStyleD3 = vVar.f15690a.d(cVar2);
        if (dVar2 == null) {
            dVar2 = vVar.f15695f;
        }
        if (j16 == 0) {
            j13 = vVar.f15691b;
        } else {
            j13 = j10;
        }
        if (lVar == null) {
            lVar2 = vVar.f15692c;
        } else {
            lVar2 = lVar;
        }
        if (jVar == null) {
            jVar3 = vVar.f15693d;
        } else {
            jVar3 = jVar;
        }
        if (kVar2 == null) {
            kVar2 = vVar.f15694e;
        }
        if (str2 == null) {
            str2 = vVar.f15696g;
        }
        if ((j15 & 1095216660480L) == 0) {
            j15 = vVar.f15697h;
        }
        if (aVar == null) {
            aVar2 = vVar.f15698i;
        } else {
            aVar2 = aVar;
        }
        if (jVar2 == null) {
            jVar4 = vVar.j;
        } else {
            jVar4 = jVar2;
        }
        if (cVar == null) {
            cVar3 = vVar.f15699k;
        } else {
            cVar3 = cVar;
        }
        if (j12 != 16) {
            j14 = j12;
        } else {
            j14 = vVar.f15700l;
        }
        long j19 = j14;
        if (hVar == null) {
            hVar2 = vVar.f15701m;
        } else {
            hVar2 = hVar;
        }
        if (k0Var2 == null) {
            k0Var2 = vVar.f15702n;
        }
        sVar2 = vVar.f15703o;
        if (sVar2 == null) {
            sVar2 = sVar;
        }
        if (fVar2 == null) {
            fVar3 = vVar.f15704p;
        } else {
            fVar3 = fVar2;
        }
        return new v(textForegroundStyleD3, j13, lVar2, jVar3, kVar2, dVar2, str2, j15, aVar2, jVar4, cVar3, j19, hVar2, k0Var2, sVar2, fVar3);
    }

    public static final Object b(float f10, Object obj, Object obj2) {
        return ((double) f10) < 0.5d ? obj : obj2;
    }

    public static final long c(float f10, long j, long j10) {
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        long j11 = j & 1095216660480L;
        if (j11 != 0) {
            long j12 = 1095216660480L & j10;
            if (j12 != 0) {
                if (j11 == 0 || j12 == 0) {
                    p013b0.i.a("Cannot perform operation for Unspecified type.");
                }
                if (!p013b0.o.a(p013b0.n.b(j), p013b0.n.b(j10))) {
                    p013b0.i.a("Cannot perform operation for " + ((Object) p013b0.o.b(p013b0.n.b(j))) + " and " + ((Object) p013b0.o.b(p013b0.n.b(j10))));
                }
                return G0.a.i(D9.o.n(p013b0.n.c(j), p013b0.n.c(j10), f10), j11);
            }
        }
        return ((p013b0.n) b(f10, new p013b0.n(j), new p013b0.n(j10))).f20494a;
    }
}
