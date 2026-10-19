package androidx.work.impl;

import D2.V;
import I4.f;
import K2.C0709b;
import K2.C0712e;
import K2.C0713f;
import K2.C0714g;
import K2.C0715h;
import K2.C0716i;
import K2.C0717j;
import K2.C0718k;
import K2.C0719l;
import K2.C0720m;
import K2.C0721n;
import K2.K;
import K2.L;
import K2.r;
import K2.s;
import R2.t;
import S2.c;
import android.app.ActivityManager;
import android.content.Context;
import androidx.room.RoomDatabase;
import com.voltasit.obdeleven.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p160n.b;

/* JADX INFO: compiled from: WorkManagerImplExt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final K a(Context context, androidx.work.a configuration) {
        RoomDatabase.a aVar;
        RoomDatabase.JournalMode journalMode;
        int i10;
        boolean zContainsKey;
        int i11 = 1;
        i.e(context, "context");
        i.e(configuration, "configuration");
        c cVar = new c(configuration.f20330b);
        Context applicationContext = context.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        t tVar = cVar.f5478a;
        i.d(tVar, "workTaskExecutor.serialTaskExecutor");
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        F8.a clock = configuration.f20331c;
        i.e(clock, "clock");
        if (z10) {
            aVar = new RoomDatabase.a(applicationContext, null);
            aVar.f20084i = true;
        } else {
            if (n.S("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            RoomDatabase.a aVar2 = new RoomDatabase.a(applicationContext, "androidx.work.workdb");
            aVar2.f20083h = new f(i11, applicationContext);
            aVar = aVar2;
        }
        aVar.f20081f = tVar;
        C0709b c0709b = new C0709b(clock);
        ArrayList arrayList = aVar.f20078c;
        arrayList.add(c0709b);
        aVar.a(C0716i.f4195c);
        aVar.a(new s(applicationContext, 2, 3));
        aVar.a(C0717j.f4196c);
        aVar.a(C0718k.f4197c);
        aVar.a(new s(applicationContext, 5, 6));
        aVar.a(C0719l.f4198c);
        aVar.a(C0720m.f4199c);
        aVar.a(C0721n.f4200c);
        aVar.a(new L(applicationContext));
        aVar.a(new s(applicationContext, 10, 11));
        aVar.a(C0712e.f4191c);
        aVar.a(C0713f.f4192c);
        aVar.a(C0714g.f4193c);
        aVar.a(C0715h.f4194c);
        aVar.f20085k = false;
        aVar.f20086l = true;
        Executor executor = aVar.f20081f;
        if (executor == null && aVar.f20082g == null) {
            p160n.a aVar3 = b.f44654e;
            aVar.f20082g = aVar3;
            aVar.f20081f = aVar3;
        } else if (executor != null && aVar.f20082g == null) {
            aVar.f20082g = executor;
        } else if (executor == null) {
            aVar.f20081f = aVar.f20082g;
        }
        HashSet hashSet = aVar.f20090p;
        LinkedHashSet linkedHashSet = aVar.f20089o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(J4.i.b(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        p285x2.c.InterfaceC0549c v10 = aVar.f20083h;
        if (v10 == null) {
            v10 = new V();
        }
        p285x2.c.InterfaceC0549c interfaceC0549c = v10;
        if (aVar.f20087m > 0) {
            if (aVar.f20077b != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z11 = aVar.f20084i;
        RoomDatabase.JournalMode journalMode2 = aVar.j;
        journalMode2.getClass();
        Context context2 = aVar.f20076a;
        RoomDatabase.JournalMode journalMode3 = RoomDatabase.JournalMode.f20072b;
        RoomDatabase.JournalMode journalMode4 = RoomDatabase.JournalMode.f20074d;
        if (journalMode2 != journalMode3) {
            journalMode = journalMode2;
        } else {
            Object systemService = context2.getSystemService("activity");
            i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            journalMode = !((ActivityManager) systemService).isLowRamDevice() ? journalMode4 : RoomDatabase.JournalMode.f20073c;
        }
        Executor executor2 = aVar.f20081f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = aVar.f20082g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        androidx.room.b bVar = new androidx.room.b(context2, aVar.f20077b, interfaceC0549c, aVar.f20088n, arrayList, z11, journalMode, executor2, executor3, aVar.f20085k, aVar.f20086l, linkedHashSet, aVar.f20079d, aVar.f20080e);
        Package r10 = WorkDatabase.class.getPackage();
        i.b(r10);
        String fullPackage = r10.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        i.b(canonicalName);
        i.d(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            i.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strReplace = canonicalName.replace('.', '_');
        i.d(strReplace, "replace(...)");
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? strConcat : fullPackage + '.' + strConcat, true, WorkDatabase.class.getClassLoader());
            i.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            RoomDatabase roomDatabase = (RoomDatabase) cls.newInstance();
            roomDatabase.getClass();
            roomDatabase.f20064c = roomDatabase.e(bVar);
            Set<Class<Object>> setH = roomDatabase.h();
            BitSet bitSet = new BitSet();
            Iterator<Class<Object>> it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = roomDatabase.f20068g;
                ArrayList arrayList2 = bVar.f20107n;
                if (zHasNext) {
                    Class<Object> next = it2.next();
                    int size = arrayList2.size() - 1;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    while (true) {
                        int i12 = size - 1;
                        if (next.isAssignableFrom(arrayList2.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        }
                        if (i12 < 0) {
                            size = -1;
                            break;
                        }
                        size = i12;
                    }
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(next, arrayList2.get(size));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i13 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i13 < 0) {
                                break;
                            }
                            size2 = i13;
                        }
                    }
                    for (p224s2.a aVar4 : roomDatabase.f(linkedHashMap)) {
                        int i14 = aVar4.f46883a;
                        RoomDatabase.c cVar2 = bVar.f20098d;
                        LinkedHashMap linkedHashMap2 = cVar2.f20091a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i14))) {
                            Map mapP = (Map) linkedHashMap2.get(Integer.valueOf(i14));
                            if (mapP == null) {
                                mapP = y.p();
                            }
                            zContainsKey = mapP.containsKey(Integer.valueOf(aVar4.f46884b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            cVar2.a(aVar4);
                        }
                    }
                    if (((androidx.room.a) RoomDatabase.n(androidx.room.a.class, roomDatabase.g())) != null) {
                        roomDatabase.f20065d.getClass();
                        i.e(null, "autoCloser");
                        throw null;
                    }
                    roomDatabase.g().setWriteAheadLoggingEnabled(bVar.f20101g == journalMode4);
                    roomDatabase.f20067f = bVar.f20099e;
                    roomDatabase.f20063b = bVar.f20102h;
                    Executor executor4 = bVar.f20103i;
                    i.e(executor4, "executor");
                    new ArrayDeque();
                    roomDatabase.f20066e = bVar.f20100f;
                    Map<Class<?>, List<Class<?>>> mapI = roomDatabase.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = mapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        ArrayList arrayList3 = bVar.f20106m;
                        if (!zHasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i15 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i15 >= 0) {
                                        size3 = i15;
                                    }
                                }
                            }
                            WorkDatabase workDatabase = (WorkDatabase) roomDatabase;
                            Context applicationContext2 = context.getApplicationContext();
                            i.d(applicationContext2, "context.applicationContext");
                            O2.n nVar = new O2.n(applicationContext2, cVar);
                            r rVar = new r(context.getApplicationContext(), configuration, cVar, workDatabase);
                            WorkManagerImplExtKt$WorkManagerImpl$1 schedulersCreator = WorkManagerImplExtKt$WorkManagerImpl$1.f20371b;
                            i.e(schedulersCreator, "schedulersCreator");
                            return new K(context.getApplicationContext(), configuration, cVar, workDatabase, schedulersCreator.i(context, configuration, cVar, workDatabase, nVar, rVar), rVar, nVar);
                        }
                        Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                        Class<?> key = next2.getKey();
                        for (Class<?> cls2 : next2.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 < 0) {
                                i10 = -1;
                                break;
                            }
                            while (true) {
                                int i16 = size4 - 1;
                                if (cls2.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                    bitSet2.set(size4);
                                    i10 = size4;
                                    break;
                                }
                                if (i16 < 0) {
                                    i10 = -1;
                                    break;
                                }
                                size4 = i16;
                            }
                            if (!(i10 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            roomDatabase.f20071k.put(cls2, arrayList3.get(i10));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }
}
