package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17921b = 0;
    public final int reason;

    public DataSourceException(int i10) {
        this.reason = i10;
    }

    public DataSourceException(int i10, Exception exc) {
        super(exc);
        this.reason = i10;
    }

    public DataSourceException(String str, Exception exc, int i10) {
        super(str, exc);
        this.reason = i10;
    }
}
