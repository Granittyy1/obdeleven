package p104i3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.a;
import p116j3.b;

/* JADX INFO: compiled from: StrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class r extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f36715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f36716r;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(LottieDrawable lottieDrawable, a aVar, ShapeStroke shapeStroke) {
        int iOrdinal = shapeStroke.f23417g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = shapeStroke.f23418h.ordinal();
        super(lottieDrawable, aVar, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, shapeStroke.f23419i, shapeStroke.f23415e, shapeStroke.f23416f, shapeStroke.f23413c, shapeStroke.f23412b);
        this.f36715q = shapeStroke.j;
        p116j3.a<Integer, Integer> aVarA = shapeStroke.f23414d.a();
        this.f36716r = (b) aVarA;
        aVarA.a(this);
        aVar.d(aVarA);
    }

    @Override // p104i3.a, p104i3.d
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f36715q) {
            return;
        }
        b bVar = this.f36716r;
        this.f36610i.setColor(bVar.i(bVar.f41084c.b(), bVar.c()));
        super.f(canvas, matrix, i10);
    }
}
