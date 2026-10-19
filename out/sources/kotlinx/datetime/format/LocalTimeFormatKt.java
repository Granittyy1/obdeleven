package kotlinx.datetime.format;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalTimeFormatKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p293xa.g f43758a = kotlin.a.a(new Ia.a<v>() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$ISO_TIME$2

        /* JADX INFO: renamed from: kotlinx.datetime.format.LocalTimeFormatKt$ISO_TIME$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LocalTimeFormat.kt */
        final class AnonymousClass1 extends Lambda implements Ia.l<InterfaceC2724i.d, p293xa.r> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final AnonymousClass1 f43761h = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.d dVar) {
                InterfaceC2724i.d build = dVar;
                kotlin.jvm.internal.i.e(build, "$this$build");
                build.n(Padding.f43774c);
                C2725j.b(build, ':');
                build.f(Padding.f43774c);
                C2725j.a(build, new Ia.l[]{new Ia.l<InterfaceC2724i.d, p293xa.r>() { // from class: kotlinx.datetime.format.LocalTimeFormatKt.ISO_TIME.2.1.1
                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC2724i.d dVar2) {
                        InterfaceC2724i.d alternativeParsing = dVar2;
                        kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                        return p293xa.r.f47939a;
                    }
                }}, new Ia.l<InterfaceC2724i.d, p293xa.r>() { // from class: kotlinx.datetime.format.LocalTimeFormatKt.ISO_TIME.2.1.2
                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC2724i.d dVar2) {
                        InterfaceC2724i.d alternativeParsing = dVar2;
                        kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                        C2725j.b(alternativeParsing, ':');
                        alternativeParsing.g(Padding.f43774c);
                        C2725j.c(alternativeParsing, "", new Ia.l<InterfaceC2724i.d, p293xa.r>() { // from class: kotlinx.datetime.format.LocalTimeFormatKt.ISO_TIME.2.1.2.1
                            @Override // Ia.l
                            public final p293xa.r invoke(InterfaceC2724i.d dVar3) {
                                InterfaceC2724i.d optional = dVar3;
                                kotlin.jvm.internal.i.e(optional, "$this$optional");
                                C2725j.b(optional, '.');
                                optional.l(1, 9);
                                return p293xa.r.f47939a;
                            }
                        });
                        return p293xa.r.f47939a;
                    }
                });
                return p293xa.r.f47939a;
            }
        }

        @Override // Ia.a
        public final v invoke() {
            AnonymousClass1 block = AnonymousClass1.f43761h;
            kotlin.jvm.internal.i.e(block, "block");
            v.a aVar = new v.a(new kotlinx.datetime.internal.format.d());
            block.invoke(aVar);
            return new v(InterfaceC2717b.a.c(aVar));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f43759b = new r(0);
}
