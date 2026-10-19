package Q2;

/* JADX INFO: renamed from: Q2.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkProgressDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0744v extends androidx.room.d<C0742t> {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    @Override // androidx.room.d
    public final void e(p285x2.f fVar, C0742t c0742t) throws Throwable {
        C0742t c0742t2 = c0742t;
        String str = c0742t2.f5030a;
        if (str == null) {
            fVar.p0(1);
        } else {
            fVar.r(1, str);
        }
        byte[] bArrB = androidx.work.d.b(c0742t2.f5031b);
        if (bArrB == null) {
            fVar.p0(2);
        } else {
            fVar.X(2, bArrB);
        }
    }
}
