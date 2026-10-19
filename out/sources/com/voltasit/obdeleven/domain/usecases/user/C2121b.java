package com.voltasit.obdeleven.domain.usecases.user;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import com.voltasit.parse.Parse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangePasswordUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2121b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.network.b f30980b;

    public C2121b(K8.v vVar, com.voltasit.obdeleven.network.b bVar) {
        this.f30979a = vVar;
        this.f30980b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ChangePasswordUC$invoke$1 changePasswordUC$invoke$1;
        C2121b c2121b;
        p255u9.z zVar;
        if (continuationImpl instanceof ChangePasswordUC$invoke$1) {
            changePasswordUC$invoke$1 = (ChangePasswordUC$invoke$1) continuationImpl;
            int i10 = changePasswordUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                changePasswordUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                changePasswordUC$invoke$1 = new ChangePasswordUC$invoke$1(this, continuationImpl);
            }
        } else {
            changePasswordUC$invoke$1 = new ChangePasswordUC$invoke$1(this, continuationImpl);
        }
        Object obj = changePasswordUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = changePasswordUC$invoke$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    zVar = (p255u9.z) changePasswordUC$invoke$1.L$1;
                    c2121b = (C2121b) changePasswordUC$invoke$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return new C8.a.b(p293xa.r.f47939a);
            }
            kotlin.b.b(obj);
            p255u9.z zVarL = this.f30979a.L();
            zVarL.setPassword(str);
            Task<Void> taskSaveInBackground = zVarL.saveInBackground();
            kotlin.jvm.internal.i.d(taskSaveInBackground, "saveInBackground(...)");
            changePasswordUC$invoke$1.L$0 = this;
            changePasswordUC$invoke$1.L$1 = zVarL;
            changePasswordUC$invoke$1.label = 1;
            if (ParseTaskExtensionsKt.b(taskSaveInBackground, changePasswordUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2121b = this;
            zVar = zVarL;
            Parse.f34394a.f34437a = zVar.getSessionToken();
            com.voltasit.obdeleven.network.b bVar = c2121b.f30980b;
            String sessionToken = zVar.getSessionToken();
            kotlin.jvm.internal.i.d(sessionToken, "getSessionToken(...)");
            bVar.a(sessionToken);
            K8.v vVar = c2121b.f30979a;
            changePasswordUC$invoke$1.L$0 = null;
            changePasswordUC$invoke$1.L$1 = null;
            changePasswordUC$invoke$1.label = 2;
            if (vVar.q(false, changePasswordUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return new C8.a.b(p293xa.r.f47939a);
        } catch (Exception e10) {
            return new C8.a.C0024a(e10);
        }
    }
}
