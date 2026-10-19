package p177o3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.model.layer.b;
import java.util.Collections;
import p005a4.t;
import p104i3.c;
import p164n3.j;
import p202q3.C2766j;

/* JADX INFO: compiled from: ShapeLayer.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f45190C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final b f45191D;

    public d(LottieDrawable lottieDrawable, Layer layer, b bVar, p079g3.b bVar2) {
        super(lottieDrawable, layer);
        this.f45191D = bVar;
        c cVar = new c(lottieDrawable, this, new j("__container", layer.f23444a, false), bVar2);
        this.f45190C = cVar;
        cVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a, p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        this.f45190C.c(rectF, this.f23488n, z10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        this.f45190C.f(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final t j() {
        t tVar = this.f23490p.f23465w;
        return tVar != null ? tVar : this.f45191D.f23490p.f23465w;
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final C2766j k() {
        C2766j c2766j = this.f23490p.f23466x;
        return c2766j != null ? c2766j : this.f45191D.f23490p.f23466x;
    }
}
