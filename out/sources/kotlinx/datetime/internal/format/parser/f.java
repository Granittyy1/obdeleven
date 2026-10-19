package kotlinx.datetime.internal.format.parser;

/* JADX INFO: compiled from: NumberConsumer.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface f {

    /* JADX INFO: compiled from: NumberConsumer.kt */
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f43907a;

        public a(Object obj) {
            this.f43907a = obj;
        }

        @Override // kotlinx.datetime.internal.format.parser.f
        public final String a() {
            return B6.c.e(new StringBuilder("attempted to overwrite the existing value '"), this.f43907a, '\'');
        }
    }

    /* JADX INFO: compiled from: NumberConsumer.kt */
    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43908a = new b();

        @Override // kotlinx.datetime.internal.format.parser.f
        public final String a() {
            return "expected an Int value";
        }
    }

    /* JADX INFO: compiled from: NumberConsumer.kt */
    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43909a;

        public c(int i10) {
            this.f43909a = i10;
        }

        @Override // kotlinx.datetime.internal.format.parser.f
        public final String a() {
            return p005a4.q.c(new StringBuilder("expected at least "), this.f43909a, " digits");
        }
    }

    /* JADX INFO: compiled from: NumberConsumer.kt */
    public static final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43910a;

        public d(int i10) {
            this.f43910a = i10;
        }

        @Override // kotlinx.datetime.internal.format.parser.f
        public final String a() {
            return p005a4.q.c(new StringBuilder("expected at most "), this.f43910a, " digits");
        }
    }

    /* JADX INFO: compiled from: NumberConsumer.kt */
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43911a;

        public e(String expected) {
            kotlin.jvm.internal.i.e(expected, "expected");
            this.f43911a = expected;
        }

        @Override // kotlinx.datetime.internal.format.parser.f
        public final String a() {
            return B7.b.g(new StringBuilder("expected '"), this.f43911a, '\'');
        }
    }

    String a();
}
