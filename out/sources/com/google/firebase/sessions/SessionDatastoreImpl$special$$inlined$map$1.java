package com.google.firebase.sessions;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionDatastoreImpl$special$$inlined$map$1 implements InterfaceC2686c<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 f28646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SessionDatastoreImpl f28647c;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    public static final class AnonymousClass2<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d f28648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SessionDatastoreImpl f28649c;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @Aa.c(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {224}, m = "emit")
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(InterfaceC2687d interfaceC2687d, SessionDatastoreImpl sessionDatastoreImpl) {
            this.f28648b = interfaceC2687d;
            this.f28649c = sessionDatastoreImpl;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            AnonymousClass1 anonymousClass1;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i10 = anonymousClass1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(cVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
            Object obj2 = anonymousClass1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = anonymousClass1.label;
            if (i11 == 0) {
                kotlin.b.b(obj2);
                SessionDatastoreImpl.a aVar = SessionDatastoreImpl.f28636e;
                this.f28649c.getClass();
                j jVar = new j((String) ((androidx.datastore.preferences.core.c) obj).b(SessionDatastoreImpl.b.f28645a));
                anonymousClass1.label = 1;
                if (this.f28648b.emit(jVar, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj2);
            }
            return p293xa.r.f47939a;
        }
    }

    public SessionDatastoreImpl$special$$inlined$map$1(FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, SessionDatastoreImpl sessionDatastoreImpl) {
        this.f28646b = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        this.f28647c = sessionDatastoreImpl;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super j> interfaceC2687d, kotlin.coroutines.c cVar) throws Throwable {
        Object objCollect = this.f28646b.collect(new AnonymousClass2(interfaceC2687d, this.f28647c), cVar);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
    }
}
