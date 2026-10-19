package Q2;

/* JADX INFO: renamed from: Q2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DependencyDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0726c extends androidx.room.d<C0724a> {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // androidx.room.d
    public final void e(p285x2.f fVar, C0724a c0724a) {
        C0724a c0724a2 = c0724a;
        fVar.r(1, c0724a2.f5012a);
        String str = c0724a2.f5013b;
        if (str == null) {
            fVar.p0(2);
        } else {
            fVar.r(2, str);
        }
    }
}
