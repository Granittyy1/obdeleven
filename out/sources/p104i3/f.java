package p104i3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import p116j3.a;
import p116j3.b;
import p116j3.c;
import p154m3.d;
import p164n3.i;

/* JADX INFO: compiled from: FillContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d, a.InterfaceC0468a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f36635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p092h3.a f36636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f36637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f36639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f36640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p116j3.f f36641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LottieDrawable f36642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a<Float, Float> f36643i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f36644k;

    public f(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, i iVar) {
        Path path = new Path();
        this.f36635a = path;
        this.f36636b = new p092h3.a(1);
        this.f36639e = new ArrayList();
        this.f36637c = aVar;
        String str = iVar.f44855c;
        this.f36638d = iVar.f44858f;
        this.f36642h = lottieDrawable;
        if (aVar.j() != null) {
            a<Float, Float> aVarA = ((p154m3.b) aVar.j().f8043a).a();
            this.f36643i = aVarA;
            aVarA.a(this);
            aVar.d(this.f36643i);
        }
        if (aVar.k() != null) {
            this.f36644k = new c(this, aVar, aVar.k());
        }
        p154m3.a aVar2 = iVar.f44856d;
        if (aVar2 == null) {
            this.f36640f = null;
            this.f36641g = null;
            return;
        }
        d dVar = iVar.f44857e;
        path.setFillType(iVar.f44854b);
        a<Integer, Integer> aVarA2 = aVar2.a();
        this.f36640f = (b) aVarA2;
        aVarA2.a(this);
        aVar.d(aVarA2);
        a<Integer, Integer> aVarA3 = dVar.a();
        this.f36641g = (p116j3.f) aVarA3;
        aVarA3.a(this);
        aVar.d(aVarA3);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36642h.invalidateSelf();
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof k) {
                this.f36639e.add((k) bVar);
            }
        }
    }

    @Override // p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f36635a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36639e;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((k) arrayList.get(i10)).getPath(), matrix);
                i10++;
            }
        }
    }

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
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (this.f36638d) {
            return;
        }
        b bVar = this.f36640f;
        int i11 = bVar.i(bVar.f41084c.b(), bVar.c());
        int iIntValue = (int) ((((i10 / 255.0f) * this.f36641g.e().intValue()) / 100.0f) * 255.0f);
        PointF pointF = p214r3.f.f46331a;
        int i12 = 0;
        int iMax = (Math.max(0, Math.min(255, iIntValue)) << 24) | (i11 & 16777215);
        p092h3.a aVar = this.f36636b;
        aVar.setColor(iMax);
        a<Float, Float> aVar2 = this.f36643i;
        if (aVar2 != null) {
            float fFloatValue = aVar2.e().floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.j) {
                com.airbnb.lottie.model.layer.a aVar3 = this.f36637c;
                if (aVar3.f23474A == fFloatValue) {
                    blurMaskFilter = aVar3.f23475B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar3.f23475B = blurMaskFilter2;
                    aVar3.f23474A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.j = fFloatValue;
        }
        c cVar = this.f36644k;
        if (cVar != null) {
            cVar.b(aVar);
        }
        Path path = this.f36635a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f36639e;
            if (i12 >= arrayList.size()) {
                canvas.drawPath(path, aVar);
                return;
            } else {
                path.addPath(((k) arrayList.get(i12)).getPath(), matrix);
                i12++;
            }
        }
    }
}
