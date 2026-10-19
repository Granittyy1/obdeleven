package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    @Override // androidx.media3.exoplayer.upstream.b
    public final long a(b.a aVar) {
        Throwable cause = aVar.f18825a;
        if (!(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource$CleartextNotPermittedException) && !(cause instanceof Loader.UnexpectedLoaderException)) {
            int i10 = DataSourceException.f17921b;
            while (cause != null) {
                if (!(cause instanceof DataSourceException) || ((DataSourceException) cause).reason != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((aVar.f18826b - 1) * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final int b(int i10) {
        return i10 == 7 ? 6 : 3;
    }
}
