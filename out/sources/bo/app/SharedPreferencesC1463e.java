package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: renamed from: bo.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC1463e implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f20881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2694i0 f20882d;

    /* JADX INFO: renamed from: bo.app.e$a */
    public static final class a extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20883b;

        public a(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return SharedPreferencesC1463e.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f20883b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            SharedPreferencesC1463e.this.f20879a.getSharedPreferences(SharedPreferencesC1463e.this.f20880b, 0);
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: renamed from: bo.app.e$b */
    public static final class b extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20885b;

        public b(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((b) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return SharedPreferencesC1463e.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f20885b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                InterfaceC2694i0 interfaceC2694i0 = SharedPreferencesC1463e.this.f20882d;
                this.f20885b = 1;
                if (interfaceC2694i0.C(this) == coroutineSingletons) {
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

    public SharedPreferencesC1463e(Context context, String name) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(name, "name");
        this.f20879a = context;
        this.f20880b = name;
        this.f20882d = C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new a(null), 3);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            return sharedPreferences.contains(str);
        }
        kotlin.jvm.internal.i.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.i.m("prefs");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        kotlin.jvm.internal.i.d(editorEdit, "prefs.edit()");
        return editorEdit;
    }

    @Override // android.content.SharedPreferences
    public Map getAll() throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.i.m("prefs");
            throw null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        kotlin.jvm.internal.i.d(all, "prefs.all");
        return all;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, z10);
        }
        kotlin.jvm.internal.i.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            return sharedPreferences.getFloat(str, f10);
        }
        kotlin.jvm.internal.i.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, i10);
        }
        kotlin.jvm.internal.i.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, j);
        }
        kotlin.jvm.internal.i.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, str2);
        }
        kotlin.jvm.internal.i.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            return sharedPreferences.getStringSet(str, set);
        }
        kotlin.jvm.internal.i.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            kotlin.jvm.internal.i.m("prefs");
            throw null;
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f20881c;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            kotlin.jvm.internal.i.m("prefs");
            throw null;
        }
    }

    private final void a() throws Throwable {
        if (!this.f20882d.I0()) {
            C2680e.d(EmptyCoroutineContext.f43032b, new b(null));
        }
        SharedPreferences sharedPreferences = this.f20879a.getSharedPreferences(this.f20880b, 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f20881c = sharedPreferences;
    }
}
