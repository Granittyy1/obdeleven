package Q2;

import androidx.room.SharedSQLiteStatement;

/* JADX INFO: compiled from: WorkTagDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class X extends SharedSQLiteStatement {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "DELETE FROM worktag WHERE work_spec_id=?";
    }
}
