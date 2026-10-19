package Q2;

/* JADX INFO: compiled from: WorkNameDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.room.d<C0739p> {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // androidx.room.d
    public final void e(p285x2.f fVar, C0739p c0739p) {
        C0739p c0739p2 = c0739p;
        c0739p2.getClass();
        fVar.p0(1);
        fVar.r(2, c0739p2.f5027a);
    }
}
