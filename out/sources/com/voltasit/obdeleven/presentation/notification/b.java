package com.voltasit.obdeleven.presentation.notification;

import com.voltasit.obdeleven.presentation.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NotificationActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f32659A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f32660B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J8.a f32661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U7.a<Boolean> f32662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U7.a f32663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U7.a<String> f32664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a f32665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a<String> f32666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a f32667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f32668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f32669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f32670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f32671y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f32672z;

    public b(J8.a aVar) {
        this.f32661o = aVar;
        U7.a<Boolean> aVar2 = new U7.a<>();
        this.f32662p = aVar2;
        this.f32663q = aVar2;
        U7.a<String> aVar3 = new U7.a<>();
        this.f32664r = aVar3;
        this.f32665s = aVar3;
        U7.a<String> aVar4 = new U7.a<>();
        this.f32666t = aVar4;
        this.f32667u = aVar4;
    }

    public final void b() {
        this.f32672z = true;
        if (!this.f32670x) {
            this.f32670x = true;
            this.f32661o.T(this.f32668v);
        }
        String str = this.f32659A;
        if (str != null) {
            this.f32664r.j(str);
        } else {
            i.m("destinationURL");
            throw null;
        }
    }
}
