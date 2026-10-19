package p104i3;

import Z3.n;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import java.util.ArrayList;
import java.util.List;
import p116j3.a;
import p116j3.d;

/* JADX INFO: compiled from: PolystarContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k, a.InterfaceC0468a, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieDrawable f36676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PolystarShape.Type f36677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f36680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a<?, PointF> f36681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f36682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f36683i;
    public final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f36684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f36685l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f36687n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f36675a = new Path();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2126g f36686m = new C2126g();

    public l(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.f36676b = lottieDrawable;
        String str = polystarShape.f23399a;
        PolystarShape.Type type = polystarShape.f23400b;
        this.f36677c = type;
        this.f36678d = polystarShape.j;
        this.f36679e = polystarShape.f23408k;
        a<?, ?> aVarA = polystarShape.f23401c.a();
        this.f36680f = (d) aVarA;
        a<PointF, PointF> aVarA2 = polystarShape.f23402d.a();
        this.f36681g = aVarA2;
        a<?, ?> aVarA3 = polystarShape.f23403e.a();
        this.f36682h = (d) aVarA3;
        a<?, ?> aVarA4 = polystarShape.f23405g.a();
        this.j = (d) aVarA4;
        a<?, ?> aVarA5 = polystarShape.f23407i.a();
        this.f36685l = (d) aVarA5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f36683i = (d) polystarShape.f23404f.a();
            this.f36684k = (d) polystarShape.f23406h.a();
        } else {
            this.f36683i = null;
            this.f36684k = null;
        }
        aVar.d(aVarA);
        aVar.d(aVarA2);
        aVar.d(aVarA3);
        aVar.d(aVarA4);
        aVar.d(aVarA5);
        if (type == type2) {
            aVar.d(this.f36683i);
            aVar.d(this.f36684k);
        }
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
        aVarA4.a(this);
        aVarA5.a(this);
        if (type == type2) {
            this.f36683i.a(this);
            this.f36684k.a(this);
        }
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36687n = false;
        this.f36676b.invalidateSelf();
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 >= arrayList.size()) {
                return;
            }
            b bVar = (b) arrayList.get(i10);
            if (bVar instanceof s) {
                s sVar = (s) bVar;
                if (sVar.f36719c == ShapeTrimPath.Type.f23429b) {
                    ((ArrayList) this.f36686m.f30991b).add(sVar);
                    sVar.d(this);
                }
            }
            i10++;
        }
    }

    @Override // p104i3.k
    public final Path getPath() {
        l lVar;
        float fCos;
        float f10;
        double d10;
        float fSin;
        float f11;
        Path path;
        Path path2;
        float f12;
        double d11;
        boolean z10 = this.f36687n;
        Path path3 = this.f36675a;
        if (z10) {
            return path3;
        }
        path3.reset();
        if (this.f36678d) {
            this.f36687n = true;
            return path3;
        }
        int iOrdinal = this.f36677c.ordinal();
        a<?, PointF> aVar = this.f36681g;
        d dVar = this.j;
        d dVar2 = this.f36685l;
        double dFloatValue = 0.0d;
        d dVar3 = this.f36682h;
        d dVar4 = this.f36680f;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                lVar = this;
            } else {
                int iFloor = (int) Math.floor(dVar4.e().floatValue());
                if (dVar3 != null) {
                    dFloatValue = dVar3.e().floatValue();
                }
                double radians = Math.toRadians(dFloatValue - 90.0d);
                double d12 = iFloor;
                float fFloatValue = dVar2.e().floatValue() / 100.0f;
                float fFloatValue2 = dVar.e().floatValue();
                double d13 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d13);
                float fSin2 = (float) (Math.sin(radians) * d13);
                path3.moveTo(fCos2, fSin2);
                double d14 = (float) (6.283185307179586d / d12);
                double d15 = radians + d14;
                double dCeil = Math.ceil(d12);
                int i10 = 0;
                while (i10 < dCeil) {
                    float fCos3 = (float) (Math.cos(d15) * d13);
                    int i11 = i10;
                    float fSin3 = (float) (Math.sin(d15) * d13);
                    if (fFloatValue != 0.0f) {
                        double d16 = d13;
                        double dAtan2 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                        float fCos4 = (float) Math.cos(dAtan2);
                        float fSin4 = (float) Math.sin(dAtan2);
                        double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                        float f13 = fFloatValue2 * fFloatValue * 0.25f;
                        d11 = d16;
                        path3.cubicTo(fCos2 - (fCos4 * f13), fSin2 - (fSin4 * f13), fCos3 + (((float) Math.cos(dAtan3)) * f13), (f13 * ((float) Math.sin(dAtan3))) + fSin3, fCos3, fSin3);
                    } else {
                        d11 = d13;
                        path3.lineTo(fCos3, fSin3);
                    }
                    fSin2 = fSin3;
                    fFloatValue2 = fFloatValue2;
                    i10 = i11 + 1;
                    d13 = d11;
                    d15 += d14;
                    fCos2 = fCos3;
                }
                PointF pointFE = aVar.e();
                path3.offset(pointFE.x, pointFE.y);
                path3.close();
                lVar = this;
            }
            path = path3;
        } else {
            float fFloatValue3 = dVar4.e().floatValue();
            double radians2 = Math.toRadians((dVar3 != null ? dVar3.e().floatValue() : 0.0d) - 90.0d);
            double d17 = fFloatValue3;
            float f14 = (float) (6.283185307179586d / d17);
            lVar = this;
            if (lVar.f36679e) {
                f14 *= -1.0f;
            }
            float f15 = f14;
            float f16 = f15 / 2.0f;
            float f17 = fFloatValue3 - ((int) fFloatValue3);
            if (f17 != 0.0f) {
                radians2 += (double) ((1.0f - f17) * f16);
            }
            float fFloatValue4 = dVar.e().floatValue();
            float fFloatValue5 = lVar.f36683i.e().floatValue();
            d dVar5 = lVar.f36684k;
            float fFloatValue6 = dVar5 != null ? dVar5.e().floatValue() / 100.0f : 0.0f;
            float fFloatValue7 = dVar2 != null ? dVar2.e().floatValue() / 100.0f : 0.0f;
            if (f17 != 0.0f) {
                float fB = n.b(fFloatValue4, fFloatValue5, f17, fFloatValue5);
                double d18 = fB;
                fCos = (float) (Math.cos(radians2) * d18);
                fSin = (float) (Math.sin(radians2) * d18);
                path3.moveTo(fCos, fSin);
                d10 = radians2 + ((double) ((f15 * f17) / 2.0f));
                f11 = fB;
                f10 = f16;
            } else {
                double d19 = fFloatValue4;
                fCos = (float) (Math.cos(radians2) * d19);
                float fSin5 = (float) (Math.sin(radians2) * d19);
                path3.moveTo(fCos, fSin5);
                f10 = f16;
                d10 = radians2 + ((double) f10);
                fSin = fSin5;
                f11 = 0.0f;
            }
            double dCeil2 = Math.ceil(d17) * 2.0d;
            double d20 = d10;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                double d21 = i12;
                if (d21 >= dCeil2) {
                    break;
                }
                float f18 = z11 ? fFloatValue4 : fFloatValue5;
                float f19 = (f11 == 0.0f || d21 != dCeil2 - 2.0d) ? f10 : (f15 * f17) / 2.0f;
                double d22 = (f11 == 0.0f || d21 != dCeil2 - 1.0d) ? f18 : f11;
                float f20 = f15;
                float f21 = f10;
                float fCos5 = (float) (Math.cos(d20) * d22);
                float fSin6 = (float) (d22 * Math.sin(d20));
                if (fFloatValue6 == 0.0f && fFloatValue7 == 0.0f) {
                    path3.lineTo(fCos5, fSin6);
                    path2 = path3;
                    f12 = fSin6;
                } else {
                    float f22 = fSin;
                    double dAtan4 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos6 = (float) Math.cos(dAtan4);
                    float fSin7 = (float) Math.sin(dAtan4);
                    path2 = path3;
                    f12 = fSin6;
                    double dAtan5 = (float) (Math.atan2(fSin6, fCos5) - 1.5707963267948966d);
                    float fCos7 = (float) Math.cos(dAtan5);
                    float fSin8 = (float) Math.sin(dAtan5);
                    float f23 = z11 ? fFloatValue6 : fFloatValue7;
                    float f24 = z11 ? fFloatValue7 : fFloatValue6;
                    float f25 = z11 ? fFloatValue5 : fFloatValue4;
                    float f26 = z11 ? fFloatValue4 : fFloatValue5;
                    float f27 = f25 * f23 * 0.47829f;
                    float f28 = fCos6 * f27;
                    float f29 = f27 * fSin7;
                    float f30 = f26 * f24 * 0.47829f;
                    float f31 = fCos7 * f30;
                    float f32 = f30 * fSin8;
                    if (f17 != 0.0f) {
                        if (i12 == 0) {
                            f28 *= f17;
                            f29 *= f17;
                        } else if (d21 == dCeil2 - 1.0d) {
                            f31 *= f17;
                            f32 *= f17;
                        }
                    }
                    path2.cubicTo(fCos - f28, f22 - f29, f31 + fCos5, f12 + f32, fCos5, f12);
                }
                d20 += (double) f19;
                z11 = !z11;
                i12++;
                fFloatValue5 = fFloatValue5;
                fCos = fCos5;
                fFloatValue4 = fFloatValue4;
                path3 = path2;
                f15 = f20;
                f10 = f21;
                f11 = f11;
                fSin = f12;
            }
            PointF pointFE2 = aVar.e();
            path = path3;
            path.offset(pointFE2.x, pointFE2.y);
            path.close();
        }
        path.close();
        lVar.f36686m.c(path);
        lVar.f36687n = true;
        return path;
    }
}
