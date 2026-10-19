package androidx.room;

import android.database.Cursor;
import android.util.Log;
import androidx.core.view.C1293h;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.M1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.m;
import p293xa.r;

/* JADX INFO: compiled from: RoomOpenHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends x2.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.room.b f20126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl.a f20127c;

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    public static abstract class a {
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20129b;

        public b(boolean z10, String str) {
            this.f20128a = z10;
            this.f20129b = str;
        }
    }

    public j(androidx.room.b bVar, WorkDatabase_Impl.a aVar) {
        super(20);
        this.f20126b = bVar;
        this.f20127c = aVar;
    }

    @Override // x2.c.a
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        Cursor cursorC = frameworkSQLiteDatabase.c("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = cursorC.moveToFirst() && cursorC.getInt(0) == 0;
            p241t7.b.n(cursorC, null);
            WorkDatabase_Impl.a aVar = this.f20127c;
            aVar.a(frameworkSQLiteDatabase);
            if (!z10) {
                b bVarB = aVar.b(frameworkSQLiteDatabase);
                if (!bVarB.f20128a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.f20129b);
                }
            }
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            ArrayList arrayList = workDatabase_Impl.f20067f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) workDatabase_Impl.f20067f.get(i10)).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p241t7.b.n(cursorC, th);
                throw th2;
            }
        }
    }

    @Override // x2.c.a
    public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11) throws IOException {
        f(frameworkSQLiteDatabase, i10, i11);
    }

    @Override // x2.c.a
    public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        Cursor cursorC = frameworkSQLiteDatabase.c("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = cursorC.moveToFirst() && cursorC.getInt(0) != 0;
            p241t7.b.n(cursorC, null);
            if (z10) {
                Cursor cursorX0 = frameworkSQLiteDatabase.x0(new p285x2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorX0.moveToFirst() ? cursorX0.getString(0) : null;
                    p241t7.b.n(cursorX0, null);
                    if (!"7d73d21f1bd82c9e5268b6dcf9fde2cb".equals(string) && !"3071c8717539de5d5353f4c8cd59a032".equals(string)) {
                        throw new IllegalStateException(B7.b.c("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: ", string));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p241t7.b.n(cursorX0, th);
                        throw th2;
                    }
                }
            } else {
                b bVarB = this.f20127c.b(frameworkSQLiteDatabase);
                if (!bVarB.f20128a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.f20129b);
                }
                frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
            }
            WorkDatabase_Impl.a aVar = this.f20127c;
            WorkDatabase_Impl.this.f20062a = frameworkSQLiteDatabase;
            frameworkSQLiteDatabase.q("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            workDatabase_Impl.getClass();
            h hVar = workDatabase_Impl.f20065d;
            hVar.getClass();
            synchronized (hVar.f20119k) {
                if (hVar.f20115f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                } else {
                    frameworkSQLiteDatabase.q("PRAGMA temp_store = MEMORY;");
                    frameworkSQLiteDatabase.q("PRAGMA recursive_triggers='ON';");
                    frameworkSQLiteDatabase.q("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                    hVar.c(frameworkSQLiteDatabase);
                    hVar.f20116g = frameworkSQLiteDatabase.u("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                    hVar.f20115f = true;
                    r rVar = r.f47939a;
                }
            }
            ArrayList arrayList = WorkDatabase_Impl.this.f20067f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f20067f.get(i10)).a(frameworkSQLiteDatabase);
                }
            }
            this.f20126b = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                p241t7.b.n(cursorC, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[LOOP:3: B:11:0x0026->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    @Override // x2.c.a
    public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11) throws IOException {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z10;
        Integer targetVersion;
        int i12;
        int iIntValue;
        int iIntValue2;
        androidx.room.b bVar = this.f20126b;
        WorkDatabase_Impl.a aVar = this.f20127c;
        if (bVar != null) {
            RoomDatabase.c cVar = bVar.f20098d;
            cVar.getClass();
            if (i10 == i11) {
                iterable = EmptyList.f42983b;
            } else {
                boolean z11 = i11 > i10;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i10;
                while (true) {
                    if (z11) {
                        if (iIntValue3 < i11) {
                            treeMap = (TreeMap) cVar.f20091a.get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (z11) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z10 = false;
                                        break;
                                    }
                                    targetVersion = (Integer) it.next();
                                    if (z11) {
                                        i12 = iIntValue3 + 1;
                                        kotlin.jvm.internal.i.d(targetVersion, "targetVersion");
                                        iIntValue = targetVersion.intValue();
                                        if (i12 <= iIntValue && iIntValue <= i11) {
                                            Object obj = treeMap.get(targetVersion);
                                            kotlin.jvm.internal.i.b(obj);
                                            arrayList.add(obj);
                                            iIntValue3 = targetVersion.intValue();
                                            z10 = true;
                                            break;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.d(targetVersion, "targetVersion");
                                        iIntValue2 = targetVersion.intValue();
                                        if (i11 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            Object obj2 = treeMap.get(targetVersion);
                                            kotlin.jvm.internal.i.b(obj2);
                                            arrayList.add(obj2);
                                            iIntValue3 = targetVersion.intValue();
                                            z10 = true;
                                            break;
                                            break;
                                        }
                                    }
                                }
                                if (!z10) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i11) {
                        treeMap = (TreeMap) cVar.f20091a.get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (z11) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z10 = false;
                                    break;
                                    break;
                                }
                                targetVersion = (Integer) it.next();
                                if (z11) {
                                    i12 = iIntValue3 + 1;
                                    kotlin.jvm.internal.i.d(targetVersion, "targetVersion");
                                    iIntValue = targetVersion.intValue();
                                    if (i12 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.d(targetVersion, "targetVersion");
                                    iIntValue2 = targetVersion.intValue();
                                    if (i11 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (!z10) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                ListBuilder listBuilderF = M1.f();
                Cursor cursorC = frameworkSQLiteDatabase.c("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorC.moveToNext()) {
                    try {
                        listBuilderF.add(cursorC.getString(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p241t7.b.n(cursorC, th);
                            throw th2;
                        }
                    }
                }
                r rVar = r.f47939a;
                p241t7.b.n(cursorC, null);
                ListIterator listIterator = listBuilderF.I().listIterator(0);
                while (true) {
                    ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    String triggerName = (String) aVar2.next();
                    kotlin.jvm.internal.i.d(triggerName, "triggerName");
                    if (m.I(triggerName, "room_fts_content_sync_", false)) {
                        frameworkSQLiteDatabase.q("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((p224s2.a) it2.next()).a(frameworkSQLiteDatabase);
                }
                b bVarB = aVar.b(frameworkSQLiteDatabase);
                if (!bVarB.f20128a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + bVarB.f20129b);
                }
                frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                return;
            }
        }
        androidx.room.b bVar2 = this.f20126b;
        if (bVar2 != null) {
            if (!((i10 <= i11 || !bVar2.f20104k) && bVar2.j && ((linkedHashSet = bVar2.f20105l) == null || !linkedHashSet.contains(Integer.valueOf(i10))))) {
                frameworkSQLiteDatabase.q("DROP TABLE IF EXISTS `Dependency`");
                frameworkSQLiteDatabase.q("DROP TABLE IF EXISTS `WorkSpec`");
                frameworkSQLiteDatabase.q("DROP TABLE IF EXISTS `WorkTag`");
                frameworkSQLiteDatabase.q("DROP TABLE IF EXISTS `SystemIdInfo`");
                frameworkSQLiteDatabase.q("DROP TABLE IF EXISTS `WorkName`");
                frameworkSQLiteDatabase.q("DROP TABLE IF EXISTS `WorkProgress`");
                frameworkSQLiteDatabase.q("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                ArrayList arrayList2 = workDatabase_Impl.f20067f;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((RoomDatabase.b) workDatabase_Impl.f20067f.get(i13)).getClass();
                    }
                }
                aVar.a(frameworkSQLiteDatabase);
                return;
            }
        }
        throw new IllegalStateException(C1293h.h("A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.", i10, i11));
    }

    @Override // x2.c.a
    public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }
}
