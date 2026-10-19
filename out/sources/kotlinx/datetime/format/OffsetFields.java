package kotlinx.datetime.format;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OffsetFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.datetime.internal.format.t<G> f43765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.datetime.internal.format.t<G> f43766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.datetime.internal.format.t<G> f43767c;

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.datetime.format.OffsetFields$sign$1] */
    static {
        ?? r10 = new kotlinx.datetime.internal.format.l<G>() { // from class: kotlinx.datetime.format.OffsetFields$sign$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final kotlinx.datetime.internal.format.r<G, Boolean> f43770a = new kotlinx.datetime.internal.format.r<>(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$sign$1$isNegative$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
                public final Object get(Object obj) {
                    return ((G) obj).w();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
                public final void set(Object obj, Object obj2) {
                    ((G) obj).x((Boolean) obj2);
                }
            });

            @Override // kotlinx.datetime.internal.format.l
            public final kotlinx.datetime.internal.format.r a() {
                return this.f43770a;
            }

            @Override // kotlinx.datetime.internal.format.l
            public final boolean b(G g10) {
                G obj = g10;
                kotlin.jvm.internal.i.e(obj, "obj");
                Integer numF = obj.f();
                if ((numF != null ? numF.intValue() : 0) != 0) {
                    return false;
                }
                Integer numR = obj.r();
                if ((numR != null ? numR.intValue() : 0) != 0) {
                    return false;
                }
                Integer numJ = obj.j();
                return (numJ != null ? numJ.intValue() : 0) == 0;
            }
        };
        f43765a = new kotlinx.datetime.internal.format.t<>(new kotlinx.datetime.internal.format.r(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$totalHoursAbs$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
            public final Object get(Object obj) {
                return ((G) obj).f();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
            public final void set(Object obj, Object obj2) {
                ((G) obj).B((Integer) obj2);
            }
        }), 0, 18, 0, r10, 8);
        f43766b = new kotlinx.datetime.internal.format.t<>(new kotlinx.datetime.internal.format.r(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$minutesOfHour$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
            public final Object get(Object obj) {
                return ((G) obj).r();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
            public final void set(Object obj, Object obj2) {
                ((G) obj).z((Integer) obj2);
            }
        }), 0, 59, 0, r10, 8);
        f43767c = new kotlinx.datetime.internal.format.t<>(new kotlinx.datetime.internal.format.r(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$secondsOfMinute$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
            public final Object get(Object obj) {
                return ((G) obj).j();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
            public final void set(Object obj, Object obj2) {
                ((G) obj).C((Integer) obj2);
            }
        }), 0, 59, 0, r10, 8);
    }
}
