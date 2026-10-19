package io.grpc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ManagedChannelProvider {

    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;
    }

    public abstract l<?> a(String str);

    public abstract boolean b();

    public abstract int c();
}
