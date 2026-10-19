package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import p293xa.r;

/* JADX INFO: compiled from: InvalidationTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f20125b;

    public i(h hVar) {
        this.f20125b = hVar;
    }

    public final SetBuilder a() throws IOException {
        h hVar = this.f20125b;
        SetBuilder setBuilder = new SetBuilder();
        Cursor cursorK = hVar.f20110a.k(new p285x2.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (cursorK.moveToNext()) {
            try {
                setBuilder.add(Integer.valueOf(cursorK.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(cursorK, th);
                    throw th2;
                }
            }
        }
        r rVar = r.f47939a;
        p241t7.b.n(cursorK, null);
        SetBuilder setBuilderK = setBuilder.k();
        if (!setBuilderK.isEmpty()) {
            if (this.f20125b.f20116g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            p285x2.f fVar = this.f20125b.f20116g;
            if (fVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            fVar.t();
        }
        return setBuilderK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection invalidatedTablesIds;
        ReentrantReadWriteLock.ReadLock lock = this.f20125b.f20110a.f20069h.readLock();
        kotlin.jvm.internal.i.d(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
                if (!this.f20125b.a()) {
                    lock.unlock();
                    this.f20125b.getClass();
                    return;
                }
                if (!this.f20125b.f20114e.compareAndSet(true, false)) {
                    lock.unlock();
                    this.f20125b.getClass();
                    return;
                }
                if (this.f20125b.f20110a.g().b0().v0()) {
                    lock.unlock();
                    this.f20125b.getClass();
                    return;
                }
                p285x2.b bVarB0 = this.f20125b.f20110a.g().b0();
                bVarB0.T();
                try {
                    invalidatedTablesIds = a();
                    bVarB0.P();
                    bVarB0.g0();
                    lock.unlock();
                    this.f20125b.getClass();
                    if (invalidatedTablesIds.isEmpty()) {
                        return;
                    }
                    h hVar = this.f20125b;
                    synchronized (hVar.f20118i) {
                        o.b.e eVar = (o.b.e) hVar.f20118i.iterator();
                        if (eVar.hasNext()) {
                            ((h.d) ((Map.Entry) eVar.next()).getValue()).getClass();
                            kotlin.jvm.internal.i.e(invalidatedTablesIds, "invalidatedTablesIds");
                            throw null;
                        }
                        r rVar = r.f47939a;
                    }
                } catch (Throwable th) {
                    bVarB0.g0();
                    throw th;
                }
            } catch (Throwable th2) {
                lock.unlock();
                this.f20125b.getClass();
                throw th2;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            invalidatedTablesIds = EmptySet.f42985b;
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
            invalidatedTablesIds = EmptySet.f42985b;
        }
    }
}
