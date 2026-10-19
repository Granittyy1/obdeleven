package F5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: InsetDialogOnTouchListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f3252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3255e;

    public a(Dialog dialog, Rect rect) {
        this.f3252b = dialog;
        this.f3253c = rect.left;
        this.f3254d = rect.top;
        this.f3255e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f3253c;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f3254d;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f3255e;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f3252b.onTouchEvent(motionEventObtain);
    }
}
