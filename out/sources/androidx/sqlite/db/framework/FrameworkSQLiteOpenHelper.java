package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.compose.animation.D;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import p293xa.g;

/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements p285x2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x2.c.a f20144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g<OpenHelper> f20147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20148h;

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f20149i = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f20150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f20151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x2.c.a f20152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f20153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f20154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p298y2.a f20155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f20156h;

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class CallbackException extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.callbackName = callbackName;
                this.cause = th;
            }

            public final CallbackName a() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.cause;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class CallbackName {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final CallbackName f20157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final CallbackName f20158c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final CallbackName f20159d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final CallbackName f20160e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final CallbackName f20161f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ CallbackName[] f20162g;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                f20157b = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                f20158c = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                f20159d = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                f20160e = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                f20161f = callbackName5;
                f20162g = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public CallbackName() {
                throw null;
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) f20162g.clone();
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class a {
            public static FrameworkSQLiteDatabase a(a refHolder, SQLiteDatabase sqLiteDatabase) {
                i.e(refHolder, "refHolder");
                i.e(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = refHolder.f20163a;
                if (frameworkSQLiteDatabase != null && i.a(frameworkSQLiteDatabase.f20140b, sqLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.f20163a = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final a aVar, final x2.c.a callback, boolean z10) {
            super(context, str, null, callback.f47884a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.c
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase dbObj) {
                    x2.c.a callback2 = callback;
                    i.e(callback2, "$callback");
                    FrameworkSQLiteOpenHelper.a aVar2 = aVar;
                    int i10 = FrameworkSQLiteOpenHelper.OpenHelper.f20149i;
                    i.d(dbObj, "dbObj");
                    FrameworkSQLiteDatabase frameworkSQLiteDatabaseA = FrameworkSQLiteOpenHelper.OpenHelper.a.a(aVar2, dbObj);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + frameworkSQLiteDatabaseA + ".path");
                    SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabaseA.f20140b;
                    if (!sQLiteDatabase.isOpen()) {
                        String path = sQLiteDatabase.getPath();
                        if (path != null) {
                            x2.c.a.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = frameworkSQLiteDatabaseA.f20141c;
                        } catch (SQLiteException unused) {
                        }
                        try {
                            frameworkSQLiteDatabaseA.close();
                        } catch (IOException unused2) {
                        }
                        if (list != null) {
                            return;
                        }
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                i.d(obj, "p.second");
                                x2.c.a.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase.getPath();
                            if (path2 != null) {
                                x2.c.a.a(path2);
                            }
                        }
                    }
                }
            });
            i.e(callback, "callback");
            this.f20150b = context;
            this.f20151c = aVar;
            this.f20152d = callback;
            this.f20153e = z10;
            str = str == null ? D.c("randomUUID().toString()") : str;
            File cacheDir = context.getCacheDir();
            i.d(cacheDir, "context.cacheDir");
            this.f20155g = new p298y2.a(str, cacheDir, false);
        }

        public final p285x2.b b(boolean z10) {
            p298y2.a aVar = this.f20155g;
            try {
                aVar.a((this.f20156h || getDatabaseName() == null) ? false : true);
                this.f20154f = false;
                SQLiteDatabase sQLiteDatabaseI = i(z10);
                if (!this.f20154f) {
                    return c(sQLiteDatabaseI);
                }
                close();
                return b(z10);
            } finally {
                aVar.b();
            }
        }

        public final FrameworkSQLiteDatabase c(SQLiteDatabase sqLiteDatabase) {
            i.e(sqLiteDatabase, "sqLiteDatabase");
            return a.a(this.f20151c, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            p298y2.a aVar = this.f20155g;
            try {
                aVar.a(aVar.f48228a);
                super.close();
                this.f20151c.f20163a = null;
                this.f20156h = false;
            } finally {
                aVar.b();
            }
        }

        public final SQLiteDatabase h(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                i.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            i.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase i(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            Context context = this.f20150b;
            if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    parentFile.toString();
                }
            }
            try {
                return h(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return h(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int iOrdinal = callbackException.a().ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f20153e) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return h(z10);
                    } catch (CallbackException e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db2) {
            i.e(db2, "db");
            try {
                this.f20152d.b(c(db2));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f20157b, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            i.e(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f20152d.c(c(sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f20158c, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            i.e(db2, "db");
            this.f20154f = true;
            try {
                this.f20152d.d(c(db2), i10, i11);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f20160e, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db2) {
            i.e(db2, "db");
            if (!this.f20154f) {
                try {
                    this.f20152d.e(c(db2));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.f20161f, th);
                }
            }
            this.f20156h = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            i.e(sqLiteDatabase, "sqLiteDatabase");
            this.f20154f = true;
            try {
                this.f20152d.f(c(sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f20159d, th);
            }
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FrameworkSQLiteDatabase f20163a = null;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, x2.c.a callback, boolean z10, boolean z11) {
        i.e(callback, "callback");
        this.f20142b = context;
        this.f20143c = str;
        this.f20144d = callback;
        this.f20145e = z10;
        this.f20146f = z11;
        this.f20147g = kotlin.a.a(new Ia.a<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            @Override // Ia.a
            public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.this$0;
                if (frameworkSQLiteOpenHelper.f20143c == null || !frameworkSQLiteOpenHelper.f20145e) {
                    FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper2 = this.this$0;
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper2.f20142b, frameworkSQLiteOpenHelper2.f20143c, new FrameworkSQLiteOpenHelper.a(), frameworkSQLiteOpenHelper2.f20144d, frameworkSQLiteOpenHelper2.f20146f);
                } else {
                    File noBackupFilesDir = this.this$0.f20142b.getNoBackupFilesDir();
                    i.d(noBackupFilesDir, "context.noBackupFilesDir");
                    File file = new File(noBackupFilesDir, this.this$0.f20143c);
                    Context context2 = this.this$0.f20142b;
                    String absolutePath = file.getAbsolutePath();
                    FrameworkSQLiteOpenHelper.a aVar = new FrameworkSQLiteOpenHelper.a();
                    FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper3 = this.this$0;
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, absolutePath, aVar, frameworkSQLiteOpenHelper3.f20144d, frameworkSQLiteOpenHelper3.f20146f);
                }
                openHelper.setWriteAheadLoggingEnabled(this.this$0.f20148h);
                return openHelper;
            }
        });
    }

    @Override // p285x2.c
    public final p285x2.b b0() {
        return this.f20147g.getValue().b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g<OpenHelper> gVar = this.f20147g;
        if (gVar.d()) {
            gVar.getValue().close();
        }
    }

    @Override // p285x2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        g<OpenHelper> gVar = this.f20147g;
        if (gVar.d()) {
            OpenHelper sQLiteOpenHelper = gVar.getValue();
            i.e(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
        }
        this.f20148h = z10;
    }
}
