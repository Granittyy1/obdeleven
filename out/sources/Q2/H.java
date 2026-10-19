package Q2;

import androidx.room.SharedSQLiteStatement;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class H extends SharedSQLiteStatement {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
