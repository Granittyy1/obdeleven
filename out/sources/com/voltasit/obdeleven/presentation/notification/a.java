package com.voltasit.obdeleven.presentation.notification;

import B8.AbstractC0612a;
import T3.c;
import W8.d;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bumptech.glide.load.engine.GlideException;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NotificationActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32657a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32658b;

    public a(NotificationActivity notificationActivity) {
        this.f32658b = notificationActivity;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // T3.c
    public final void b(Object obj) {
        switch (this.f32657a) {
            case 0:
                NotificationActivity notificationActivity = (NotificationActivity) this.f32658b;
                AbstractC0612a abstractC0612a = notificationActivity.f32654b;
                if (abstractC0612a == null) {
                    i.m("binding");
                    throw null;
                }
                ImageView offerImageView = abstractC0612a.f1850t;
                i.d(offerImageView, "offerImageView");
                d.f(offerImageView, true);
                AbstractC0612a abstractC0612a2 = notificationActivity.f32654b;
                if (abstractC0612a2 == null) {
                    i.m("binding");
                    throw null;
                }
                ProgressBar loadingProgressBar = abstractC0612a2.f1849s;
                i.d(loadingProgressBar, "loadingProgressBar");
                d.f(loadingProgressBar, false);
                return;
            default:
                C2134a0.a();
                ((Lambda) this.f32658b).invoke();
                return;
        }
    }

    @Override // T3.c
    public final void c(GlideException glideException) {
        switch (this.f32657a) {
            case 0:
                NotificationActivity notificationActivity = (NotificationActivity) this.f32658b;
                AbstractC0612a abstractC0612a = notificationActivity.f32654b;
                if (abstractC0612a == null) {
                    i.m("binding");
                    throw null;
                }
                ProgressBar loadingProgressBar = abstractC0612a.f1849s;
                i.d(loadingProgressBar, "loadingProgressBar");
                d.f(loadingProgressBar, false);
                AbstractC0612a abstractC0612a2 = notificationActivity.f32654b;
                if (abstractC0612a2 == null) {
                    i.m("binding");
                    throw null;
                }
                Button tryAgainButton = abstractC0612a2.f1852v;
                i.d(tryAgainButton, "tryAgainButton");
                d.f(tryAgainButton, true);
                return;
            default:
                C2134a0.a();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Ia.a aVar) {
        this.f32658b = (Lambda) aVar;
    }
}
