package Q2;

import androidx.room.SharedSQLiteStatement;

/* JADX INFO: renamed from: Q2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0735l extends SharedSQLiteStatement {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
