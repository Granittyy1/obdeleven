package com.voltasit.obdeleven.presentation.vehicleInfo;

import android.app.Activity;
import android.widget.ImageView;
import com.parse.ParseException;
import com.parse.ParseQuery;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: VehicleInfoFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i<V> implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f33512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParseQuery<E> f33513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f33514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f33515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Lambda f33516f;

    /* JADX WARN: Multi-variable type inference failed */
    public i(E e10, ParseQuery<E> parseQuery, Activity activity, ImageView imageView, Ia.a<r> aVar) {
        this.f33512b = e10;
        this.f33513c = parseQuery;
        this.f33514d = activity;
        this.f33515e = imageView;
        this.f33516f = (Lambda) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws ParseException {
        E e10 = this.f33512b;
        e10.remove("picture");
        e10.save();
        String strF = e10.f();
        this.f33513c.clearCachedResult();
        if (n.S(strF)) {
            return null;
        }
        this.f33514d.runOnUiThread(new h(this.f33515e, strF, this.f33516f));
        return null;
    }
}
