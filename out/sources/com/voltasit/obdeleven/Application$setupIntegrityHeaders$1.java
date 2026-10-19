package com.voltasit.obdeleven;

import Aa.c;
import Ia.p;
import J8.m;
import com.voltasit.obdeleven.domain.models.integrity.IntegrityTokenType;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.g;
import p293xa.r;

/* JADX INFO: compiled from: Application.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.Application$setupIntegrityHeaders$1", f = "Application.kt", l = {185}, m = "invokeSuspend")
final class Application$setupIntegrityHeaders$1 extends SuspendLambda implements p<byte[], kotlin.coroutines.c<? super com.voltasit.sharednetwork.integrity.a>, Object> {
    final /* synthetic */ g<m> $integrityProvider$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Application$setupIntegrityHeaders$1(g<? extends m> gVar, kotlin.coroutines.c<? super Application$setupIntegrityHeaders$1> cVar) {
        super(2, cVar);
        this.$integrityProvider$delegate = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        Application$setupIntegrityHeaders$1 application$setupIntegrityHeaders$1 = new Application$setupIntegrityHeaders$1(this.$integrityProvider$delegate, cVar);
        application$setupIntegrityHeaders$1.L$0 = obj;
        return application$setupIntegrityHeaders$1;
    }

    @Override // Ia.p
    public final Object invoke(byte[] bArr, kotlin.coroutines.c<? super com.voltasit.sharednetwork.integrity.a> cVar) {
        return ((Application$setupIntegrityHeaders$1) create(bArr, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            byte[] bArr = (byte[]) this.L$0;
            g<m> gVar = this.$integrityProvider$delegate;
            p279w9.b bVar = Application.f29634b;
            m value = gVar.getValue();
            this.label = 1;
            objB = value.b(bArr, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            objB = ((Result) obj).b();
        }
        if (objB instanceof Result.Failure) {
            objB = null;
        }
        H8.a aVar = (H8.a) objB;
        if (aVar == null) {
            return null;
        }
        IntegrityTokenType integrityTokenType = IntegrityTokenType.f30558b;
        return new com.voltasit.sharednetwork.integrity.a(aVar.f3739a, "PlayIntegrity", aVar.f3740b);
    }
}
