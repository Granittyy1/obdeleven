package com.voltasit.obdeleven.ui.dialogs;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.view.KeyEvent;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.R;
import java.util.Locale;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BaseBackupDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2155l extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f33983x = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B8.r f33984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ControlUnit f33985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f33986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f33987v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AlertDialog f33988w;

    public final void B() {
        this.f33988w.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.j
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                AbstractC2155l abstractC2155l = this.f33979b;
                if (i10 == 4) {
                    abstractC2155l.f33988w.getButton(-2).callOnClick();
                    return false;
                }
                abstractC2155l.getClass();
                return false;
            }
        });
    }

    public final void C(float f10) {
        int color;
        if (isAdded()) {
            this.f33984s.f2119J.setText(String.format(Locale.US, "%2.1f V", Float.valueOf(f10)));
            double d10 = f10;
            if (d10 <= 11.5d) {
                this.f33984s.f2124t.setImageResource(2131230867);
                color = getResources().getColor(R.color.red_500);
            } else if (d10 > 11.5d && f10 <= 12.0f) {
                this.f33984s.f2124t.setImageResource(2131230867);
                color = getResources().getColor(R.color.yellow_700);
            } else if (f10 > 12.0f && f10 <= 13.0f) {
                this.f33984s.f2124t.setImageResource(2131230867);
                color = getResources().getColor(R.color.holo_green_dark);
            } else if (f10 <= 13.0f || d10 > 15.5d) {
                this.f33984s.f2124t.setImageResource(2131230868);
                color = getResources().getColor(R.color.red_500);
            } else {
                this.f33984s.f2124t.setImageResource(2131230868);
                color = getResources().getColor(R.color.holo_green_dark);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(((Integer) this.f33984s.f2124t.getTag()).intValue(), color);
            valueAnimator.setEvaluator(new ArgbEvaluator());
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.voltasit.obdeleven.ui.dialogs.k
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AbstractC2155l abstractC2155l = this.f33981b;
                    if (abstractC2155l.isAdded()) {
                        Integer num = (Integer) valueAnimator2.getAnimatedValue();
                        abstractC2155l.f33984s.f2124t.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                        abstractC2155l.f33984s.f2124t.setTag(num);
                    }
                }
            });
            valueAnimator.setDuration(1000L);
            valueAnimator.start();
        }
    }
}
