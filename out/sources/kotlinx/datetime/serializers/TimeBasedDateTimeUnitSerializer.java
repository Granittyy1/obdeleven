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
import p037cb.S;
import p293xa.r;

/* JADX INFO: compiled from: DateTimeUnitSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TimeBasedDateTimeUnitSerializer implements b<a.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeBasedDateTimeUnitSerializer f43957a = new TimeBasedDateTimeUnitSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f43958b = kotlin.a.b(LazyThreadSafetyMode.f42972c, new Ia.a<e>() { // from class: kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer$descriptor$2
        @Override // Ia.a
        public final e invoke() {
            return l.b("kotlinx.datetime.TimeBased", new e[0], new Ia.l<p011ab.a, r>() { // from class: kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer$descriptor$2.1
                @Override // Ia.l
                public final r invoke(p011ab.a aVar) {
                    p011ab.a buildClassSerialDescriptor = aVar;
                    i.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                    EmptyList emptyList = EmptyList.f42983b;
                    S s10 = S.f22579a;
                    buildClassSerialDescriptor.a("nanoseconds", S.f22580b, emptyList, false);
                    return r.f47939a;
                }
            });
        }
    });

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        e descriptor = getDescriptor();
        p024bb.a aVarA = cVar.a(descriptor);
        TimeBasedDateTimeUnitSerializer timeBasedDateTimeUnitSerializer = f43957a;
        long jA = 0;
        boolean z10 = false;
        while (true) {
            int iO = aVarA.o(timeBasedDateTimeUnitSerializer.getDescriptor());
            if (iO == -1) {
                r rVar = r.f47939a;
                aVarA.c(descriptor);
                if (z10) {
                    return new a.e(jA);
                }
                throw new MissingFieldException("nanoseconds", getDescriptor().a());
            }
            if (iO != 0) {
                A.j(iO);
                throw null;
            }
            jA = aVarA.A(timeBasedDateTimeUnitSerializer.getDescriptor(), 0);
            z10 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return (e) f43958b.getValue();
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        a.e value = (a.e) obj;
        i.e(value, "value");
        e descriptor = getDescriptor();
        p024bb.b bVarA = dVar.a(descriptor);
        bVarA.j(f43957a.getDescriptor(), 0, value.f6571b);
        bVarA.c(descriptor);
    }
}
