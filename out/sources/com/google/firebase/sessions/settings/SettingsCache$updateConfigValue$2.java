package com.google.firebase.sessions.settings;

import Ia.p;
import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
final class SettingsCache$updateConfigValue$2 extends SuspendLambda implements p<MutablePreferences, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ androidx.datastore.preferences.core.c.a<Object> $key;
    final /* synthetic */ Object $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$2(Object obj, androidx.datastore.preferences.core.c.a<Object> aVar, SettingsCache settingsCache, kotlin.coroutines.c<? super SettingsCache$updateConfigValue$2> cVar) {
        super(2, cVar);
        this.$value = obj;
        this.$key = aVar;
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(this.$value, this.$key, this.this$0, cVar);
        settingsCache$updateConfigValue$2.L$0 = obj;
        return settingsCache$updateConfigValue$2;
    }

    @Override // Ia.p
    public final Object invoke(MutablePreferences mutablePreferences, kotlin.coroutines.c<? super r> cVar) {
        return ((SettingsCache$updateConfigValue$2) create(mutablePreferences, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        Object obj2 = this.$value;
        if (obj2 != null) {
            androidx.datastore.preferences.core.c.a<?> key = this.$key;
            mutablePreferences.getClass();
            i.e(key, "key");
            mutablePreferences.c(key, obj2);
        } else {
            androidx.datastore.preferences.core.c.a<Object> key2 = this.$key;
            mutablePreferences.getClass();
            i.e(key2, "key");
            if (mutablePreferences.f17084b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            mutablePreferences.f17083a.remove(key2);
        }
        SettingsCache.a(this.this$0, mutablePreferences);
        return r.f47939a;
    }
}
