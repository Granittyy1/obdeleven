package com.voltasit.obdeleven.presentation.vehicleInfo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseQuery;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: VehicleInfoFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l<V> implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParseFile f33523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f33524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParseQuery<E> f33525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f33526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ImageView f33527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Lambda f33528g;

    /* JADX WARN: Multi-variable type inference failed */
    public l(ParseFile parseFile, E e10, ParseQuery<E> parseQuery, Activity activity, ImageView imageView, Ia.a<r> aVar) {
        this.f33523b = parseFile;
        this.f33524c = e10;
        this.f33525d = parseQuery;
        this.f33526e = activity;
        this.f33527f = imageView;
        this.f33528g = (Lambda) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws ParseException {
        ParseFile parseFile = this.f33523b;
        parseFile.save();
        E e10 = this.f33524c;
        e10.put("picture", parseFile);
        e10.save();
        final String strF = e10.f();
        this.f33525d.clearCachedResult();
        if (n.S(strF)) {
            return null;
        }
        final ?? r10 = this.f33528g;
        final Activity activity = this.f33526e;
        final ImageView imageView = this.f33527f;
        activity.runOnUiThread(new Runnable(imageView, strF, activity, r10) { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageView f33517b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f33518c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Activity f33519d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Lambda f33520e;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f33520e = (Lambda) r10;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
            @Override // java.lang.Runnable
            public final void run() {
                ImageView carImage = this.f33517b;
                kotlin.jvm.internal.i.e(carImage, "$carImage");
                Activity activity2 = this.f33519d;
                ?? r11 = this.f33520e;
                com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(carImage).m(this.f33518c);
                dVarM.y(new k(activity2, r11));
                dVarM.x(carImage);
            }
        });
        return null;
    }
}
