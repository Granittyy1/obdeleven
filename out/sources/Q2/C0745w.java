package Q2;

import androidx.room.SharedSQLiteStatement;

/* JADX INFO: renamed from: Q2.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkProgressDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0745w extends SharedSQLiteStatement {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
