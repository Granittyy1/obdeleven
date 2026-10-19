package Q2;

/* JADX INFO: renamed from: Q2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PreferenceDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0730g extends androidx.room.d<C0728e> {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // androidx.room.d
    public final void e(p285x2.f fVar, C0728e c0728e) {
        C0728e c0728e2 = c0728e;
        fVar.r(1, c0728e2.f5016a);
        fVar.O(2, c0728e2.f5017b.longValue());
    }
}
