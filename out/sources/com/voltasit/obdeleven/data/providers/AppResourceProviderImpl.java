package com.voltasit.obdeleven.data.providers;

import android.app.Application;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: AppResourceProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppResourceProviderImpl implements p242t9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.odx.g f30195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.o f30196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.p f30197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J8.s f30198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.v f30199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.odx.b f30200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J8.a f30201g;

    public AppResourceProviderImpl(Application application, com.voltasit.obdeleven.domain.usecases.odx.g gVar, A8.o oVar, J8.p pVar, J8.s sVar, com.voltasit.obdeleven.domain.usecases.user.v vVar, com.voltasit.obdeleven.domain.usecases.odx.b bVar, com.voltasit.obdeleven.domain.usecases.odx.c cVar, J8.a aVar) {
        this.f30195a = gVar;
        this.f30196b = oVar;
        this.f30197c = pVar;
        this.f30198d = sVar;
        this.f30199e = vVar;
        this.f30200f = bVar;
        this.f30201g = aVar;
    }

    @Override // p242t9.a
    public final String a() {
        return this.f30198d.a();
    }

    @Override // p242t9.a
    public final void b(Exception exc) {
        this.f30197c.d(exc, true);
    }

    @Override // p242t9.a
    public final com.obdeleven.service.odx.c c(short s10, String odxName, String odxVersion, String platform, boolean z10) {
        kotlin.jvm.internal.i.e(odxName, "odxName");
        kotlin.jvm.internal.i.e(odxVersion, "odxVersion");
        kotlin.jvm.internal.i.e(platform, "platform");
        return new com.obdeleven.service.odx.c(s10, odxName, odxVersion, platform, z10);
    }

    @Override // p242t9.a
    public final p255u9.l d(com.obdeleven.service.odx.c odxFileInfo) {
        kotlin.jvm.internal.i.e(odxFileInfo, "odxFileInfo");
        return (p255u9.l) C2680e.d(EmptyCoroutineContext.f43032b, new AppResourceProviderImpl$findOdxDb$1(this, odxFileInfo, null));
    }

    @Override // p242t9.a
    public final void e() {
        C2680e.c(C2673a0.f43223b, null, null, new AppResourceProviderImpl$notifySubscriptionFunctionUsed$1(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p242t9.a
    public final String f(String encryptedPassword) throws Throwable {
        C8.a c0024a;
        kotlin.jvm.internal.i.e(encryptedPassword, "encryptedPassword");
        com.voltasit.obdeleven.domain.usecases.odx.b bVar = this.f30200f;
        J8.i iVar = bVar.f30892b;
        try {
            c0024a = new C8.a.b(new String(iVar.e(E8.a.b(encryptedPassword), E8.a.b(iVar.c(6)), E8.a.b(iVar.c(7))), kotlin.text.a.f43120b));
        } catch (Throwable th) {
            bVar.f30891a.d(th, false);
            c0024a = new C8.a.C0024a(th);
        }
        if (c0024a instanceof C8.a.b) {
            return (String) ((C8.a.b) c0024a).f2463a;
        }
        if (c0024a instanceof C8.a.C0024a) {
            throw ((C8.a.C0024a) c0024a).f2462a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p242t9.a
    public final com.obdeleven.service.odx.d g(String filename) {
        kotlin.jvm.internal.i.e(filename, "filename");
        return com.voltasit.obdeleven.domain.usecases.odx.c.a(filename);
    }

    @Override // p242t9.a
    public final String h() {
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // p242t9.a
    public final p279w9.b i() {
        p279w9.b bVar = com.voltasit.obdeleven.Application.f29634b;
        return com.voltasit.obdeleven.Application.f29634b;
    }
}
