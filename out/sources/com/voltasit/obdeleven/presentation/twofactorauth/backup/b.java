package com.voltasit.obdeleven.presentation.twofactorauth.backup;

import androidx.lifecycle.C;
import com.voltasit.obdeleven.presentation.d;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorAuthBackupViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C f33295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U7.a<r> f33296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U7.a f33297q;

    public b(String backupCode) {
        i.e(backupCode, "backupCode");
        this.f33295o = new C(backupCode);
        U7.a<r> aVar = new U7.a<>();
        this.f33296p = aVar;
        this.f33297q = aVar;
    }
}
