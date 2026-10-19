package p104i3;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import java.util.ArrayList;
import java.util.List;
import p116j3.a;
import p116j3.k;

/* JADX INFO: compiled from: EllipseContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k, a.InterfaceC0468a, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieDrawable f36629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f36630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<?, PointF> f36631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p164n3.a f36632e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36634g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f36628a = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2126g f36633f = new C2126g();

    public e(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, p164n3.a aVar2) {
        String str = aVar2.f44824a;
        this.f36629b = lottieDrawable;
        a<?, ?> aVarA = aVar2.f44826c.a();
        this.f36630c = (k) aVarA;
        a<PointF, PointF> aVarA2 = aVar2.f44825b.a();
        this.f36631d = aVarA2;
        this.f36632e = aVar2;
        aVar.d(aVarA);
        aVar.d(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36634g = false;
        this.f36629b.invalidateSelf();
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
                    ((ArrayList) this.f36633f.f30991b).add(sVar);
                    sVar.d(this);
                }
            }
            i10++;
        }
    }

    @Override // p104i3.k
    public final Path getPath() {
        boolean z10 = this.f36634g;
        Path path = this.f36628a;
        if (z10) {
            return path;
        }
        path.reset();
        p164n3.a aVar = this.f36632e;
        if (aVar.f44828e) {
            this.f36634g = true;
            return path;
        }
        PointF pointFE = this.f36630c.e();
        float f10 = pointFE.x / 2.0f;
        float f11 = pointFE.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f44827d) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFE2 = this.f36631d.e();
        path.offset(pointFE2.x, pointFE2.y);
        path.close();
        this.f36633f.c(path);
        this.f36634g = true;
        return path;
    }
}
