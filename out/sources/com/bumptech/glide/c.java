package com.bumptech.glide;

import E3.h;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.C0873a;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;

/* JADX INFO: compiled from: GlideContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static final a j = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f24478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Registry f24479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P3.d f24480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M1 f24481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<T3.c<Object>> f24482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0873a f24483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.c f24484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public T3.d f24486i;

    public c(Context context, h hVar, Registry registry, P3.d dVar, M1 m7, C0873a c0873a, List list, com.bumptech.glide.load.engine.c cVar, int i10) {
        super(context.getApplicationContext());
        this.f24478a = hVar;
        this.f24479b = registry;
        this.f24480c = dVar;
        this.f24481d = m7;
        this.f24482e = list;
        this.f24483f = c0873a;
        this.f24484g = cVar;
        this.f24485h = i10;
    }
}
