package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.exceptions.HttpException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Disable2FaBackupCodeUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2123d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30982a;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.d$a */
    /* JADX INFO: compiled from: Disable2FaBackupCodeUC.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Disable2FaBackupCodeUC.kt */
        public static final class C0323a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0323a f30983a = new C0323a();
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.d$a$b */
        /* JADX INFO: compiled from: Disable2FaBackupCodeUC.kt */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f30984a = new b();
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.d$a$c */
        /* JADX INFO: compiled from: Disable2FaBackupCodeUC.kt */
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f30985a = new c();
        }
    }

    public C2123d(K8.v vVar) {
        this.f30982a = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Disable2FaBackupCodeUC$invoke$1 disable2FaBackupCodeUC$invoke$1;
        C2123d c2123d;
        if (continuationImpl instanceof Disable2FaBackupCodeUC$invoke$1) {
            disable2FaBackupCodeUC$invoke$1 = (Disable2FaBackupCodeUC$invoke$1) continuationImpl;
            int i10 = disable2FaBackupCodeUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                disable2FaBackupCodeUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                disable2FaBackupCodeUC$invoke$1 = new Disable2FaBackupCodeUC$invoke$1(this, continuationImpl);
            }
        } else {
            disable2FaBackupCodeUC$invoke$1 = new Disable2FaBackupCodeUC$invoke$1(this, continuationImpl);
        }
        Object objJ = disable2FaBackupCodeUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = disable2FaBackupCodeUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objJ);
            disable2FaBackupCodeUC$invoke$1.L$0 = this;
            disable2FaBackupCodeUC$invoke$1.label = 1;
            objJ = this.f30982a.j(str, disable2FaBackupCodeUC$invoke$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2123d = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2123d = (C2123d) disable2FaBackupCodeUC$invoke$1.L$0;
            kotlin.b.b(objJ);
        }
        C8.a aVar = (C8.a) objJ;
        if (aVar instanceof C8.a.b) {
            return a.c.f30985a;
        }
        if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th = ((C8.a.C0024a) aVar).f2462a;
        c2123d.getClass();
        return kotlin.jvm.internal.i.a(th, HttpException.BadRequest.f30405b) ? a.b.f30984a : a.C0323a.f30983a;
    }
}
