package kotlinx.datetime.format;

/* JADX INFO: renamed from: kotlinx.datetime.format.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2724i {

    /* JADX INFO: renamed from: kotlinx.datetime.format.i$a */
    /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
    public interface a extends InterfaceC2724i {

        /* JADX INFO: renamed from: kotlinx.datetime.format.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
        public static final class C0501a {
        }

        void b();

        void i(Padding padding);

        void j(Padding padding);

        void o(m mVar);

        void p(Padding padding);

        void q(InterfaceC2723h<Ua.e> interfaceC2723h);

        void r(z zVar);
    }

    /* JADX INFO: renamed from: kotlinx.datetime.format.i$b */
    /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
    public interface b extends a, d {
    }

    /* JADX INFO: renamed from: kotlinx.datetime.format.i$c */
    /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
    public interface c extends b, e {
        void k();
    }

    /* JADX INFO: renamed from: kotlinx.datetime.format.i$d */
    /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
    public interface d extends InterfaceC2724i {

        /* JADX INFO: renamed from: kotlinx.datetime.format.i$d$a */
        /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
        public static final class a {
        }

        void e(v vVar);

        void f(Padding padding);

        void g(Padding padding);

        void l(int i10, int i11);

        void n(Padding padding);

        void x(int i10);
    }

    /* JADX INFO: renamed from: kotlinx.datetime.format.i$e */
    /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
    public interface e extends InterfaceC2724i {

        /* JADX INFO: renamed from: kotlinx.datetime.format.i$e$a */
        /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
        public static final class a {
            public static /* synthetic */ void b(e eVar) {
                eVar.s(Padding.f43774c);
            }

            public static /* synthetic */ void c(e eVar) {
                eVar.y(Padding.f43774c);
            }
        }

        void m(H h8);

        void s(Padding padding);

        void w(Padding padding);

        void y(Padding padding);
    }

    void d(String str);
}
