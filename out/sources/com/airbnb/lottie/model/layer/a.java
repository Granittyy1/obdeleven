package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005a4.t;
import p079g3.u;
import p104i3.d;
import p116j3.h;
import p116j3.p;
import p154m3.j;
import p202q3.C2766j;
import p214r3.g;

/* JADX INFO: compiled from: BaseLayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d, p116j3.a.InterfaceC0468a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f23474A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f23475B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f23476a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f23477b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f23478c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p092h3.a f23479d = new p092h3.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p092h3.a f23480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p092h3.a f23481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p092h3.a f23482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p092h3.a f23483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f23484i;
    public final RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f23485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f23486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f23487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f23488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LottieDrawable f23489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Layer f23490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f23491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p116j3.d f23492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f23493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f23494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<a> f23495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f23496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f23497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f23499y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p092h3.a f23500z;

    public a(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f23480e = new p092h3.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f23481f = new p092h3.a(mode2);
        p092h3.a aVar = new p092h3.a(1);
        this.f23482g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        p092h3.a aVar2 = new p092h3.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f23483h = aVar2;
        this.f23484i = new RectF();
        this.j = new RectF();
        this.f23485k = new RectF();
        this.f23486l = new RectF();
        this.f23487m = new RectF();
        this.f23488n = new Matrix();
        this.f23496v = new ArrayList();
        this.f23498x = true;
        this.f23474A = 0.0f;
        this.f23489o = lottieDrawable;
        this.f23490p = layer;
        if (layer.f23463u == Layer.MatteType.f23472c) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        j jVar = layer.f23452i;
        jVar.getClass();
        p pVar = new p(jVar);
        this.f23497w = pVar;
        pVar.b(this);
        List<Mask> list = layer.f23451h;
        if (list != null && !list.isEmpty()) {
            h hVar = new h(list);
            this.f23491q = hVar;
            Iterator it = ((ArrayList) hVar.f41103a).iterator();
            while (it.hasNext()) {
                ((p116j3.a) it.next()).a(this);
            }
            for (p116j3.a<?, ?> aVar3 : (ArrayList) this.f23491q.f41104b) {
                d(aVar3);
                aVar3.a(this);
            }
        }
        Layer layer2 = this.f23490p;
        if (layer2.f23462t.isEmpty()) {
            if (true != this.f23498x) {
                this.f23498x = true;
                this.f23489o.invalidateSelf();
                return;
            }
            return;
        }
        p116j3.d dVar = new p116j3.d(layer2.f23462t);
        this.f23492r = dVar;
        dVar.f41083b = true;
        dVar.a(new p116j3.a.InterfaceC0468a() { // from class: o3.a
            @Override // p116j3.a.InterfaceC0468a
            public final void a() {
                com.airbnb.lottie.model.layer.a aVar4 = this.f45185a;
                boolean z10 = aVar4.f23492r.i() == 1.0f;
                if (z10 != aVar4.f23498x) {
                    aVar4.f23498x = z10;
                    aVar4.f23489o.invalidateSelf();
                }
            }
        });
        boolean z10 = this.f23492r.e().floatValue() == 1.0f;
        if (z10 != this.f23498x) {
            this.f23498x = z10;
            this.f23489o.invalidateSelf();
        }
        d(this.f23492r);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f23489o.invalidateSelf();
    }

    @Override // p104i3.d
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f23484i.set(0.0f, 0.0f, 0.0f, 0.0f);
        g();
        Matrix matrix2 = this.f23488n;
        matrix2.set(matrix);
        if (z10) {
            List<a> list = this.f23495u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.f23495u.get(size).f23497w.d());
                }
            } else {
                a aVar = this.f23494t;
                if (aVar != null) {
                    matrix2.preConcat(aVar.f23497w.d());
                }
            }
        }
        matrix2.preConcat(this.f23497w.d());
    }

    public final void d(p116j3.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f23496v.add(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    @Override // p104i3.d
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        float f10;
        RectF rectF;
        p092h3.a aVar;
        int i11;
        int i12;
        char c10;
        int i13;
        Integer numE;
        int i14 = 1;
        if (this.f23498x) {
            Layer layer = this.f23490p;
            if (layer.f23464v) {
                return;
            }
            g();
            Matrix matrix2 = this.f23477b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.f23495u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(this.f23495u.get(size).f23497w.d());
            }
            p pVar = this.f23497w;
            p116j3.a<Integer, Integer> aVar2 = pVar.j;
            int iIntValue = (int) ((((i10 / 255.0f) * ((aVar2 == null || (numE = aVar2.e()) == null) ? 100 : numE.intValue())) / 100.0f) * 255.0f);
            if (!(this.f23493s != null) && !l()) {
                matrix2.preConcat(pVar.d());
                i(canvas, matrix2, iIntValue);
                m();
                return;
            }
            RectF rectF2 = this.f23484i;
            c(rectF2, matrix2, false);
            if (this.f23493s != null && layer.f23463u != Layer.MatteType.f23472c) {
                RectF rectF3 = this.f23486l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f23493s.c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(pVar.d());
            RectF rectF4 = this.f23485k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zL = l();
            Path path = this.f23476a;
            h hVar = this.f23491q;
            int i15 = 3;
            int i16 = 2;
            if (zL) {
                int size2 = ((List) hVar.f41105c).size();
                int i17 = 0;
                while (true) {
                    if (i17 < size2) {
                        Mask mask = (Mask) ((List) hVar.f41105c).get(i17);
                        Path path2 = (Path) ((p116j3.a) ((ArrayList) hVar.f41103a).get(i17)).e();
                        if (path2 != null) {
                            path.set(path2);
                            path.transform(matrix2);
                            int iOrdinal = mask.f23382a.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != i14) {
                                    if (iOrdinal != i16) {
                                        if (iOrdinal == i15) {
                                        }
                                        rectF = this.f23487m;
                                        path.computeBounds(rectF, false);
                                        if (i17 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                            i14 = 1;
                                        }
                                    }
                                }
                            }
                            if (mask.f23385d) {
                            }
                            rectF = this.f23487m;
                            path.computeBounds(rectF, false);
                            if (i17 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                i14 = 1;
                            }
                        }
                        i17 += i14;
                        i15 = 3;
                        i16 = 2;
                    } else if (!rectF2.intersect(rectF4)) {
                        f10 = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        break;
                    }
                    f10 = 0.0f;
                    break;
                }
            } else {
                f10 = 0.0f;
            }
            RectF rectF5 = this.j;
            rectF5.set(f10, f10, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.f23478c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f10, f10, f10, f10);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                p092h3.a aVar3 = this.f23479d;
                aVar3.setAlpha(255);
                g.a aVar4 = g.f46332a;
                canvas.saveLayer(rectF2, aVar3);
                h(canvas);
                i(canvas, matrix2, iIntValue);
                if (l()) {
                    p092h3.a aVar5 = this.f23480e;
                    canvas.saveLayer(rectF2, aVar5);
                    if (Build.VERSION.SDK_INT < 28) {
                        h(canvas);
                    }
                    int i18 = 0;
                    while (i18 < ((List) hVar.f41105c).size()) {
                        List list = (List) hVar.f41105c;
                        Mask mask2 = (Mask) list.get(i18);
                        ArrayList arrayList = (ArrayList) hVar.f41103a;
                        p116j3.a aVar6 = (p116j3.a) arrayList.get(i18);
                        p116j3.a aVar7 = (p116j3.a) ((ArrayList) hVar.f41104b).get(i18);
                        h hVar2 = hVar;
                        int iOrdinal2 = mask2.f23382a.ordinal();
                        p092h3.a aVar8 = this.f23481f;
                        boolean z10 = mask2.f23385d;
                        if (iOrdinal2 != 0) {
                            i12 = iIntValue;
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3 && !arrayList.isEmpty()) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 >= list.size()) {
                                                aVar3.setAlpha(255);
                                                canvas.drawRect(rectF2, aVar3);
                                                break;
                                            } else if (((Mask) list.get(i19)).f23382a != Mask.MaskMode.f23389e) {
                                                break;
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                } else if (z10) {
                                    g.a aVar9 = g.f46332a;
                                    canvas.saveLayer(rectF2, aVar5);
                                    canvas.drawRect(rectF2, aVar3);
                                    aVar8.setAlpha((int) (((Integer) aVar7.e()).intValue() * 2.55f));
                                    path.set((Path) aVar6.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, aVar8);
                                    canvas.restore();
                                } else {
                                    g.a aVar10 = g.f46332a;
                                    canvas.saveLayer(rectF2, aVar5);
                                    path.set((Path) aVar6.e());
                                    path.transform(matrix2);
                                    aVar3.setAlpha((int) (((Integer) aVar7.e()).intValue() * 2.55f));
                                    canvas.drawPath(path, aVar3);
                                    canvas.restore();
                                }
                                i13 = 1;
                                c10 = 255;
                            } else {
                                if (i18 == 0) {
                                    aVar3.setColor(-16777216);
                                    c10 = 255;
                                    aVar3.setAlpha(255);
                                    canvas.drawRect(rectF2, aVar3);
                                } else {
                                    c10 = 255;
                                }
                                if (z10) {
                                    g.a aVar11 = g.f46332a;
                                    canvas.saveLayer(rectF2, aVar8);
                                    canvas.drawRect(rectF2, aVar3);
                                    aVar8.setAlpha((int) (((Integer) aVar7.e()).intValue() * 2.55f));
                                    path.set((Path) aVar6.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, aVar8);
                                    canvas.restore();
                                } else {
                                    path.set((Path) aVar6.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, aVar8);
                                }
                            }
                            i18 += i13;
                            hVar = hVar2;
                            iIntValue = i12;
                        } else {
                            i12 = iIntValue;
                            c10 = 255;
                            if (z10) {
                                g.a aVar12 = g.f46332a;
                                canvas.saveLayer(rectF2, aVar3);
                                canvas.drawRect(rectF2, aVar3);
                                path.set((Path) aVar6.e());
                                path.transform(matrix2);
                                aVar3.setAlpha((int) (((Integer) aVar7.e()).intValue() * 2.55f));
                                canvas.drawPath(path, aVar8);
                                canvas.restore();
                            } else {
                                path.set((Path) aVar6.e());
                                path.transform(matrix2);
                                aVar3.setAlpha((int) (((Integer) aVar7.e()).intValue() * 2.55f));
                                canvas.drawPath(path, aVar3);
                            }
                        }
                        i13 = 1;
                        i18 += i13;
                        hVar = hVar2;
                        iIntValue = i12;
                    }
                    i11 = iIntValue;
                    canvas.restore();
                } else {
                    i11 = iIntValue;
                }
                if (this.f23493s != null) {
                    canvas.saveLayer(rectF2, this.f23482g);
                    h(canvas);
                    this.f23493s.f(canvas, matrix, i11);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f23499y && (aVar = this.f23500z) != null) {
                aVar.setStyle(Paint.Style.STROKE);
                this.f23500z.setColor(-251901);
                this.f23500z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.f23500z);
                this.f23500z.setStyle(Paint.Style.FILL);
                this.f23500z.setColor(1357638635);
                canvas.drawRect(rectF2, this.f23500z);
            }
            m();
        }
    }

    public final void g() {
        if (this.f23495u != null) {
            return;
        }
        if (this.f23494t == null) {
            this.f23495u = Collections.emptyList();
            return;
        }
        this.f23495u = new ArrayList();
        for (a aVar = this.f23494t; aVar != null; aVar = aVar.f23494t) {
            this.f23495u.add(aVar);
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF = this.f23484i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23483h);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i10);

    public t j() {
        return this.f23490p.f23465w;
    }

    public C2766j k() {
        return this.f23490p.f23466x;
    }

    public final boolean l() {
        h hVar = this.f23491q;
        return (hVar == null || ((ArrayList) hVar.f41103a).isEmpty()) ? false : true;
    }

    public final void m() {
        u uVar = this.f23489o.f23312b.f35552a;
        String str = this.f23490p.f23446c;
        uVar.getClass();
    }

    public void n(boolean z10) {
        if (z10 && this.f23500z == null) {
            this.f23500z = new p092h3.a();
        }
        this.f23499y = z10;
    }

    public void o(float f10) {
        p pVar = this.f23497w;
        p116j3.a<Integer, Integer> aVar = pVar.j;
        if (aVar != null) {
            aVar.h(f10);
        }
        p116j3.a<?, Float> aVar2 = pVar.f41129m;
        if (aVar2 != null) {
            aVar2.h(f10);
        }
        p116j3.a<?, Float> aVar3 = pVar.f41130n;
        if (aVar3 != null) {
            aVar3.h(f10);
        }
        p116j3.a<PointF, PointF> aVar4 = pVar.f41123f;
        if (aVar4 != null) {
            aVar4.h(f10);
        }
        p116j3.a<?, PointF> aVar5 = pVar.f41124g;
        if (aVar5 != null) {
            aVar5.h(f10);
        }
        p116j3.a<p225s3.b, p225s3.b> aVar6 = pVar.f41125h;
        if (aVar6 != null) {
            aVar6.h(f10);
        }
        p116j3.a<Float, Float> aVar7 = pVar.f41126i;
        if (aVar7 != null) {
            aVar7.h(f10);
        }
        p116j3.d dVar = pVar.f41127k;
        if (dVar != null) {
            dVar.h(f10);
        }
        p116j3.d dVar2 = pVar.f41128l;
        if (dVar2 != null) {
            dVar2.h(f10);
        }
        h hVar = this.f23491q;
        if (hVar != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) hVar.f41103a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((p116j3.a) arrayList.get(i10)).h(f10);
                i10++;
            }
        }
        p116j3.d dVar3 = this.f23492r;
        if (dVar3 != null) {
            dVar3.h(f10);
        }
        a aVar8 = this.f23493s;
        if (aVar8 != null) {
            aVar8.o(f10);
        }
        ArrayList arrayList2 = this.f23496v;
        arrayList2.size();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((p116j3.a) arrayList2.get(i11)).h(f10);
        }
        arrayList2.size();
    }

    @Override // p104i3.b
    public final void b(List<p104i3.b> list, List<p104i3.b> list2) {
    }
}
