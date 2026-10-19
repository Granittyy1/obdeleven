package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final void a(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = d14;
        double d20 = (d16 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d20);
        double dSin = Math.sin(d20);
        double d21 = ((d11 * dSin) + (d10 * dCos)) / d19;
        double d22 = ((d11 * dCos) + ((-d10) * dSin)) / d15;
        double d23 = ((d13 * dSin) + (d12 * dCos)) / d19;
        double d24 = ((d13 * dCos) + ((-d12) * dSin)) / d15;
        double d25 = d21 - d23;
        double d26 = d22 - d24;
        double d27 = 2;
        double d28 = (d21 + d23) / d27;
        double d29 = (d22 + d24) / d27;
        double d30 = (d26 * d26) + (d25 * d25);
        if (d30 == 0.0d) {
            return;
        }
        double d31 = (1.0d / d30) - 0.25d;
        if (d31 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d30) / 1.99999d);
            a(path, d10, d11, d12, d13, d19 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d31);
        double d32 = d25 * dSqrt2;
        double d33 = dSqrt2 * d26;
        if (z10 == z11) {
            d17 = d28 - d33;
            d18 = d29 + d32;
        } else {
            d17 = d28 + d33;
            d18 = d29 - d32;
        }
        double dAtan2 = Math.atan2(d22 - d18, d21 - d17);
        double dAtan3 = Math.atan2(d24 - d18, d23 - d17) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d34 = d17 * d19;
        double d35 = d18 * d15;
        double d36 = (d34 * dCos) - (d35 * dSin);
        double d37 = (d35 * dCos) + (d34 * dSin);
        double d38 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d38) / 3.141592653589793d));
        double dCos2 = Math.cos(d20);
        double dSin2 = Math.sin(d20);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d39 = -d19;
        double d40 = d39 * dCos2;
        double d41 = d15 * dSin2;
        double d42 = (d40 * dSin3) - (d41 * dCos3);
        double d43 = d39 * dSin2;
        double d44 = d15 * dCos2;
        double d45 = (dCos3 * d44) + (dSin3 * d43);
        double d46 = dAtan3 / ((double) iCeil);
        double d47 = d10;
        double d48 = dAtan2;
        double d49 = d42;
        int i10 = 0;
        double d50 = d45;
        double d51 = d11;
        while (i10 < iCeil) {
            double d52 = d48 + d46;
            double dSin4 = Math.sin(d52);
            double dCos4 = Math.cos(d52);
            double d53 = d46;
            double d54 = (((d19 * dCos2) * dCos4) + d36) - (d41 * dSin4);
            int i11 = iCeil;
            double d55 = (d44 * dSin4) + (d19 * dSin2 * dCos4) + d37;
            double d56 = (d40 * dSin4) - (d41 * dCos4);
            double d57 = (dCos4 * d44) + (dSin4 * d43);
            double d58 = d52 - d48;
            double dTan = Math.tan(d58 / d27);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d38) - ((double) 1)) * Math.sin(d58)) / ((double) 3);
            path.m((float) ((d49 * dSqrt3) + d47), (float) ((d50 * dSqrt3) + d51), (float) (d54 - (dSqrt3 * d56)), (float) (d55 - (dSqrt3 * d57)), (float) d54, (float) d55);
            i10++;
            dSin2 = dSin2;
            dCos2 = dCos2;
            d47 = d54;
            d51 = d55;
            iCeil = i11;
            d48 = d52;
            d50 = d57;
            d49 = d56;
            d46 = d53;
            d19 = d14;
        }
    }

    public static final void b(List list, Path path) {
        e eVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        List list2 = list;
        Path path2 = path;
        int i10 = path.i();
        path.o();
        path2.g(i10);
        e eVar2 = list.isEmpty() ? e.b.f13907c : (e) list2.get(0);
        int size = list2.size();
        float f23 = 0.0f;
        int i11 = 0;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        float f29 = 0.0f;
        while (i11 < size) {
            e eVar3 = (e) list2.get(i11);
            if (eVar3 instanceof e.b) {
                path.close();
                eVar3 = eVar3;
                f23 = f23;
                i11 = i11;
                size = size;
                f24 = f28;
                f26 = f24;
                f25 = f29;
            } else {
                if (eVar3 instanceof e.n) {
                    e.n nVar = (e.n) eVar3;
                    float f30 = nVar.f13945c;
                    f26 += f30;
                    float f31 = nVar.f13946d;
                    f27 += f31;
                    path2.c(f30, f31);
                    f28 = f26;
                    f29 = f27;
                } else if (eVar3 instanceof e.f) {
                    e.f fVar = (e.f) eVar3;
                    float f32 = fVar.f13917c;
                    float f33 = fVar.f13918d;
                    path2.l(f32, f33);
                    f27 = f33;
                    f29 = f27;
                    f26 = f32;
                    f28 = f26;
                } else if (eVar3 instanceof e.m) {
                    e.m mVar = (e.m) eVar3;
                    float f34 = mVar.f13943c;
                    float f35 = mVar.f13944d;
                    path2.r(f34, f35);
                    f26 += mVar.f13943c;
                    f27 += f35;
                } else {
                    if (eVar3 instanceof e.C0157e) {
                        e.C0157e c0157e = (e.C0157e) eVar3;
                        float f36 = c0157e.f13915c;
                        f14 = c0157e.f13916d;
                        path2.t(f36, f14);
                        f26 = c0157e.f13915c;
                    } else if (eVar3 instanceof e.l) {
                        e.l lVar = (e.l) eVar3;
                        path2.r(lVar.f13942c, f23);
                        f26 += lVar.f13942c;
                    } else if (eVar3 instanceof e.d) {
                        e.d dVar = (e.d) eVar3;
                        path2.t(dVar.f13914c, f27);
                        f26 = dVar.f13914c;
                    } else if (eVar3 instanceof e.r) {
                        e.r rVar = (e.r) eVar3;
                        path2.r(f23, rVar.f13957c);
                        f27 += rVar.f13957c;
                    } else if (eVar3 instanceof e.s) {
                        e.s sVar = (e.s) eVar3;
                        path2.t(f26, sVar.f13958c);
                        f27 = sVar.f13958c;
                    } else {
                        if (eVar3 instanceof e.k) {
                            e.k kVar = (e.k) eVar3;
                            path.d(kVar.f13936c, kVar.f13937d, kVar.f13938e, kVar.f13939f, kVar.f13940g, kVar.f13941h);
                            f12 = kVar.f13938e + f26;
                            f13 = kVar.f13939f + f27;
                            f26 += kVar.f13940g;
                            f22 = kVar.f13941h;
                        } else {
                            if (eVar3 instanceof e.c) {
                                e.c cVar = (e.c) eVar3;
                                path.m(cVar.f13908c, cVar.f13909d, cVar.f13910e, cVar.f13911f, cVar.f13912g, cVar.f13913h);
                                f12 = cVar.f13910e;
                                f17 = cVar.f13911f;
                                f18 = cVar.f13912g;
                                f19 = cVar.f13913h;
                            } else {
                                if (eVar3 instanceof e.p) {
                                    if (eVar2.f13898a) {
                                        f21 = f27 - f25;
                                        f20 = f26 - f24;
                                    } else {
                                        f20 = f23;
                                        f21 = f20;
                                    }
                                    e.p pVar = (e.p) eVar3;
                                    path.d(f20, f21, pVar.f13951c, pVar.f13952d, pVar.f13953e, pVar.f13954f);
                                    f12 = pVar.f13951c + f26;
                                    f13 = pVar.f13952d + f27;
                                    f26 += pVar.f13953e;
                                    f22 = pVar.f13954f;
                                } else if (eVar3 instanceof e.h) {
                                    if (eVar2.f13898a) {
                                        float f37 = 2;
                                        f16 = (f37 * f27) - f25;
                                        f15 = (f26 * f37) - f24;
                                    } else {
                                        f15 = f26;
                                        f16 = f27;
                                    }
                                    e.h hVar = (e.h) eVar3;
                                    path.m(f15, f16, hVar.f13923c, hVar.f13924d, hVar.f13925e, hVar.f13926f);
                                    f12 = hVar.f13923c;
                                    f17 = hVar.f13924d;
                                    f18 = hVar.f13925e;
                                    f19 = hVar.f13926f;
                                } else if (eVar3 instanceof e.o) {
                                    e.o oVar = (e.o) eVar3;
                                    float f38 = oVar.f13947c;
                                    float f39 = oVar.f13948d;
                                    float f40 = oVar.f13949e;
                                    float f41 = oVar.f13950f;
                                    path2.a(f38, f39, f40, f41);
                                    float f42 = oVar.f13947c + f26;
                                    f25 = f39 + f27;
                                    f26 += f40;
                                    f27 += f41;
                                    f24 = f42;
                                } else if (eVar3 instanceof e.g) {
                                    e.g gVar = (e.g) eVar3;
                                    float f43 = gVar.f13919c;
                                    f25 = gVar.f13920d;
                                    float f44 = gVar.f13921e;
                                    f14 = gVar.f13922f;
                                    path2.h(f43, f25, f44, f14);
                                    f24 = gVar.f13919c;
                                    f26 = f44;
                                } else if (eVar3 instanceof e.q) {
                                    if (eVar2.f13899b) {
                                        f10 = f26 - f24;
                                        f11 = f27 - f25;
                                    } else {
                                        f10 = f23;
                                        f11 = f10;
                                    }
                                    e.q qVar = (e.q) eVar3;
                                    float f45 = qVar.f13955c;
                                    float f46 = qVar.f13956d;
                                    path2.a(f10, f11, f45, f46);
                                    f12 = f10 + f26;
                                    f13 = f11 + f27;
                                    f26 += qVar.f13955c;
                                    f27 += f46;
                                    f25 = f13;
                                    f24 = f12;
                                } else if (eVar3 instanceof e.i) {
                                    if (eVar2.f13899b) {
                                        float f47 = 2;
                                        f26 = (f26 * f47) - f24;
                                        f27 = (f47 * f27) - f25;
                                    }
                                    e.i iVar = (e.i) eVar3;
                                    float f48 = iVar.f13927c;
                                    float f49 = iVar.f13928d;
                                    path2.h(f26, f27, f48, f49);
                                    f24 = f26;
                                    eVar3 = eVar3;
                                    f23 = f23;
                                    i11 = i11;
                                    size = size;
                                    f26 = iVar.f13927c;
                                    float f50 = f27;
                                    f27 = f49;
                                    f25 = f50;
                                } else {
                                    if (eVar3 instanceof e.j) {
                                        e.j jVar = (e.j) eVar3;
                                        float f51 = jVar.f13934h + f26;
                                        float f52 = jVar.f13935i + f27;
                                        i11 = i11;
                                        eVar = eVar3;
                                        f23 = 0.0f;
                                        size = size;
                                        a(path, f26, f27, f51, f52, jVar.f13929c, jVar.f13930d, jVar.f13931e, jVar.f13932f, jVar.f13933g);
                                        f24 = f51;
                                        f26 = f24;
                                        f25 = f52;
                                        f27 = f25;
                                    } else {
                                        eVar = eVar3;
                                        f23 = f23;
                                        i11 = i11;
                                        size = size;
                                        if (eVar instanceof e.a) {
                                            e.a aVar = (e.a) eVar;
                                            double d10 = aVar.f13905h;
                                            float f53 = aVar.f13906i;
                                            eVar3 = eVar;
                                            a(path, f26, f27, d10, f53, aVar.f13900c, aVar.f13901d, aVar.f13902e, aVar.f13903f, aVar.f13904g);
                                            f24 = aVar.f13905h;
                                            f26 = f24;
                                            f25 = f53;
                                        }
                                    }
                                    eVar3 = eVar;
                                }
                                i11++;
                                list2 = list;
                                path2 = path;
                                f23 = f23;
                                eVar2 = eVar3;
                                size = size;
                            }
                            f26 = f18;
                            f27 = f19;
                            f25 = f17;
                            f24 = f12;
                            i11++;
                            list2 = list;
                            path2 = path;
                            f23 = f23;
                            eVar2 = eVar3;
                            size = size;
                        }
                        f27 += f22;
                        f25 = f13;
                        f24 = f12;
                        i11++;
                        list2 = list;
                        path2 = path;
                        f23 = f23;
                        eVar2 = eVar3;
                        size = size;
                    }
                    f27 = f14;
                }
                eVar3 = eVar3;
                f23 = f23;
                i11 = i11;
                size = size;
                i11++;
                list2 = list;
                path2 = path;
                f23 = f23;
                eVar2 = eVar3;
                size = size;
            }
            f27 = f25;
            i11++;
            list2 = list;
            path2 = path;
            f23 = f23;
            eVar2 = eVar3;
            size = size;
        }
    }
}
