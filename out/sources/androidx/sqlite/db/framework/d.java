package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FrameworkSQLiteProgram.kt */
/* JADX INFO: loaded from: classes.dex */
public class d implements p285x2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteProgram f20168b;

    public d(SQLiteProgram delegate) {
        i.e(delegate, "delegate");
        this.f20168b = delegate;
    }

    @Override // p285x2.d
    public final void O(int i10, long j) {
        this.f20168b.bindLong(i10, j);
    }

    @Override // p285x2.d
    public final void X(int i10, byte[] bArr) {
        this.f20168b.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20168b.close();
    }

    @Override // p285x2.d
    public final void p0(int i10) {
        this.f20168b.bindNull(i10);
    }

    @Override // p285x2.d
    public final void r(int i10, String value) {
        i.e(value, "value");
        this.f20168b.bindString(i10, value);
    }

    @Override // p285x2.d
    public final void z(int i10, double d10) {
        this.f20168b.bindDouble(i10, d10);
    }
}
