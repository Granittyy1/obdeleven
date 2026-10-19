package io.intercom.android.sdk.helpcenter.utils.networking;

import java.lang.reflect.Type;
import kotlin.jvm.internal.i;
import retrofit2.d;
import retrofit2.e;

/* JADX INFO: compiled from: NetworkResponseAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkResponseAdapter<S> implements e<S, d<NetworkResponse<? extends S>>> {
    public static final int $stable = 8;
    private final Type successType;

    public NetworkResponseAdapter(Type successType) {
        i.e(successType, "successType");
        this.successType = successType;
    }

    @Override // retrofit2.e
    public Type responseType() {
        return this.successType;
    }

    @Override // retrofit2.e
    public d<NetworkResponse<S>> adapt(d<S> call) {
        i.e(call, "call");
        return new NetworkResponseCall(call);
    }
}
