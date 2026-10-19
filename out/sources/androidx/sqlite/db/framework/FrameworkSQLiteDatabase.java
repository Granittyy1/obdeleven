package androidx.sqlite.db.framework;

import Ia.r;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.i;
import p285x2.f;

/* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements p285x2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f20138d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f20139e = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f20140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Pair<String, String>> f20141c;

    public FrameworkSQLiteDatabase(SQLiteDatabase delegate) {
        i.e(delegate, "delegate");
        this.f20140b = delegate;
        this.f20141c = delegate.getAttachedDbs();
    }

    @Override // p285x2.b
    public final boolean E0() {
        SQLiteDatabase sQLiteDatabase = this.f20140b;
        i.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // p285x2.b
    public final void P() {
        this.f20140b.setTransactionSuccessful();
    }

    @Override // p285x2.b
    public final void T() {
        this.f20140b.beginTransactionNonExclusive();
    }

    @Override // p285x2.b
    public final Cursor V0(final p285x2.e eVar, CancellationSignal cancellationSignal) {
        String sql = eVar.b();
        String[] strArr = f20139e;
        i.b(cancellationSignal);
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                p285x2.e eVar2 = eVar;
                i.b(sQLiteQuery);
                eVar2.c(new d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        SQLiteDatabase sQLiteDatabase = this.f20140b;
        i.e(sQLiteDatabase, "sQLiteDatabase");
        i.e(sql, "sql");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, strArr, null, cancellationSignal);
        i.d(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public final void b(String sql, Object[] bindArgs) throws SQLException {
        i.e(sql, "sql");
        i.e(bindArgs, "bindArgs");
        this.f20140b.execSQL(sql, bindArgs);
    }

    public final Cursor c(String query) {
        i.e(query, "query");
        return x0(new p285x2.a(query));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20140b.close();
    }

    @Override // p285x2.b
    public final void g0() {
        this.f20140b.endTransaction();
    }

    @Override // p285x2.b
    public final void l() {
        this.f20140b.beginTransaction();
    }

    @Override // p285x2.b
    public final void q(String sql) throws SQLException {
        i.e(sql, "sql");
        this.f20140b.execSQL(sql);
    }

    @Override // p285x2.b
    public final f u(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f20140b.compileStatement(str);
        i.d(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new e(sQLiteStatementCompileStatement);
    }

    @Override // p285x2.b
    public final boolean v0() {
        return this.f20140b.inTransaction();
    }

    @Override // p285x2.b
    public final Cursor x0(final p285x2.e eVar) {
        final r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> rVar = new r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // Ia.r
            public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                SQLiteQuery sQLiteQuery2 = sQLiteQuery;
                p285x2.e eVar2 = eVar;
                i.b(sQLiteQuery2);
                eVar2.c(new d(sQLiteQuery2));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
            }
        };
        Cursor cursorRawQueryWithFactory = this.f20140b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r tmp0 = rVar;
                i.e(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.b(), f20139e, null);
        i.d(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }
}
