package com.google.firebase.sessions.settings;

import Ia.p;
import androidx.datastore.core.e;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.d;
import com.braze.Constants;
import java.io.IOException;
import java.util.Map;
import kotlin.collections.y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingsCache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final androidx.datastore.preferences.core.c.a<Boolean> f28754c = new androidx.datastore.preferences.core.c.a<>("firebase_sessions_enabled");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final androidx.datastore.preferences.core.c.a<Double> f28755d = new androidx.datastore.preferences.core.c.a<>("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final androidx.datastore.preferences.core.c.a<Integer> f28756e = new androidx.datastore.preferences.core.c.a<>("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final androidx.datastore.preferences.core.c.a<Integer> f28757f = new androidx.datastore.preferences.core.c.a<>("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final androidx.datastore.preferences.core.c.a<Long> f28758g = new androidx.datastore.preferences.core.c.a<>("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<androidx.datastore.preferences.core.c> f28759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f28760b;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: SettingsCache.kt */
    @Aa.c(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SettingsCache.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SettingsCache settingsCache;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                InterfaceC2686c<androidx.datastore.preferences.core.c> data = settingsCache2.f28759a.getData();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object objJ = C2688e.j(data, this);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                settingsCache = settingsCache2;
                obj = objJ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (SettingsCache) this.L$0;
                kotlin.b.b(obj);
            }
            SettingsCache.a(settingsCache, new MutablePreferences((Map<androidx.datastore.preferences.core.c.a<?>, Object>) y.y(((androidx.datastore.preferences.core.c) obj).a()), true));
            return r.f47939a;
        }
    }

    public SettingsCache(e<androidx.datastore.preferences.core.c> eVar) throws Throwable {
        this.f28759a = eVar;
        C2680e.d(EmptyCoroutineContext.f43032b, new AnonymousClass1(null));
    }

    public static final void a(SettingsCache settingsCache, androidx.datastore.preferences.core.c cVar) {
        settingsCache.getClass();
        settingsCache.f28760b = new c((Boolean) cVar.b(f28754c), (Double) cVar.b(f28755d), (Integer) cVar.b(f28756e), (Integer) cVar.b(f28757f), (Long) cVar.b(f28758g));
    }

    public final boolean b() {
        Integer num;
        c cVar = this.f28760b;
        if (cVar == null) {
            i.m("sessionConfigs");
            throw null;
        }
        if (cVar != null) {
            Long l10 = cVar.f28769e;
            return l10 == null || (num = cVar.f28768d) == null || (System.currentTimeMillis() - l10.longValue()) / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) >= ((long) num.intValue());
        }
        i.m("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(androidx.datastore.preferences.core.c.a aVar, Object obj, ContinuationImpl continuationImpl) {
        SettingsCache$updateConfigValue$1 settingsCache$updateConfigValue$1;
        if (continuationImpl instanceof SettingsCache$updateConfigValue$1) {
            settingsCache$updateConfigValue$1 = (SettingsCache$updateConfigValue$1) continuationImpl;
            int i10 = settingsCache$updateConfigValue$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                settingsCache$updateConfigValue$1.label = i10 - Integer.MIN_VALUE;
            } else {
                settingsCache$updateConfigValue$1 = new SettingsCache$updateConfigValue$1(this, continuationImpl);
            }
        } else {
            settingsCache$updateConfigValue$1 = new SettingsCache$updateConfigValue$1(this, continuationImpl);
        }
        Object obj2 = settingsCache$updateConfigValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = settingsCache$updateConfigValue$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj2);
                e<androidx.datastore.preferences.core.c> eVar = this.f28759a;
                SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(obj, aVar, this, null);
                settingsCache$updateConfigValue$1.label = 1;
                if (d.a(eVar, settingsCache$updateConfigValue$2, settingsCache$updateConfigValue$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj2);
            }
        } catch (IOException e10) {
            e10.toString();
        }
        return r.f47939a;
    }
}
