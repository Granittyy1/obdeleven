package androidx.datastore.preferences.core;

import Ia.p;
import java.util.Map;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
final class PreferencesKt$edit$2 extends SuspendLambda implements p<c, kotlin.coroutines.c<? super c>, Object> {
    final /* synthetic */ p<MutablePreferences, kotlin.coroutines.c<? super r>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(p<? super MutablePreferences, ? super kotlin.coroutines.c<? super r>, ? extends Object> pVar, kotlin.coroutines.c<? super PreferencesKt$edit$2> cVar) {
        super(2, cVar);
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, cVar);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // Ia.p
    public final Object invoke(c cVar, kotlin.coroutines.c<? super c> cVar2) {
        return ((PreferencesKt$edit$2) create(cVar, cVar2)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            kotlin.b.b(obj);
            return mutablePreferences;
        }
        kotlin.b.b(obj);
        MutablePreferences mutablePreferences2 = new MutablePreferences((Map<c.a<?>, Object>) y.y(((c) this.L$0).a()), false);
        p<MutablePreferences, kotlin.coroutines.c<? super r>, Object> pVar = this.$transform;
        this.L$0 = mutablePreferences2;
        this.label = 1;
        return pVar.invoke(mutablePreferences2, this) == coroutineSingletons ? coroutineSingletons : mutablePreferences2;
    }
}
