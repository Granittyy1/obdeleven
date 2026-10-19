package Q2;

/* JADX INFO: compiled from: WorkTagDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class W extends androidx.room.d<U> {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // androidx.room.d
    public final void e(p285x2.f fVar, U u10) {
        U u11 = u10;
        String str = u11.f5010a;
        if (str == null) {
            fVar.p0(1);
        } else {
            fVar.r(1, str);
        }
        fVar.r(2, u11.f5011b);
    }
}
