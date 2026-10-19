package p058e7;

import A8.p;
import D9.a;
import D9.t;
import D9.u;
import T6.b;
import com.google.android.gms.internal.measurement.C1787c0;
import io.grpc.ManagedChannelProvider;
import io.grpc.ManagedChannelRegistry;
import io.grpc.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: GrpcChannelModule_ProvidesGrpcChannelFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements b<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f34818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<String> f34819b;

    public s(p pVar, p268va.a<String> aVar) {
        this.f34818a = pVar;
        this.f34819b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        ManagedChannelRegistry managedChannelRegistry;
        List<ManagedChannelProvider> list;
        p pVar = this.f34818a;
        String str = this.f34819b.get();
        pVar.getClass();
        Logger logger = ManagedChannelRegistry.f36882c;
        synchronized (ManagedChannelRegistry.class) {
            try {
                if (ManagedChannelRegistry.f36883d == null) {
                    List<ManagedChannelProvider> listA = r.a(ManagedChannelProvider.class, ManagedChannelRegistry.a(), ManagedChannelProvider.class.getClassLoader(), new ManagedChannelRegistry.a());
                    ManagedChannelRegistry.f36883d = new ManagedChannelRegistry();
                    for (ManagedChannelProvider managedChannelProvider : listA) {
                        ManagedChannelRegistry.f36882c.fine("Service loader found " + managedChannelProvider);
                        ManagedChannelRegistry managedChannelRegistry2 = ManagedChannelRegistry.f36883d;
                        synchronized (managedChannelRegistry2) {
                            p.f("isAvailable() returned false", managedChannelProvider.b());
                            managedChannelRegistry2.f36884a.add(managedChannelProvider);
                        }
                    }
                    ManagedChannelRegistry managedChannelRegistry3 = ManagedChannelRegistry.f36883d;
                    synchronized (managedChannelRegistry3) {
                        ArrayList arrayList = new ArrayList(managedChannelRegistry3.f36884a);
                        Collections.sort(arrayList, Collections.reverseOrder(new u()));
                        managedChannelRegistry3.f36885b = Collections.unmodifiableList(arrayList);
                    }
                }
                managedChannelRegistry = ManagedChannelRegistry.f36883d;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (managedChannelRegistry) {
            list = managedChannelRegistry.f36885b;
        }
        ManagedChannelProvider managedChannelProvider2 = list.isEmpty() ? null : list.get(0);
        if (managedChannelProvider2 == null) {
            throw new ManagedChannelProvider.ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
        }
        t tVarA = managedChannelProvider2.a(str).a();
        C1787c0.f(tVarA);
        return tVarA;
    }
}
