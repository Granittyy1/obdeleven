package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {R.styleable.AppCompatTheme_panelMenuListTheme}, m = "invokeSuspend")
public final class SessionDatastoreImpl$updateSessionId$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ SessionDatastoreImpl this$0;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Aa.c(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<MutablePreferences, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ String $sessionId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$sessionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(MutablePreferences mutablePreferences, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(mutablePreferences, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            String str = this.$sessionId;
            mutablePreferences.getClass();
            androidx.datastore.preferences.core.c.a<String> key = SessionDatastoreImpl.b.f28645a;
            kotlin.jvm.internal.i.e(key, "key");
            mutablePreferences.c(key, str);
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionDatastoreImpl$updateSessionId$1(SessionDatastoreImpl sessionDatastoreImpl, String str, kotlin.coroutines.c<? super SessionDatastoreImpl$updateSessionId$1> cVar) {
        super(2, cVar);
        this.this$0 = sessionDatastoreImpl;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SessionDatastoreImpl$updateSessionId$1(this.this$0, this.$sessionId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SessionDatastoreImpl$updateSessionId$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            SessionDatastoreImpl.a aVar = SessionDatastoreImpl.f28636e;
            Context context = this.this$0.f28638a;
            aVar.getClass();
            androidx.datastore.core.e eVar = (androidx.datastore.core.e) SessionDatastoreImpl.f28637f.a(context, SessionDatastoreImpl.a.f28644a[0]);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, null);
            this.label = 1;
            if (androidx.datastore.preferences.core.d.a(eVar, anonymousClass1, this) == coroutineSingletons) {
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
