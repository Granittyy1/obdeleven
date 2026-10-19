package Q2;

/* JADX INFO: renamed from: Q2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0734k extends androidx.room.d<C0732i> {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // androidx.room.d
    public final void e(p285x2.f fVar, C0732i c0732i) {
        C0732i c0732i2 = c0732i;
        String str = c0732i2.f5018a;
        if (str == null) {
            fVar.p0(1);
        } else {
            fVar.r(1, str);
        }
        fVar.O(2, c0732i2.f5019b);
        fVar.O(3, c0732i2.f5020c);
    }
}
