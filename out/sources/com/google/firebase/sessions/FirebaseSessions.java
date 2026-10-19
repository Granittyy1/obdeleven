package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.os.Messenger;
import android.util.Log;
import androidx.core.view.C1293h;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FirebaseSessions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p144l6.e f28632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionsSettings f28633b;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    /* JADX INFO: compiled from: FirebaseSessions.kt */
    @Aa.c(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {44, R.styleable.AppCompatTheme_checkboxStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ kotlin.coroutines.e $backgroundDispatcher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.coroutines.e eVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$backgroundDispatcher = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return FirebaseSessions.this.new AnonymousClass1(this.$backgroundDispatcher, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0070  */
        /* JADX WARN: Code duplicated, block: B:29:0x0075  */
        /* JADX WARN: Code duplicated, block: B:31:0x007d  */
        /* JADX WARN: Code duplicated, block: B:32:0x0082  */
        /* JADX WARN: Code duplicated, block: B:35:0x0086  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SessionsSettings sessionsSettings;
            Boolean boolA;
            Boolean boolA2;
            boolean zBooleanValue;
            u uVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                sessionsSettings = FirebaseSessions.this.f28633b;
                boolA = sessionsSettings.f28750a.a();
                if (boolA != null) {
                    zBooleanValue = boolA.booleanValue();
                } else {
                    boolA2 = sessionsSettings.f28751b.a();
                    if (boolA2 != null) {
                        zBooleanValue = boolA2.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                }
                if (zBooleanValue) {
                    kotlin.coroutines.e eVar = this.$backgroundDispatcher;
                    uVar = new u(eVar);
                    Object objB = p144l6.e.c().b(w.class);
                    kotlin.jvm.internal.i.d(objB, "Firebase.app[SessionLife…erviceBinder::class.java]");
                    ((w) objB).a(new Messenger(new u.a(eVar)), uVar.f28780d);
                    y.f28784b.getClass();
                    y.f28786d = uVar;
                    if (y.f28785c) {
                        y.f28785c = false;
                        uVar.b(1);
                    }
                    p144l6.e eVar2 = FirebaseSessions.this.f28632a;
                    C1293h c1293h = new C1293h(0);
                    eVar2.a();
                    eVar2.j.add(c1293h);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.f28674a;
            this.label = 1;
            obj = aVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((SessionSubscriber) it.next()).a());
                SessionsSettings sessionsSettings2 = FirebaseSessions.this.f28633b;
                this.label = 2;
                if (sessionsSettings2.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sessionsSettings = FirebaseSessions.this.f28633b;
                boolA = sessionsSettings.f28750a.a();
                if (boolA != null) {
                    zBooleanValue = boolA.booleanValue();
                } else {
                    boolA2 = sessionsSettings.f28751b.a();
                    if (boolA2 != null) {
                        zBooleanValue = boolA2.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                }
                if (zBooleanValue) {
                    kotlin.coroutines.e eVar3 = this.$backgroundDispatcher;
                    uVar = new u(eVar3);
                    Object objB2 = p144l6.e.c().b(w.class);
                    kotlin.jvm.internal.i.d(objB2, "Firebase.app[SessionLife…erviceBinder::class.java]");
                    ((w) objB2).a(new Messenger(new u.a(eVar3)), uVar.f28780d);
                    y.f28784b.getClass();
                    y.f28786d = uVar;
                    if (y.f28785c) {
                        y.f28785c = false;
                        uVar.b(1);
                    }
                    p144l6.e eVar4 = FirebaseSessions.this.f28632a;
                    C1293h c1293h2 = new C1293h(0);
                    eVar4.a();
                    eVar4.j.add(c1293h2);
                }
            }
            return p293xa.r.f47939a;
        }
    }

    public FirebaseSessions(p144l6.e eVar, SessionsSettings sessionsSettings, kotlin.coroutines.e eVar2) {
        this.f28632a = eVar;
        this.f28633b = sessionsSettings;
        eVar.a();
        Context applicationContext = eVar.f44388a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(y.f28784b);
            C2680e.c(B.a(eVar2), null, null, new AnonymousClass1(eVar2, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
