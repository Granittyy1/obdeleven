package p104i3;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import java.util.ArrayList;
import java.util.List;
import p116j3.a;
import p116j3.d;
import p164n3.e;

/* JADX INFO: compiled from: RectangleContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class m implements a.InterfaceC0468a, b, k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LottieDrawable f36691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<?, PointF> f36692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a<?, PointF> f36693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f36694g;
    public boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f36688a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f36689b = new RectF();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2126g f36695h = new C2126g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a<Float, Float> f36696i = null;

    public m(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, e eVar) {
        String str = eVar.f44839a;
        this.f36690c = eVar.f44843e;
        this.f36691d = lottieDrawable;
        a<PointF, PointF> aVarA = eVar.f44840b.a();
        this.f36692e = aVarA;
        a<PointF, PointF> aVarA2 = eVar.f44841c.a();
        this.f36693f = aVarA2;
        a<?, ?> aVarA3 = eVar.f44842d.a();
        this.f36694g = (d) aVarA3;
        aVar.d(aVarA);
        aVar.d(aVarA2);
        aVar.d(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.j = false;
        this.f36691d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[SYNTHETIC] */
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
                    ((ArrayList) this.f36695h.f30991b).add(sVar);
                    sVar.d(this);
                } else if (bVar instanceof o) {
                    this.f36696i = ((o) bVar).f36707b;
                }
            } else if (bVar instanceof o) {
                this.f36696i = ((o) bVar).f36707b;
            }
            i10++;
        }
    }

    @Override // p104i3.k
    public final Path getPath() {
        a<Float, Float> aVar;
        boolean z10 = this.j;
        Path path = this.f36688a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f36690c) {
            this.j = true;
            return path;
        }
        PointF pointFE = this.f36693f.e();
        float f10 = pointFE.x / 2.0f;
        float f11 = pointFE.y / 2.0f;
        d dVar = this.f36694g;
        float fI = dVar == null ? 0.0f : dVar.i();
        if (fI == 0.0f && (aVar = this.f36696i) != null) {
            fI = Math.min(aVar.e().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fI > fMin) {
            fI = fMin;
        }
        PointF pointFE2 = this.f36692e.e();
        path.moveTo(pointFE2.x + f10, (pointFE2.y - f11) + fI);
        path.lineTo(pointFE2.x + f10, (pointFE2.y + f11) - fI);
        RectF rectF = this.f36689b;
        if (fI > 0.0f) {
            float f12 = pointFE2.x + f10;
            float f13 = fI * 2.0f;
            float f14 = pointFE2.y + f11;
            rectF.set(f12 - f13, f14 - f13, f12, f14);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointFE2.x - f10) + fI, pointFE2.y + f11);
        if (fI > 0.0f) {
            float f15 = pointFE2.x - f10;
            float f16 = pointFE2.y + f11;
            float f17 = fI * 2.0f;
            rectF.set(f15, f16 - f17, f17 + f15, f16);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointFE2.x - f10, (pointFE2.y - f11) + fI);
        if (fI > 0.0f) {
            float f18 = pointFE2.x - f10;
            float f19 = pointFE2.y - f11;
            float f20 = fI * 2.0f;
            rectF.set(f18, f19, f18 + f20, f20 + f19);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointFE2.x + f10) - fI, pointFE2.y - f11);
        if (fI > 0.0f) {
            float f21 = pointFE2.x + f10;
            float f22 = fI * 2.0f;
            float f23 = pointFE2.y - f11;
            rectF.set(f21 - f22, f23, f21, f22 + f23);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f36695h.c(path);
        this.j = true;
        return path;
    }
}
