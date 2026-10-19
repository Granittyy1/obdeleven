package kotlinx.datetime.format;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LocalDateTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTimeFormatKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p293xa.g f43752a = kotlin.a.a(new Ia.a<u>() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$ISO_DATETIME$2

        /* JADX INFO: renamed from: kotlinx.datetime.format.LocalDateTimeFormatKt$ISO_DATETIME$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LocalDateTimeFormat.kt */
        final class AnonymousClass1 extends Lambda implements Ia.l<InterfaceC2724i.b, p293xa.r> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final AnonymousClass1 f43755h = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.b bVar) {
                InterfaceC2724i.b build = bVar;
                kotlin.jvm.internal.i.e(build, "$this$build");
                build.q((InterfaceC2723h) LocalDateFormatKt.f43745a.getValue());
                C2725j.a(build, new Ia.l[]{new Ia.l<InterfaceC2724i.b, p293xa.r>() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt.ISO_DATETIME.2.1.1
                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC2724i.b bVar2) {
                        InterfaceC2724i.b alternativeParsing = bVar2;
                        kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                        C2725j.b(alternativeParsing, 't');
                        return p293xa.r.f47939a;
                    }
                }}, new Ia.l<InterfaceC2724i.b, p293xa.r>() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt.ISO_DATETIME.2.1.2
                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC2724i.b bVar2) {
                        InterfaceC2724i.b alternativeParsing = bVar2;
                        kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                        C2725j.b(alternativeParsing, 'T');
                        return p293xa.r.f47939a;
                    }
                });
                build.e((v) LocalTimeFormatKt.f43758a.getValue());
                return p293xa.r.f47939a;
            }
        }

        @Override // Ia.a
        public final u invoke() {
            AnonymousClass1 block = AnonymousClass1.f43755h;
            kotlin.jvm.internal.i.e(block, "block");
            u.a aVar = new u.a(new kotlinx.datetime.internal.format.d());
            block.invoke(aVar);
            return new u(InterfaceC2717b.a.c(aVar));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f43753b = new q(0);
}
