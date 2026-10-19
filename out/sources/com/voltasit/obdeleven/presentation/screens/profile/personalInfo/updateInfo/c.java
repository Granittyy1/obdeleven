package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import G8.G;
import K8.i;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.p;
import com.voltasit.obdeleven.domain.usecases.user.B;
import com.voltasit.obdeleven.domain.usecases.user.h;
import com.voltasit.obdeleven.presentation.d;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: PersonalInformationUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B f32982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f32983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f32984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.i f32985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f32986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f32987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r f32988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1085f0 f32989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1085f0 f32990w;

    public c(B b10, i iVar, h hVar, com.voltasit.obdeleven.domain.usecases.i iVar2, p pVar) {
        this.f32982o = b10;
        this.f32983p = iVar;
        this.f32984q = hVar;
        this.f32985r = iVar2;
        this.f32986s = pVar;
        v vVarA = P3.d.a();
        this.f32987t = vVarA;
        this.f32988u = C2688e.a(vVarA);
        C1085f0 c1085f0F = J0.f(new b(new G(null, null, null, null, null, null, null, null, 2047), "", false, "", false));
        this.f32989v = c1085f0F;
        this.f32990w = c1085f0F;
        C2680e.c(Z.a(this), null, null, new PersonalInformationUpdateViewModel$loadData$1(this, null), 3);
    }
}
