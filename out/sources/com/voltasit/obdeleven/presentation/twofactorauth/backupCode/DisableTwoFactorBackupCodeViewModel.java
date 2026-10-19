package com.voltasit.obdeleven.presentation.twofactorauth.backupCode;

import Ia.l;
import K8.v;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.user.C2123d;
import com.voltasit.obdeleven.presentation.d;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: DisableTwoFactorBackupCodeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public class DisableTwoFactorBackupCodeViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2123d f33302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f33303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C<Integer> f33304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C f33305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C<String> f33306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B f33307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a<r> f33308u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a f33309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a<r> f33310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a f33311x;

    public DisableTwoFactorBackupCodeViewModel(C2123d c2123d, v vVar) {
        this.f33302o = c2123d;
        this.f33303p = vVar;
        C<Integer> c10 = new C<>(-1);
        this.f33304q = c10;
        this.f33305r = c10;
        C<String> c11 = new C<>("");
        this.f33306s = c11;
        this.f33307t = X.a(c11, new l<String, Boolean>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeViewModel$isEnabled$1
            @Override // Ia.l
            public final Boolean invoke(String str) {
                return Boolean.valueOf(str.length() == 10);
            }
        });
        U7.a<r> aVar = new U7.a<>();
        this.f33308u = aVar;
        this.f33309v = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f33310w = aVar2;
        this.f33311x = aVar2;
    }

    public void b() {
        C2680e.c(Z.a(this), this.f32112a, null, new DisableTwoFactorBackupCodeViewModel$buttonClick$1(this, null), 2);
    }
}
