package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.C0891t;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p177o3.c;
import p177o3.d;
import p177o3.e;
import p177o3.f;
import p214r3.g;

/* JADX INFO: compiled from: CompositionLayer.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p116j3.a<Float, Float> f23501C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f23502D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final RectF f23503E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RectF f23504F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Paint f23505G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f23506H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f23507I;

    public b(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, p079g3.b bVar) {
        int i10;
        a aVar;
        a bVar2;
        super(lottieDrawable, layer);
        this.f23502D = new ArrayList();
        this.f23503E = new RectF();
        this.f23504F = new RectF();
        this.f23505G = new Paint();
        this.f23507I = true;
        p154m3.b bVar3 = layer.f23461s;
        if (bVar3 != null) {
            p116j3.a<Float, Float> aVarA = bVar3.a();
            this.f23501C = aVarA;
            d(aVarA);
            this.f23501C.a(this);
        } else {
            this.f23501C = null;
        }
        C0891t c0891t = new C0891t(bVar.f35559h.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            int iOrdinal = layer2.f23448e.ordinal();
            if (iOrdinal == 0) {
                bVar2 = new b(lottieDrawable, layer2, (List) bVar.f35554c.get(layer2.f23450g), bVar);
            } else if (iOrdinal == 1) {
                bVar2 = new e(lottieDrawable, layer2);
            } else if (iOrdinal == 2) {
                bVar2 = new p177o3.b(lottieDrawable, layer2);
            } else if (iOrdinal == 3) {
                bVar2 = new c(lottieDrawable, layer2);
            } else if (iOrdinal == 4) {
                bVar2 = new d(lottieDrawable, layer2, this, bVar);
            } else if (iOrdinal != 5) {
                p214r3.c.b("Unknown layer type " + layer2.f23448e);
                bVar2 = null;
            } else {
                bVar2 = new f(lottieDrawable, layer2);
            }
            if (bVar2 != null) {
                c0891t.e(bVar2, bVar2.f23490p.f23447d);
                if (aVar2 != null) {
                    aVar2.f23493s = bVar2;
                    aVar2 = null;
                } else {
                    this.f23502D.add(0, bVar2);
                    int iOrdinal2 = layer2.f23463u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        aVar2 = bVar2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < c0891t.g(); i10++) {
            a aVar3 = (a) c0891t.b(c0891t.d(i10));
            if (aVar3 != null && (aVar = (a) c0891t.b(aVar3.f23490p.f23449f)) != null) {
                aVar3.f23494t = aVar;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        ArrayList arrayList = this.f23502D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f23503E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a) arrayList.get(size)).c(rectF2, this.f23488n, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        RectF rectF = this.f23504F;
        Layer layer = this.f23490p;
        rectF.set(0.0f, 0.0f, layer.f23457o, layer.f23458p);
        matrix.mapRect(rectF);
        boolean z10 = this.f23489o.f23325p;
        ArrayList arrayList = this.f23502D;
        boolean z11 = z10 && arrayList.size() > 1 && i10 != 255;
        if (z11) {
            Paint paint = this.f23505G;
            paint.setAlpha(i10);
            g.a aVar = g.f46332a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z11) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.f23507I || !"__container".equals(layer.f23446c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((a) arrayList.get(size)).f(canvas, matrix, i10);
            }
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void n(boolean z10) {
        super.n(z10);
        Iterator it = this.f23502D.iterator();
        while (it.hasNext()) {
            ((a) it.next()).n(z10);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void o(float f10) {
        this.f23506H = f10;
        super.o(f10);
        p116j3.a<Float, Float> aVar = this.f23501C;
        Layer layer = this.f23490p;
        if (aVar != null) {
            p079g3.b bVar = this.f23489o.f23312b;
            f10 = ((aVar.e().floatValue() * layer.f23445b.f35562l) - layer.f23445b.j) / ((bVar.f35561k - bVar.j) + 0.01f);
        }
        if (this.f23501C == null) {
            p079g3.b bVar2 = layer.f23445b;
            f10 -= layer.f23456n / (bVar2.f35561k - bVar2.j);
        }
        if (layer.f23455m != 0.0f && !"__container".equals(layer.f23446c)) {
            f10 /= layer.f23455m;
        }
        ArrayList arrayList = this.f23502D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).o(f10);
        }
    }
}
