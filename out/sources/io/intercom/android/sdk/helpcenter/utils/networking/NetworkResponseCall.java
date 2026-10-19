package io.intercom.android.sdk.helpcenter.utils.networking;

import java.io.IOException;
import kotlin.jvm.internal.i;
import okhttp3.u;
import okhttp3.z;
import p318zb.I;
import retrofit2.d;
import retrofit2.f;
import retrofit2.v;

/* JADX INFO: compiled from: NetworkResponseCall.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkResponseCall<S> implements d<NetworkResponse<? extends S>> {
    public static final int $stable = 8;
    private final d<S> delegate;

    public NetworkResponseCall(d<S> delegate) {
        i.e(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // retrofit2.d
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // retrofit2.d
    public void enqueue(final f<NetworkResponse<S>> callback) {
        i.e(callback, "callback");
        this.delegate.enqueue(new f<S>() { // from class: io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseCall.enqueue.1
            @Override // retrofit2.f
            public void onFailure(d<S> call, Throwable throwable) {
                i.e(call, "call");
                i.e(throwable, "throwable");
                callback.onResponse(this, v.a(throwable instanceof IOException ? new NetworkResponse.NetworkError((IOException) throwable) : new NetworkResponse.ClientError(throwable)));
            }

            @Override // retrofit2.f
            public void onResponse(d<S> call, v<S> response) {
                i.e(call, "call");
                i.e(response, "response");
                z zVar = response.f46822a;
                if (!zVar.h()) {
                    callback.onResponse(this, v.a(new NetworkResponse.ServerError(zVar.f45683e)));
                    return;
                }
                S s10 = response.f46823b;
                if (s10 != null) {
                    callback.onResponse(this, v.a(new NetworkResponse.Success(s10)));
                } else {
                    callback.onResponse(this, v.a(new NetworkResponse.ClientError(new Throwable())));
                }
            }
        });
    }

    public v<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.d
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // retrofit2.d
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // retrofit2.d
    public u request() {
        u uVarRequest = this.delegate.request();
        i.d(uVarRequest, "request(...)");
        return uVarRequest;
    }

    @Override // retrofit2.d
    public I timeout() {
        I iTimeout = this.delegate.timeout();
        i.d(iTimeout, "timeout(...)");
        return iTimeout;
    }

    @Override // retrofit2.d
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NetworkResponseCall<S> m58clone() {
        d<S> dVarM58clone = this.delegate.m58clone();
        i.d(dVarM58clone, "clone(...)");
        return new NetworkResponseCall<>(dVarM58clone);
    }
}
