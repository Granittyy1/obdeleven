package androidx.room;

/* JADX INFO: compiled from: EntityInsertionAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> extends SharedSQLiteStatement {
    public abstract void e(p285x2.f fVar, T t8);

    public final void f(T t8) {
        p285x2.f fVarA = a();
        try {
            e(fVarA, t8);
            fVarA.T0();
        } finally {
            d(fVarA);
        }
    }
}
