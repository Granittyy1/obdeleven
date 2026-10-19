package kotlinx.datetime.format;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TimeFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.datetime.internal.format.t<C> f43777a = new kotlinx.datetime.internal.format.t<>(new kotlinx.datetime.internal.format.r(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$hour$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
        public final Object get(Object obj) {
            return ((C) obj).b();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
        public final void set(Object obj, Object obj2) {
            ((C) obj).u((Integer) obj2);
        }
    }), 0, 23, null, null, 56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.datetime.internal.format.t<C> f43778b = new kotlinx.datetime.internal.format.t<>(new kotlinx.datetime.internal.format.r(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$minute$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
        public final Object get(Object obj) {
            return ((C) obj).a();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
        public final void set(Object obj, Object obj2) {
            ((C) obj).k((Integer) obj2);
        }
    }), 0, 59, null, null, 56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.datetime.internal.format.t<C> f43779c = new kotlinx.datetime.internal.format.t<>(new kotlinx.datetime.internal.format.r(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$second$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
        public final Object get(Object obj) {
            return ((C) obj).y();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
        public final void set(Object obj, Object obj2) {
            ((C) obj).A((Integer) obj2);
        }
    }), 0, 59, 0, null, 40);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kotlinx.datetime.internal.format.o<C, Va.a> f43780d = new kotlinx.datetime.internal.format.o<>(new kotlinx.datetime.internal.format.r(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$fractionOfSecond$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
        public final Object get(Object obj) {
            return ((C) obj).n();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
        public final void set(Object obj, Object obj2) {
            ((C) obj).g((Va.a) obj2);
        }
    }), new Va.a(0, 9), 10);

    static {
        TimeFields$amPm$1 property = new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$amPm$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
            public final Object get(Object obj) {
                return ((C) obj).e();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
            public final void set(Object obj, Object obj2) {
                ((C) obj).c((AmPmMarker) obj2);
            }
        };
        kotlin.jvm.internal.i.e(property, "property");
        String name = property.getName();
        kotlin.jvm.internal.i.e(name, "name");
        TimeFields$hourOfAmPm$1 property2 = new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$hourOfAmPm$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
            public final Object get(Object obj) {
                return ((C) obj).o();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
            public final void set(Object obj, Object obj2) {
                ((C) obj).h((Integer) obj2);
            }
        };
        kotlin.jvm.internal.i.e(property2, "property");
        String name2 = property2.getName();
        kotlin.jvm.internal.i.e(name2, "name");
    }
}
