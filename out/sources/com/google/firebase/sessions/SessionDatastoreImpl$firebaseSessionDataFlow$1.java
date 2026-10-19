package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m = "invokeSuspend")
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super androidx.datastore.preferences.core.c>, Throwable, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super androidx.datastore.preferences.core.c> interfaceC2687d, Throwable th, kotlin.coroutines.c<? super p293xa.r> cVar) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(3, cVar);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = interfaceC2687d;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
            MutablePreferences mutablePreferences = new MutablePreferences(1, true);
            this.L$0 = null;
            this.label = 1;
            if (interfaceC2687d.emit(mutablePreferences, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
