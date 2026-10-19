package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import okhttp3.B;
import retrofit2.v;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorObject {
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig = LumberMill.getLogger();

    public ErrorObject(Throwable th, v vVar) {
        this.throwable = th;
        this.errorBody = parseErrorBody(vVar);
        this.statusCode = parseStatusCode(vVar);
    }

    private String parseErrorBody(v vVar) {
        B b10;
        if (vVar == null || (b10 = vVar.f46824c) == null) {
            return null;
        }
        try {
            return b10.i();
        } catch (IOException e10) {
            this.twig.internal("Couldn't parse error body: " + e10.getMessage());
            return null;
        }
    }

    private int parseStatusCode(v vVar) {
        if (vVar != null) {
            return vVar.f46822a.f45683e;
        }
        return -1;
    }

    public String getErrorBody() {
        return this.errorBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean hasErrorBody() {
        return this.errorBody != null;
    }
}
