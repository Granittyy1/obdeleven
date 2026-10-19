package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.exceptions.InvalidUserSessionException;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: HandleExpiredSessionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.HandleExpiredSessionUC$invoke$1", f = "HandleExpiredSessionUC.kt", l = {16}, m = "invokeSuspend")
final class HandleExpiredSessionUC$invoke$1 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super p293xa.r>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.HandleExpiredSessionUC$invoke$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HandleExpiredSessionUC.kt */
    public static final class AnonymousClass1<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f30973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d<p293xa.r> f30974c;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(j jVar, InterfaceC2687d<? super p293xa.r> interfaceC2687d) {
            this.f30973b = jVar;
            this.f30974c = interfaceC2687d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Throwable th, kotlin.coroutines.c<? super p293xa.r> cVar) {
            HandleExpiredSessionUC$invoke$1$1$emit$1 handleExpiredSessionUC$invoke$1$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (cVar instanceof HandleExpiredSessionUC$invoke$1$1$emit$1) {
                handleExpiredSessionUC$invoke$1$1$emit$1 = (HandleExpiredSessionUC$invoke$1$1$emit$1) cVar;
                int i10 = handleExpiredSessionUC$invoke$1$1$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    handleExpiredSessionUC$invoke$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    handleExpiredSessionUC$invoke$1$1$emit$1 = new HandleExpiredSessionUC$invoke$1$1$emit$1(this, cVar);
                }
            } else {
                handleExpiredSessionUC$invoke$1$1$emit$1 = new HandleExpiredSessionUC$invoke$1$1$emit$1(this, cVar);
            }
            Object obj = handleExpiredSessionUC$invoke$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = handleExpiredSessionUC$invoke$1$1$emit$1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    anonymousClass1 = (AnonymousClass1) handleExpiredSessionUC$invoke$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            if (!(th instanceof InvalidUserSessionException)) {
                return p293xa.r.f47939a;
            }
            W7.c.b();
            u uVar = this.f30973b.f30998b;
            handleExpiredSessionUC$invoke$1$1$emit$1.L$0 = this;
            handleExpiredSessionUC$invoke$1$1$emit$1.label = 1;
            if (uVar.a(handleExpiredSessionUC$invoke$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            anonymousClass1 = this;
            InterfaceC2687d<p293xa.r> interfaceC2687d = anonymousClass1.f30974c;
            p293xa.r rVar = p293xa.r.f47939a;
            handleExpiredSessionUC$invoke$1$1$emit$1.L$0 = null;
            handleExpiredSessionUC$invoke$1$1$emit$1.label = 2;
            if (interfaceC2687d.emit(rVar, handleExpiredSessionUC$invoke$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleExpiredSessionUC$invoke$1(j jVar, kotlin.coroutines.c<? super HandleExpiredSessionUC$invoke$1> cVar) {
        super(2, cVar);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        HandleExpiredSessionUC$invoke$1 handleExpiredSessionUC$invoke$1 = new HandleExpiredSessionUC$invoke$1(this.this$0, cVar);
        handleExpiredSessionUC$invoke$1.L$0 = obj;
        return handleExpiredSessionUC$invoke$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<? super p293xa.r> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        ((HandleExpiredSessionUC$invoke$1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw new KotlinNothingValueException();
        }
        kotlin.b.b(obj);
        InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
        kotlinx.coroutines.flow.v vVarB = this.this$0.f30997a.b();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC2687d);
        this.label = 1;
        vVarB.collect(anonymousClass1, this);
        return coroutineSingletons;
    }
}
