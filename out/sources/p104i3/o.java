package p104i3;

import Z3.n;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import p116j3.a;
import p164n3.g;
import p164n3.h;

/* JADX INFO: compiled from: RoundedCornersContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements q, a.InterfaceC0468a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieDrawable f36706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Float, Float> f36707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f36708c;

    public o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, g gVar) {
        this.f36706a = lottieDrawable;
        gVar.getClass();
        a<Float, Float> aVarA = gVar.f44849a.a();
        this.f36707b = aVarA;
        aVar.d(aVarA);
        aVarA.a(this);
    }

    public static int d(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36706a.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01cd  */
    @Override // p104i3.q
    public final h e(h hVar) {
        boolean z10;
        boolean z11;
        int i10;
        h hVar2 = hVar;
        ArrayList arrayList = hVar2.f44850a;
        if (arrayList.size() <= 2) {
            return hVar2;
        }
        float fFloatValue = this.f36707b.e().floatValue();
        if (fFloatValue == 0.0f) {
            return hVar2;
        }
        ArrayList arrayList2 = hVar2.f44850a;
        boolean z12 = hVar2.f44852c;
        int size = arrayList2.size() - 1;
        int i11 = 0;
        while (size >= 0) {
            p142l3.a aVar = (p142l3.a) arrayList2.get(size);
            p142l3.a aVar2 = (p142l3.a) arrayList2.get(d(size - 1, arrayList2.size()));
            PointF pointF = (size != 0 || z12) ? aVar2.f44342c : hVar2.f44851b;
            i11 = (((size != 0 || z12) ? aVar2.f44341b : pointF).equals(pointF) && aVar.f44340a.equals(pointF) && !(!hVar2.f44852c && size == 0 && size == arrayList2.size() - 1)) ? i11 + 2 : i11 + 1;
            size--;
        }
        h hVar3 = this.f36708c;
        if (hVar3 == null || hVar3.f44850a.size() != i11) {
            ArrayList arrayList3 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList3.add(new p142l3.a());
            }
            this.f36708c = new h(new PointF(0.0f, 0.0f), false, arrayList3);
        }
        h hVar4 = this.f36708c;
        hVar4.f44852c = z12;
        PointF pointF2 = hVar2.f44851b;
        hVar4.a(pointF2.x, pointF2.y);
        ArrayList arrayList4 = hVar4.f44850a;
        boolean z13 = hVar2.f44852c;
        int i13 = 0;
        int i14 = 0;
        while (i13 < arrayList.size()) {
            p142l3.a aVar3 = (p142l3.a) arrayList.get(i13);
            p142l3.a aVar4 = (p142l3.a) arrayList.get(d(i13 - 1, arrayList.size()));
            p142l3.a aVar5 = (p142l3.a) arrayList.get(d(i13 - 2, arrayList.size()));
            PointF pointF3 = (i13 != 0 || z13) ? aVar4.f44342c : hVar2.f44851b;
            PointF pointF4 = (i13 != 0 || z13) ? aVar4.f44341b : pointF3;
            PointF pointF5 = aVar3.f44340a;
            PointF pointF6 = aVar5.f44342c;
            if (hVar2.f44852c || i13 != 0) {
                z10 = true;
            } else {
                z10 = true;
                boolean z14 = i13 == arrayList.size() + (-1);
                if (pointF4.equals(pointF3) || !pointF5.equals(pointF3) || z14) {
                    z11 = z13;
                    i10 = i13;
                    p142l3.a aVar6 = (p142l3.a) arrayList4.get(d(i14 - 1, arrayList4.size()));
                    p142l3.a aVar7 = (p142l3.a) arrayList4.get(i14);
                    PointF pointF7 = aVar4.f44341b;
                    aVar6.f44341b.set(pointF7.x, pointF7.y);
                    PointF pointF8 = aVar4.f44342c;
                    aVar6.f44342c.set(pointF8.x, pointF8.y);
                    PointF pointF9 = aVar3.f44340a;
                    aVar7.f44340a.set(pointF9.x, pointF9.y);
                    i14++;
                } else {
                    float f10 = pointF3.x;
                    float f11 = f10 - pointF6.x;
                    float f12 = pointF3.y;
                    float f13 = f12 - pointF6.y;
                    PointF pointF10 = aVar3.f44342c;
                    float f14 = pointF10.x - f10;
                    float f15 = pointF10.y - f12;
                    double d10 = f11;
                    boolean z15 = z13;
                    i10 = i13;
                    float fHypot = (float) Math.hypot(d10, f13);
                    double d11 = f14;
                    z11 = z15;
                    float fHypot2 = (float) Math.hypot(d11, f15);
                    float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                    float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                    float f16 = pointF3.x;
                    float fB = n.b(pointF6.x, f16, fMin, f16);
                    float f17 = pointF3.y;
                    float fB2 = n.b(pointF6.y, f17, fMin, f17);
                    float fB3 = n.b(pointF10.x, f16, fMin2, f16);
                    float fB4 = n.b(pointF10.y, f17, fMin2, f17);
                    float f18 = fB - ((fB - f16) * 0.5519f);
                    float f19 = fB2 - ((fB2 - f17) * 0.5519f);
                    float f20 = fB3 - ((fB3 - f16) * 0.5519f);
                    float f21 = fB4 - ((fB4 - f17) * 0.5519f);
                    p142l3.a aVar8 = (p142l3.a) arrayList4.get(d(i14 - 1, arrayList4.size()));
                    p142l3.a aVar9 = (p142l3.a) arrayList4.get(i14);
                    aVar8.f44341b.set(fB, fB2);
                    aVar8.f44342c.set(fB, fB2);
                    if (i10 == 0) {
                        hVar4.a(fB, fB2);
                    }
                    aVar9.f44340a.set(f18, f19);
                    p142l3.a aVar10 = (p142l3.a) arrayList4.get(i14 + 1);
                    aVar9.f44341b.set(f20, f21);
                    aVar9.f44342c.set(fB3, fB4);
                    aVar10.f44340a.set(fB3, fB4);
                    i14 += 2;
                }
                i13 = i10 + 1;
                hVar2 = hVar;
                z13 = z11;
                arrayList = arrayList;
            }
            if (pointF4.equals(pointF3)) {
                z11 = z13;
                i10 = i13;
                p142l3.a aVar11 = (p142l3.a) arrayList4.get(d(i14 - 1, arrayList4.size()));
                p142l3.a aVar12 = (p142l3.a) arrayList4.get(i14);
                PointF pointF11 = aVar4.f44341b;
                aVar11.f44341b.set(pointF11.x, pointF11.y);
                PointF pointF12 = aVar4.f44342c;
                aVar11.f44342c.set(pointF12.x, pointF12.y);
                PointF pointF13 = aVar3.f44340a;
                aVar12.f44340a.set(pointF13.x, pointF13.y);
                i14++;
            } else {
                z11 = z13;
                i10 = i13;
                p142l3.a aVar13 = (p142l3.a) arrayList4.get(d(i14 - 1, arrayList4.size()));
                p142l3.a aVar14 = (p142l3.a) arrayList4.get(i14);
                PointF pointF14 = aVar4.f44341b;
                aVar13.f44341b.set(pointF14.x, pointF14.y);
                PointF pointF15 = aVar4.f44342c;
                aVar13.f44342c.set(pointF15.x, pointF15.y);
                PointF pointF16 = aVar3.f44340a;
                aVar14.f44340a.set(pointF16.x, pointF16.y);
                i14++;
            }
            i13 = i10 + 1;
            hVar2 = hVar;
            z13 = z11;
            arrayList = arrayList;
        }
        return hVar4;
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
    }
}
