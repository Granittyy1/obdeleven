package E9;

import io.grpc.ManagedChannelProvider;
import io.grpc.l;
import io.grpc.okhttp.OkHttpChannelBuilder;

/* JADX INFO: compiled from: OkHttpChannelProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ManagedChannelProvider {
    @Override // io.grpc.ManagedChannelProvider
    public l a(String str) {
        return new OkHttpChannelBuilder(str);
    }

    @Override // io.grpc.ManagedChannelProvider
    public boolean b() {
        return true;
    }

    @Override // io.grpc.ManagedChannelProvider
    public int c() {
        try {
            Class.forName("android.app.Application", false, d.class.getClassLoader());
            return 8;
        } catch (Exception unused) {
            return 3;
        }
    }
}
