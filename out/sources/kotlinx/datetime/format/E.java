package kotlinx.datetime.format;

import java.util.List;

/* JADX INFO: compiled from: Unicode.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface E {

    /* JADX INFO: compiled from: Unicode.kt */
    public static abstract class a implements E {

        /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Unicode.kt */
        public static abstract class AbstractC0481a extends a {

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class C0482a extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43663a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43664b = 'U';

                public C0482a(int i10) {
                    this.f43663a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43663a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43664b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("cyclic-year", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$b */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class b extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43665a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43666b = 'd';

                public b(int i10) {
                    this.f43665a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43665a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43666b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43665a;
                    if (i10 == 1) {
                        builder.p(Padding.f43773b);
                    } else if (i10 == 2) {
                        builder.p(Padding.f43774c);
                    } else {
                        UnicodeKt.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$c */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class c extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43667a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43668b = 'E';

                public c(int i10) {
                    this.f43667a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43667a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43668b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$d */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class d extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43669a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43670b = 'F';

                public d(int i10) {
                    this.f43669a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43669a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43670b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("day-of-week-in-month", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$e */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class e extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43671a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43672b = 'D';

                public e(int i10) {
                    this.f43671a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43671a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43672b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("day-of-year", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$f */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class f extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43673a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43674b = 'G';

                public f(int i10) {
                    this.f43673a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43673a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43674b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$g */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class g extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43675a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43676b = 'e';

                public g(int i10) {
                    this.f43675a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43675a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43676b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$h */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class h extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43677a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43678b = 'g';

                public h(int i10) {
                    this.f43677a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43677a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43678b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("modified-julian-day", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$i */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class i extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43679a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43680b = 'M';

                public i(int i10) {
                    this.f43679a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43679a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43680b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43679a;
                    if (i10 == 1) {
                        builder.i(Padding.f43773b);
                        return;
                    }
                    if (i10 == 2) {
                        builder.i(Padding.f43774c);
                    } else {
                        if (i10 == 3 || i10 == 4 || i10 == 5) {
                            UnicodeKt.e(this, null);
                            throw null;
                        }
                        UnicodeKt.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$j */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class j extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43681a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43682b = 'Q';

                public j(int i10) {
                    this.f43681a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43681a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43682b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43681a;
                    if (i10 == 1 || i10 == 2) {
                        UnicodeKt.f("quarter-of-year", null);
                        throw null;
                    }
                    if (i10 == 3 || i10 == 4 || i10 == 5) {
                        UnicodeKt.e(this, null);
                        throw null;
                    }
                    UnicodeKt.b(this);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$k */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class k extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43683a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43684b = 'r';

                public k(int i10) {
                    this.f43683a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43683a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43684b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("related-gregorian-year", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$l */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class l extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43685a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43686b = 'c';

                public l(int i10) {
                    this.f43685a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43685a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43686b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$m */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class m extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43687a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43688b = 'L';

                public m(int i10) {
                    this.f43687a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43687a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43688b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43687a;
                    if (i10 == 1) {
                        builder.i(Padding.f43773b);
                        return;
                    }
                    if (i10 == 2) {
                        builder.i(Padding.f43774c);
                    } else {
                        if (i10 == 3 || i10 == 4 || i10 == 5) {
                            UnicodeKt.e(this, null);
                            throw null;
                        }
                        UnicodeKt.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$n */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class n extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43689a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43690b = 'q';

                public n(int i10) {
                    this.f43689a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43689a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43690b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43689a;
                    if (i10 == 1 || i10 == 2) {
                        UnicodeKt.f("standalone-quarter-of-year", null);
                        throw null;
                    }
                    if (i10 == 3 || i10 == 4 || i10 == 5) {
                        UnicodeKt.e(this, null);
                        throw null;
                    }
                    UnicodeKt.b(this);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$o */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class o extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43691a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43692b = 'Y';

                public o(int i10) {
                    this.f43691a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43691a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43692b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("week-based-year", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$p */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class p extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43693a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43694b = 'W';

                public p(int i10) {
                    this.f43693a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43693a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43694b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("week-of-month", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$q */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class q extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43695a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43696b = 'w';

                public q(int i10) {
                    this.f43695a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43695a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43696b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.f("week-of-week-based-year", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$r */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class r extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43697a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43698b = 'u';

                public r(int i10) {
                    this.f43697a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43697a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43698b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43697a;
                    if (i10 == 1) {
                        builder.j(Padding.f43773b);
                        return;
                    }
                    if (i10 == 2) {
                        builder.b();
                        return;
                    }
                    if (i10 == 3) {
                        UnicodeKt.c(this, i10);
                        throw null;
                    }
                    if (i10 == 4) {
                        builder.j(Padding.f43774c);
                    } else {
                        UnicodeKt.c(this, i10);
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$a$s */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class s extends AbstractC0481a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43699a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43700b = 'y';

                public s(int i10) {
                    this.f43699a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43699a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43700b;
                }

                @Override // kotlinx.datetime.format.E.a.AbstractC0481a
                public final void c(InterfaceC2724i.a builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43699a;
                    if (i10 == 1) {
                        LocalDateFormatKt.b(builder, Padding.f43773b);
                        return;
                    }
                    if (i10 == 2) {
                        p293xa.g gVar = LocalDateFormatKt.f43745a;
                        if (builder instanceof InterfaceC2718c) {
                            ((InterfaceC2718c) builder).u(new kotlinx.datetime.internal.format.e(new A(true)));
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        UnicodeKt.c(this, i10);
                        throw null;
                    }
                    if (i10 == 4) {
                        LocalDateFormatKt.b(builder, Padding.f43774c);
                    } else {
                        UnicodeKt.c(this, i10);
                        throw null;
                    }
                }
            }

            public abstract void c(InterfaceC2724i.a aVar);
        }

        /* JADX INFO: compiled from: Unicode.kt */
        public static abstract class b extends a {

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class C0483a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43701a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43702b = 'O';

                public C0483a(int i10) {
                    this.f43701a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43701a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43702b;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final void c(InterfaceC2724i.e builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput e() {
                    UnicodeKt.e(this, null);
                    throw null;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput f() {
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class C0484b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43703a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43704b = 'X';

                public C0484b(int i10) {
                    this.f43703a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43703a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43704b;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final void c(InterfaceC2724i.e builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43703a;
                    if (i10 == 1) {
                        d(builder, true, false);
                        return;
                    }
                    if (i10 == 2) {
                        d(builder, true, false);
                        return;
                    }
                    if (i10 == 3) {
                        d(builder, true, true);
                        return;
                    }
                    if (i10 == 4) {
                        d(builder, true, false);
                    } else if (i10 == 5) {
                        d(builder, true, true);
                    } else {
                        UnicodeKt.b(this);
                        throw null;
                    }
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput e() {
                    return this.f43703a == 1 ? WhenToOutput.f43810c : WhenToOutput.f43811d;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput f() {
                    return this.f43703a <= 3 ? WhenToOutput.f43809b : WhenToOutput.f43810c;
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static final class c extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43705a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43706b = 'x';

                public c(int i10) {
                    this.f43705a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43705a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43706b;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final void c(InterfaceC2724i.e builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43705a;
                    if (i10 == 1) {
                        d(builder, false, false);
                        return;
                    }
                    if (i10 == 2) {
                        d(builder, false, false);
                        return;
                    }
                    if (i10 == 3) {
                        d(builder, false, true);
                        return;
                    }
                    if (i10 == 4) {
                        d(builder, false, false);
                    } else if (i10 == 5) {
                        d(builder, false, true);
                    } else {
                        UnicodeKt.b(this);
                        throw null;
                    }
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput e() {
                    return this.f43705a == 1 ? WhenToOutput.f43810c : WhenToOutput.f43811d;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput f() {
                    return this.f43705a <= 3 ? WhenToOutput.f43809b : WhenToOutput.f43810c;
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static final class d extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43707a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43708b = 'Z';

                public d(int i10) {
                    this.f43707a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43707a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43708b;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final void c(InterfaceC2724i.e builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43707a;
                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                        d(builder, false, false);
                        return;
                    }
                    if (i10 == 4) {
                        UnicodeKt.e(new C0483a(4), null);
                        throw null;
                    }
                    if (i10 == 5) {
                        d(builder, false, true);
                    } else {
                        UnicodeKt.b(this);
                        throw null;
                    }
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput e() {
                    return WhenToOutput.f43811d;
                }

                @Override // kotlinx.datetime.format.E.a.b
                public final WhenToOutput f() {
                    return this.f43707a <= 3 ? WhenToOutput.f43809b : WhenToOutput.f43810c;
                }
            }

            public abstract void c(InterfaceC2724i.e eVar);

            public final void d(InterfaceC2724i.e eVar, boolean z10, final boolean z11) {
                kotlin.jvm.internal.i.e(eVar, "<this>");
                final WhenToOutput outputMinute = e();
                final WhenToOutput outputSecond = f();
                p293xa.g gVar = UtcOffsetFormatKt.f43789a;
                kotlin.jvm.internal.i.e(outputMinute, "outputMinute");
                kotlin.jvm.internal.i.e(outputSecond, "outputSecond");
                if (outputMinute.compareTo(outputSecond) < 0) {
                    throw new IllegalArgumentException("Seconds cannot be included without minutes");
                }
                if (z10) {
                    C2725j.c(eVar, "Z", new Ia.l<InterfaceC2724i.e, p293xa.r>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$isoOffset$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(InterfaceC2724i.e eVar2) {
                            InterfaceC2724i.e optional = eVar2;
                            kotlin.jvm.internal.i.e(optional, "$this$optional");
                            Ia.l[] lVarArr = {new Ia.l<InterfaceC2724i.e, p293xa.r>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$isoOffset$2.1
                                @Override // Ia.l
                                public final p293xa.r invoke(InterfaceC2724i.e eVar3) {
                                    InterfaceC2724i.e alternativeParsing = eVar3;
                                    kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                                    C2725j.b(alternativeParsing, 'z');
                                    return p293xa.r.f47939a;
                                }
                            }};
                            final WhenToOutput whenToOutput = outputMinute;
                            final boolean z12 = z11;
                            final WhenToOutput whenToOutput2 = outputSecond;
                            C2725j.a(optional, lVarArr, new Ia.l<InterfaceC2724i.e, p293xa.r>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$isoOffset$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(InterfaceC2724i.e eVar3) {
                                    InterfaceC2724i.e alternativeParsing = eVar3;
                                    kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                                    WhenToOutput whenToOutput3 = whenToOutput;
                                    boolean z13 = z12;
                                    WhenToOutput whenToOutput4 = whenToOutput2;
                                    p293xa.g gVar2 = UtcOffsetFormatKt.f43789a;
                                    alternativeParsing.w(Padding.f43774c);
                                    UtcOffsetFormatKt.a(alternativeParsing, whenToOutput3, new UtcOffsetFormatKt$isoOffset$appendIsoOffsetWithoutZOnZero$1(z13, whenToOutput4));
                                    return p293xa.r.f47939a;
                                }
                            });
                            return p293xa.r.f47939a;
                        }
                    });
                } else {
                    eVar.w(Padding.f43774c);
                    UtcOffsetFormatKt.a(eVar, outputMinute, new UtcOffsetFormatKt$isoOffset$appendIsoOffsetWithoutZOnZero$1(z11, outputSecond));
                }
            }

            public abstract WhenToOutput e();

            public abstract WhenToOutput f();
        }

        /* JADX INFO: compiled from: Unicode.kt */
        public static abstract class c extends a {

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class C0485a extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43709a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43710b = 'h';

                public C0485a(int i10) {
                    this.f43709a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43709a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43710b;
                }

                @Override // kotlinx.datetime.format.E.a.c
                public final void c(InterfaceC2724i.d builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static final class b extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43711a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43712b = 'a';

                public b(int i10) {
                    this.f43711a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43711a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43712b;
                }

                @Override // kotlinx.datetime.format.E.a.c
                public final void c(InterfaceC2724i.d builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class C0486c extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43713a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43714b = 'H';

                public C0486c(int i10) {
                    this.f43713a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43713a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43714b;
                }

                @Override // kotlinx.datetime.format.E.a.c
                public final void c(InterfaceC2724i.d builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43713a;
                    if (i10 == 1) {
                        builder.n(Padding.f43773b);
                    } else if (i10 == 2) {
                        builder.n(Padding.f43774c);
                    } else {
                        UnicodeKt.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static final class d extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43715a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43716b = 'm';

                public d(int i10) {
                    this.f43715a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43715a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43716b;
                }

                @Override // kotlinx.datetime.format.E.a.c
                public final void c(InterfaceC2724i.d builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    int i10 = this.f43715a;
                    if (i10 == 1) {
                        builder.f(Padding.f43773b);
                    } else if (i10 == 2) {
                        builder.f(Padding.f43774c);
                    } else {
                        UnicodeKt.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static abstract class e extends c {

                /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$c$e$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Unicode.kt */
                public static final class C0487a extends e {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f43717a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final char f43718b = 's';

                    public C0487a(int i10) {
                        this.f43717a = i10;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final int a() {
                        return this.f43717a;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final char b() {
                        return this.f43718b;
                    }

                    @Override // kotlinx.datetime.format.E.a.c
                    public final void c(InterfaceC2724i.d builder) {
                        kotlin.jvm.internal.i.e(builder, "builder");
                        int i10 = this.f43717a;
                        if (i10 == 1) {
                            builder.g(Padding.f43773b);
                        } else if (i10 == 2) {
                            builder.g(Padding.f43774c);
                        } else {
                            UnicodeKt.b(this);
                            throw null;
                        }
                    }
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static abstract class f extends e {

                /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$c$f$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Unicode.kt */
                public static final class C0488a extends f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f43719a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final char f43720b = 'S';

                    public C0488a(int i10) {
                        this.f43719a = i10;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final int a() {
                        return this.f43719a;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final char b() {
                        return this.f43720b;
                    }

                    @Override // kotlinx.datetime.format.E.a.c
                    public final void c(InterfaceC2724i.d builder) {
                        kotlin.jvm.internal.i.e(builder, "builder");
                        builder.x(this.f43719a);
                    }
                }

                /* JADX INFO: compiled from: Unicode.kt */
                public static final class b extends f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f43721a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final char f43722b = 'A';

                    public b(int i10) {
                        this.f43721a = i10;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final int a() {
                        return this.f43721a;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final char b() {
                        return this.f43722b;
                    }

                    @Override // kotlinx.datetime.format.E.a.c
                    public final void c(InterfaceC2724i.d builder) {
                        kotlin.jvm.internal.i.e(builder, "builder");
                        UnicodeKt.f("millisecond-of-day", null);
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$c$f$c, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Unicode.kt */
                public static final class C0489c extends f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f43723a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final char f43724b = 'N';

                    public C0489c(int i10) {
                        this.f43723a = i10;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final int a() {
                        return this.f43723a;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final char b() {
                        return this.f43724b;
                    }

                    @Override // kotlinx.datetime.format.E.a.c
                    public final void c(InterfaceC2724i.d builder) {
                        kotlin.jvm.internal.i.e(builder, "builder");
                        UnicodeKt.f("nanosecond-of-day", null);
                        throw null;
                    }
                }

                /* JADX INFO: compiled from: Unicode.kt */
                public static final class d extends f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f43725a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final char f43726b = 'n';

                    public d(int i10) {
                        this.f43725a = i10;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final int a() {
                        return this.f43725a;
                    }

                    @Override // kotlinx.datetime.format.E.a
                    public final char b() {
                        return this.f43726b;
                    }

                    @Override // kotlinx.datetime.format.E.a.c
                    public final void c(InterfaceC2724i.d builder) {
                        kotlin.jvm.internal.i.e(builder, "builder");
                        UnicodeKt.f("nano-of-second", "Maybe you meant 'S' instead of 'n'?");
                        throw null;
                    }
                }
            }

            public abstract void c(InterfaceC2724i.d dVar);
        }

        /* JADX INFO: compiled from: Unicode.kt */
        public static abstract class d extends a {

            /* JADX INFO: renamed from: kotlinx.datetime.format.E$a$d$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Unicode.kt */
            public static final class C0490a extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43727a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43728b = 'v';

                public C0490a(int i10) {
                    this.f43727a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43727a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43728b;
                }

                @Override // kotlinx.datetime.format.E.a.d
                public final void c(InterfaceC2724i.c builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static final class b extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43729a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43730b = 'V';

                public b(int i10) {
                    this.f43729a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43729a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43730b;
                }

                @Override // kotlinx.datetime.format.E.a.d
                public final void c(InterfaceC2724i.c builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    if (this.f43729a == 2) {
                        builder.k();
                    } else {
                        UnicodeKt.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: compiled from: Unicode.kt */
            public static final class c extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f43731a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final char f43732b = 'z';

                public c(int i10) {
                    this.f43731a = i10;
                }

                @Override // kotlinx.datetime.format.E.a
                public final int a() {
                    return this.f43731a;
                }

                @Override // kotlinx.datetime.format.E.a
                public final char b() {
                    return this.f43732b;
                }

                @Override // kotlinx.datetime.format.E.a.d
                public final void c(InterfaceC2724i.c builder) {
                    kotlin.jvm.internal.i.e(builder, "builder");
                    UnicodeKt.e(this, "Format 'V' can be used to format time zone IDs in a locale-invariant manner.");
                    throw null;
                }
            }

            public abstract void c(InterfaceC2724i.c cVar);
        }

        public abstract int a();

        public abstract char b();

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (b() == aVar.b() && a() == aVar.a()) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return a() + (Character.hashCode(b()) * 31);
        }

        public final String toString() {
            return kotlin.text.m.F(a(), String.valueOf(b()));
        }
    }

    /* JADX INFO: compiled from: Unicode.kt */
    public static final class b implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f43733a;

        public b(c cVar) {
            this.f43733a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f43733a.equals(((b) obj).f43733a);
        }

        public final int hashCode() {
            return this.f43733a.f43734a.hashCode();
        }

        public final String toString() {
            return "[" + this.f43733a + ']';
        }
    }

    /* JADX INFO: compiled from: Unicode.kt */
    public static final class c implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<E> f43734a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends E> list) {
            this.f43734a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.i.a(this.f43734a, ((c) obj).f43734a);
        }

        public final int hashCode() {
            return this.f43734a.hashCode();
        }

        public final String toString() {
            return kotlin.collections.q.U(this.f43734a, "", null, null, null, 62);
        }
    }

    /* JADX INFO: compiled from: Unicode.kt */
    public static final class d implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43735a;

        public d(String literal) {
            kotlin.jvm.internal.i.e(literal, "literal");
            this.f43735a = literal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.i.a(this.f43735a, ((d) obj).f43735a);
        }

        public final int hashCode() {
            return this.f43735a.hashCode();
        }

        public final String toString() {
            String str = this.f43735a;
            if (kotlin.jvm.internal.i.a(str, "'")) {
                return "''";
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (Character.isLetter(str.charAt(i10))) {
                    return p005a4.o.c('\'', "'", str);
                }
            }
            return str.length() == 0 ? "" : str;
        }
    }
}
