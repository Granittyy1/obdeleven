package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import J8.p;
import K8.i;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.K;
import com.voltasit.obdeleven.domain.usecases.user.u;
import com.voltasit.obdeleven.domain.usecases.w;
import com.voltasit.obdeleven.presentation.d;
import p293xa.r;

/* JADX INFO: compiled from: PersonalInformationUpdateDialogViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f32967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f32968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f32969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K.a f32970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1085f0 f32971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1085f0 f32972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a<r> f32973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a f32974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a<r> f32975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a f32976x;

    public a(K k10, boolean z10, i iVar, u uVar, w wVar, p pVar) {
        this.f32967o = iVar;
        this.f32968p = uVar;
        this.f32969q = pVar;
        wVar.f31087a.j(p279w9.a.f47821s, Boolean.TRUE);
        this.f32970r = k10.a(Boolean.valueOf(z10), "should_logout_user");
        C1085f0 c1085f0F = J0.f(Boolean.FALSE);
        this.f32971s = c1085f0F;
        this.f32972t = c1085f0F;
        U7.a<r> aVar = new U7.a<>();
        this.f32973u = aVar;
        this.f32974v = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f32975w = aVar2;
        this.f32976x = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Boolean bool = (Boolean) this.f32970r.d();
        if (bool == null ? false : bool.booleanValue()) {
            this.f32971s.setValue(Boolean.TRUE);
        } else {
            this.f32973u.j(r.f47939a);
        }
    }
}
