package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.exceptions.HttpException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Disable2FaUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2124e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30986a;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.e$a */
    /* JADX INFO: compiled from: Disable2FaUC.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Disable2FaUC.kt */
        public static final class C0324a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0324a f30987a = new C0324a();
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.e$a$b */
        /* JADX INFO: compiled from: Disable2FaUC.kt */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f30988a = new b();
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.e$a$c */
        /* JADX INFO: compiled from: Disable2FaUC.kt */
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f30989a = new c();
        }
    }

    public C2124e(K8.v vVar) {
        this.f30986a = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Disable2FaUC$invoke$1 disable2FaUC$invoke$1;
        C2124e c2124e;
        if (continuationImpl instanceof Disable2FaUC$invoke$1) {
            disable2FaUC$invoke$1 = (Disable2FaUC$invoke$1) continuationImpl;
            int i10 = disable2FaUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                disable2FaUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                disable2FaUC$invoke$1 = new Disable2FaUC$invoke$1(this, continuationImpl);
            }
        } else {
            disable2FaUC$invoke$1 = new Disable2FaUC$invoke$1(this, continuationImpl);
        }
        Object objN = disable2FaUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = disable2FaUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objN);
            disable2FaUC$invoke$1.L$0 = this;
            disable2FaUC$invoke$1.label = 1;
            objN = this.f30986a.n(str, disable2FaUC$invoke$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2124e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2124e = (C2124e) disable2FaUC$invoke$1.L$0;
            kotlin.b.b(objN);
        }
        C8.a aVar = (C8.a) objN;
        if (aVar instanceof C8.a.b) {
            return a.c.f30989a;
        }
        if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th = ((C8.a.C0024a) aVar).f2462a;
        c2124e.getClass();
        return kotlin.jvm.internal.i.a(th, HttpException.BadRequest.f30405b) ? a.b.f30988a : a.C0324a.f30987a;
    }
}
