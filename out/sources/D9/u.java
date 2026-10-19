package D9;

import io.grpc.ManagedChannelProvider;
import java.util.Comparator;

/* JADX INFO: compiled from: ManagedChannelRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Comparator<ManagedChannelProvider> {
    @Override // java.util.Comparator
    public final int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
        return managedChannelProvider.c() - managedChannelProvider2.c();
    }
}
