package Q2;

import androidx.room.SharedSQLiteStatement;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class O extends SharedSQLiteStatement {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
