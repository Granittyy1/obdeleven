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
public final class DayBasedDateTimeUnitSerializer implements b<a.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DayBasedDateTimeUnitSerializer f43949a = new DayBasedDateTimeUnitSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f43950b = kotlin.a.b(LazyThreadSafetyMode.f42972c, new Ia.a<e>() { // from class: kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer$descriptor$2
        @Override // Ia.a
        public final e invoke() {
            return l.b("kotlinx.datetime.DayBased", new e[0], new Ia.l<p011ab.a, r>() { // from class: kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer$descriptor$2.1
                @Override // Ia.l
                public final r invoke(p011ab.a aVar) {
                    p011ab.a buildClassSerialDescriptor = aVar;
                    i.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                    EmptyList emptyList = EmptyList.f42983b;
                    I i10 = I.f22555a;
                    buildClassSerialDescriptor.a("days", I.f22556b, emptyList, false);
                    return r.f47939a;
                }
            });
        }
    });

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        e descriptor = getDescriptor();
        p024bb.a aVarA = cVar.a(descriptor);
        DayBasedDateTimeUnitSerializer dayBasedDateTimeUnitSerializer = f43949a;
        boolean z10 = false;
        int iH = 0;
        while (true) {
            int iO = aVarA.o(dayBasedDateTimeUnitSerializer.getDescriptor());
            if (iO == -1) {
                r rVar = r.f47939a;
                aVarA.c(descriptor);
                if (z10) {
                    return new a.c(iH);
                }
                throw new MissingFieldException("days", getDescriptor().a());
            }
            if (iO != 0) {
                A.j(iO);
                throw null;
            }
            iH = aVarA.h(dayBasedDateTimeUnitSerializer.getDescriptor(), 0);
            z10 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return (e) f43950b.getValue();
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        a.c value = (a.c) obj;
        i.e(value, "value");
        e descriptor = getDescriptor();
        p024bb.b bVarA = dVar.a(descriptor);
        bVarA.g(0, value.f6569b, f43949a.getDescriptor());
        bVarA.c(descriptor);
    }
}
