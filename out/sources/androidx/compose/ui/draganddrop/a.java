package androidx.compose.ui.draganddrop;

import Ia.l;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.unit.LayoutDirection;
import p293xa.r;

/* JADX INFO: compiled from: ComposeDragShadowBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p013b0.d f13360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<J.e, r> f13362c;

    public a(p013b0.d dVar, long j, l lVar) {
        this.f13360a = dVar;
        this.f13361b = j;
        this.f13362c = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        J.a aVar = new J.a();
        LayoutDirection layoutDirection = LayoutDirection.f15717b;
        Canvas canvas2 = C1139o.f13774a;
        C1138n c1138n = new C1138n();
        c1138n.f13771a = canvas;
        J.a.C0049a c0049a = aVar.f3940b;
        p013b0.c cVar = c0049a.f3944a;
        LayoutDirection layoutDirection2 = c0049a.f3945b;
        E e10 = c0049a.f3946c;
        long j = c0049a.f3947d;
        c0049a.f3944a = this.f13360a;
        c0049a.f3945b = layoutDirection;
        c0049a.f3946c = c1138n;
        c0049a.f3947d = this.f13361b;
        c1138n.g();
        this.f13362c.invoke(aVar);
        c1138n.o();
        c0049a.f3944a = cVar;
        c0049a.f3945b = layoutDirection2;
        c0049a.f3946c = e10;
        c0049a.f3947d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f13361b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        p013b0.d dVar = this.f13360a;
        point.set(dVar.e1(fIntBitsToFloat / dVar.getDensity()), dVar.e1(Float.intBitsToFloat((int) (j & 4294967295L)) / dVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
