package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.y;

/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile FrameworkSQLiteDatabase f20062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f20063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p285x2.c f20064c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f20067f;
    public final Map<String, Object> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f20071k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f20065d = d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f20068g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f20069h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal<Integer> f20070i = new ThreadLocal<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static final class JournalMode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final JournalMode f20072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final JournalMode f20073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final JournalMode f20074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ JournalMode[] f20075e;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            f20072b = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            f20073c = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            f20074d = journalMode3;
            f20075e = new JournalMode[]{journalMode, journalMode2, journalMode3};
        }

        public JournalMode() {
            throw null;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) f20075e.clone();
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static class a<T extends RoomDatabase> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f20076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20077b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f20081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Executor f20082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public I4.f f20083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20084i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20086l;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public HashSet f20090p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f20078c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f20079d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f20080e = new ArrayList();
        public final JournalMode j = JournalMode.f20072b;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f20085k = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f20087m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final c f20088n = new c();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final LinkedHashSet f20089o = new LinkedHashSet();

        public a(Context context, String str) {
            this.f20076a = context;
            this.f20077b = str;
        }

        public final void a(p224s2.a... aVarArr) {
            if (this.f20090p == null) {
                this.f20090p = new HashSet();
            }
            for (p224s2.a aVar : aVarArr) {
                HashSet hashSet = this.f20090p;
                kotlin.jvm.internal.i.b(hashSet);
                hashSet.add(Integer.valueOf(aVar.f46883a));
                HashSet hashSet2 = this.f20090p;
                kotlin.jvm.internal.i.b(hashSet2);
                hashSet2.add(Integer.valueOf(aVar.f46884b));
            }
            this.f20088n.a((p224s2.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f20091a = new LinkedHashMap();

        public final void a(p224s2.a... migrations) {
            kotlin.jvm.internal.i.e(migrations, "migrations");
            for (p224s2.a aVar : migrations) {
                int i10 = aVar.f46883a;
                LinkedHashMap linkedHashMap = this.f20091a;
                Integer numValueOf = Integer.valueOf(i10);
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                int i11 = aVar.f46884b;
                if (treeMap2.containsKey(Integer.valueOf(i11))) {
                    Objects.toString(treeMap2.get(Integer.valueOf(i11)));
                    aVar.toString();
                }
                treeMap2.put(Integer.valueOf(i11), aVar);
            }
        }
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.d(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.j = mapSynchronizedMap;
        this.f20071k = new LinkedHashMap();
    }

    public static Object n(Class cls, p285x2.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof androidx.room.c) {
            return n(cls, ((androidx.room.c) cVar).b());
        }
        return null;
    }

    public final void a() {
        if (!this.f20066e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().b0().v0() && this.f20070i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @p293xa.d
    public final void c() {
        a();
        a();
        p285x2.b bVarB0 = g().b0();
        this.f20065d.c(bVarB0);
        if (bVarB0.E0()) {
            bVarB0.T();
        } else {
            bVarB0.l();
        }
    }

    public abstract h d();

    public abstract p285x2.c e(androidx.room.b bVar);

    public List f(LinkedHashMap autoMigrationSpecs) {
        kotlin.jvm.internal.i.e(autoMigrationSpecs, "autoMigrationSpecs");
        return EmptyList.f42983b;
    }

    public final p285x2.c g() {
        p285x2.c cVar = this.f20064c;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.i.m("internalOpenHelper");
        throw null;
    }

    public Set<Class<Object>> h() {
        return EmptySet.f42985b;
    }

    public Map<Class<?>, List<Class<?>>> i() {
        return y.p();
    }

    public final void j() {
        g().b0().g0();
        if (g().b0().v0()) {
            return;
        }
        h hVar = this.f20065d;
        if (hVar.f20114e.compareAndSet(false, true)) {
            Executor executor = hVar.f20110a.f20063b;
            if (executor != null) {
                executor.execute(hVar.f20120l);
            } else {
                kotlin.jvm.internal.i.m("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final Cursor k(p285x2.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? g().b0().V0(eVar, cancellationSignal) : g().b0().x0(eVar);
    }

    public final <V> V l(Callable<V> callable) {
        c();
        try {
            V vCall = callable.call();
            m();
            return vCall;
        } finally {
            j();
        }
    }

    @p293xa.d
    public final void m() {
        g().b0().P();
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static abstract class b {
        public void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }
}
