package kotlinx.datetime.serializers;

import Oa.c;
import Ua.a;
import Ya.b;
import Ya.j;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.internal.x;
import p011ab.e;
import p037cb.AbstractC1515b;

/* JADX INFO: compiled from: DateTimeUnitSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeUnitSerializer extends AbstractC1515b<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeUnitSerializer f43946a = new DateTimeUnitSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f43947b = kotlin.a.b(LazyThreadSafetyMode.f42972c, new Ia.a<j<a>>() { // from class: kotlinx.datetime.serializers.DateTimeUnitSerializer$impl$2
        @Override // Ia.a
        public final j<a> invoke() {
            return new j<>("kotlinx.datetime.DateTimeUnit", l.a(a.class), new c[]{l.a(a.c.class), l.a(a.d.class), l.a(a.e.class)}, new b[]{DayBasedDateTimeUnitSerializer.f43949a, MonthBasedDateTimeUnitSerializer.f43953a, TimeBasedDateTimeUnitSerializer.f43957a});
        }
    });

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // p037cb.AbstractC1515b
    public final Ya.a<a> a(p024bb.a aVar, String str) {
        return ((j) f43947b.getValue()).a(aVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    @Override // p037cb.AbstractC1515b
    public final Ya.l b(x xVar, Object obj) {
        a value = (a) obj;
        i.e(value, "value");
        return ((j) f43947b.getValue()).b(xVar, value);
    }

    @Override // p037cb.AbstractC1515b
    public final c<a> c() {
        return l.a(a.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return ((j) f43947b.getValue()).getDescriptor();
    }
}
