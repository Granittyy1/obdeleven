package Q2;

import androidx.room.SharedSQLiteStatement;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class L extends SharedSQLiteStatement {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "DELETE FROM workspec WHERE id=?";
    }
}
