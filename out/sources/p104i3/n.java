package p104i3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p116j3.a;
import p116j3.d;
import p116j3.p;
import p154m3.j;
import p164n3.f;

/* JADX INFO: compiled from: RepeaterContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements d, k, i, a.InterfaceC0468a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f36697a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f36698b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f36699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f36700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f36702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f36703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f36704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f36705i;

    public n(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, f fVar) {
        this.f36699c = lottieDrawable;
        this.f36700d = aVar;
        String str = fVar.f44844a;
        this.f36701e = fVar.f44848e;
        a<Float, Float> aVarA = fVar.f44845b.a();
        this.f36702f = (d) aVarA;
        aVar.d(aVarA);
        aVarA.a(this);
        a<Float, Float> aVarA2 = fVar.f44846c.a();
        this.f36703g = (d) aVarA2;
        aVar.d(aVarA2);
        aVarA2.a(this);
        j jVar = fVar.f44847d;
        jVar.getClass();
        p pVar = new p(jVar);
        this.f36704h = pVar;
        pVar.a(aVar);
        pVar.b(this);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36699c.invalidateSelf();
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        this.f36705i.b(list, list2);
    }

    @Override // p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f36705i.c(rectF, matrix, z10);
    }

    @Override // p104i3.i
    public final void d(ListIterator<b> listIterator) {
        if (this.f36705i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f36705i = new c(this.f36699c, this.f36700d, "Repeater", this.f36701e, arrayList, null);
    }

    @Override // p104i3.d
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f36702f.e().floatValue();
        float fFloatValue2 = this.f36703g.e().floatValue();
        p pVar = this.f36704h;
        float fFloatValue3 = pVar.f41129m.e().floatValue() / 100.0f;
        float fFloatValue4 = pVar.f41130n.e().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f36697a;
            matrix2.set(matrix);
            float f10 = i11;
            matrix2.preConcat(pVar.e(f10 + fFloatValue2));
            this.f36705i.f(canvas, matrix2, (int) (p214r3.f.d(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i10));
        }
    }

    @Override // p104i3.k
    public final Path getPath() {
        Path path = this.f36705i.getPath();
        Path path2 = this.f36698b;
        path2.reset();
        float fFloatValue = this.f36702f.e().floatValue();
        float fFloatValue2 = this.f36703g.e().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix = this.f36697a;
            matrix.set(this.f36704h.e(i10 + fFloatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
