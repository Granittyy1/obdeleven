package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import retrofit2.d;
import retrofit2.f;
import retrofit2.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseCallback<T> implements f<T> {
    private final Twig twig = LumberMill.getLogger();

    public static String getDetails(ErrorObject errorObject) {
        String errorBody = errorObject.hasErrorBody() ? errorObject.getErrorBody() : errorObject.getThrowable().getMessage();
        return errorBody == null ? "unknown error" : errorBody;
    }

    private void handleError(ErrorObject errorObject) {
        logFailure("Api call failed", errorObject);
        onError(errorObject);
    }

    public void logFailure(String str, ErrorObject errorObject) {
        Twig twig = this.twig;
        StringBuilder sbF = C4.b.f(str, ": ");
        sbF.append(getDetails(errorObject));
        twig.e(sbF.toString(), new Object[0]);
    }

    @Override // retrofit2.f
    public final void onFailure(d<T> dVar, Throwable th) {
        handleError(new ErrorObject(th, null));
    }

    @Override // retrofit2.f
    public final void onResponse(d<T> dVar, v<T> vVar) {
        if (vVar == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), null));
            return;
        }
        T t8 = vVar.f46823b;
        if (t8 == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), vVar));
        } else if (vVar.f46822a.h()) {
            onSuccess(t8);
        } else {
            handleError(new ErrorObject(new Exception("Status code outside the 200-300 range"), vVar));
        }
    }

    public abstract void onSuccess(T t8);

    public void onError(ErrorObject errorObject) {
    }
}
