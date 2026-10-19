package io.intercom.android.sdk.survey.ui.components;

import Ia.l;
import Ia.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.m5.conversation.ui.A;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: LoadingComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingComponentKt {
    public static final void SurveyLoading(final SurveyState.Loading state, final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.i.e(state, "state");
        C1086g c1086gP = interfaceC1084f.p(913588806);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(hVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            androidx.compose.ui.h hVarI = hVar.i(W.f10226c);
            c1086gP.L(1496338436);
            boolean z10 = (i12 & 14) == 4;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new A(2, state);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            AndroidView_androidKt.b((l) objF, hVarI, null, c1086gP, 0, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LoadingComponentKt.SurveyLoading$lambda$3(state, hVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p300y4.d SurveyLoading$lambda$2$lambda$1(SurveyState.Loading state, Context context) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(context, "context");
        p300y4.d dVarBuildLoadingContainer = buildLoadingContainer(context);
        dVarBuildLoadingContainer.addView(m402buildLoadingContentbw27NRU(context, state.getSurveyUiColors().m360getOnBackground0d7_KjU(), io.intercom.android.sdk.R.drawable.intercom_survey_loading_state));
        return dVarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyLoading$lambda$3(SurveyState.Loading state, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        SurveyLoading(state, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final p300y4.d buildLoadingContainer(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(context);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    /* JADX INFO: renamed from: buildLoadingContent-bw27NRU, reason: not valid java name */
    public static final View m402buildLoadingContentbw27NRU(Context context, long j, int i10) {
        kotlin.jvm.internal.i.e(context, "context");
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i11 = (int) (20 * context.getResources().getDisplayMetrics().density);
        layoutParams.setMarginStart(i11);
        layoutParams.setMarginEnd(i11);
        layoutParams.topMargin = i11;
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = p211r0.f.f46248a;
        Drawable drawableA = r0.f.a.a(resources, i10, null);
        if (drawableA != null) {
            p234t0.a.C0532a.g(drawableA, Q3.d.K(j));
            drawableA.setAutoMirrored(true);
            imageView.setImageDrawable(drawableA);
        }
        return imageView;
    }
}
