package p104i3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p116j3.c;
import p116j3.d;
import p116j3.f;
import p154m3.b;
import p214r3.g;

/* JADX INFO: compiled from: BaseStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p116j3.a.InterfaceC0468a, b, d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieDrawable f36606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f36607f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f36609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p092h3.a f36610i;
    public final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f36611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f36612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f36613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p116j3.a<Float, Float> f36614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f36615o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f36616p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f36602a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f36603b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f36604c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f36605d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f36608g = new ArrayList();

    /* JADX INFO: renamed from: i3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseStrokeContent.java */
    public static final class C0384a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f36617a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f36618b;

        public C0384a(s sVar) {
            this.f36618b = sVar;
        }
    }

    public a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f10, p154m3.d dVar, b bVar, ArrayList arrayList, b bVar2) {
        p092h3.a aVar2 = new p092h3.a(1);
        this.f36610i = aVar2;
        this.f36615o = 0.0f;
        this.f36606e = lottieDrawable;
        this.f36607f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f10);
        this.f36611k = (f) dVar.a();
        this.j = (d) bVar.a();
        if (bVar2 == null) {
            this.f36613m = null;
        } else {
            this.f36613m = (d) bVar2.a();
        }
        this.f36612l = new ArrayList(arrayList.size());
        this.f36609h = new float[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f36612l.add(((b) arrayList.get(i10)).a());
        }
        aVar.d(this.f36611k);
        aVar.d(this.j);
        for (int i11 = 0; i11 < this.f36612l.size(); i11++) {
            aVar.d((p116j3.a) this.f36612l.get(i11));
        }
        d dVar2 = this.f36613m;
        if (dVar2 != null) {
            aVar.d(dVar2);
        }
        this.f36611k.a(this);
        this.j.a(this);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((p116j3.a) this.f36612l.get(i12)).a(this);
        }
        d dVar3 = this.f36613m;
        if (dVar3 != null) {
            dVar3.a(this);
        }
        if (aVar.j() != null) {
            p116j3.a<Float, Float> aVarA = ((b) aVar.j().f8043a).a();
            this.f36614n = aVarA;
            aVarA.a(this);
            aVar.d(this.f36614n);
        }
        if (aVar.k() != null) {
            this.f36616p = new c(this, aVar, aVar.k());
        }
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36606e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[SYNTHETIC] */
    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        ShapeTrimPath.Type type;
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size() - 1;
        C0384a c0384a = null;
        s sVar = null;
        while (true) {
            type = ShapeTrimPath.Type.f23430c;
            if (size < 0) {
                break;
            }
            b bVar = (b) arrayList2.get(size);
            if (bVar instanceof s) {
                s sVar2 = (s) bVar;
                if (sVar2.f36719c == type) {
                    sVar = sVar2;
                }
            }
            size--;
        }
        if (sVar != null) {
            sVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f36608g;
            if (size2 < 0) {
                break;
            }
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof s) {
                s sVar3 = (s) bVar2;
                if (sVar3.f36719c == type) {
                    if (c0384a != null) {
                        arrayList.add(c0384a);
                    }
                    C0384a c0384a2 = new C0384a(sVar3);
                    sVar3.d(this);
                    c0384a = c0384a2;
                } else if (!(bVar2 instanceof k)) {
                    if (c0384a == null) {
                        c0384a = new C0384a(sVar);
                    }
                    c0384a.f36617a.add((k) bVar2);
                }
            } else if (!(bVar2 instanceof k)) {
                if (c0384a == null) {
                    c0384a = new C0384a(sVar);
                }
                c0384a.f36617a.add((k) bVar2);
            }
        }
        if (c0384a != null) {
            arrayList.add(c0384a);
        }
    }

    @Override // p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f36603b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36608g;
            if (i10 >= arrayList.size()) {
                RectF rectF2 = this.f36605d;
                path.computeBounds(rectF2, false);
                float fI = this.j.i() / 2.0f;
                rectF2.set(rectF2.left - fI, rectF2.top - fI, rectF2.right + fI, rectF2.bottom + fI);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C0384a c0384a = (C0384a) arrayList.get(i10);
            for (int i11 = 0; i11 < c0384a.f36617a.size(); i11++) {
                path.addPath(((k) c0384a.f36617a.get(i11)).getPath(), matrix);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01f9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p104i3.d
    public void f(Canvas canvas, Matrix matrix, int i10) {
        float f10;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        a aVar = this;
        int i11 = 1;
        float[] fArr2 = g.f46335d.get();
        boolean z10 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        f fVar = aVar.f36611k;
        float fI = (i10 / 255.0f) * fVar.i(fVar.f41084c.b(), fVar.c());
        float f11 = 100.0f;
        PointF pointF = p214r3.f.f46331a;
        int iMax = Math.max(0, Math.min(255, (int) ((fI / 100.0f) * 255.0f)));
        p092h3.a aVar2 = aVar.f36610i;
        aVar2.setAlpha(iMax);
        aVar2.setStrokeWidth(g.d(matrix) * aVar.j.i());
        if (aVar2.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = aVar.f36612l;
        if (!arrayList.isEmpty()) {
            float fD = g.d(matrix);
            int i12 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.f36609h;
                if (i12 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((p116j3.a) arrayList.get(i12)).e()).floatValue();
                fArr[i12] = fFloatValue;
                if (i12 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i12] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i12] = 0.1f;
                }
                fArr[i12] = fArr[i12] * fD;
                i12++;
            }
            d dVar = aVar.f36613m;
            aVar2.setPathEffect(new DashPathEffect(fArr, dVar == null ? 0.0f : dVar.e().floatValue() * fD));
        }
        p116j3.a<Float, Float> aVar3 = aVar.f36614n;
        if (aVar3 != null) {
            float fFloatValue2 = aVar3.e().floatValue();
            if (fFloatValue2 == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (fFloatValue2 != aVar.f36615o) {
                com.airbnb.lottie.model.layer.a aVar4 = aVar.f36607f;
                if (aVar4.f23474A == fFloatValue2) {
                    blurMaskFilter = aVar4.f23475B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar4.f23475B = blurMaskFilter2;
                    aVar4.f23474A = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar2.setMaskFilter(blurMaskFilter);
            }
            aVar.f36615o = fFloatValue2;
        }
        c cVar = aVar.f36616p;
        if (cVar != null) {
            cVar.b(aVar2);
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = aVar.f36608g;
            if (i13 >= arrayList2.size()) {
                return;
            }
            C0384a c0384a = (C0384a) arrayList2.get(i13);
            s sVar = c0384a.f36618b;
            Path path = aVar.f36603b;
            ArrayList arrayList3 = c0384a.f36617a;
            if (sVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i11; size2 >= 0; size2--) {
                    path.addPath(((k) arrayList3.get(size2)).getPath(), matrix);
                }
                s sVar2 = c0384a.f36618b;
                float fFloatValue3 = sVar2.f36720d.e().floatValue() / f11;
                float fFloatValue4 = sVar2.f36721e.e().floatValue() / f11;
                float fFloatValue5 = sVar2.f36722f.e().floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = aVar.f36602a;
                    pathMeasure.setPath(path, z10);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length = pathMeasure.getLength() + length;
                    }
                    float f12 = fFloatValue5 * length;
                    float f13 = (fFloatValue3 * length) + f12;
                    float fMin = Math.min((fFloatValue4 * length) + f12, (f13 + length) - 1.0f);
                    int size3 = arrayList3.size() - i11;
                    float f14 = 0.0f;
                    while (size3 >= 0) {
                        Path path2 = aVar.f36604c;
                        path2.set(((k) arrayList3.get(size3)).getPath());
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z10);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f15 = fMin - length;
                            if (f15 >= f14 + length2 || f14 >= f15) {
                                f10 = f14 + length2;
                                if (f10 < f13 && f14 <= fMin) {
                                    if (f10 > fMin || f13 >= f14) {
                                        g.a(path2, f13 < f14 ? 0.0f : (f13 - f14) / length2, fMin > f10 ? 1.0f : (fMin - f14) / length2, 0.0f);
                                        canvas.drawPath(path2, aVar2);
                                    } else {
                                        canvas.drawPath(path2, aVar2);
                                    }
                                }
                            } else {
                                g.a(path2, f13 > length ? (f13 - length) / length2 : 0.0f, Math.min(f15 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, aVar2);
                            }
                        } else {
                            f10 = f14 + length2;
                            if (f10 < f13) {
                            }
                        }
                        f14 += length2;
                        size3--;
                        aVar = this;
                        z10 = false;
                    }
                } else {
                    canvas.drawPath(path, aVar2);
                }
                i11 = 1;
            } else {
                path.reset();
                i11 = 1;
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((k) arrayList3.get(size4)).getPath(), matrix);
                }
                canvas.drawPath(path, aVar2);
            }
            i13 += i11;
            aVar = this;
            z10 = false;
            f11 = 100.0f;
        }
    }
}
