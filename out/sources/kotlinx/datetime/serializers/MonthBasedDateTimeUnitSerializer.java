package kotlinx.datetime.serializers;

import A8.A;
import Ua.a;
import Ya.b;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlinx.serialization.MissingFieldException;
import p011ab.e;
import p011ab.l;
import p024bb.c;
import p024bb.d;
import p037cb.I;
import p293xa.r;

/* JADX INFO: compiled from: DateTimeUnitSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MonthBasedDateTimeUnitSerializer implements b<a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MonthBasedDateTimeUnitSerializer f43953a = new MonthBasedDateTimeUnitSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f43954b = kotlin.a.b(LazyThreadSafetyMode.f42972c, new Ia.a<e>() { // from class: kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer$descriptor$2
        @Override // Ia.a
        public final e invoke() {
            return l.b("kotlinx.datetime.MonthBased", new e[0], new Ia.l<p011ab.a, r>() { // from class: kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer$descriptor$2.1
                @Override // Ia.l
                public final r invoke(p011ab.a aVar) {
                    p011ab.a buildClassSerialDescriptor = aVar;
                    i.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                    EmptyList emptyList = EmptyList.f42983b;
                    I i10 = I.f22555a;
                    buildClassSerialDescriptor.a("months", I.f22556b, emptyList, false);
                    return r.f47939a;
                }
            });
        }
    });

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        e descriptor = getDescriptor();
        p024bb.a aVarA = cVar.a(descriptor);
        MonthBasedDateTimeUnitSerializer monthBasedDateTimeUnitSerializer = f43953a;
        boolean z10 = false;
        int iH = 0;
        while (true) {
            int iO = aVarA.o(monthBasedDateTimeUnitSerializer.getDescriptor());
            if (iO == -1) {
                r rVar = r.f47939a;
                aVarA.c(descriptor);
                if (z10) {
                    return new a.d(iH);
                }
                throw new MissingFieldException("months", getDescriptor().a());
            }
            if (iO != 0) {
                A.j(iO);
                throw null;
            }
            iH = aVarA.h(monthBasedDateTimeUnitSerializer.getDescriptor(), 0);
            z10 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return (e) f43954b.getValue();
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        a.d value = (a.d) obj;
        i.e(value, "value");
        e descriptor = getDescriptor();
        p024bb.b bVarA = dVar.a(descriptor);
        bVarA.g(0, value.f6570b, f43953a.getDescriptor());
        bVarA.c(descriptor);
    }
}
