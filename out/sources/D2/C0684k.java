package D2;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: D2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Explode.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0684k extends e0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final DecelerateInterpolator f2672H = new DecelerateInterpolator();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final AccelerateInterpolator f2673I = new AccelerateInterpolator();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int[] f2674G;

    @Override // D2.e0
    public final ObjectAnimator Q(ViewGroup viewGroup, View view, O o10, O o11) {
        if (o11 == null) {
            return null;
        }
        Rect rect = (Rect) o11.f2553a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = this.f2674G;
        T(viewGroup, rect, iArr);
        return Q.a(view, o11, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f2672H, this);
    }

    @Override // D2.e0
    public final ObjectAnimator R(ViewGroup viewGroup, View view, O o10) {
        float f10;
        float f11;
        if (o10 == null) {
            return null;
        }
        Rect rect = (Rect) o10.f2553a.get("android:explode:screenBounds");
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) o10.f2554b.getTag(R.id.transition_position);
        if (iArr != null) {
            int i12 = iArr[0];
            f10 = (i12 - rect.left) + translationX;
            int i13 = iArr[1];
            f11 = (i13 - rect.top) + translationY;
            rect.offsetTo(i12, i13);
        } else {
            f10 = translationX;
            f11 = translationY;
        }
        int[] iArr2 = this.f2674G;
        T(viewGroup, rect, iArr2);
        return Q.a(view, o10, i10, i11, translationX, translationY, f10 + iArr2[0], f11 + iArr2[1], f2673I, this);
    }

    public final void T(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.f2674G;
        viewGroup.getLocationOnScreen(iArr2);
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        F.d dVar = this.f2521z;
        Rect rectA = dVar == null ? null : dVar.a();
        if (rectA == null) {
            iCenterX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i10;
            iCenterY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i11;
        } else {
            iCenterX = rectA.centerX();
            iCenterY = rectA.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i12 = iCenterX - i10;
        int i13 = iCenterY - i11;
        float fMax = Math.max(i12, viewGroup.getWidth() - i12);
        float fMax2 = Math.max(i13, viewGroup.getHeight() - i13);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void U(O o10) {
        View view = o10.f2554b;
        int[] iArr = this.f2674G;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        o10.f2553a.put("android:explode:screenBounds", new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    @Override // D2.e0, D2.F
    public final void g(O o10) {
        e0.O(o10);
        U(o10);
    }

    @Override // D2.F
    public final void j(O o10) {
        e0.O(o10);
        U(o10);
    }
}
