package J9;

import A8.p;
import D9.w;
import D9.x;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.k;
import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.Status;
import io.grpc.internal.C2250v0;
import io.grpc.internal.K0;
import io.grpc.internal.R0;
import io.grpc.m;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends io.grpc.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final io.grpc.a.b<a> f4062k = new io.grpc.a.b<>("addressTrackerKey");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f4064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J9.e f4065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final R0.a f4066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f4067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w.c f4068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f4069i;
    public final ChannelLogger j;

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f4070a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f4073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4074e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile C0055a f4071b = new C0055a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0055a f4072c = new C0055a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final HashSet f4075f = new HashSet();

        /* JADX INFO: renamed from: J9.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
        public static class C0055a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AtomicLong f4076a = new AtomicLong();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicLong f4077b = new AtomicLong();
        }

        public a(f fVar) {
            this.f4070a = fVar;
        }

        public final void a(h hVar) {
            if (d() && !hVar.f4109c) {
                hVar.j();
            } else if (!d() && hVar.f4109c) {
                hVar.f4109c = false;
                D9.h hVar2 = hVar.f4110d;
                if (hVar2 != null) {
                    hVar.f4111e.a(hVar2);
                    hVar.f4112f.b(ChannelLogger.ChannelLogLevel.f36863c, "Subchannel unejected: {0}", hVar);
                }
            }
            hVar.f4108b = this;
            this.f4075f.add(hVar);
        }

        public final void b(long j) {
            this.f4073d = Long.valueOf(j);
            this.f4074e++;
            Iterator it = this.f4075f.iterator();
            while (it.hasNext()) {
                ((h) it.next()).j();
            }
        }

        public final long c() {
            return this.f4072c.f4077b.get() + this.f4072c.f4076a.get();
        }

        public final boolean d() {
            return this.f4073d != null;
        }

        public final void e() {
            p.p("not currently ejected", this.f4073d != null);
            this.f4073d = null;
            for (h hVar : this.f4075f) {
                hVar.f4109c = false;
                D9.h hVar2 = hVar.f4110d;
                if (hVar2 != null) {
                    hVar.f4111e.a(hVar2);
                    hVar.f4112f.b(ChannelLogger.ChannelLogLevel.f36863c, "Subchannel unejected: {0}", hVar);
                }
            }
        }

        public final String toString() {
            return "AddressTracker{subchannels=" + this.f4075f + '}';
        }
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public static class b extends k<SocketAddress, a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f4078b = new HashMap();

        @Override // com.google.common.collect.l
        public final Object a() {
            return this.f4078b;
        }

        @Override // com.google.common.collect.k
        public final Map<SocketAddress, a> b() {
            return this.f4078b;
        }

        public final double c() {
            HashMap map = this.f4078b;
            if (map.isEmpty()) {
                return 0.0d;
            }
            Iterator it = map.values().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                i11++;
                if (((a) it.next()).d()) {
                    i10++;
                }
            }
            return (((double) i10) / ((double) i11)) * 100.0d;
        }
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public class c extends J9.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.i.c f4079a;

        public c(io.grpc.i.c cVar) {
            this.f4079a = cVar;
        }

        @Override // J9.c, io.grpc.i.c
        public final io.grpc.i.g a(io.grpc.i.a aVar) {
            io.grpc.i.g gVarA = this.f4079a.a(aVar);
            g gVar = g.this;
            h hVar = gVar.new h(gVarA);
            List<io.grpc.d> list = aVar.f36972a;
            if (g.f(list) && gVar.f4063c.containsKey(list.get(0).f36959a.get(0))) {
                a aVar2 = gVar.f4063c.get(list.get(0).f36959a.get(0));
                aVar2.a(hVar);
                if (aVar2.f4073d != null) {
                    hVar.j();
                }
            }
            return hVar;
        }

        @Override // io.grpc.i.c
        public final void f(ConnectivityState connectivityState, io.grpc.i.h hVar) {
            this.f4079a.f(connectivityState, new C0056g(hVar));
        }

        @Override // J9.c
        public final io.grpc.i.c g() {
            return this.f4079a;
        }
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f4081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChannelLogger f4082c;

        public d(f fVar, ChannelLogger channelLogger) {
            this.f4081b = fVar;
            this.f4082c = channelLogger;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.f4069i = Long.valueOf(gVar.f4066f.a());
            for (a aVar : g.this.f4063c.f4078b.values()) {
                a.C0055a c0055a = aVar.f4072c;
                c0055a.f4076a.set(0L);
                c0055a.f4077b.set(0L);
                a.C0055a c0055a2 = aVar.f4071b;
                aVar.f4071b = aVar.f4072c;
                aVar.f4072c = c0055a2;
            }
            f fVar = this.f4081b;
            ChannelLogger channelLogger = this.f4082c;
            ImmutableList.b bVar = ImmutableList.f27874c;
            ImmutableList.a aVar2 = new ImmutableList.a();
            if (fVar.f4090e != null) {
                aVar2.c(new j(fVar, channelLogger));
            }
            if (fVar.f4091f != null) {
                aVar2.c(new e(fVar, channelLogger));
            }
            ImmutableList.b bVarListIterator = aVar2.h().listIterator(0);
            while (bVarListIterator.hasNext()) {
                i iVar = (i) bVarListIterator.next();
                g gVar2 = g.this;
                iVar.a(gVar2.f4063c, gVar2.f4069i.longValue());
            }
            g gVar3 = g.this;
            b bVar2 = gVar3.f4063c;
            Long l10 = gVar3.f4069i;
            for (a aVar3 : bVar2.f4078b.values()) {
                if (!aVar3.d()) {
                    int i10 = aVar3.f4074e;
                    aVar3.f4074e = i10 == 0 ? 0 : i10 - 1;
                }
                if (aVar3.d()) {
                    if (l10.longValue() > Math.min(aVar3.f4070a.f4087b.longValue() * ((long) aVar3.f4074e), Math.max(aVar3.f4070a.f4087b.longValue(), aVar3.f4070a.f4088c.longValue())) + aVar3.f4073d.longValue()) {
                        aVar3.e();
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public static class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f4084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChannelLogger f4085b;

        public e(f fVar, ChannelLogger channelLogger) {
            this.f4084a = fVar;
            this.f4085b = channelLogger;
        }

        @Override // J9.g.i
        public final void a(b bVar, long j) {
            f fVar = this.f4084a;
            ArrayList<a> arrayListG = g.g(bVar, fVar.f4091f.f4096d.intValue());
            int size = arrayListG.size();
            f.a aVar = fVar.f4091f;
            if (size < aVar.f4095c.intValue() || arrayListG.size() == 0) {
                return;
            }
            for (a aVar2 : arrayListG) {
                if (bVar.c() >= fVar.f4089d.intValue()) {
                    return;
                }
                if (aVar2.c() >= aVar.f4096d.intValue()) {
                    if (aVar2.f4072c.f4077b.get() / aVar2.c() > ((double) aVar.f4093a.intValue()) / 100.0d) {
                        this.f4085b.b(ChannelLogger.ChannelLogLevel.f36862b, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", aVar2, Double.valueOf(aVar2.f4072c.f4077b.get() / aVar2.c()));
                        if (new Random().nextInt(100) < aVar.f4094b.intValue()) {
                            aVar2.b(j);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f4086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f4087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f4088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f4089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f4090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f4091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K0.b f4092g;

        /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f4093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f4094b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f4095c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f4096d;

            public a(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f4093a = num;
                this.f4094b = num2;
                this.f4095c = num3;
                this.f4096d = num4;
            }
        }

        /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f4097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f4098b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f4099c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f4100d;

            public b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f4097a = num;
                this.f4098b = num2;
                this.f4099c = num3;
                this.f4100d = num4;
            }
        }

        public f(Long l10, Long l11, Long l12, Integer num, b bVar, a aVar, K0.b bVar2) {
            this.f4086a = l10;
            this.f4087b = l11;
            this.f4088c = l12;
            this.f4089d = num;
            this.f4090e = bVar;
            this.f4091f = aVar;
            this.f4092g = bVar2;
        }
    }

    /* JADX INFO: renamed from: J9.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public class C0056g extends io.grpc.i.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.i.h f4101a;

        /* JADX INFO: renamed from: J9.g$g$a */
        /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
        public class a extends io.grpc.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f4102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f4103b;

            /* JADX INFO: renamed from: J9.g$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
            public class C0057a extends J9.a {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ io.grpc.c f4104d;

                public C0057a(io.grpc.c cVar) {
                    this.f4104d = cVar;
                }

                @Override // C.g
                public final void g0(Status status) {
                    a aVar = a.this.f4102a;
                    boolean zF = status.f();
                    f fVar = aVar.f4070a;
                    if (fVar.f4090e != null || fVar.f4091f != null) {
                        if (zF) {
                            aVar.f4071b.f4076a.getAndIncrement();
                        } else {
                            aVar.f4071b.f4077b.getAndIncrement();
                        }
                    }
                    this.f4104d.g0(status);
                }
            }

            /* JADX INFO: renamed from: J9.g$g$a$b */
            /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
            public class b extends io.grpc.c {
                public b() {
                }

                @Override // C.g
                public final void g0(Status status) {
                    a aVar = a.this.f4102a;
                    boolean zF = status.f();
                    f fVar = aVar.f4070a;
                    if (fVar.f4090e == null && fVar.f4091f == null) {
                        return;
                    }
                    if (zF) {
                        aVar.f4071b.f4076a.getAndIncrement();
                    } else {
                        aVar.f4071b.f4077b.getAndIncrement();
                    }
                }
            }

            public a(a aVar, a aVar2) {
                this.f4102a = aVar;
                this.f4103b = aVar2;
            }

            @Override // io.grpc.c.a
            public final io.grpc.c a(io.grpc.c.b bVar, m mVar) {
                a aVar = this.f4103b;
                return aVar != null ? new C0057a(aVar.a(bVar, mVar)) : new b();
            }
        }

        public C0056g(io.grpc.i.h hVar) {
            this.f4101a = hVar;
        }

        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            io.grpc.i.d dVarA = this.f4101a.a(c2250v0);
            io.grpc.i.g gVar = dVarA.f36979a;
            if (gVar == null) {
                return dVarA;
            }
            io.grpc.a aVarC = gVar.c();
            return io.grpc.i.d.b(gVar, new a((a) aVarC.f36933a.get(g.f4062k), dVarA.f36980b));
        }
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public class h extends J9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.i.g f4107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f4108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public D9.h f4110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.grpc.i.InterfaceC0390i f4111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ChannelLogger f4112f;

        /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
        public class a implements io.grpc.i.InterfaceC0390i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final io.grpc.i.InterfaceC0390i f4114a;

            public a(io.grpc.i.InterfaceC0390i interfaceC0390i) {
                this.f4114a = interfaceC0390i;
            }

            @Override // io.grpc.i.InterfaceC0390i
            public final void a(D9.h hVar) {
                h hVar2 = h.this;
                hVar2.f4110d = hVar;
                if (hVar2.f4109c) {
                    return;
                }
                this.f4114a.a(hVar);
            }
        }

        public h(io.grpc.i.g gVar) {
            this.f4107a = gVar;
            this.f4112f = gVar.d();
        }

        @Override // io.grpc.i.g
        public final io.grpc.a c() {
            a aVar = this.f4108b;
            io.grpc.i.g gVar = this.f4107a;
            if (aVar == null) {
                return gVar.c();
            }
            io.grpc.a aVarC = gVar.c();
            aVarC.getClass();
            io.grpc.a.b<a> bVar = g.f4062k;
            a aVar2 = this.f4108b;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(bVar, aVar2);
            for (Map.Entry<io.grpc.a.b<?>, Object> entry : aVarC.f36933a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new io.grpc.a(identityHashMap);
        }

        @Override // io.grpc.i.g
        public final void h(io.grpc.i.InterfaceC0390i interfaceC0390i) {
            this.f4111e = interfaceC0390i;
            this.f4107a.h(new a(interfaceC0390i));
        }

        @Override // io.grpc.i.g
        public final void i(List<io.grpc.d> list) {
            boolean zF = g.f(b());
            g gVar = g.this;
            if (zF && g.f(list)) {
                if (gVar.f4063c.containsValue(this.f4108b)) {
                    a aVar = this.f4108b;
                    aVar.getClass();
                    this.f4108b = null;
                    aVar.f4075f.remove(this);
                }
                SocketAddress socketAddress = list.get(0).f36959a.get(0);
                if (gVar.f4063c.containsKey(socketAddress)) {
                    gVar.f4063c.get(socketAddress).a(this);
                }
            } else if (!g.f(b()) || g.f(list)) {
                if (!g.f(b()) && g.f(list)) {
                    SocketAddress socketAddress2 = list.get(0).f36959a.get(0);
                    if (gVar.f4063c.containsKey(socketAddress2)) {
                        gVar.f4063c.get(socketAddress2).a(this);
                    }
                }
            } else if (gVar.f4063c.containsKey(a().f36959a.get(0))) {
                a aVar2 = gVar.f4063c.get(a().f36959a.get(0));
                aVar2.getClass();
                this.f4108b = null;
                aVar2.f4075f.remove(this);
                a.C0055a c0055a = aVar2.f4071b;
                c0055a.f4076a.set(0L);
                c0055a.f4077b.set(0L);
                a.C0055a c0055a2 = aVar2.f4072c;
                c0055a2.f4076a.set(0L);
                c0055a2.f4077b.set(0L);
            }
            this.f4107a.i(list);
        }

        public final void j() {
            this.f4109c = true;
            io.grpc.i.InterfaceC0390i interfaceC0390i = this.f4111e;
            Status status = Status.f36905l;
            p.f("The error status must not be OK", true ^ status.f());
            interfaceC0390i.a(new D9.h(ConnectivityState.f36869d, status));
            this.f4112f.b(ChannelLogger.ChannelLogLevel.f36863c, "Subchannel ejected: {0}", this);
        }

        public final String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f4107a.b() + '}';
        }
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public interface i {
        void a(b bVar, long j);
    }

    /* JADX INFO: compiled from: OutlierDetectionLoadBalancer.java */
    public static class j implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f4116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChannelLogger f4117b;

        public j(f fVar, ChannelLogger channelLogger) {
            p.f("success rate ejection config is null", fVar.f4090e != null);
            this.f4116a = fVar;
            this.f4117b = channelLogger;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x011e  */
        @Override // J9.g.i
        public final void a(b bVar, long j) {
            f fVar = this.f4116a;
            ArrayList<a> arrayListG = g.g(bVar, fVar.f4090e.f4100d.intValue());
            int size = arrayListG.size();
            f.b bVar2 = fVar.f4090e;
            if (size < bVar2.f4099c.intValue() || arrayListG.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (a aVar : arrayListG) {
                arrayList.add(Double.valueOf(aVar.f4072c.f4076a.get() / aVar.c()));
            }
            Iterator it = arrayList.iterator();
            double d10 = 0.0d;
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            double size2 = dDoubleValue / ((double) arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                double dDoubleValue2 = ((Double) it2.next()).doubleValue() - size2;
                d10 += dDoubleValue2 * dDoubleValue2;
            }
            double dSqrt = Math.sqrt(d10 / ((double) arrayList.size()));
            double dIntValue = size2 - (((double) (bVar2.f4097a.intValue() / 1000.0f)) * dSqrt);
            Iterator it3 = arrayListG.iterator();
            while (it3.hasNext()) {
                a aVar2 = (a) it3.next();
                f fVar2 = fVar;
                Iterator it4 = it3;
                if (bVar.c() >= fVar.f4089d.intValue()) {
                    return;
                }
                if (aVar2.f4072c.f4076a.get() / aVar2.c() < dIntValue) {
                    this.f4117b.b(ChannelLogger.ChannelLogLevel.f36862b, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", aVar2, Double.valueOf(aVar2.f4072c.f4076a.get() / aVar2.c()), Double.valueOf(size2), Double.valueOf(dSqrt), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < bVar2.f4098b.intValue()) {
                        aVar2.b(j);
                    }
                }
                fVar = fVar2;
                it3 = it4;
            }
        }
    }

    public g(io.grpc.i.c cVar) {
        R0.a aVar = R0.f37437a;
        ChannelLogger channelLoggerB = cVar.b();
        this.j = channelLoggerB;
        this.f4065e = new J9.e(new c(cVar));
        this.f4063c = new b();
        w wVarD = cVar.d();
        p.j(wVarD, "syncContext");
        this.f4064d = wVarD;
        ScheduledExecutorService scheduledExecutorServiceC = cVar.c();
        p.j(scheduledExecutorServiceC, "timeService");
        this.f4067g = scheduledExecutorServiceC;
        this.f4066f = aVar;
        channelLoggerB.a(ChannelLogger.ChannelLogLevel.f36862b, "OutlierDetection lb created.");
    }

    public static boolean f(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((io.grpc.d) it.next()).f36959a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList g(b bVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : bVar.values()) {
            if (aVar.c() >= i10) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // io.grpc.i
    public final boolean a(io.grpc.i.f fVar) {
        ChannelLogger channelLogger = this.j;
        channelLogger.b(ChannelLogger.ChannelLogLevel.f36862b, "Received resolution result: {0}", fVar);
        f fVar2 = (f) fVar.f36985c;
        ArrayList<SocketAddress> arrayList = new ArrayList();
        List<io.grpc.d> list = fVar.f36983a;
        Iterator<io.grpc.d> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().f36959a);
        }
        b bVar = this.f4063c;
        bVar.keySet().retainAll(arrayList);
        Iterator it2 = bVar.f4078b.values().iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).f4070a = fVar2;
        }
        for (SocketAddress socketAddress : arrayList) {
            HashMap map = bVar.f4078b;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new a(fVar2));
            }
        }
        io.grpc.j jVar = fVar2.f4092g.f37242a;
        J9.e eVar = this.f4065e;
        eVar.getClass();
        p.j(jVar, "newBalancerFactory");
        if (!jVar.equals(eVar.f4054g)) {
            eVar.f4055h.e();
            eVar.f4055h = eVar.f4050c;
            eVar.f4054g = null;
            eVar.f4056i = ConnectivityState.f36867b;
            eVar.j = J9.e.f4049l;
            if (!jVar.equals(eVar.f4052e)) {
                J9.f fVar3 = new J9.f(eVar);
                io.grpc.i iVarA = jVar.a(fVar3);
                fVar3.f4060a = iVarA;
                eVar.f4055h = iVarA;
                eVar.f4054g = jVar;
                if (!eVar.f4057k) {
                    eVar.f();
                }
            }
        }
        if (fVar2.f4090e == null && fVar2.f4091f == null) {
            w.c cVar = this.f4068h;
            if (cVar != null) {
                cVar.a();
                this.f4069i = null;
                for (a aVar : bVar.f4078b.values()) {
                    if (aVar.d()) {
                        aVar.e();
                    }
                    aVar.f4074e = 0;
                }
            }
        } else {
            Long l10 = this.f4069i;
            Long l11 = fVar2.f4086a;
            Long lValueOf = l10 == null ? l11 : Long.valueOf(Math.max(0L, l11.longValue() - (this.f4066f.a() - this.f4069i.longValue())));
            w.c cVar2 = this.f4068h;
            if (cVar2 != null) {
                cVar2.a();
                for (a aVar2 : bVar.f4078b.values()) {
                    a.C0055a c0055a = aVar2.f4071b;
                    c0055a.f4076a.set(0L);
                    c0055a.f4077b.set(0L);
                    a.C0055a c0055a2 = aVar2.f4072c;
                    c0055a2.f4076a.set(0L);
                    c0055a2.f4077b.set(0L);
                }
            }
            d dVar = new d(fVar2, channelLogger);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l11.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            w wVar = this.f4064d;
            wVar.getClass();
            w.b bVar2 = new w.b(dVar);
            this.f4068h = new w.c(bVar2, this.f4067g.scheduleWithFixedDelay(new x(wVar, bVar2, dVar, jLongValue2), jLongValue, jLongValue2, timeUnit));
        }
        io.grpc.a aVar3 = io.grpc.a.f36932b;
        eVar.d(new io.grpc.i.f(list, fVar.f36984b, fVar2.f4092g.f37243b));
        return true;
    }

    @Override // io.grpc.i
    public final void c(Status status) {
        this.f4065e.c(status);
    }

    @Override // io.grpc.i
    public final void e() {
        this.f4065e.e();
    }
}
