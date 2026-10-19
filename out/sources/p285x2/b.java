package p285x2;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: compiled from: SupportSQLiteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {
    boolean E0();

    void P();

    void T();

    Cursor V0(e eVar, CancellationSignal cancellationSignal);

    void g0();

    void l();

    void q(String str) throws SQLException;

    f u(String str);

    boolean v0();

    Cursor x0(e eVar);
}
