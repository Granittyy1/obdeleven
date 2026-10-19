package com.voltasit.obdeleven.presentation.vehicleInfo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import kotlin.jvm.internal.Lambda;
import p220r9.P;
import p293xa.r;

/* JADX INFO: compiled from: VehicleInfoFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements T3.c<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f33521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f33522b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Activity activity, Ia.a<r> aVar) {
        this.f33521a = activity;
        this.f33522b = (Lambda) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // T3.c
    public final void b(Object obj) {
        C2134a0.a();
        UserTrackingUtils.c(UserTrackingUtils.Key.f34279x, 1);
        this.f33522b.invoke();
    }

    @Override // T3.c
    public final void c(GlideException glideException) {
        C2134a0.a();
        Activity activity = this.f33521a;
        P.a(activity, activity.getString(R.string.common_check_network_connection_and_try_again));
    }
}
