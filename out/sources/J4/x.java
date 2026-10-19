package J4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: SchemaManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class x extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f4008d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4009e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<a> f4010f = Arrays.asList(new s(), new t(), new u(), new v(), new w());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4012c;

    /* JADX INFO: compiled from: SchemaManager.java */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public x(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f4012c = false;
        this.f4011b = i10;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f4010f;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                list.get(i10).a(sQLiteDatabase);
                i10++;
            }
        } else {
            StringBuilder sbA = B6.a.a("Migration from ", " to ", " was requested, but cannot be performed. Only ", i10, i11);
            sbA.append(list.size());
            sbA.append(" migrations are provided");
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f4012c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f4012c) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, this.f4011b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f4012c) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f4012c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f4012c) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, i10, i11);
    }
}
