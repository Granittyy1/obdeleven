package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionDatastoreImpl implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28636e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final androidx.datastore.preferences.b f28637f = androidx.datastore.preferences.a.a(m.f28728a, new O0.b(new Ia.l<CorruptionException, androidx.datastore.preferences.core.c>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2
        @Override // Ia.l
        public final androidx.datastore.preferences.core.c invoke(CorruptionException corruptionException) throws Throwable {
            CorruptionException ex = corruptionException;
            kotlin.jvm.internal.i.e(ex, "ex");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                kotlin.jvm.internal.i.d(Process.myProcessName(), "myProcessName()");
            } else if (i10 < 28 || Application.getProcessName() == null) {
                Y4.f.a();
            }
            return new MutablePreferences(1, true);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f28639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<j> f28640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SessionDatastoreImpl$special$$inlined$map$1 f28641d;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Aa.c(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1$a */
        /* JADX INFO: compiled from: SessionDatastore.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SessionDatastoreImpl f28642b;

            public a(SessionDatastoreImpl sessionDatastoreImpl) {
                this.f28642b = sessionDatastoreImpl;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                this.f28642b.f28640c.set((j) obj);
                return p293xa.r.f47939a;
            }
        }

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SessionDatastoreImpl.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                SessionDatastoreImpl$special$$inlined$map$1 sessionDatastoreImpl$special$$inlined$map$1 = sessionDatastoreImpl.f28641d;
                a aVar = new a(sessionDatastoreImpl);
                this.label = 1;
                if (sessionDatastoreImpl$special$$inlined$map$1.collect(aVar, this) == coroutineSingletons) {
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

    /* JADX INFO: compiled from: SessionDatastore.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Oa.l<Object>[] f28644a;

        static {
            PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(a.class);
            kotlin.jvm.internal.l.f43062a.getClass();
            f28644a = new Oa.l[]{propertyReference2Impl};
        }
    }

    /* JADX INFO: compiled from: SessionDatastore.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.datastore.preferences.core.c.a<String> f28645a = new androidx.datastore.preferences.core.c.a<>("session_id");
    }

    public SessionDatastoreImpl(Context context, kotlin.coroutines.e eVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f28638a = context;
        this.f28639b = eVar;
        this.f28640c = new AtomicReference<>();
        f28636e.getClass();
        this.f28641d = new SessionDatastoreImpl$special$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(((androidx.datastore.core.e) f28637f.a(context, a.f28644a[0])).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1(3, null)), this);
        C2680e.c(B.a(eVar), null, null, new AnonymousClass1(null), 3);
    }

    @Override // com.google.firebase.sessions.n
    public final String a() {
        j jVar = this.f28640c.get();
        if (jVar != null) {
            return jVar.f28720a;
        }
        return null;
    }

    @Override // com.google.firebase.sessions.n
    public final void b(String sessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        C2680e.c(B.a(this.f28639b), null, null, new SessionDatastoreImpl$updateSessionId$1(this, sessionId, null), 3);
    }
}
