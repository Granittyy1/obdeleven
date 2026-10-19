package kotlinx.datetime.format;

import androidx.compose.foundation.C0936h;
import kotlin.jvm.internal.Lambda;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateFormatKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p293xa.g f43745a = kotlin.a.a(new Ia.a<InterfaceC2723h<Ua.e>>() { // from class: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE$2

        /* JADX INFO: renamed from: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LocalDateFormat.kt */
        final class AnonymousClass1 extends Lambda implements Ia.l<InterfaceC2724i.a, p293xa.r> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final AnonymousClass1 f43749h = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.a aVar) {
                InterfaceC2724i.a build = aVar;
                kotlin.jvm.internal.i.e(build, "$this$build");
                build.j(Padding.f43774c);
                C2725j.b(build, '-');
                Padding padding = Padding.f43774c;
                build.i(padding);
                C2725j.b(build, '-');
                build.p(padding);
                return p293xa.r.f47939a;
            }
        }

        @Override // Ia.a
        public final InterfaceC2723h<Ua.e> invoke() {
            AnonymousClass1 block = AnonymousClass1.f43749h;
            kotlin.jvm.internal.i.e(block, "block");
            t.a aVar = new t.a(new kotlinx.datetime.internal.format.d());
            block.invoke(aVar);
            return new t(InterfaceC2717b.a.c(aVar));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p293xa.g f43746b = kotlin.a.a(new Ia.a<InterfaceC2723h<Ua.e>>() { // from class: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE_BASIC$2

        /* JADX INFO: renamed from: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE_BASIC$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LocalDateFormat.kt */
        final class AnonymousClass1 extends Lambda implements Ia.l<InterfaceC2724i.a, p293xa.r> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final AnonymousClass1 f43751h = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.a aVar) {
                InterfaceC2724i.a build = aVar;
                kotlin.jvm.internal.i.e(build, "$this$build");
                build.j(Padding.f43774c);
                Padding padding = Padding.f43774c;
                build.i(padding);
                build.p(padding);
                return p293xa.r.f47939a;
            }
        }

        @Override // Ia.a
        public final InterfaceC2723h<Ua.e> invoke() {
            AnonymousClass1 block = AnonymousClass1.f43751h;
            kotlin.jvm.internal.i.e(block, "block");
            t.a aVar = new t.a(new kotlinx.datetime.internal.format.d());
            block.invoke(aVar);
            return new t(InterfaceC2717b.a.c(aVar));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f43747c = new p(null, null, null, null);

    public static final void a(Object obj, String str) {
        if (obj == null) {
            throw new DateTimeFormatException(C0936h.d("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }

    public static final void b(InterfaceC2724i.a aVar, Padding padding) {
        kotlin.jvm.internal.i.e(aVar, "<this>");
        if (aVar instanceof InterfaceC2718c) {
            ((InterfaceC2718c) aVar).u(new kotlinx.datetime.internal.format.e(new L(padding, true)));
        }
    }
}
