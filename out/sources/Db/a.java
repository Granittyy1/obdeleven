package Db;

import E3.b;
import android.util.Log;
import kotlin.jvm.internal.i;
import org.koin.core.logger.Level;

/* JADX INFO: compiled from: AndroidLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    @Override // E3.b
    public final void l(Level level, String msg) {
        i.e(msg, "msg");
        int iOrdinal = level.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            Log.e("[Koin]", msg);
        } else {
            Log.e("[Koin]", msg);
        }
    }
}
