package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class ManagedChannelRegistry {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f36882c = Logger.getLogger(ManagedChannelRegistry.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ManagedChannelRegistry f36883d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<ManagedChannelProvider> f36884a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<ManagedChannelProvider> f36885b = Collections.emptyList();

    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;
    }

    public static final class a implements r.a<ManagedChannelProvider> {
        @Override // io.grpc.r.a
        public final boolean a(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.b();
        }

        @Override // io.grpc.r.a
        public final int b(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.c();
        }
    }

    public static List<Class<?>> a() {
        Logger logger = f36882c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(E9.d.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
