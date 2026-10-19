package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import p285x2.f;

/* JADX INFO: compiled from: FrameworkSQLiteStatement.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteStatement f20169c;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f20169c = sQLiteStatement;
    }

    @Override // p285x2.f
    public final long T0() {
        return this.f20169c.executeInsert();
    }

    @Override // p285x2.f
    public final int t() {
        return this.f20169c.executeUpdateDelete();
    }
}
