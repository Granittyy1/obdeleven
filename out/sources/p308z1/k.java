package p308z1;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: TouchTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j.a f48775d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f48777f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f48773b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f48774c = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f48776e = 25.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile float f48778g = 3.1415927f;

    public k(Context context, j.a aVar) {
        this.f48775d = aVar;
        this.f48777f = new GestureDetector(context, this);
    }

    @Override // z1.d.a
    public final void a(float f10, float[] fArr) {
        this.f48778g = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f48773b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f48773b.x) / this.f48776e;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f48773b;
        float f12 = (y10 - pointF.y) / this.f48776e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f48778g;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f48774c;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j.a aVar = this.f48775d;
        PointF pointF3 = this.f48774c;
        synchronized (aVar) {
            float f14 = pointF3.y;
            aVar.f48769h = f14;
            Matrix.setRotateM(aVar.f48767f, 0, -f14, (float) Math.cos(aVar.f48770i), (float) Math.sin(aVar.f48770i), 0.0f);
            Matrix.setRotateM(aVar.f48768g, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return j.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f48777f.onTouchEvent(motionEvent);
    }
}
