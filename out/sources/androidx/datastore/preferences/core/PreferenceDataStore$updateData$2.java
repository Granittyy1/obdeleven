package androidx.datastore.preferences.core;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
final class PreferenceDataStore$updateData$2 extends SuspendLambda implements p<c, kotlin.coroutines.c<? super c>, Object> {
    final /* synthetic */ p<c, kotlin.coroutines.c<? super c>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStore$updateData$2(p<? super c, ? super kotlin.coroutines.c<? super c>, ? extends Object> pVar, kotlin.coroutines.c<? super PreferenceDataStore$updateData$2> cVar) {
        super(2, cVar);
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, cVar);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // Ia.p
    public final Object invoke(c cVar, kotlin.coroutines.c<? super c> cVar2) {
        return ((PreferenceDataStore$updateData$2) create(cVar, cVar2)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            c cVar = (c) this.L$0;
            p<c, kotlin.coroutines.c<? super c>, Object> pVar = this.$transform;
            this.label = 1;
            obj = pVar.invoke(cVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        c cVar2 = (c) obj;
        ((MutablePreferences) cVar2).f17084b.set(true);
        return cVar2;
    }
}
