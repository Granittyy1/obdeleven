package com.voltasit.obdeleven.presentation.twofactorauth.backupCode;

import J8.d;
import K8.v;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.user.C2123d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: LoginTwoFactorBackupCodeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends DisableTwoFactorBackupCodeViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final d f33319A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U7.a<r> f33320B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final U7.a f33321C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final U7.a<Integer> f33322D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final U7.a f33323E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final G8.r f33324y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.r f33325z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(G8.r loginData, com.voltasit.obdeleven.domain.usecases.user.r rVar, C2123d c2123d, v vVar, d dVar) {
        super(c2123d, vVar);
        i.e(loginData, "loginData");
        this.f33324y = loginData;
        this.f33325z = rVar;
        this.f33319A = dVar;
        U7.a<r> aVar = new U7.a<>();
        this.f33320B = aVar;
        this.f33321C = aVar;
        U7.a<Integer> aVar2 = new U7.a<>();
        this.f33322D = aVar2;
        this.f33323E = aVar2;
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeViewModel
    public final void b() {
        C2680e.c(Z.a(this), this.f32112a, null, new LoginTwoFactorBackupCodeViewModel$buttonClick$1(this, null), 2);
    }
}
