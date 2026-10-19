package com.facebook.login;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25113c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f25112b = i10;
        this.f25113c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25112b) {
            case 0:
                k this$0 = (k) this.f25113c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.B();
                break;
            case 1:
                com.voltasit.obdeleven.ui.module.h hVar = (com.voltasit.obdeleven.ui.module.h) this.f25113c;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) hVar.f34119r.getLayoutParams();
                layoutParams.addRule(1, 0);
                layoutParams.width = hVar.f34119r.getHeight();
                break;
            case 2:
                p128k2.j jVar = (p128k2.j) this.f25113c;
                ViewGroup viewGroup = jVar.f41502e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(jVar.f41495A ? 0 : 4);
                }
                View view = jVar.j;
                if (view != null) {
                    int dimensionPixelSize = jVar.f41498a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (jVar.f41495A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof androidx.media3.ui.b) {
                        androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
                        boolean z10 = jVar.f41495A;
                        Rect rect = bVar.f18894b;
                        if (z10) {
                            ValueAnimator valueAnimator = bVar.f18883F;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            bVar.f18885H = true;
                            bVar.f18884G = 0.0f;
                            bVar.invalidate(rect);
                        } else {
                            int i10 = jVar.f41522z;
                            if (i10 == 1) {
                                ValueAnimator valueAnimator2 = bVar.f18883F;
                                if (valueAnimator2.isStarted()) {
                                    valueAnimator2.cancel();
                                }
                                bVar.f18885H = false;
                                bVar.f18884G = 0.0f;
                                bVar.invalidate(rect);
                            } else if (i10 != 3) {
                                ValueAnimator valueAnimator3 = bVar.f18883F;
                                if (valueAnimator3.isStarted()) {
                                    valueAnimator3.cancel();
                                }
                                bVar.f18885H = false;
                                bVar.f18884G = 1.0f;
                                bVar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : jVar.f41521y) {
                    view2.setVisibility((jVar.f41495A && p128k2.j.j(view2)) ? 4 : 0);
                }
                break;
            default:
                p314z7.f fVar = (p314z7.f) this.f25113c;
                p314z7.c cVar = fVar.f48941m;
                boolean z11 = fVar.f48946r;
                cVar.f48912d.a(z11);
                cVar.f48913e.a(z11);
                break;
        }
    }
}
